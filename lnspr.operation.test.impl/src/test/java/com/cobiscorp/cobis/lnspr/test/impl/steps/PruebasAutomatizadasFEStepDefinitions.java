package com.cobiscorp.cobis.lnspr.test.impl.steps;

import com.cobiscorp.cobis.assts.cmmns.test.AmortizationFormForm;
import com.cobiscorp.cobis.assts.qerys.test.GeneralInformationMainForm;
import com.cobiscorp.cobis.assts.qerys.test.PaymentQueryFormForm;
import com.cobiscorp.cobis.assts.trnsc.test.NegotiationPaymentsModalForm;
import com.cobiscorp.cobis.assts.trnsc.test.PaymentsMainForm;
import com.cobiscorp.cobis.assts.trnsc.test.ValueDateFormForm;
import com.cobiscorp.cobis.assts.trnsc.test.ValueDateMainForm;
import com.cobiscorp.cobis.serenity.actions.BaseActions;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.HeaderActions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;

public class PruebasAutomatizadasFEStepDefinitions {

	@Cuando("mediante los botones de Accion selecciona la opcion {string} --> boton {string} --> Tipo Pago extraordinario: {string}")
	public void mediante_los_botones_de_Accion_selecciona_la_opcion_boton_Tipo_Pago_extraordinario(String accion,String boton, String tipoPago) {
		if (accion.equals("Pagos")) {
			HeaderActions.clickActionByText(accion);
			FormActions.takeScreenshot();
			if (boton.length() > 0) {
				if (boton.equals("Negociación")) {
					FormActions.clickOn(PaymentsMainForm.Buttons.cmdCommand3IdCMPAYMENTST7N);
					if (tipoPago.length() > 0) {
						FormActions.selectRadioButtonValue(NegotiationPaymentsModalForm.Negotiation.reductionType,tipoPago);
					}
				}
			}
		}
		FormActions.takeScreenshot();
	}

	
	@Entonces("en pestaña de {string} se valida la tabla de amortización modificada")
	public void en_pestaña_de_se_valida_la_tabla_de_amortización_modificada(String tab) {
		if (tab.equals("Estado Actual")) {
			FormActions.clickLayout(GeneralInformationMainForm.Layouts.lytGroupLayout1660IdGGENERALIIO430193);
			FormActions.scrollToElementBotton(AmortizationFormForm.gridAmortization);
			FormActions.takeScreenshot();
			GridActions.scrollToRight(AmortizationFormForm.gridAmortization);
			FormActions.takeScreenshot();
		}
	}

	@Cuando("diligencia el formulario pagos {string}, {string}, {string}, {string}, {string} y precionar {string}")
	public void diligencia_el_formulario_pagos_y_precionar(String monedaPago, String formaPago, String referemcia, String monto, String descripcion, String boton) {
		if(monedaPago.length()>0){FormActions.selectByText(PaymentsMainForm.Payment.currency, monedaPago);}
		if(formaPago.length()>0){FormActions.selectByText(PaymentsMainForm.Payment.paymentsTypes, formaPago);}
		if(referemcia.length()>0){ FormActions.enterText(PaymentsMainForm.Payment.reference, referemcia); }
		if(monto.length()>0){ FormActions.enterText(PaymentsMainForm.Payment.value, monto); }
		if(descripcion.length()>0){ FormActions.enterText(PaymentsMainForm.Payment.notes, descripcion); }
		if(boton.equals("Guardar")){
			FormActions.clickOn(PaymentsMainForm.Buttons.cmdCommand2IdCMPAYMENTST3A);
		}
	}

	@Entonces("en Pestaña {string} se marca el registro correspondiente para verificar el abono realizado")
	public void en_Pestaña_se_marca_el_registro_correspondiente_para_verificar_el_abono_realizado(String tab) {
		 if(tab.equals("Abonos")){
		    	FormActions.clickLayout(GeneralInformationMainForm.Layouts.lytGroup1134IdGGENERALOTN662193);
		 }
		 GridActions.selectRecord(PaymentQueryFormForm.gridPayment, 1);
		 BaseActions.takeScreenshot();		
	}
	
	@Cuando("en Fecha valor ingresar la {string} y presionar boton {string} y presionar {string}")
	public void en_Fecha_valor_ingresar_la_y_presionar_boton_y_presionar(String fechaValor, String botonFechaValor, String botonMensaje) {
	   FormActions.setDate(ValueDateFormForm.ValueDateFilter.valueDate, fechaValor);
	   if(botonFechaValor.equals("Aplicar")) {
		   FormActions.clickOn(ValueDateMainForm.Buttons.cmdCommand1IdCMVALUEDATNNN);
	   }
	   if(botonMensaje.equals("Aceptar")) {
		   FormActions.clickOn(ValueDateMainForm.Buttons.btnConfirmCreation);
	   }
	}
	
	@Cuando("en la pestaña {string}, en la tabla de amortización se selecciona el estado {string}")
	public void en_la_pestaña_en_la_tabla_de_amortización_se_selecciona_el_estado(String tab, String estado) {
		FormActions.waitUntilElementIsPresent(GeneralInformationMainForm.Layouts.lytGroupLayout1660IdGGENERALIIO430193, 10);
		FormActions.scrollToBeginingOfThePage();
		if(tab.equals("Estado Actual")){
	    	FormActions.clickLayout(GeneralInformationMainForm.Layouts.lytGroupLayout1660IdGGENERALIIO430193);
		}
		FormActions.scrollToPercentage(45);
		GridActions.scrollToRight(AmortizationFormForm.gridAmortization);
		GridActions.selectRecordByColumnAndText(AmortizationFormForm.gridAmortization, 21, estado);
	}

	@Entonces("se valida el devengamiento de intereses corrientes")
	public void se_valida_el_devengamiento_de_intereses_corrientes() {
	    BaseActions.takeScreenshot();
	}
}

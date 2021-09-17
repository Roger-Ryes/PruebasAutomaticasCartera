package com.cobiscorp.cobis.lnspr.test.impl.steps;

import com.cobiscorp.cobis.assts.cmmns.test.LoanStatusChangeMainForm;
import com.cobiscorp.cobis.assts.trnsc.test.LoanDisbursementMainForm;
import com.cobiscorp.cobis.assts.trnsc.test.PaymentModeFormForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.LoansCreateFormForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.LoansUpdateFormManual;
import com.cobiscorp.cobis.serenity.actions.BaseActions;
import com.cobiscorp.cobis.serenity.actions.ContainerActions;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.HeaderActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;

import io.cucumber.java.es.Cuando;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.text.DecimalFormat;

public class DesembolsoDeOperacionesStepDefinitions {
	@Cuando("realiza la busqueda por {string} con el {string}")
	public void realiza_la_busqueda_por_BuscarPor_con_el_numeroDeOperacion(String buscarPor, String numeroOperacion) {
		 FormActions.selectByText(LoansUpdateFormManual.Buttons.searchByButton, buscarPor);
		    if(buscarPor.equals("Num. Préstamo")){
		    	FormActions.enterText(LoansUpdateFormManual.LoansUpdate.inputSearchByNumPres, numeroOperacion);
		    }	    
		    else if(buscarPor.equals("Cliente")){
//		    	FormActions.clickTextButton(LoansUpdateFormManual.LoansUpdate.inputSearchByCostumer);
		    	FormActions.enterText(LoansUpdateFormManual.LoansUpdate.inputSearchByCostumer, numeroOperacion);
		    	
		    }
		    FormActions.clickOn(LoansUpdateFormManual.Buttons.cmdCommandVA_VAIMAGEBUTTONNN_614498);
		    GridActions.selectRecord(LoansUpdateFormManual.gridLoansUpdate, 1);
	}
	
	@Cuando("selecciona del menu de acciones la opcion {string}")
	public void selecciona_del_menu_de_acciones_la_opcion(String accion) {
		HeaderActions.clickActionByText(accion);
		FormActions.takeScreenshot();
	}
	
	public static Double convertirNumero(String valor1){
	    int lastPosComas = -1;
	    int lastPosPuntos = -1;

	    lastPosComas = valor1.lastIndexOf(",");
	    lastPosPuntos = valor1.lastIndexOf(".");

	    if (lastPosComas > lastPosPuntos)
	    {
	    	valor1 = valor1.replace(".", "");
	        valor1 = valor1.replace(",", ".");
	    }
	    else
	    {
	        valor1 = valor1.replace(",", "");
	    }

	    Double valorDouble = new Double(valor1);
	    
	    return valorDouble;
	}
	
	@Cuando("precionar {string} y llenar la informacion {string}, {string}, {string}, {string}, {string} y presionar {string}")
	public void precionar_y_llenar_la_informacion_y_presionar(String botonDetalleDesembolso, String monedaDeDesembolso, String valor, String oficina, String formaDePago, String referencia, String botonModal) {
	    if(botonDetalleDesembolso.length()>0){
	    	FormActions.clickOn(LoanDisbursementMainForm.GridDetailPaymentForm.Buttons.btnGridCommandIdCEQV201QV597348889606);
	    }
	    BaseActions.waitUntilElementIsPresent(PaymentModeFormForm.PaymentForm.currencyId, 10);
	    if(monedaDeDesembolso.length()>0){ FormActions.selectByText(PaymentModeFormForm.PaymentForm.currencyId, monedaDeDesembolso); }
	    if(valor.length()>0){
	    	String monto_a_liquidar = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(PaymentModeFormForm.DisbursementResult.difference.getId())).getTextValue();
	    	Double montoALiquidar= convertirNumero(monto_a_liquidar);
	    	String result = String.valueOf(montoALiquidar*(Double.parseDouble(valor)/100));
	    	System.out.println("liquidar: "+ monto_a_liquidar);
	    	System.out.println("montoALiquidar: "+montoALiquidar);
	    	System.out.println("Valor%: "+valor);
	    	System.out.println("result: "+ result);
	    	FormActions.enterText(PaymentModeFormForm.PaymentForm.payAmount, result); }
	    if(oficina.length()>0){ FormActions.selectByText(PaymentModeFormForm.PaymentForm.officeId, oficina); }
	    if(formaDePago.length()>0){ FormActions.selectByText(PaymentModeFormForm.PaymentForm.payFormId, formaDePago); }
	    if(referencia.length()>0){ FormActions.enterText(PaymentModeFormForm.PaymentForm.accountNumber, referencia); }
	    if(botonModal.length()>0){ FormActions.clickOn(PaymentModeFormForm.Buttons.cmdCommand1IdCMTPAYMENTNS7); }
	}

	@Cuando("se presenta el mensaje {string} y se presiona {string}")
	public void se_presenta_el_mensaje_y_se_presiona(String mensaje, String boton) {
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, 20);
		ValidationActions.isEquals(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, mensaje);
		if(boton.equals("Enviar")){
			FormActions.clickOn(LoanDisbursementMainForm.Buttons.cmdCommand1IdCMTLOANDISS5N);
		}
	}
	
	@Cuando("diligencia el formulario de Desembolso de Prestamo, seleccionar el registro ingresado y {string}, presenta mensaje {string} se presiona {string}")
	public void diligencia_el_formulario_de_Desembolso_de_Prestamo_seleccionar_el_registro_ingresado_y_presenta_mensaje_se_presiona(String botonGrid, String mensaje, String borrarGrid) {
		if(botonGrid.toLowerCase().equals("eliminar")){
			GridActions.clickDeleteRecord(LoanDisbursementMainForm.gridDetailPaymentForm, 1);
			GridActions.clickConfirmDelete(true);
		}
		
	}


}

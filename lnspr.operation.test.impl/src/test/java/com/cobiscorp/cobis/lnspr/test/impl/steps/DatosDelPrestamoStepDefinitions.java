package com.cobiscorp.cobis.lnspr.test.impl.steps;

import java.util.List;

import org.openqa.selenium.WebElement;

import com.cobiscorp.cobis.assts.cmmns.test.LoanStatusChangeMainForm;
import com.cobiscorp.cobis.assts.qerys.test.GeneralInformationMainForm;
import com.cobiscorp.cobis.assts.qerys.test.LoanTransactionsFormForm;
import com.cobiscorp.cobis.assts.qerys.test.PaymentQueryFormForm;
import com.cobiscorp.cobis.assts.trnsc.test.NegotiationPaymentsModalForm;
import com.cobiscorp.cobis.assts.trnsc.test.ValueDateMainForm;
import com.cobiscorp.cobis.assts.trnsc.test.ValueDateMainForm.ValueDateFilter;
import com.cobiscorp.cobis.lnspr.oprtn.test.LoansCreateFormForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.LoansUpdateFormManual;
import com.cobiscorp.cobis.serenity.actions.BaseActions;
import com.cobiscorp.cobis.serenity.actions.ContainerActions;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.HeaderActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DatosDelPrestamoStepDefinitions {

	@Cuando("se busca por Prestamo {string} con {string}")
	public void se_busca_por_Prestamo(String buscarPor, String numeroDeOperacion) {
		FormActions.selectByText(LoansUpdateFormManual.Buttons.searchByButton, buscarPor);
		if (buscarPor.equals("Num. Préstamo")) {
			FormActions.enterText(LoansUpdateFormManual.LoansUpdate.inputSearchByNumPres, numeroDeOperacion);
		}

		FormActions.clickOn(LoansUpdateFormManual.Buttons.cmdCommandVA_VAIMAGEBUTTONNN_614498);
		GridActions.selectRecord(LoansUpdateFormManual.gridLoansUpdate, 1);
		FormActions.takeScreenshot();
	}

	@Cuando("se presiona el boton de Accion opcion {string}")
	public void se_presiona_el_boton_de_Accion_opcion(String boton) {
		if (boton.equals("Reversos Transacciones")) {
			HeaderActions.clickActionByText(boton);
		}
		FormActions.takeScreenshot();
	}

	@Cuando("llenamos campo Observacion {string}")
	public void llenamos_campo_Observacion(String observacion) {
		FormActions.enterText(ValueDateMainForm.valueDateFilter.observation, observacion);
		FormActions.takeScreenshot();
	}
	
	@Cuando("presionamos el boton {string}")
	public void presionamos_el_boton(String boton) {
		if (boton.equals("Aplicar")) {
	    FormActions.clickOn(ValueDateMainForm.Buttons.cmdCommand1IdCMVALUEDATNNN);
		} else if (boton.equals("Aceptar")) {
			FormActions.clickOn(NegotiationPaymentsModalForm.Buttons.cmdCommand1IdCMTNEGOTIA2A4);
		}

	    FormActions.takeScreenshot();
	}
	
	@Entonces("se valida que muestre mensaje {string}")
	public void se_valida_que_muestre_mensaje(String message) {
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, 10);
		ValidationActions.isEquals(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, message);
		FormActions.takeScreenshot();
	}

	@Entonces("se valida que muestre mensaje {string} y cerrar ventana")
	public void se_valida_que_muestre_mensaje_y_cerrar_ventana(String message) {
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, 10);
		ValidationActions.isEquals(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, message);
		FormActions.takeScreenshot();
		FormActions.clickOn(LoansCreateFormForm.MessageInformation.btnCloseMessageSuccess);
		BaseActions.waitUntilElementIsEnabledAndClickable(ValueDateMainForm.Buttons.btnClose, 30);
		FormActions.clickOn(ValueDateMainForm.Buttons.btnClose);
	}

	
	@Cuando("selecciona el ultimo abono, se llena el campo {string}")
	public void selecciona_el_ultimo_abono_se_llena_el_campo(String observacion) {
		WebElement dynamicElement = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(ValueDateMainForm.gridTransactionLoan.getId()));
		List<WebElement> elements = dynamicElement.findElements(By.xpath("//*[@id='"+ValueDateMainForm.gridTransactionLoan.getId()+"']//table/tbody/tr"));
		Integer num = elements.size();
		System.out.println("Size: "+ num);
	
		GridActions.selectRecord(ValueDateMainForm.gridTransactionLoan, num);
		if(observacion.length()>0){
			FormActions.enterText(ValueDateMainForm.valueDateFilter.observation, observacion);
		}
		FormActions.takeScreenshot();
	}

	@Cuando("selecciona el abono intermedio, se llena el campo {string}")
	public void selecciona_el_abono_intermedio_se_llena_el_campo(String observacion) {
		WebElement dynamicElement = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(ValueDateMainForm.gridTransactionLoan.getId()));
		List<WebElement> elements = dynamicElement.findElements(By.xpath("//*[@id='"+ValueDateMainForm.gridTransactionLoan.getId()+"']//table/tbody/tr"));
		Integer num = elements.size();
		num = num/2+1;
		System.out.println("Size: "+ num);
	
		GridActions.selectRecord(ValueDateMainForm.gridTransactionLoan, num);
		if(observacion.length()>0){
			FormActions.enterText(ValueDateFilter.observation, observacion);
		}
		FormActions.takeScreenshot();
	}

	@Cuando("presionamos el boton {string}, luego presionar {string}")
	public void presionamos_el_boton_luego_presionar(String botonModal, String botonMensaje) {
		if(botonModal.equals("Aplicar")){
			FormActions.clickOn(ValueDateMainForm.Buttons.cmdCommand1IdCMVALUEDATNNN);
		}if(botonMensaje.equals("Aceptar")){		
			FormActions.clickOn(ValueDateMainForm.Buttons.btnConfirmCreation);
		}
	}

	@Entonces("se valida que la transaccion se muestre {string} en la pestaña {string}, luego en la Pestaña {string}, Transacciones Reversadas se valida el registro")
	public void se_valida_que_la_transaccion_se_muestre_en_la_pestaña_luego_en_la_Pestaña_Transacciones_Reversadas_se_valida_el_registro(String transaccion, String tabAbono, String tabTransaccion) {
	    if(tabAbono.equals("Abonos")){
	    	FormActions.clickLayout(GeneralInformationMainForm.Layouts.lytGroup1134IdGGENERALOTN662193);
	    	if(transaccion.length()>0){
	    		BaseActions.waitUntilElementIsPresent(PaymentQueryFormForm.gridPayment, 10);
	    		
	    		WebElement dynamicElement = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(PaymentQueryFormForm.gridPayment.getId()));
				List<WebElement> elements = dynamicElement.findElements(By.xpath("//*[@id='"+PaymentQueryFormForm.gridPayment.getId()+"']//table/tbody/tr/td/span[text() = '"+transaccion+"']"));
				//Si elements contiene cero elementos, no existe el valor "transaccion", en la Grid
	    		if(elements.size()<=0){
	    			// Para generar el error y caer la prueba
	    			ValidationActions.isEquals(GridActions.getTargetByRowAndColumn(PaymentQueryFormForm.gridPayment, 1, 1),transaccion);
	    		}
	    		BaseActions.takeScreenshot();
		    }
	    }
	    if(tabTransaccion.equals("Transacciones")){
	    	FormActions.clickLayout(GeneralInformationMainForm.Layouts.lytGroup2225IdGGENERALNNN702193);
ContainerActions.activeIframe();
//	    	FormActions.scrollToPercentage(190);
	    	FormActions.scrollTotheEndOfThePage();
	    	WebElement dynamicElement = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.id(LoanTransactionsFormForm.gridReversedTransaction.getId()));
			List<WebElement> elements = dynamicElement.findElements(By.xpath("//*[@id='"+LoanTransactionsFormForm.gridReversedTransaction.getId()+"']//table/tbody/tr"));
			Integer num = elements.size();
	    	ValidationActions.isEquals(GridActions.getTargetByRowAndColumn(LoanTransactionsFormForm.gridReversedTransaction, num, 6), "RV");
	    	BaseActions.takeScreenshot();
	    }
	}

	@Cuando("se selecciona el registro a reversar llenamos campo Observacion {string}")
	public void se_selecciona_el_registro_a_reversar_llenamos_campo_Observacion(String observacion) {
		GridActions.selectRecord(ValueDateMainForm.gridTransactionLoan, 1);
		FormActions.enterText(ValueDateFilter.observation, observacion);
		FormActions.takeScreenshot();
	}
	
	@Cuando("presionamos el boton {string} y validamos que muestre mensaje {string} se presiona opcion {string}")
	public void presionamos_el_boton_Aplicar_y_validamos_que_muestre_mensaje_se_presiona_opcion_Aceptar(String boton, String message, String confim) {
		if(boton.equals("Aplicar")){
			FormActions.clickOn(ValueDateMainForm.Buttons.cmdCommand1IdCMVALUEDATNNN);
			FormActions.takeScreenshot();
		}

		if(confim.equals("Aceptar")){
			BaseActions.waitUntilElementIsEnabledAndClickable(ValueDateMainForm.Buttons.confirmMsg, 10);
			ValidationActions.isEquals(ValueDateMainForm.Buttons.confirmMsg, message);
			FormActions.takeScreenshot();
			FormActions.clickOn(ValueDateMainForm.Buttons.btnConfirmCreation);
		}
		FormActions.takeScreenshot();
	}
	
	@Entonces("se valida que ejecute la accion y muestre mensaje {string}")
	public void se_valida_que_ejecute_la_accion_y_muestre_mensaje(String message) {
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, 10);
		ValidationActions.isEquals(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, message);
		FormActions.takeScreenshot();
	}

	@Entonces("se valida el mensaje en el campo observacion {string}")
	public void se_valida_el_mensaje_en_el_campo_observacion(String mensaje) {
		ValidationActions.isEquals(ValueDateFilter.errorObservation, mensaje);
		BaseActions.takeScreenshot();
	}

}

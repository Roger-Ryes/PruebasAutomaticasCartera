package com.cobiscorp.cobis.lnspr.test.impl.steps;

import com.cobiscorp.cobis.assts.cmmns.test.LoanStatusChangeMainForm;
import com.cobiscorp.cobis.assts.trnsc.test.ValueDateMainForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.LoansCreateFormForm;
import com.cobiscorp.cobis.lnspr.oprtn.test.LoansUpdateFormManual;
import com.cobiscorp.cobis.serenity.actions.BaseActions;
import com.cobiscorp.cobis.serenity.actions.FormActions;
import com.cobiscorp.cobis.serenity.actions.GridActions;
import com.cobiscorp.cobis.serenity.actions.HeaderActions;
import com.cobiscorp.cobis.serenity.actions.ValidationActions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CambiosDeEstadoStepDefinitions {

	@Cuando("realiza la busqueda por {string} o con numero {string}")
	public void realiza_la_busqueda_por_o_con_numero(String buscarPor, String numeroDeOperacion) {
		if(buscarPor.equals("Num. Préstamo")){
	    	FormActions.selectByText(LoansUpdateFormManual.Buttons.searchByButton, buscarPor);
			FormActions.enterText(LoansUpdateFormManual.LoansUpdate.inputSearchByNumPres, numeroDeOperacion);
	    }
		FormActions.clickOn(LoansUpdateFormManual.Buttons.cmdCommandVA_VAIMAGEBUTTONNN_614498);
	    FormActions.takeScreenshot();
	}
	
	@Cuando("selecciona de la grilla una operacion en estado no vigente")
	public void selecciona_de_la_grilla_una_operacion_en_estado_no_vigente() {
		GridActions.selectRecord(LoansUpdateFormManual.gridLoansUpdate, 1);
		FormActions.takeScreenshot();
	}
	
	@Cuando("selecciona Nuevo Estado {string}")
	public void selecciona_Nuevo_Estado(String estado) {
		FormActions.selectByText(LoanStatusChangeMainForm.Loan.newStatus, estado);
		FormActions.takeScreenshot();
	}
	
	@Cuando("Presiona el boton {string}")
	public void presiona_el_boton(String boton) {
		WebElement dynamicElement = BrowseTheWeb.as(theActorInTheSpotlight()).$(By.xpath("//div[contains(@class,'modal-content')]//div[contains(@id,'QV_LM37_VTI26')]"));
		List<WebElement> elements = dynamicElement.findElements(By.xpath("//div[contains(@class,'modal-content')]//div[contains(@id,'QV_LM37_VTI26')]//ul/li"));
		if(elements.size()>1){
			FormActions.clickOn(LoanStatusChangeMainForm.ModalGridAmortization.modalBtnLastPage);
		}
		
		if(boton.equals("Guardar")){
			FormActions.clickOn(LoanStatusChangeMainForm.Buttons.cmdCommand1IdCMTLOANSTASTA);
		}
		FormActions.takeScreenshot();
	}
	
	@Entonces("el sistema despliega el mensaje de alerta {string}, y en Datos del Prestamo se valida nuevo {string}")
	public void el_sistema_despliega_el_mensaje_de_alerta_y_en_Datos_del_Prestamo_se_valida_nuevo(String message, String estado) {
		BaseActions.waitUntilElementIsPresent(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, 10);
		ValidationActions.isEquals(LoansCreateFormForm.MessageInformation.messageSuccessfulBulding, message);
		FormActions.takeScreenshot();
				
		FormActions.clickOn(LoansCreateFormForm.MessageInformation.btnCloseMessageSuccess);
		BaseActions.waitUntilElementIsEnabledAndClickable(ValueDateMainForm.Buttons.btnClose, 30);
		FormActions.clickOn(ValueDateMainForm.Buttons.btnClose);
		FormActions.takeScreenshot();
		
		ValidationActions.isEquals(HeaderActions.getInfoValue(3), estado);
		FormActions.takeScreenshot();
	}
}

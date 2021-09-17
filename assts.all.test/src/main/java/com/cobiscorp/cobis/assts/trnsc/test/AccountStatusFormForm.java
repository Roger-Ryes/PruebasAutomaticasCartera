/*
 * Esta aplicacion es parte de los paquetes bancarios propiedad de COBISCORP.
 * Su uso no autorizado queda expresamente prohibido asi como cualquier
 * alteracion o agregado hecho por alguno de sus usuarios sin el debido
 * consentimiento por escrito de COBISCORP.
 * Este programa esta protegido por la ley de derechos de autor y por las
 * convenciones internacionales de propiedad intelectual. Su uso no
 * autorizado dara derecho a COBISCORP para obtener ordenes de secuestro
 * o retencion y para perseguir penalmente a los autores de cualquier infraccion.
 */
package com.cobiscorp.cobis.assts.trnsc.test;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.impl.*;

public class AccountStatusFormForm{
	public static final Loan loan = Singleton.getInstance(Loan.class);

	public static final GridAccountStatus gridAccountStatus = Singleton.getInstance(GridAccountStatus.class);
	private AccountStatusFormForm() {
		throw new IllegalStateException("AccountStatusFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTASSTSFIAS9 cmdCommand1IdCMTASSTSFIAS9 = Singleton.getInstance(CmdCommand1IdCMTASSTSFIAS9.class);
		
		public static class CmdCommand1IdCMTASSTSFIAS9 extends COBISButton{
			public CmdCommand1IdCMTASSTSFIAS9 () {
				this.init("CM_TASSTSFI_AS9", "Vista previa");
			}
		}
	
		public static final CmdCommand2IdCMTASSTSFIS64 cmdCommand2IdCMTASSTSFIS64 = Singleton.getInstance(CmdCommand2IdCMTASSTSFIS64.class);
		
		public static class CmdCommand2IdCMTASSTSFIS64 extends COBISButton{
			public CmdCommand2IdCMTASSTSFIS64 () {
				this.init("CM_TASSTSFI_S64", "Enviar");
			}
		}
	
		public static final BtnVAVABUTTONPMSVXME604859IdVAVABUTTONPMSVXME604859 btnVAVABUTTONPMSVXME604859IdVAVABUTTONPMSVXME604859 = Singleton.getInstance(BtnVAVABUTTONPMSVXME604859IdVAVABUTTONPMSVXME604859.class);
		
		public static class BtnVAVABUTTONPMSVXME604859IdVAVABUTTONPMSVXME604859 extends COBISButton{
			public BtnVAVABUTTONPMSVXME604859IdVAVABUTTONPMSVXME604859 () {
				this.init("VA_VABUTTONPMSVXME_604859", "Buscar");
			}
		}
	

	}
	

	public static class Loan {
	
		private Loan() {
			throw new IllegalStateException("AccountStatusFormForm is a utility class");
		}
		
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final FeeEndDate feeEndDate = Singleton.getInstance(FeeEndDate.class);

		public static class ClientName extends COBISInputTextButton {
			public ClientName() {
				this.init("VA_CLIENTNAMEEZJBH_766859","Cliente");
			}
		}			

		public static class FeeEndDate extends COBISDatePicker {
			public FeeEndDate() {
				this.init("VA_FEEENDDATEXFOYY_333859","Fecha");
			}
		}			
	}
	
	public static class GridAccountStatus extends COBISGrid {
		public GridAccountStatus() {
			this.init("QV_3580_21558", "QV_3580_21558");
		} 

		public static final Date date = Singleton.getInstance(Date.class);
		public static final ClientId clientId = Singleton.getInstance(ClientId.class);
		public static final BankNumber bankNumber = Singleton.getInstance(BankNumber.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final GroupName groupName = Singleton.getInstance(GroupName.class);
		public static final Email email = Singleton.getInstance(Email.class);
		public static final ToPrint toPrint = Singleton.getInstance(ToPrint.class);

		public static class Date extends COBISDatePicker {
			public Date() {
				this.init("VA_DATEFIELDKACVTJ_411859","Fecha");
			}
		}			

		public static class ClientId extends COBISInputValue {
			public ClientId() {
				this.init("VA_TEXTINPUTBOXCDM_103859","CodigoCliente");
			}
		}			

		public static class BankNumber extends COBISInputValue {
			public BankNumber() {
				this.init("VA_TEXTINPUTBOXNAI_832859","NumerodeBanco");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_TEXTINPUTBOXAYT_745859","NombredelCliente");
			}
		}			

		public static class GroupName extends COBISInputValue {
			public GroupName() {
				this.init("VA_TEXTINPUTBOXMHX_934859","Grupo");
			}
		}			

		public static class Email extends COBISInputValue {
			public Email() {
				this.init("VA_TEXTINPUTBOXRFI_286859","Correo");
			}
		}			

		public static class ToPrint extends COBISCheckBox {
			public ToPrint() {
				this.init("VA_CHECKBOXDCCDNZV_992859","Imprimir");
			}
		}			
	}
}

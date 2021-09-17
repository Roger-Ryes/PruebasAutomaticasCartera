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

public class CompaniesDiscountsFileFormModalForm{
	public static final CompaniesDiscountsFileList companiesDiscountsFileList = Singleton.getInstance(CompaniesDiscountsFileList.class);

	private CompaniesDiscountsFileFormModalForm() {
		throw new IllegalStateException("CompaniesDiscountsFileFormModalForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTASSTSBLS7 cmdCommand1IdCMTASSTSBLS7 = Singleton.getInstance(CmdCommand1IdCMTASSTSBLS7.class);
		
		public static class CmdCommand1IdCMTASSTSBLS7 extends COBISButton{
			public CmdCommand1IdCMTASSTSBLS7 () {
				this.init("CM_TASSTSBL__S7", "Guardar");
			}
		}
	
		public static final CmdCommand2IdCMTASSTSBLBC3 cmdCommand2IdCMTASSTSBLBC3 = Singleton.getInstance(CmdCommand2IdCMTASSTSBLBC3.class);
		
		public static class CmdCommand2IdCMTASSTSBLBC3 extends COBISButton{
			public CmdCommand2IdCMTASSTSBLBC3 () {
				this.init("CM_TASSTSBL_BC3", "Cancelar");
			}
		}
	

	}
	

	public static class CompaniesDiscountsFileList {
	
		private CompaniesDiscountsFileList() {
			throw new IllegalStateException("CompaniesDiscountsFileFormModalForm is a utility class");
		}
		
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final DateExpirationDiscounts dateExpirationDiscounts = Singleton.getInstance(DateExpirationDiscounts.class);
		public static final Client client = Singleton.getInstance(Client.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final DocumentType documentType = Singleton.getInstance(DocumentType.class);
		public static final DocumentValue documentValue = Singleton.getInstance(DocumentValue.class);
		public static final Debit debit = Singleton.getInstance(Debit.class);
		public static final CompanyStatusOk companyStatusOk = Singleton.getInstance(CompanyStatusOk.class);
		public static final DebitAll debitAll = Singleton.getInstance(DebitAll.class);
		public static final Fee fee = Singleton.getInstance(Fee.class);
		public static final CompanyComments companyComments = Singleton.getInstance(CompanyComments.class);
		public static final ErrorDesc errorDesc = Singleton.getInstance(ErrorDesc.class);

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_OPERATIONUKLPII_460596","Operacion");
			}
		}			

		public static class DateExpirationDiscounts extends COBISDatePicker {
			public DateExpirationDiscounts() {
				this.init("VA_DATEEXPIRATIUUS_245596","Fechadevencimiento");
			}
		}			

		public static class Client extends COBISInputValue {
			public Client() {
				this.init("VA_CLIENTAEKEVKXUZ_894596","CodCliente");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_CLIENTNAMENBVPZ_207596","Nombres");
			}
		}			

		public static class DocumentType extends COBISInputValue {
			public DocumentType() {
				this.init("VA_DOCUMENTTYPEPZH_884596","TipodeIdentificacion");
			}
		}			

		public static class DocumentValue extends COBISInputValue {
			public DocumentValue() {
				this.init("VA_DOCUMENTVALUEEE_227596","Identificacion");
			}
		}			

		public static class Debit extends COBISInputValue {
			public Debit() {
				this.init("VA_DEBITZIQFQBZJOQ_104596","ValorCuota");
			}
		}			

		public static class CompanyStatusOk extends COBISComboBox {
			public CompanyStatusOk() {
				this.init("VA_COMPANYSTATUSKS_684596","Estado");
			}
		}			

		public static class DebitAll extends COBISInputValue {
			public DebitAll() {
				this.init("VA_DEBITALLKVPUZSH_219596","ValorAdeudado");
			}
		}			

		public static class Fee extends COBISInputValue {
			public Fee() {
				this.init("VA_FEEOAASNERXKXJM_794596","TotalAdeudado");
			}
		}			

		public static class CompanyComments extends COBISInputValue {
			public CompanyComments() {
				this.init("VA_COMPANYCOMMESST_885596","Comentario");
			}
		}			

		public static class ErrorDesc extends COBISInputValue {
			public ErrorDesc() {
				this.init("VA_ERRORDESCQGHVJA_314596","Errorenlacargadelarchivo");
			}
		}			
	}
}

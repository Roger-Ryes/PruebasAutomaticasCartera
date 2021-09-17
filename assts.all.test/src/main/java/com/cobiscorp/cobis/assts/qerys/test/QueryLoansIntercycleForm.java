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
package com.cobiscorp.cobis.assts.qerys.test;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.impl.*;

public class QueryLoansIntercycleForm{

	public static final GridLoanIntercycle gridLoanIntercycle = Singleton.getInstance(GridLoanIntercycle.class);
	private QueryLoansIntercycleForm() {
		throw new IllegalStateException("QueryLoansIntercycleForm is a utility class");
	}
	
	public static class GridLoanIntercycle extends COBISGrid {
		public GridLoanIntercycle() {
			this.init("QV_VE62_BRX74", "QV_VE62_BRX74");
		} 

		public static final DesOperationType desOperationType = Singleton.getInstance(DesOperationType.class);
		public static final LoanBankID loanBankID = Singleton.getInstance(LoanBankID.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final DesStatus desStatus = Singleton.getInstance(DesStatus.class);
		public static final ExpirationDate expirationDate = Singleton.getInstance(ExpirationDate.class);
		public static final CodCurrency codCurrency = Singleton.getInstance(CodCurrency.class);
		public static final DisbursementDate disbursementDate = Singleton.getInstance(DisbursementDate.class);
		public static final ClientID clientID = Singleton.getInstance(ClientID.class);
		public static final NumProcedure numProcedure = Singleton.getInstance(NumProcedure.class);
		public static final OfficerID officerID = Singleton.getInstance(OfficerID.class);
		public static final OfficeID officeID = Singleton.getInstance(OfficeID.class);
		public static final PreviousOper previousOper = Singleton.getInstance(PreviousOper.class);
		public static final LoanID loanID = Singleton.getInstance(LoanID.class);
		public static final Adjustment adjustment = Singleton.getInstance(Adjustment.class);
		public static final RedesCont redesCont = Singleton.getInstance(RedesCont.class);
		public static final OperationTypeID operationTypeID = Singleton.getInstance(OperationTypeID.class);

		public static class DesOperationType extends COBISInputValue {
			public DesOperationType() {
				this.init("VA_TEXTINPUTBOXCPU_105291","TipoPrestamo");
			}
		}			

		public static class LoanBankID extends COBISInputValue {
			public LoanBankID() {
				this.init("VA_TEXTINPUTBOXJIE_823291","NumPrestamo");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_TEXTINPUTBOXWEU_957291","NombreCliente");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXTIL_871291","MontoPrestamo");
			}
		}			

		public static class DesStatus extends COBISInputValue {
			public DesStatus() {
				this.init("VA_TEXTINPUTBOXCTM_542291","EstadoPrestamo");
			}
		}			

		public static class ExpirationDate extends COBISDatePicker {
			public ExpirationDate() {
				this.init("VA_DATEFIELDPTAOWQ_552291","Fechavencimiento");
			}
		}			

		public static class CodCurrency extends COBISInputValue {
			public CodCurrency() {
				this.init("VA_TEXTINPUTBOXYCA_817291","CodMoneda");
			}
		}			

		public static class DisbursementDate extends COBISDatePicker {
			public DisbursementDate() {
				this.init("VA_DATEFIELDWNGFQM_623291","FechaDesembolso");
			}
		}			

		public static class ClientID extends COBISInputValue {
			public ClientID() {
				this.init("VA_TEXTINPUTBOXGFS_556291","CodigoCliente");
			}
		}			

		public static class NumProcedure extends COBISInputValue {
			public NumProcedure() {
				this.init("VA_TEXTINPUTBOXYFU_218291","NumTramite");
			}
		}			

		public static class OfficerID extends COBISInputValue {
			public OfficerID() {
				this.init("VA_TEXTINPUTBOXHWZ_788291","OfficerID");
			}
		}			

		public static class OfficeID extends COBISInputValue {
			public OfficeID() {
				this.init("VA_TEXTINPUTBOXDAC_519291","OfficeID");
			}
		}			

		public static class PreviousOper extends COBISInputValue {
			public PreviousOper() {
				this.init("VA_TEXTINPUTBOXOUZ_520291","PreviousOper");
			}
		}			

		public static class LoanID extends COBISInputValue {
			public LoanID() {
				this.init("VA_TEXTINPUTBOXPVE_309291","LoanID");
			}
		}			

		public static class Adjustment extends COBISInputValue {
			public Adjustment() {
				this.init("VA_TEXTINPUTBOXHIU_311291","Adjustment");
			}
		}			

		public static class RedesCont extends COBISInputValue {
			public RedesCont() {
				this.init("VA_TEXTINPUTBOXKVV_478291","RedesCont");
			}
		}			

		public static class OperationTypeID extends COBISInputValue {
			public OperationTypeID() {
				this.init("VA_TEXTINPUTBOXDNV_217291","OperationTypeID");
			}
		}			
	}
}

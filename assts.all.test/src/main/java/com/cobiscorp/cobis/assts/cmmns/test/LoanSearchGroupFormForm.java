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
package com.cobiscorp.cobis.assts.cmmns.test;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.impl.*;

public class LoanSearchGroupFormForm{
	public static final LoanSearchFilter loanSearchFilter = Singleton.getInstance(LoanSearchFilter.class);

	public static final GridLoan gridLoan = Singleton.getInstance(GridLoan.class);
	private LoanSearchGroupFormForm() {
		throw new IllegalStateException("LoanSearchGroupFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVABUTTONMIOOIVQ638549IdVAVABUTTONMIOOIVQ638549 btnVAVABUTTONMIOOIVQ638549IdVAVABUTTONMIOOIVQ638549 = Singleton.getInstance(BtnVAVABUTTONMIOOIVQ638549IdVAVABUTTONMIOOIVQ638549.class);
		
		public static class BtnVAVABUTTONMIOOIVQ638549IdVAVABUTTONMIOOIVQ638549 extends COBISButton{
			public BtnVAVABUTTONMIOOIVQ638549IdVAVABUTTONMIOOIVQ638549 () {
				this.init("VA_VABUTTONMIOOIVQ_638549", "Buscar");
			}
		}
	

	}
	

	public static class LoanSearchFilter {
	
		private LoanSearchFilter() {
			throw new IllegalStateException("LoanSearchGroupFormForm is a utility class");
		}
		
		public static final NumIdentification numIdentification = Singleton.getInstance(NumIdentification.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final NumProcedures numProcedures = Singleton.getInstance(NumProcedures.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final DisbursementDate disbursementDate = Singleton.getInstance(DisbursementDate.class);
		public static final Officer officer = Singleton.getInstance(Officer.class);
		public static final AvanceSearch avanceSearch = Singleton.getInstance(AvanceSearch.class);

		public static class NumIdentification extends COBISInputTextButton {
			public NumIdentification() {
				this.init("VA_TEXTINPUTBOXHCG_720549","PorGrupo");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_TEXTINPUTBOXLPX_148549","NumPrestamo");
			}
		}			

		public static class NumProcedures extends COBISInputValue {
			public NumProcedures() {
				this.init("VA_TEXTINPUTBOXUDJ_171549","PorTramite");
			}
		}			

		public static class Office extends COBISComboBox {
			public Office() {
				this.init("VA_TEXTINPUTBOXTKU_514549","PorOficina");
			}
		}			

		public static class DisbursementDate extends COBISDatePicker {
			public DisbursementDate() {
				this.init("VA_DATEFIELDCVISIT_349549","PorFechaInicio");
			}
		}			

		public static class Officer extends COBISComboBox {
			public Officer() {
				this.init("VA_OFFICERKLHXZUAP_236549","PorOficial");
			}
		}			

		public static class AvanceSearch extends COBISCheckBox {
			public AvanceSearch() {
				this.init("VA_AVANCESEARCHJRS_939549","CriteriosSecundarios");
			}
		}			
	}
	
	public static class GridLoan extends COBISGrid {
		public GridLoan() {
			this.init("QV_3992_44545", "QV_3992_44545");
		} 

		public static final LoanBankID loanBankID = Singleton.getInstance(LoanBankID.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final StartDate startDate = Singleton.getInstance(StartDate.class);

		public static class LoanBankID extends COBISInputValue {
			public LoanBankID() {
				this.init("VA_TEXTINPUTBOXKXR_473549","NumPrestamoGrupal");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_TEXTINPUTBOXSFI_253549","NombreGrupo");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXQQF_208549","MontoPrestamo");
			}
		}			

		public static class StartDate extends COBISDatePicker {
			public StartDate() {
				this.init("VA_DATEFIELDYEFIRM_534549","Fechadeinicio");
			}
		}			
	}
}

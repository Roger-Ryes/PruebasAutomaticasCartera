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

public class QueryLoansSeguroForm{

	public static final GridSeguros gridSeguros = Singleton.getInstance(GridSeguros.class);
	private QueryLoansSeguroForm() {
		throw new IllegalStateException("QueryLoansSeguroForm is a utility class");
	}
	
	public static class GridSeguros extends COBISGrid {
		public GridSeguros() {
			this.init("QV_DF84_XNN39", "QV_DF84_XNN39");
		} 

		public static final Group group = Singleton.getInstance(Group.class);
		public static final LoanID loanID = Singleton.getInstance(LoanID.class);
		public static final LoanBankID loanBankID = Singleton.getInstance(LoanBankID.class);
		public static final ClientID clientID = Singleton.getInstance(ClientID.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final TypeID typeID = Singleton.getInstance(TypeID.class);
		public static final Type type = Singleton.getInstance(Type.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final DateValidityIni dateValidityIni = Singleton.getInstance(DateValidityIni.class);
		public static final DateValidityFin dateValidityFin = Singleton.getInstance(DateValidityFin.class);
		public static final Term term = Singleton.getInstance(Term.class);
		public static final Folio folio = Singleton.getInstance(Folio.class);
		public static final StatusDesc statusDesc = Singleton.getInstance(StatusDesc.class);

		public static class Group extends COBISInputValue {
			public Group() {
				this.init("VA_TEXTINPUTBOXBPH_891929","Group");
			}
		}			

		public static class LoanID extends COBISInputValue {
			public LoanID() {
				this.init("VA_TEXTINPUTBOXNZI_518929","LoanID");
			}
		}			

		public static class LoanBankID extends COBISInputValue {
			public LoanBankID() {
				this.init("VA_TEXTINPUTBOXJWY_848929","LoanBankID");
			}
		}			

		public static class ClientID extends COBISInputValue {
			public ClientID() {
				this.init("VA_TEXTINPUTBOXIQK_851929","ClientID");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_TEXTINPUTBOXPJQ_765929","Cliente");
			}
		}			

		public static class TypeID extends COBISInputValue {
			public TypeID() {
				this.init("VA_TEXTINPUTBOXOCT_289929","TypeID");
			}
		}			

		public static class Type extends COBISInputValue {
			public Type() {
				this.init("VA_TEXTINPUTBOXWWS_842929","TipoSeguro");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXDST_681929","Monto");
			}
		}			

		public static class DateValidityIni extends COBISDatePicker {
			public DateValidityIni() {
				this.init("VA_DATEFIELDDLSZDZ_593929","FechaVigIni");
			}
		}			

		public static class DateValidityFin extends COBISDatePicker {
			public DateValidityFin() {
				this.init("VA_DATEFIELDLZIUTE_366929","FechaVigFin");
			}
		}			

		public static class Term extends COBISInputValue {
			public Term() {
				this.init("VA_TEXTINPUTBOXKEL_574929","Plazo");
			}
		}			

		public static class Folio extends COBISInputValue {
			public Folio() {
				this.init("VA_TEXTINPUTBOXPLX_826929","Folio");
			}
		}			

		public static class StatusDesc extends COBISInputValue {
			public StatusDesc() {
				this.init("VA_TEXTINPUTBOXLNM_225929","Estado");
			}
		}			
	}
}

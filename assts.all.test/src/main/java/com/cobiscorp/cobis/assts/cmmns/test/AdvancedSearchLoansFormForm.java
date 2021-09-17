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

public class AdvancedSearchLoansFormForm{
	public static final LoanSearchFilter loanSearchFilter = Singleton.getInstance(LoanSearchFilter.class);

	private AdvancedSearchLoansFormForm() {
		throw new IllegalStateException("AdvancedSearchLoansFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class LoanSearchFilter {
	
		private LoanSearchFilter() {
			throw new IllegalStateException("AdvancedSearchLoansFormForm is a utility class");
		}
		
		public static final NumProcedures numProcedures = Singleton.getInstance(NumProcedures.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final CodCurrency codCurrency = Singleton.getInstance(CodCurrency.class);
		public static final DisbursementDate disbursementDate = Singleton.getInstance(DisbursementDate.class);
		public static final Status status = Singleton.getInstance(Status.class);
		public static final MigratedOper migratedOper = Singleton.getInstance(MigratedOper.class);
		public static final Type type = Singleton.getInstance(Type.class);

		public static class NumProcedures extends COBISInputValue {
			public NumProcedures() {
				this.init("VA_NUMPROCEDURESSS_883521","NumTramite");
			}
		}			

		public static class Office extends COBISDropDownList {
			public Office() {
				this.init("VA_OFFICEIZBTWUGLQ_256521","Oficina");
			}
		}			

		public static class CodCurrency extends COBISDropDownList {
			public CodCurrency() {
				this.init("VA_CODCURRENCYWYFH_403521","Moneda");
			}
		}			

		public static class DisbursementDate extends COBISDatePicker {
			public DisbursementDate() {
				this.init("VA_DISBURSEMENTDAE_580521","FechaDesembolso");
			}
		}			

		public static class Status extends COBISDropDownList {
			public Status() {
				this.init("VA_STATUSBETIKSGLY_234521","EstadoPrestamo");
			}
		}			

		public static class MigratedOper extends COBISInputValue {
			public MigratedOper() {
				this.init("VA_MIGRATEDOPERTVT_332521","PrestamoMigrado");
			}
		}			

		public static class Type extends COBISDropDownList {
			public Type() {
				this.init("VA_TYPEQKEVCBCXYDI_286521","TipoOperacion");
			}
		}			
	}
}

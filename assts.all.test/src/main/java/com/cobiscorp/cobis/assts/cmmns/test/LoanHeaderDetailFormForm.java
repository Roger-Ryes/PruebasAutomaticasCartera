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

public class LoanHeaderDetailFormForm{
	public static final Loan loan = Singleton.getInstance(Loan.class);

	private LoanHeaderDetailFormForm() {
		throw new IllegalStateException("LoanHeaderDetailFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class Loan {
	
		private Loan() {
			throw new IllegalStateException("LoanHeaderDetailFormForm is a utility class");
		}
		
		public static final SimpleLabel363101 simpleLabelVAVASIMPLELABELLL363101 = Singleton.getInstance(SimpleLabel363101.class);
		public static final StartDate startDate = Singleton.getInstance(StartDate.class);
		public static final SimpleLabel912101 simpleLabelVAVASIMPLELABELLL912101 = Singleton.getInstance(SimpleLabel912101.class);
		public static final EndDate endDate = Singleton.getInstance(EndDate.class);
		public static final SimpleLabel674101 simpleLabelVAVASIMPLELABELLL674101 = Singleton.getInstance(SimpleLabel674101.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final SimpleLabel525101 simpleLabelVAVASIMPLELABELLL525101 = Singleton.getInstance(SimpleLabel525101.class);
		public static final IdentityCardNumber identityCardNumber = Singleton.getInstance(IdentityCardNumber.class);
		public static final SimpleLabel271101 simpleLabelVAVASIMPLELABELLL271101 = Singleton.getInstance(SimpleLabel271101.class);
		public static final EffectiveAnualRate effectiveAnualRate = Singleton.getInstance(EffectiveAnualRate.class);
		public static class SimpleLabel363101 extends COBISSimpleLabel {
			public SimpleLabel363101() {
				this.init("VA_VASIMPLELABELLL_363101","Fechadeinicio");
			}
		}			

		public static class StartDate extends COBISDatePicker {
			public StartDate() {
				this.init("VA_STARTDATEMYJCBK_533101","StartDate");
			}
		}			
		public static class SimpleLabel912101 extends COBISSimpleLabel {
			public SimpleLabel912101() {
				this.init("VA_VASIMPLELABELLL_912101","Fechavencimiento");
			}
		}			

		public static class EndDate extends COBISDatePicker {
			public EndDate() {
				this.init("VA_ENDDATEKDVGVAYF_756101","EndDate");
			}
		}			
		public static class SimpleLabel674101 extends COBISSimpleLabel {
			public SimpleLabel674101() {
				this.init("VA_VASIMPLELABELLL_674101","Oficina");
			}
		}			

		public static class Office extends COBISInputValue {
			public Office() {
				this.init("VA_OFFICECVGCATPDP_750101","Office");
			}
		}			
		public static class SimpleLabel525101 extends COBISSimpleLabel {
			public SimpleLabel525101() {
				this.init("VA_VASIMPLELABELLL_525101","Cedula");
			}
		}			

		public static class IdentityCardNumber extends COBISInputValue {
			public IdentityCardNumber() {
				this.init("VA_IDCARDNUMBERWCO_539101","IdentityCardNumber");
			}
		}			
		public static class SimpleLabel271101 extends COBISSimpleLabel {
			public SimpleLabel271101() {
				this.init("VA_VASIMPLELABELLL_271101","Tasaefectivaanual");
			}
		}			

		public static class EffectiveAnualRate extends COBISInputValue {
			public EffectiveAnualRate() {
				this.init("VA_EFFECTIVEANULTR_470101","EffectiveAnualRate");
			}
		}			
	}
}

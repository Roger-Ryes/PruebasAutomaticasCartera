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

public class ValueDateFormForm{
	public static final Loan loan = Singleton.getInstance(Loan.class);
	public static final ValueDateFilter valueDateFilter = Singleton.getInstance(ValueDateFilter.class);

	public static final GridTransactionLoan gridTransactionLoan = Singleton.getInstance(GridTransactionLoan.class);
	private ValueDateFormForm() {
		throw new IllegalStateException("ValueDateFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class Loan {
	
		private Loan() {
			throw new IllegalStateException("ValueDateFormForm is a utility class");
		}
		
		public static final LastProcessDate lastProcessDate = Singleton.getInstance(LastProcessDate.class);

		public static class LastProcessDate extends COBISDatePicker {
			public LastProcessDate() {
				this.init("VA_LASTPROCESSDEET_724866","Ultproceso");
			}
		}			
	}

	public static class ValueDateFilter {
	
		private ValueDateFilter() {
			throw new IllegalStateException("ValueDateFormForm is a utility class");
		}
		
		public static final ValueDate valueDate = Singleton.getInstance(ValueDate.class);
		public static final Observation observation = Singleton.getInstance(Observation.class);

		public static class ValueDate extends COBISDatePicker {
			public ValueDate() {
				this.init("VA_3610ZOUUEMDZQED_313866","FechaValor");
			}
		}			

		public static class Observation extends COBISInputValue {
			public Observation() {
				this.init("VA_OBSERVATIONDKBP_175866","Observacion");
			}
		}			
	}
	
	public static class GridTransactionLoan extends COBISGrid {
		public GridTransactionLoan() {
			this.init("QV_1244_89323", "QV_1244_89323");
		} 

		public static final TransactionId transactionId = Singleton.getInstance(TransactionId.class);
		public static final Secuential secuential = Singleton.getInstance(Secuential.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final DateTran dateTran = Singleton.getInstance(DateTran.class);
		public static final DateRef dateRef = Singleton.getInstance(DateRef.class);
		public static final Status status = Singleton.getInstance(Status.class);
		public static final User user = Singleton.getInstance(User.class);

		public static class TransactionId extends COBISInputValue {
			public TransactionId() {
				this.init("VA_TEXTINPUTBOXIIN_213866","Transaccion");
			}
		}			

		public static class Secuential extends COBISInputValue {
			public Secuential() {
				this.init("VA_TEXTINPUTBOXMEP_425866","Secuencial");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_TEXTINPUTBOXQOK_378866","Prestamo");
			}
		}			

		public static class DateTran extends COBISInputValue {
			public DateTran() {
				this.init("VA_TEXTINPUTBOXSNL_252866","FechaTrn");
			}
		}			

		public static class DateRef extends COBISInputValue {
			public DateRef() {
				this.init("VA_TEXTINPUTBOXYSE_969866","FechaRef");
			}
		}			

		public static class Status extends COBISInputValue {
			public Status() {
				this.init("VA_TEXTINPUTBOXZAT_127866","Estado");
			}
		}			

		public static class User extends COBISInputValue {
			public User() {
				this.init("VA_TEXTINPUTBOXARG_897866","Usuario");
			}
		}			
	}
}

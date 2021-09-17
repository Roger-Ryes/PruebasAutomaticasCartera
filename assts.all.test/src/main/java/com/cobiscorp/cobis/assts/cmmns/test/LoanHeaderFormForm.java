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

public class LoanHeaderFormForm{
	public static final Loan loan = Singleton.getInstance(Loan.class);

	private LoanHeaderFormForm() {
		throw new IllegalStateException("LoanHeaderFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class Loan {
	
		private Loan() {
			throw new IllegalStateException("LoanHeaderFormForm is a utility class");
		}
		
		public static final LoanBankID loanBankID = Singleton.getInstance(LoanBankID.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final BalanceDue balanceDue = Singleton.getInstance(BalanceDue.class);
		public static final NextPayment nextPayment = Singleton.getInstance(NextPayment.class);
		public static final EndDate endDate = Singleton.getInstance(EndDate.class);
		public static final Status status = Singleton.getInstance(Status.class);

		public static class LoanBankID extends COBISInputValue {
			public LoanBankID() {
				this.init("VA_LOANBANKIDWFLGV_115410","LoanBankID");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_CLIENTNAMEIMCVW_943410","ClientName");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTWVBZUFPIR_807410","Amount");
			}
		}			

		public static class BalanceDue extends COBISInputValue {
			public BalanceDue() {
				this.init("VA_BALANCEDUEVMRHP_171410","BalanceDue");
			}
		}			

		public static class NextPayment extends COBISInputValue {
			public NextPayment() {
				this.init("VA_NEXTPAYMENTMIET_530410","NextPayment");
			}
		}			

		public static class EndDate extends COBISInputValue {
			public EndDate() {
				this.init("VA_ENDDATEQGSRYPHD_771410","EndDate");
			}
		}			

		public static class Status extends COBISInputValue {
			public Status() {
				this.init("VA_STATUSVZPEDDLAK_675410","Status");
			}
		}			
	}
}

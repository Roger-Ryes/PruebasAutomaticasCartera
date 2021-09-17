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

public class LoanDetailPopupFormForm{
	public static final Loan loan = Singleton.getInstance(Loan.class);

	private LoanDetailPopupFormForm() {
		throw new IllegalStateException("LoanDetailPopupFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class Loan {
	
		private Loan() {
			throw new IllegalStateException("LoanDetailPopupFormForm is a utility class");
		}
		
		public static final SimpleLabel441816 simpleLabelVAVASIMPLELABELLL441816 = Singleton.getInstance(SimpleLabel441816.class);
		public static final StartDate startDate = Singleton.getInstance(StartDate.class);
		public static final EndDate endDate = Singleton.getInstance(EndDate.class);
		public static final NextPayment nextPayment = Singleton.getInstance(NextPayment.class);
		public static final FeeEndDate feeEndDate = Singleton.getInstance(FeeEndDate.class);
		public static final ClientID clientID = Singleton.getInstance(ClientID.class);
		public static class SimpleLabel441816 extends COBISSimpleLabel {
			public SimpleLabel441816() {
				this.init("VA_VASIMPLELABELLL_441816","MasInformacion");
			}
		}			

		public static class StartDate extends COBISInputValue {
			public StartDate() {
				this.init("VA_7775TCUQPHQIJIN_505816","InicioPrestamo");
			}
		}			

		public static class EndDate extends COBISInputValue {
			public EndDate() {
				this.init("VA_1312UYWFEFJMEDU_689816","VencimientoPrestamo");
			}
		}			

		public static class NextPayment extends COBISInputValue {
			public NextPayment() {
				this.init("VA_1253HNEIJDXZZSW_616816","ValordeCuota");
			}
		}			

		public static class FeeEndDate extends COBISInputValue {
			public FeeEndDate() {
				this.init("VA_1354FMLLLTKNQED_674816","VencimientoProxCuota");
			}
		}			

		public static class ClientID extends COBISInputValue {
			public ClientID() {
				this.init("VA_9251WPWDZDHUCXQ_318816","CodigoCliente");
			}
		}			
	}
}

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

public class QuotaDetailPaymentsModalForm{

	public static final GridQuoteDetailPayment gridQuoteDetailPayment = Singleton.getInstance(GridQuoteDetailPayment.class);
	private QuotaDetailPaymentsModalForm() {
		throw new IllegalStateException("QuotaDetailPaymentsModalForm is a utility class");
	}
	
	public static class GridQuoteDetailPayment extends COBISGrid {
		public GridQuoteDetailPayment() {
			this.init("QV_4705_99765", "QV_4705_99765");
		} 

		public static final NumQuote numQuote = Singleton.getInstance(NumQuote.class);
		public static final Expired expired = Singleton.getInstance(Expired.class);
		public static final Payment payment = Singleton.getInstance(Payment.class);
		public static final Status status = Singleton.getInstance(Status.class);

		public static class NumQuote extends COBISInputValue {
			public NumQuote() {
				this.init("VA_TEXTINPUTBOXXRD_924925","NumCuota");
			}
		}			

		public static class Expired extends COBISInputValue {
			public Expired() {
				this.init("VA_DATEFIELDKHRUFK_991925","Vence");
			}
		}			

		public static class Payment extends COBISInputValue {
			public Payment() {
				this.init("VA_TEXTINPUTBOXGDJ_450925","Pago");
			}
		}			

		public static class Status extends COBISInputValue {
			public Status() {
				this.init("VA_CHECKBOXHEMRRGX_743925","Estado");
			}
		}			
	}
}

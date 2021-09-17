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

public class PaymentDetailFormForm{

	public static final GridPaymentDetail gridPaymentDetail = Singleton.getInstance(GridPaymentDetail.class);
	private PaymentDetailFormForm() {
		throw new IllegalStateException("PaymentDetailFormForm is a utility class");
	}
	
	public static class GridPaymentDetail extends COBISGrid {
		public GridPaymentDetail() {
			this.init("QV_1707_26229", "QV_1707_26229");
		} 

		public static final Fee fee = Singleton.getInstance(Fee.class);
		public static final Description description = Singleton.getInstance(Description.class);
		public static final StatusDescription statusDescription = Singleton.getInstance(StatusDescription.class);
		public static final Account account = Singleton.getInstance(Account.class);
		public static final MoneyDescription moneyDescription = Singleton.getInstance(MoneyDescription.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final AmountMn amountMn = Singleton.getInstance(AmountMn.class);
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);

		public static class Fee extends COBISInputValue {
			public Fee() {
				this.init("VA_TEXTINPUTBOXXNY_867485","Dividendo");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXGVF_565485","Descripcion");
			}
		}			

		public static class StatusDescription extends COBISInputValue {
			public StatusDescription() {
				this.init("VA_TEXTINPUTBOXKNL_859485","Estado");
			}
		}			

		public static class Account extends COBISInputValue {
			public Account() {
				this.init("VA_TEXTINPUTBOXDMX_646485","Cuenta");
			}
		}			

		public static class MoneyDescription extends COBISInputValue {
			public MoneyDescription() {
				this.init("VA_TEXTINPUTBOXQJY_953485","Moneda");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXHZF_700485","MontoMOP");
			}
		}			

		public static class AmountMn extends COBISInputValue {
			public AmountMn() {
				this.init("VA_TEXTINPUTBOXRNJ_230485","MontoMLE");
			}
		}			

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_TEXTINPUTBOXUOF_222485","Secuencial");
			}
		}			
	}
}

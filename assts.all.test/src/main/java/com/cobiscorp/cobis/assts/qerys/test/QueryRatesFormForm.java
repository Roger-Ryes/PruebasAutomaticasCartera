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

public class QueryRatesFormForm{

	public static final GridLoanRates gridLoanRates = Singleton.getInstance(GridLoanRates.class);
	private QueryRatesFormForm() {
		throw new IllegalStateException("QueryRatesFormForm is a utility class");
	}
	
	public static class GridLoanRates extends COBISGrid {
		public GridLoanRates() {
			this.init("QV_7625_68514", "QV_7625_68514");
		} 

		public static final Sequential sequential = Singleton.getInstance(Sequential.class);
		public static final UpdatedOn updatedOn = Singleton.getInstance(UpdatedOn.class);
		public static final Quota quota = Singleton.getInstance(Quota.class);
		public static final Item item = Singleton.getInstance(Item.class);
		public static final ValueToApply valueToApply = Singleton.getInstance(ValueToApply.class);
		public static final SignToApply signToApply = Singleton.getInstance(SignToApply.class);
		public static final SpreadApply spreadApply = Singleton.getInstance(SpreadApply.class);
		public static final CurrentRate currentRate = Singleton.getInstance(CurrentRate.class);
		public static final AnualEffectiveRate anualEffectiveRate = Singleton.getInstance(AnualEffectiveRate.class);
		public static final DateReferenceRate dateReferenceRate = Singleton.getInstance(DateReferenceRate.class);
		public static final ReferentialRate referentialRate = Singleton.getInstance(ReferentialRate.class);
		public static final ValueReferenceRate valueReferenceRate = Singleton.getInstance(ValueReferenceRate.class);

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_TEXTINPUTBOXVAQ_545660","Secuencial");
			}
		}			

		public static class UpdatedOn extends COBISInputValue {
			public UpdatedOn() {
				this.init("VA_TEXTINPUTBOXKWQ_686660","FechaMod");
			}
		}			

		public static class Quota extends COBISInputValue {
			public Quota() {
				this.init("VA_TEXTINPUTBOXGAR_184660","NoCuota");
			}
		}			

		public static class Item extends COBISInputValue {
			public Item() {
				this.init("VA_TEXTINPUTBOXRSO_292660","Rubro");
			}
		}			

		public static class ValueToApply extends COBISInputValue {
			public ValueToApply() {
				this.init("VA_TEXTINPUTBOXFFC_765660","ValorAplicar");
			}
		}			

		public static class SignToApply extends COBISInputValue {
			public SignToApply() {
				this.init("VA_TEXTINPUTBOXYGA_388660","SignoAplicar");
			}
		}			

		public static class SpreadApply extends COBISInputValue {
			public SpreadApply() {
				this.init("VA_TEXTINPUTBOXLAZ_256660","SpreadAplicar");
			}
		}			

		public static class CurrentRate extends COBISInputValue {
			public CurrentRate() {
				this.init("VA_TEXTINPUTBOXHTZ_428660","TasaActual");
			}
		}			

		public static class AnualEffectiveRate extends COBISInputValue {
			public AnualEffectiveRate() {
				this.init("VA_TEXTINPUTBOXYKA_140660","Tasaefectivaanual");
			}
		}			

		public static class DateReferenceRate extends COBISInputValue {
			public DateReferenceRate() {
				this.init("VA_TEXTINPUTBOXQOD_800660","FechaTasaReferencial");
			}
		}			

		public static class ReferentialRate extends COBISInputValue {
			public ReferentialRate() {
				this.init("VA_TEXTINPUTBOXUWM_511660","TasaReferencial");
			}
		}			

		public static class ValueReferenceRate extends COBISInputValue {
			public ValueReferenceRate() {
				this.init("VA_TEXTINPUTBOXMSZ_323660","ValorTasaReferencial");
			}
		}			
	}
}

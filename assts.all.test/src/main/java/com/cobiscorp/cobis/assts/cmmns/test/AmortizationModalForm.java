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

public class AmortizationModalForm{

	public static final GridAmortization gridAmortization = Singleton.getInstance(GridAmortization.class);
	private AmortizationModalForm() {
		throw new IllegalStateException("AmortizationModalForm is a utility class");
	}
	
	public static class GridAmortization extends COBISGrid {
		public GridAmortization() {
			this.init("QV_QV37_LCP47", "QV_QV37_LCP47");
		} 

		public static final Share share = Singleton.getInstance(Share.class);
		public static final Expiration expiration = Singleton.getInstance(Expiration.class);
		public static final Days days = Singleton.getInstance(Days.class);
		public static final BalanceCap balanceCap = Singleton.getInstance(BalanceCap.class);
		public static final Items1 items1 = Singleton.getInstance(Items1.class);
		public static final Items2 items2 = Singleton.getInstance(Items2.class);
		public static final Items3 items3 = Singleton.getInstance(Items3.class);
		public static final Items4 items4 = Singleton.getInstance(Items4.class);
		public static final Items5 items5 = Singleton.getInstance(Items5.class);
		public static final Items7 items7 = Singleton.getInstance(Items7.class);
		public static final Items8 items8 = Singleton.getInstance(Items8.class);
		public static final Items9 items9 = Singleton.getInstance(Items9.class);
		public static final Items10 items10 = Singleton.getInstance(Items10.class);
		public static final Items11 items11 = Singleton.getInstance(Items11.class);
		public static final Items12 items12 = Singleton.getInstance(Items12.class);
		public static final Items14 items14 = Singleton.getInstance(Items14.class);
		public static final Items15 items15 = Singleton.getInstance(Items15.class);
		public static final ShareValue shareValue = Singleton.getInstance(ShareValue.class);
		public static final Items6 items6 = Singleton.getInstance(Items6.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final Items13 items13 = Singleton.getInstance(Items13.class);
		public static final Porroga porroga = Singleton.getInstance(Porroga.class);

		public static class Share extends COBISInputValue {
			public Share() {
				this.init("VA_TEXTINPUTBOXEBY_458244","Cuotas");
			}
		}			

		public static class Expiration extends COBISDatePicker {
			public Expiration() {
				this.init("VA_DATEFIELDMUGVCO_937244","Fechavencimiento");
			}
		}			

		public static class Days extends COBISInputValue {
			public Days() {
				this.init("VA_TEXTINPUTBOXAJH_441244","Dias");
			}
		}			

		public static class BalanceCap extends COBISInputValue {
			public BalanceCap() {
				this.init("VA_TEXTINPUTBOXEBB_845244","SaldoCapital");
			}
		}			

		public static class Items1 extends COBISInputValue {
			public Items1() {
				this.init("VA_TEXTINPUTBOXXIE_368244","CAP");
			}
		}			

		public static class Items2 extends COBISInputValue {
			public Items2() {
				this.init("VA_TEXTINPUTBOXECP_389244","COMMORA");
			}
		}			

		public static class Items3 extends COBISInputValue {
			public Items3() {
				this.init("VA_TEXTINPUTBOXIQG_995244","IMO");
			}
		}			

		public static class Items4 extends COBISInputValue {
			public Items4() {
				this.init("VA_TEXTINPUTBOXCZG_232244","INT");
			}
		}			

		public static class Items5 extends COBISInputValue {
			public Items5() {
				this.init("VA_TEXTINPUTBOXYJC_667244","IVACMORA");
			}
		}			

		public static class Items7 extends COBISInputValue {
			public Items7() {
				this.init("VA_TEXTINPUTBOXYYM_693244","Items7");
			}
		}			

		public static class Items8 extends COBISInputValue {
			public Items8() {
				this.init("VA_TEXTINPUTBOXMZL_667244","Items8");
			}
		}			

		public static class Items9 extends COBISInputValue {
			public Items9() {
				this.init("VA_TEXTINPUTBOXZAX_680244","Items9");
			}
		}			

		public static class Items10 extends COBISInputValue {
			public Items10() {
				this.init("VA_TEXTINPUTBOXQJV_131244","Items10");
			}
		}			

		public static class Items11 extends COBISInputValue {
			public Items11() {
				this.init("VA_TEXTINPUTBOXDSL_380244","Items11");
			}
		}			

		public static class Items12 extends COBISInputValue {
			public Items12() {
				this.init("VA_TEXTINPUTBOXEBS_621244","Items12");
			}
		}			

		public static class Items14 extends COBISInputValue {
			public Items14() {
				this.init("VA_TEXTINPUTBOXYMI_363244","Items14");
			}
		}			

		public static class Items15 extends COBISInputValue {
			public Items15() {
				this.init("VA_TEXTINPUTBOXRVV_155244","Items15");
			}
		}			

		public static class ShareValue extends COBISInputValue {
			public ShareValue() {
				this.init("VA_TEXTINPUTBOXZCC_660244","ValorCuota");
			}
		}			

		public static class Items6 extends COBISInputValue {
			public Items6() {
				this.init("VA_TEXTINPUTBOXEKM_962244","IVAINT");
			}
		}			

		public static class State extends COBISInputValue {
			public State() {
				this.init("VA_TEXTINPUTBOXAZY_732244","Estado");
			}
		}			

		public static class Items13 extends COBISInputValue {
			public Items13() {
				this.init("VA_TEXTINPUTBOXVBI_648244","Items13");
			}
		}			

		public static class Porroga extends COBISInputValue {
			public Porroga() {
				this.init("VA_TEXTINPUTBOXBOQ_761244","Porroga");
			}
		}			
	}
}

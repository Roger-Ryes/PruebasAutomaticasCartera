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

public class GeneralInfoLeftChartFormForm{

	public static final GridSummaryLoanStatus gridSummaryLoanStatus = Singleton.getInstance(GridSummaryLoanStatus.class);
	private GeneralInfoLeftChartFormForm() {
		throw new IllegalStateException("GeneralInfoLeftChartFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	
	
	public static class GridSummaryLoanStatus extends COBISGrid {
		public GridSummaryLoanStatus() {
			this.init("QV_6100_21620", "QV_6100_21620");
		} 

		public static final StatusAmortization statusAmortization = Singleton.getInstance(StatusAmortization.class);
		public static final Capital capital = Singleton.getInstance(Capital.class);
		public static final InterestArrear interestArrear = Singleton.getInstance(InterestArrear.class);
		public static final OtherItems otherItems = Singleton.getInstance(OtherItems.class);
		public static final Total total = Singleton.getInstance(Total.class);
		public static final NumberPayments numberPayments = Singleton.getInstance(NumberPayments.class);
		public static final Arrear arrear = Singleton.getInstance(Arrear.class);
		public static final Interest interest = Singleton.getInstance(Interest.class);

		public static class StatusAmortization extends COBISInputValue {
			public StatusAmortization() {
				this.init("VA_TEXTINPUTBOXTMD_417344","Estado");
			}
		}			

		public static class Capital extends COBISInputValue {
			public Capital() {
				this.init("VA_TEXTINPUTBOXMWX_470344","Capital");
			}
		}			

		public static class InterestArrear extends COBISInputValue {
			public InterestArrear() {
				this.init("VA_TEXTINPUTBOXNHL_435344","Interes");
			}
		}			

		public static class OtherItems extends COBISInputValue {
			public OtherItems() {
				this.init("VA_TEXTINPUTBOXWXQ_508344","OTROS");
			}
		}			

		public static class Total extends COBISInputValue {
			public Total() {
				this.init("VA_TEXTINPUTBOXJLV_306344","Total");
			}
		}			

		public static class NumberPayments extends COBISInputValue {
			public NumberPayments() {
				this.init("VA_TEXTINPUTBOXRMW_550344","NumberPayments");
			}
		}			

		public static class Arrear extends COBISInputValue {
			public Arrear() {
				this.init("VA_TEXTINPUTBOXYPA_189344","Arrear");
			}
		}			

		public static class Interest extends COBISInputValue {
			public Interest() {
				this.init("VA_TEXTINPUTBOXNJT_993344","Interest");
			}
		}			
	}
}

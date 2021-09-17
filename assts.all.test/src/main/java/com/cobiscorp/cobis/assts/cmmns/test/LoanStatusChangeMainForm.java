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

public class LoanStatusChangeMainForm{
	public static final Loan loan = Singleton.getInstance(Loan.class);
	public static final ItemsLoan itemsLoan = Singleton.getInstance(ItemsLoan.class);
	public static final ModalGrid modalGrid = Singleton.getInstance(ModalGrid.class);

	public static final GridAmortization gridAmortization = Singleton.getInstance(GridAmortization.class);
	private LoanStatusChangeMainForm() {
		throw new IllegalStateException("LoanStatusChangeMainForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTLOANSTASTA cmdCommand1IdCMTLOANSTASTA = Singleton.getInstance(CmdCommand1IdCMTLOANSTASTA.class);
		
		public static class CmdCommand1IdCMTLOANSTASTA extends COBISButton{
			public CmdCommand1IdCMTLOANSTASTA () {
				this.init("CM_TLOANSTA_STA", "Guardar");
			}
		}
	

	}
	

	public static class Loan {
	
		private Loan() {
			throw new IllegalStateException("LoanStatusChangeMainForm is a utility class");
		}
		
		public static final StatusCopy statusCopy = Singleton.getInstance(StatusCopy.class);
		public static final NewStatus newStatus = Singleton.getInstance(NewStatus.class);

		public static class StatusCopy extends COBISInputValue {
			public StatusCopy() {
				this.init("VA_STATUSCYEFKGCDY_909722","EstadoActual");
			}
		}			

		public static class NewStatus extends COBISComboBox {
			public NewStatus() {
				this.init("VA_NEWSTATUSLZHCOE_110722","NuevoEstado");
			}
		}			
	}

	public static class ItemsLoan {
	
		private ItemsLoan() {
			throw new IllegalStateException("LoanStatusChangeMainForm is a utility class");
		}
		
	}
	
	public static class GridAmortization extends COBISGrid {
		public GridAmortization() {
			this.init("QV_LM37_VTI26", "QV_LM37_VTI26");
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
		public static final Items6 items6 = Singleton.getInstance(Items6.class);
		public static final Items13 items13 = Singleton.getInstance(Items13.class);
		public static final ShareValue shareValue = Singleton.getInstance(ShareValue.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final Porroga porroga = Singleton.getInstance(Porroga.class);

		public static class Share extends COBISInputValue {
			public Share() {
				this.init("VA_TEXTINPUTBOXZUA_304871","Cuotas");
			}
		}			

		public static class Expiration extends COBISDatePicker {
			public Expiration() {
				this.init("VA_DATEFIELDBPQSTR_142871","Fechavencimiento");
			}
		}			

		public static class Days extends COBISInputValue {
			public Days() {
				this.init("VA_TEXTINPUTBOXMMN_363871","Dias");
			}
		}			

		public static class BalanceCap extends COBISInputValue {
			public BalanceCap() {
				this.init("VA_TEXTINPUTBOXTWI_476871","SaldoCapital");
			}
		}			

		public static class Items1 extends COBISInputValue {
			public Items1() {
				this.init("VA_TEXTINPUTBOXZNS_485871","Items1");
			}
		}			

		public static class Items2 extends COBISInputValue {
			public Items2() {
				this.init("VA_TEXTINPUTBOXRER_848871","Items2");
			}
		}			

		public static class Items3 extends COBISInputValue {
			public Items3() {
				this.init("VA_TEXTINPUTBOXBVN_129871","Items3");
			}
		}			

		public static class Items4 extends COBISInputValue {
			public Items4() {
				this.init("VA_TEXTINPUTBOXYCQ_383871","Items4");
			}
		}			

		public static class Items5 extends COBISInputValue {
			public Items5() {
				this.init("VA_TEXTINPUTBOXOFJ_503871","Items5");
			}
		}			

		public static class Items7 extends COBISInputValue {
			public Items7() {
				this.init("VA_TEXTINPUTBOXCGS_176871","Items7");
			}
		}			

		public static class Items8 extends COBISInputValue {
			public Items8() {
				this.init("VA_TEXTINPUTBOXLPC_409871","Items8");
			}
		}			

		public static class Items9 extends COBISInputValue {
			public Items9() {
				this.init("VA_TEXTINPUTBOXQLU_499871","Items9");
			}
		}			

		public static class Items10 extends COBISInputValue {
			public Items10() {
				this.init("VA_TEXTINPUTBOXYBZ_761871","Items10");
			}
		}			

		public static class Items11 extends COBISInputValue {
			public Items11() {
				this.init("VA_TEXTINPUTBOXOUD_939871","Items11");
			}
		}			

		public static class Items12 extends COBISInputValue {
			public Items12() {
				this.init("VA_TEXTINPUTBOXZPT_760871","Items12");
			}
		}			

		public static class Items14 extends COBISInputValue {
			public Items14() {
				this.init("VA_TEXTINPUTBOXADC_261871","Items14");
			}
		}			

		public static class Items15 extends COBISInputValue {
			public Items15() {
				this.init("VA_TEXTINPUTBOXHQL_468871","Items15");
			}
		}			

		public static class Items6 extends COBISInputValue {
			public Items6() {
				this.init("VA_TEXTINPUTBOXPNI_341871","Items6");
			}
		}			

		public static class Items13 extends COBISInputValue {
			public Items13() {
				this.init("VA_TEXTINPUTBOXUWA_570871","Items13");
			}
		}			

		public static class ShareValue extends COBISInputValue {
			public ShareValue() {
				this.init("VA_TEXTINPUTBOXSXJ_950871","ValorCuota");
			}
		}			

		public static class State extends COBISInputValue {
			public State() {
				this.init("VA_TEXTINPUTBOXEED_382871","Estado");
			}
		}			

		public static class Porroga extends COBISInputValue {
			public Porroga() {
				this.init("VA_TEXTINPUTBOXGOC_946871","DiasdeAtraso");
			}
		}			
	}
	
	public static class ModalGridAmortization extends COBISButton{
		public ModalGridAmortization(){
			throw new IllegalStateException("LoanStatusChangeMainForm is a utility class");
		}
		public static final ModalBtnLastPage modalBtnLastPage = Singleton.getInstance(ModalBtnLastPage.class);
		public static class ModalBtnLastPage extends COBISButton{
			public ModalBtnLastPage(){
				this.init("","BotonNextPage","//div[contains(@class,'modal-content')]//div[contains(@id,'QV_LM37_VTI26')]//span[contains(@class,'k-icon k-i-arrow-end-right')]");
			}
		}
		
	}
	
	public static class ModalGrid extends COBISGrid {
		public ModalGrid() {
			this.init("//div[contains(@class,'modal-content')]//div[contains(@id,'QV_LM37_VTI26')]","QV_LM37_VTI26", "//div[contains(@class,'modal-content')]//div[contains(@id,'QV_LM37_VTI26')]");
		}
	}
}

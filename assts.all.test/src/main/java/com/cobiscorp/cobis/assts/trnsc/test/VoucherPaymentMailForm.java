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

public class VoucherPaymentMailForm{
	public static final Group group = Singleton.getInstance(Group.class);

	private VoucherPaymentMailForm() {
		throw new IllegalStateException("VoucherPaymentMailForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTASSTSHP4SA cmdCommand1IdCMTASSTSHP4SA = Singleton.getInstance(CmdCommand1IdCMTASSTSHP4SA.class);
		
		public static class CmdCommand1IdCMTASSTSHP4SA extends COBISButton{
			public CmdCommand1IdCMTASSTSHP4SA () {
				this.init("CM_TASSTSHP_4SA", "Vista previa");
			}
		}
	
		public static final CmdCommand2IdCMTASSTSHPZAX cmdCommand2IdCMTASSTSHPZAX = Singleton.getInstance(CmdCommand2IdCMTASSTSHPZAX.class);
		
		public static class CmdCommand2IdCMTASSTSHPZAX extends COBISButton{
			public CmdCommand2IdCMTASSTSHPZAX () {
				this.init("CM_TASSTSHP_ZAX", "Enviar");
			}
		}
	
		public static final BtnVAVABUTTONFPBVJYH744873IdVAVABUTTONFPBVJYH744873 btnVAVABUTTONFPBVJYH744873IdVAVABUTTONFPBVJYH744873 = Singleton.getInstance(BtnVAVABUTTONFPBVJYH744873IdVAVABUTTONFPBVJYH744873.class);
		
		public static class BtnVAVABUTTONFPBVJYH744873IdVAVABUTTONFPBVJYH744873 extends COBISButton{
			public BtnVAVABUTTONFPBVJYH744873IdVAVABUTTONFPBVJYH744873 () {
				this.init("VA_VABUTTONFPBVJYH_744873", "Buscar");
			}
		}
	

	}
	

	public static class Group {
	
		private Group() {
			throw new IllegalStateException("VoucherPaymentMailForm is a utility class");
		}
		
		public static final GroupName groupName = Singleton.getInstance(GroupName.class);
		public static final SimpleLabel145873 simpleLabelVAVASIMPLELABELLL145873 = Singleton.getInstance(SimpleLabel145873.class);
		public static final LoanBalCurrencyNem loanBalCurrencyNem = Singleton.getInstance(LoanBalCurrencyNem.class);
		public static final LoanBalance loanBalance = Singleton.getInstance(LoanBalance.class);
		public static final SimpleLabel688873 simpleLabelVAVASIMPLELABELLL688873 = Singleton.getInstance(SimpleLabel688873.class);
		public static final CollateralBalance collateralBalance = Singleton.getInstance(CollateralBalance.class);
		public static final ColBalCurrencyNem colBalCurrencyNem = Singleton.getInstance(ColBalCurrencyNem.class);
		public static final SimpleLabel544873 simpleLabelVAVASIMPLELABELLL544873 = Singleton.getInstance(SimpleLabel544873.class);
		public static final GroupStatus groupStatus = Singleton.getInstance(GroupStatus.class);

		public static class GroupName extends COBISInputTextButton {
			public GroupName() {
				this.init("VA_1491XAAAAMJTPOU_128873","Grupo");
			}
		}			
		public static class SimpleLabel145873 extends COBISSimpleLabel {
			public SimpleLabel145873() {
				this.init("VA_VASIMPLELABELLL_145873","MontodelPrestamo");
			}
		}			

		public static class LoanBalCurrencyNem extends COBISInputValue {
			public LoanBalCurrencyNem() {
				this.init("VA_5301LEFQXMGTFDL_507873","LoanBalCurrencyNem");
			}
		}			

		public static class LoanBalance extends COBISInputValue {
			public LoanBalance() {
				this.init("VA_4688QHPDXVMYWGP_873873","LoanBalance");
			}
		}			
		public static class SimpleLabel688873 extends COBISSimpleLabel {
			public SimpleLabel688873() {
				this.init("VA_VASIMPLELABELLL_688873","MontodeGarantia");
			}
		}			

		public static class CollateralBalance extends COBISInputValue {
			public CollateralBalance() {
				this.init("VA_1265XRDFYDJTFCJ_177873","CollateralBalance");
			}
		}			

		public static class ColBalCurrencyNem extends COBISInputValue {
			public ColBalCurrencyNem() {
				this.init("VA_5284HTSBDMFVRZH_251873","ColBalCurrencyNem");
			}
		}			
		public static class SimpleLabel544873 extends COBISSimpleLabel {
			public SimpleLabel544873() {
				this.init("VA_VASIMPLELABELLL_544873","EstadodelTramite");
			}
		}			

		public static class GroupStatus extends COBISInputValue {
			public GroupStatus() {
				this.init("VA_GROUPSTATUSUSLR_781873","GroupStatus");
			}
		}			
	}
}

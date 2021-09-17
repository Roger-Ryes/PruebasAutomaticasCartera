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

public class PreCancellationLoanReferenceForm{
	public static final Loan loan = Singleton.getInstance(Loan.class);
	public static final PreCancellation preCancellation = Singleton.getInstance(PreCancellation.class);

	private PreCancellationLoanReferenceForm() {
		throw new IllegalStateException("PreCancellationLoanReferenceForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTASSTSCXS1 cmdCommand1IdCMTASSTSCXS1 = Singleton.getInstance(CmdCommand1IdCMTASSTSCXS1.class);
		
		public static class CmdCommand1IdCMTASSTSCXS1 extends COBISButton{
			public CmdCommand1IdCMTASSTSCXS1 () {
				this.init("CM_TASSTSCX_S1_", "Vista previa");
			}
		}
	
		public static final CmdCommand2IdCMTASSTSCX8X cmdCommand2IdCMTASSTSCX8X = Singleton.getInstance(CmdCommand2IdCMTASSTSCX8X.class);
		
		public static class CmdCommand2IdCMTASSTSCX8X extends COBISButton{
			public CmdCommand2IdCMTASSTSCX8X () {
				this.init("CM_TASSTSCX__8X", "Enviar");
			}
		}
	
		public static final BtnIdVAVABUTTONTGCIJOQ898796 btnIdVAVABUTTONTGCIJOQ898796 = Singleton.getInstance(BtnIdVAVABUTTONTGCIJOQ898796.class);
		
		public static class BtnIdVAVABUTTONTGCIJOQ898796 extends COBISButton{
			public BtnIdVAVABUTTONTGCIJOQ898796 () {
				this.init("VA_VABUTTONTGCIJOQ_898796", "Buscar");
			}
		}
	

	}
	

	public static class Loan {
	
		private Loan() {
			throw new IllegalStateException("PreCancellationLoanReferenceForm is a utility class");
		}
		
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);

		public static class ClientName extends COBISInputTextButton {
			public ClientName() {
				this.init("VA_CLIENTNAMESZXPR_236796","Cliente");
			}
		}			
	}

	public static class PreCancellation {
	
		private PreCancellation() {
			throw new IllegalStateException("PreCancellationLoanReferenceForm is a utility class");
		}
		
		public static final SimpleLabel113796 simpleLabelVAVASIMPLELABELLL113796 = Singleton.getInstance(SimpleLabel113796.class);
		public static final AmountOP amountOP = Singleton.getInstance(AmountOP.class);
		public static final SimpleLabel779796 simpleLabelVAVASIMPLELABELLL779796 = Singleton.getInstance(SimpleLabel779796.class);
		public static final AmountInsurence amountInsurence = Singleton.getInstance(AmountInsurence.class);
		public static final SimpleLabel894796 simpleLabelVAVASIMPLELABELLL894796 = Singleton.getInstance(SimpleLabel894796.class);
		public static final IsInsurenceChanged isInsurenceChanged = Singleton.getInstance(IsInsurenceChanged.class);
		public static final SimpleLabel465796 simpleLabelVAVASIMPLELABELLL465796 = Singleton.getInstance(SimpleLabel465796.class);
		public static final AmountPRE amountPRE = Singleton.getInstance(AmountPRE.class);
		public static class SimpleLabel113796 extends COBISSimpleLabel {
			public SimpleLabel113796() {
				this.init("VA_VASIMPLELABELLL_113796","MontodelPrestamo");
			}
		}			

		public static class AmountOP extends COBISInputValue {
			public AmountOP() {
				this.init("VA_AMOUNTOPEQCFHTN_742796","AmountOP");
			}
		}			
		public static class SimpleLabel779796 extends COBISSimpleLabel {
			public SimpleLabel779796() {
				this.init("VA_VASIMPLELABELLL_779796","MontodelSeguroCobrado");
			}
		}			

		public static class AmountInsurence extends COBISInputValue {
			public AmountInsurence() {
				this.init("VA_AMOUNTINSURENEC_518796","AmountInsurence");
			}
		}			
		public static class SimpleLabel894796 extends COBISSimpleLabel {
			public SimpleLabel894796() {
				this.init("VA_VASIMPLELABELLL_894796","SeguroCobrado");
			}
		}			

		public static class IsInsurenceChanged extends COBISCheckBox {
			public IsInsurenceChanged() {
				this.init("VA_ISINSURENCECDHE_154796","IsInsurenceChanged");
			}
		}			
		public static class SimpleLabel465796 extends COBISSimpleLabel {
			public SimpleLabel465796() {
				this.init("VA_VASIMPLELABELLL_465796","TotalaPagar");
			}
		}			

		public static class AmountPRE extends COBISInputValue {
			public AmountPRE() {
				this.init("VA_AMOUNTPREGANAKQ_881796","AmountPRE");
			}
		}			
	}
}

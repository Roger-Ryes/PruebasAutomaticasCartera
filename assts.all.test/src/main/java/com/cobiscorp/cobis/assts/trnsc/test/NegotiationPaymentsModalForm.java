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

public class NegotiationPaymentsModalForm{
	public static final Negotiation negotiation = Singleton.getInstance(Negotiation.class);

	private NegotiationPaymentsModalForm() {
		throw new IllegalStateException("NegotiationPaymentsModalForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTNEGOTIA2A4 cmdCommand1IdCMTNEGOTIA2A4 = Singleton.getInstance(CmdCommand1IdCMTNEGOTIA2A4.class);
		
		public static class CmdCommand1IdCMTNEGOTIA2A4 extends COBISButton{
			public CmdCommand1IdCMTNEGOTIA2A4 () {
				this.init("CM_TNEGOTIA_2A4", "Aceptar");
			}
		}
	
		public static final CmdCommand2IdCMTNEGOTIA6T cmdCommand2IdCMTNEGOTIA6T = Singleton.getInstance(CmdCommand2IdCMTNEGOTIA6T.class);
		
		public static class CmdCommand2IdCMTNEGOTIA6T extends COBISButton{
			public CmdCommand2IdCMTNEGOTIA6T () {
				this.init("CM_TNEGOTIA_6T_", "Cancelar");
			}
		}
	

	}
	

	public static class Negotiation {
	
		private Negotiation() {
			throw new IllegalStateException("NegotiationPaymentsModalForm is a utility class");
		}
		
		public static final PaymentType paymentType = Singleton.getInstance(PaymentType.class);
		public static final InterestType interestType = Singleton.getInstance(InterestType.class);
		public static final FullFee fullFee = Singleton.getInstance(FullFee.class);
		public static final AdditionalPayments additionalPayments = Singleton.getInstance(AdditionalPayments.class);
		public static final ReductionType reductionType = Singleton.getInstance(ReductionType.class);

		public static class PaymentType extends COBISRadioButtonList {
			public PaymentType() {
				this.init("VA_TEXTINPUTBOXHOE_149225","TipodePago");
			}
		}			

		public static class InterestType extends COBISRadioButtonList {
			public InterestType() {
				this.init("VA_TEXTINPUTBOXNOR_530225","TipodeInteres");
			}
		}			

		public static class FullFee extends COBISCheckBox {
			public FullFee() {
				this.init("VA_CHECKBOXMVFTHFB_720225","CuotaCompleta");
			}
		}			

		public static class AdditionalPayments extends COBISCheckBox {
			public AdditionalPayments() {
				this.init("VA_TEXTINPUTBOXAPF_912225","PermitePagosAdicionales");
			}
		}			

		public static class ReductionType extends COBISRadioButtonList {
			public ReductionType() {
				this.init("VA_5608AAOSYWATGEZ_226225","TipoPagoExtraordinario");
			}
		}			
	}
}

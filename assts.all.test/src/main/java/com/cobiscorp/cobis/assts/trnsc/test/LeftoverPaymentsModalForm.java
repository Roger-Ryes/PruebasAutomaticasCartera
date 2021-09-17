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

public class LeftoverPaymentsModalForm{
	public static final LeftOverPayment leftOverPayment = Singleton.getInstance(LeftOverPayment.class);

	private LeftoverPaymentsModalForm() {
		throw new IllegalStateException("LeftoverPaymentsModalForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTLEFTOVE3S cmdCommand1IdCMTLEFTOVE3S = Singleton.getInstance(CmdCommand1IdCMTLEFTOVE3S.class);
		
		public static class CmdCommand1IdCMTLEFTOVE3S extends COBISButton{
			public CmdCommand1IdCMTLEFTOVE3S () {
				this.init("CM_TLEFTOVE__3S", "Aceptar");
			}
		}
	
		public static final CmdCommand2IdCMTLEFTOVEV5 cmdCommand2IdCMTLEFTOVEV5 = Singleton.getInstance(CmdCommand2IdCMTLEFTOVEV5.class);
		
		public static class CmdCommand2IdCMTLEFTOVEV5 extends COBISButton{
			public CmdCommand2IdCMTLEFTOVEV5 () {
				this.init("CM_TLEFTOVE_V_5", "Cancelar");
			}
		}
	

	}
	

	public static class LeftOverPayment {
	
		private LeftOverPayment() {
			throw new IllegalStateException("LeftoverPaymentsModalForm is a utility class");
		}
		
		public static final PaymentType paymentType = Singleton.getInstance(PaymentType.class);
		public static final Value value = Singleton.getInstance(Value.class);
		public static final CurrencyType currencyType = Singleton.getInstance(CurrencyType.class);
		public static final Reference reference = Singleton.getInstance(Reference.class);
		public static final Note note = Singleton.getInstance(Note.class);

		public static class PaymentType extends COBISComboBox {
			public PaymentType() {
				this.init("VA_TEXTINPUTBOXAQZ_901369","FormadePago");
			}
		}			

		public static class Value extends COBISInputValue {
			public Value() {
				this.init("VA_TEXTINPUTBOXVFP_330369","Monto");
			}
		}			

		public static class CurrencyType extends COBISComboBox {
			public CurrencyType() {
				this.init("VA_TEXTINPUTBOXSZZ_277369","CurrencyType");
			}
		}			

		public static class Reference extends COBISInputTextButton {
			public Reference() {
				this.init("VA_TEXTINPUTBOXJMX_394369","Referencia");
			}
		}			

		public static class Note extends COBISInputValue {
			public Note() {
				this.init("VA_TEXTINPUTBOXYWQ_139369","Observacion");
			}
		}			
	}
}

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

public class CondonationDetailFormForm{

	public static final GridCondonationDetail gridCondonationDetail = Singleton.getInstance(GridCondonationDetail.class);
	private CondonationDetailFormForm() {
		throw new IllegalStateException("CondonationDetailFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTCONDONASS3 cmdCommand1IdCMTCONDONASS3 = Singleton.getInstance(CmdCommand1IdCMTCONDONASS3.class);
		
		public static class CmdCommand1IdCMTCONDONASS3 extends COBISButton{
			public CmdCommand1IdCMTCONDONASS3 () {
				this.init("CM_TCONDONA_SS3", "Guardar");
			}
		}
	
		public static final CmdCommand2IdCMTCONDONANAN cmdCommand2IdCMTCONDONANAN = Singleton.getInstance(CmdCommand2IdCMTCONDONANAN.class);
		
		public static class CmdCommand2IdCMTCONDONANAN extends COBISButton{
			public CmdCommand2IdCMTCONDONANAN () {
				this.init("CM_TCONDONA_NAN", "Cancelar");
			}
		}
	

	}
	
	
	public static class GridCondonationDetail extends COBISGrid {
		public GridCondonationDetail() {
			this.init("QV_7324_98967", "QV_7324_98967");
		} 

		public static final Concept concept = Singleton.getInstance(Concept.class);
		public static final Observation observation = Singleton.getInstance(Observation.class);
		public static final PastDueAmount pastDueAmount = Singleton.getInstance(PastDueAmount.class);
		public static final CurrentAmount currentAmount = Singleton.getInstance(CurrentAmount.class);
		public static final DueAmount dueAmount = Singleton.getInstance(DueAmount.class);
		public static final TotalValue totalValue = Singleton.getInstance(TotalValue.class);
		public static final ValueToCondone valueToCondone = Singleton.getInstance(ValueToCondone.class);

		public static class Concept extends COBISComboBox {
			public Concept() {
				this.init("VA_TEXTINPUTBOXVSD_563764","Concepto");
			}
		}			

		public static class Observation extends COBISInputValue {
			public Observation() {
				this.init("VA_TEXTINPUTBOXEPR_994764","Observacion");
			}
		}			

		public static class PastDueAmount extends COBISInputValue {
			public PastDueAmount() {
				this.init("VA_TEXTINPUTBOXTSF_920764","Vencido");
			}
		}			

		public static class CurrentAmount extends COBISInputValue {
			public CurrentAmount() {
				this.init("VA_TEXTINPUTBOXABB_665764","Vigente");
			}
		}			

		public static class DueAmount extends COBISInputValue {
			public DueAmount() {
				this.init("VA_TEXTINPUTBOXBSX_772764","PORVENCER");
			}
		}			

		public static class TotalValue extends COBISInputValue {
			public TotalValue() {
				this.init("VA_TEXTINPUTBOXBOS_972764","Total");
			}
		}			

		public static class ValueToCondone extends COBISInputValue {
			public ValueToCondone() {
				this.init("VA_TEXTINPUTBOXECH_722764","Valoracondonar");
			}
		}			
	}
}

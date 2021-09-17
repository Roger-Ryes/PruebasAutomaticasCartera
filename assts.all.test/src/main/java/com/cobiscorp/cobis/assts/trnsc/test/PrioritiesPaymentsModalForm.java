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

public class PrioritiesPaymentsModalForm{

	public static final GridPriorities gridPriorities = Singleton.getInstance(GridPriorities.class);
	private PrioritiesPaymentsModalForm() {
		throw new IllegalStateException("PrioritiesPaymentsModalForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPRIORITTTT cmdCommand1IdCMTPRIORITTTT = Singleton.getInstance(CmdCommand1IdCMTPRIORITTTT.class);
		
		public static class CmdCommand1IdCMTPRIORITTTT extends COBISButton{
			public CmdCommand1IdCMTPRIORITTTT () {
				this.init("CM_TPRIORIT_TTT", "Aceptar");
			}
		}
	
		public static final CmdCommand2IdCMTPRIORITI8N cmdCommand2IdCMTPRIORITI8N = Singleton.getInstance(CmdCommand2IdCMTPRIORITI8N.class);
		
		public static class CmdCommand2IdCMTPRIORITI8N extends COBISButton{
			public CmdCommand2IdCMTPRIORITI8N () {
				this.init("CM_TPRIORIT_I8N", "Cancelar");
			}
		}
	

	}
	
	
	public static class GridPriorities extends COBISGrid {
		public GridPriorities() {
			this.init("QV_3510_83627", "QV_3510_83627");
		} 

		public static final Item item = Singleton.getInstance(Item.class);
		public static final Priority priority = Singleton.getInstance(Priority.class);

		public static class Item extends COBISInputValue {
			public Item() {
				this.init("VA_TEXTINPUTBOXTPG_996545","Rubro");
			}
		}			

		public static class Priority extends COBISInputValue {
			public Priority() {
				this.init("VA_TEXTINPUTBOXCHD_352545","Prioridad");
			}
		}			
	}
}

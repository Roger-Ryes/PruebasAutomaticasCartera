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

public class TreeTwoFormForm{

	private TreeTwoFormForm() {
		throw new IllegalStateException("TreeTwoFormForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroup1679IdGTREETWOHQC175509 lytGroup1679IdGTREETWOHQC175509 = Singleton.getInstance(LytGroup1679IdGTREETWOHQC175509.class);
		
		public static class LytGroup1679IdGTREETWOHQC175509 extends COBISCollapsable {
			public LytGroup1679IdGTREETWOHQC175509(){
				this.init("G_TREETWOHQC_175509", "Estado Actual");
			}
		}
		
		public static final LytGroup2287IdGTREETWOJBX433509 lytGroup2287IdGTREETWOJBX433509 = Singleton.getInstance(LytGroup2287IdGTREETWOJBX433509.class);
		
		public static class LytGroup2287IdGTREETWOJBX433509 extends COBISCollapsable {
			public LytGroup2287IdGTREETWOJBX433509(){
				this.init("G_TREETWOJBX_433509", "Consulta de Tasas");
			}
		}
		
		public static final LytGroup2201IdGTREETWOQUB520509 lytGroup2201IdGTREETWOQUB520509 = Singleton.getInstance(LytGroup2201IdGTREETWOQUB520509.class);
		
		public static class LytGroup2201IdGTREETWOQUB520509 extends COBISCollapsable {
			public LytGroup2201IdGTREETWOQUB520509(){
				this.init("G_TREETWOQUB_520509", "Operaciones Renovadas");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	
}

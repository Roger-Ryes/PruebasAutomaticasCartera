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

public class TreeGeneralDataFormForm{

	public static final GridGeneralDataValue gridGeneralDataValue = Singleton.getInstance(GridGeneralDataValue.class);
	private TreeGeneralDataFormForm() {
		throw new IllegalStateException("TreeGeneralDataFormForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroup1156IdGGENERALTAD810157 lytGroup1156IdGGENERALTAD810157 = Singleton.getInstance(LytGroup1156IdGGENERALTAD810157.class);
		
		public static class LytGroup1156IdGGENERALTAD810157 extends COBISCollapsable {
			public LytGroup1156IdGGENERALTAD810157(){
				this.init("G_GENERALTAD_810157", "Datos Generales");
			}
		}
		
		public static final LytGroup2816IdGGENERALTAA935157 lytGroup2816IdGGENERALTAA935157 = Singleton.getInstance(LytGroup2816IdGGENERALTAA935157.class);
		
		public static class LytGroup2816IdGGENERALTAA935157 extends COBISCollapsable {
			public LytGroup2816IdGGENERALTAA935157(){
				this.init("G_GENERALTAA_935157", "Condiciones de Pago");
			}
		}
		
		public static final LytGroup2495IdGGENERALTTA968157 lytGroup2495IdGGENERALTTA968157 = Singleton.getInstance(LytGroup2495IdGGENERALTTA968157.class);
		
		public static class LytGroup2495IdGGENERALTTA968157 extends COBISCollapsable {
			public LytGroup2495IdGGENERALTTA968157(){
				this.init("G_GENERALTTA_968157", "Condiciones Generales");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	
	
	public static class GridGeneralDataValue extends COBISGrid {
		public GridGeneralDataValue() {
			this.init("QV_6735_98834", "QV_6735_98834");
		} 

		public static final Code code = Singleton.getInstance(Code.class);
		public static final Description description = Singleton.getInstance(Description.class);

		public static class Code extends COBISInputValue {
			public Code() {
				this.init("VA_TEXTINPUTBOXSDJ_753157","Code");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXXNU_286157","Description");
			}
		}			
	}
}

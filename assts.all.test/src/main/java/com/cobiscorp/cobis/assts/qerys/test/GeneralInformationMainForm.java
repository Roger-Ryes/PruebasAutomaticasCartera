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

public class GeneralInformationMainForm{

	private GeneralInformationMainForm() {
		throw new IllegalStateException("GeneralInformationMainForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroupLayout1660IdGGENERALIIO430193 lytGroupLayout1660IdGGENERALIIO430193 = Singleton.getInstance(LytGroupLayout1660IdGGENERALIIO430193.class);
		
		public static class LytGroupLayout1660IdGGENERALIIO430193 extends COBISTab {
			public LytGroupLayout1660IdGGENERALIIO430193(){
				this.init("G_GENERALIIO_430193", "Estado Actual");
			}
		}
		
		public static final LytGroup2797IdGGENERALINN164193 lytGroup2797IdGGENERALINN164193 = Singleton.getInstance(LytGroup2797IdGGENERALINN164193.class);
		
		public static class LytGroup2797IdGGENERALINN164193 extends COBISTab {
			public LytGroup2797IdGGENERALINN164193(){
				this.init("G_GENERALINN_164193", "Información General");
			}
		}
		
		public static final LytGroup1358IdGGENERALNNA591193 lytGroup1358IdGGENERALNNA591193 = Singleton.getInstance(LytGroup1358IdGGENERALNNA591193.class);
		
		public static class LytGroup1358IdGGENERALNNA591193 extends COBISTab {
			public LytGroup1358IdGGENERALNNA591193(){
				this.init("G_GENERALNNA_591193", "Cartera Pasiva");
			}
		}
		
		public static final LytGroupLayout2612IdGGENERALOII638193 lytGroupLayout2612IdGGENERALOII638193 = Singleton.getInstance(LytGroupLayout2612IdGGENERALOII638193.class);
		
		public static class LytGroupLayout2612IdGGENERALOII638193 extends COBISTab {
			public LytGroupLayout2612IdGGENERALOII638193(){
				this.init("G_GENERALOII_638193", "Garantías y Deudores");
			}
		}
		
		public static final LytGroup1940IdGGENERALNOA127193 lytGroup1940IdGGENERALNOA127193 = Singleton.getInstance(LytGroup1940IdGGENERALNOA127193.class);
		
		public static class LytGroup1940IdGGENERALNOA127193 extends COBISCollapsable {
			public LytGroup1940IdGGENERALNOA127193(){
				this.init("G_GENERALNOA_127193", "Deudores");
			}
		}
		
		public static final LytGroup2837IdGGENERALNMM828193 lytGroup2837IdGGENERALNMM828193 = Singleton.getInstance(LytGroup2837IdGGENERALNMM828193.class);
		
		public static class LytGroup2837IdGGENERALNMM828193 extends COBISCollapsable {
			public LytGroup2837IdGGENERALNMM828193(){
				this.init("G_GENERALNMM_828193", "Garantes y Fiadores");
			}
		}
		
		public static final LytGroup2455IdGGENERALNIN596193 lytGroup2455IdGGENERALNIN596193 = Singleton.getInstance(LytGroup2455IdGGENERALNIN596193.class);
		
		public static class LytGroup2455IdGGENERALNIN596193 extends COBISCollapsable {
			public LytGroup2455IdGGENERALNIN596193(){
				this.init("G_GENERALNIN_596193", "Garantías");
			}
		}
		
		public static final LytGroup2467IdGGENERALTTN154193 lytGroup2467IdGGENERALTTN154193 = Singleton.getInstance(LytGroup2467IdGGENERALTTN154193.class);
		
		public static class LytGroup2467IdGGENERALTTN154193 extends COBISCollapsable {
			public LytGroup2467IdGGENERALTTN154193(){
				this.init("G_GENERALTTN_154193", "Pólizas");
			}
		}
		
		public static final LytGroupLayout2907IdGGENERALIOT600193 lytGroupLayout2907IdGGENERALIOT600193 = Singleton.getInstance(LytGroupLayout2907IdGGENERALIOT600193.class);
		
		public static class LytGroupLayout2907IdGGENERALIOT600193 extends COBISTab {
			public LytGroupLayout2907IdGGENERALIOT600193(){
				this.init("G_GENERALIOT_600193", "Rubros y Tasas");
			}
		}
		
		public static final LytGroup1134IdGGENERALOTN662193 lytGroup1134IdGGENERALOTN662193 = Singleton.getInstance(LytGroup1134IdGGENERALOTN662193.class);
		
		public static class LytGroup1134IdGGENERALOTN662193 extends COBISTab {
			public LytGroup1134IdGGENERALOTN662193(){
				this.init("G_GENERALOTN_662193", "Abonos");
			}
		}
		
		public static final LytGroup2225IdGGENERALNNN702193 lytGroup2225IdGGENERALNNN702193 = Singleton.getInstance(LytGroup2225IdGGENERALNNN702193.class);
		
		public static class LytGroup2225IdGGENERALNNN702193 extends COBISTab {
			public LytGroup2225IdGGENERALNNN702193(){
				this.init("G_GENERALNNN_702193", "Transacciones");
			}
		}
		
		public static final LytGroup2595IdGGENERALNNM609193 lytGroup2595IdGGENERALNNM609193 = Singleton.getInstance(LytGroup2595IdGGENERALNNM609193.class);
		
		public static class LytGroup2595IdGGENERALNNM609193 extends COBISTab {
			public LytGroup2595IdGGENERALNNM609193(){
				this.init("G_GENERALNNM_609193", "Op. Renovada/Reestructurada");
			}
		}
		
		public static final LytGroup2572IdGGENERALMIN860193 lytGroup2572IdGGENERALMIN860193 = Singleton.getInstance(LytGroup2572IdGGENERALMIN860193.class);
		
		public static class LytGroup2572IdGGENERALMIN860193 extends COBISTab {
			public LytGroup2572IdGGENERALMIN860193(){
				this.init("G_GENERALMIN_860193", "Operaciones Hijas");
			}
		}
		
		public static final LytGroup2185IdGGENERALOAT762193 lytGroup2185IdGGENERALOAT762193 = Singleton.getInstance(LytGroup2185IdGGENERALOAT762193.class);
		
		public static class LytGroup2185IdGGENERALOAT762193 extends COBISTab {
			public LytGroup2185IdGGENERALOAT762193(){
				this.init("G_GENERALOAT_762193", "Operaciones Interciclos");
			}
		}
		
		public static final LytGroup2584IdGGENERALTAM466193 lytGroup2584IdGGENERALTAM466193 = Singleton.getInstance(LytGroup2584IdGGENERALTAM466193.class);
		
		public static class LytGroup2584IdGGENERALTAM466193 extends COBISTab {
			public LytGroup2584IdGGENERALTAM466193(){
				this.init("G_GENERALTAM_466193", "Seguros");
			}
		}
		
		public static final LytGroup2446IdGGENERALAIA225193 lytGroup2446IdGGENERALAIA225193 = Singleton.getInstance(LytGroup2446IdGGENERALAIA225193.class);
		
		public static class LytGroup2446IdGGENERALAIA225193 extends COBISTab {
			public LytGroup2446IdGGENERALAIA225193(){
				this.init("G_GENERALAIA_225193", "Reajustes del Préstamo");
			}
		}
		
		public static final LytGroup1643IdGGENERALANN232193 lytGroup1643IdGGENERALANN232193 = Singleton.getInstance(LytGroup1643IdGGENERALANN232193.class);
		
		public static class LytGroup1643IdGGENERALANN232193 extends COBISTab {
			public LytGroup1643IdGGENERALANN232193(){
				this.init("G_GENERALANN_232193", "Préstamos Sindicados");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTASSTSBIBA1 cmdCommand1IdCMTASSTSBIBA1 = Singleton.getInstance(CmdCommand1IdCMTASSTSBIBA1.class);
		
		public static class CmdCommand1IdCMTASSTSBIBA1 extends COBISButton{
			public CmdCommand1IdCMTASSTSBIBA1 () {
				this.init("CM_TASSTSBI_BA1", "Actualizar");
			}
		}
	

	}
	
}

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

public class GeneralInformationFormForm{
	public static final ColumnsDataValue columnsDataValue = Singleton.getInstance(ColumnsDataValue.class);
	public static final LoanInstancia loanInstancia = Singleton.getInstance(LoanInstancia.class);
	public static final OperationPaymentColumn operationPaymentColumn = Singleton.getInstance(OperationPaymentColumn.class);

	private GeneralInformationFormForm() {
		throw new IllegalStateException("GeneralInformationFormForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroupLayout1472IdGGENERALNII893203 lytGroupLayout1472IdGGENERALNII893203 = Singleton.getInstance(LytGroupLayout1472IdGGENERALNII893203.class);
		
		public static class LytGroupLayout1472IdGGENERALNII893203 extends COBISCollapsable {
			public LytGroupLayout1472IdGGENERALNII893203(){
				this.init("G_GENERALNII_893203", "Información General");
			}
		}
		
		public static final LytGroupLayout1277IdGGENERALNNT676203 lytGroupLayout1277IdGGENERALNNT676203 = Singleton.getInstance(LytGroupLayout1277IdGGENERALNNT676203.class);
		
		public static class LytGroupLayout1277IdGGENERALNNT676203 extends COBISCollapsable {
			public LytGroupLayout1277IdGGENERALNNT676203(){
				this.init("G_GENERALNNT_676203", "Condiciones Generales:");
			}
		}
		
		public static final LytGroupLayout1145IdGGENERALOAN318203 lytGroupLayout1145IdGGENERALOAN318203 = Singleton.getInstance(LytGroupLayout1145IdGGENERALOAN318203.class);
		
		public static class LytGroupLayout1145IdGGENERALOAN318203 extends COBISCollapsable {
			public LytGroupLayout1145IdGGENERALOAN318203(){
				this.init("G_GENERALOAN_318203", "Condiciones de Pago");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVABUTTONDDDDEEH709203IdVAVABUTTONDDDDEEH709203 btnVAVABUTTONDDDDEEH709203IdVAVABUTTONDDDDEEH709203 = Singleton.getInstance(BtnVAVABUTTONDDDDEEH709203IdVAVABUTTONDDDDEEH709203.class);
		
		public static class BtnVAVABUTTONDDDDEEH709203IdVAVABUTTONDDDDEEH709203 extends COBISButton{
			public BtnVAVABUTTONDDDDEEH709203IdVAVABUTTONDDDDEEH709203 () {
				this.init("VA_VABUTTONDDDDEEH_709203", "Información Financiera");
			}
		}
	

	}
	

	public static class ColumnsDataValue {
	
		private ColumnsDataValue() {
			throw new IllegalStateException("GeneralInformationFormForm is a utility class");
		}
		
		public static final Col30 col30 = Singleton.getInstance(Col30.class);
		public static final Col82 col82 = Singleton.getInstance(Col82.class);
		public static final Col91 col91 = Singleton.getInstance(Col91.class);
		public static final Col11 col11 = Singleton.getInstance(Col11.class);
		public static final Col89 col89 = Singleton.getInstance(Col89.class);
		public static final Col70 col70 = Singleton.getInstance(Col70.class);
		public static final Col3 col3 = Singleton.getInstance(Col3.class);
		public static final Col74 col74 = Singleton.getInstance(Col74.class);
		public static final Col4 col4 = Singleton.getInstance(Col4.class);
		public static final Col63 col63 = Singleton.getInstance(Col63.class);
		public static final Col28 col28 = Singleton.getInstance(Col28.class);
		public static final Col83 col83 = Singleton.getInstance(Col83.class);
		public static final Col127 col127 = Singleton.getInstance(Col127.class);
		public static final Col96 col96 = Singleton.getInstance(Col96.class);
		public static final Col116 col116 = Singleton.getInstance(Col116.class);
		public static final Col148 col148 = Singleton.getInstance(Col148.class);
		public static final Col98 col98 = Singleton.getInstance(Col98.class);
		public static final Col149 col149 = Singleton.getInstance(Col149.class);
		public static final Col94 col94 = Singleton.getInstance(Col94.class);
		public static final Col150 col150 = Singleton.getInstance(Col150.class);
		public static final Col16 col16 = Singleton.getInstance(Col16.class);
		public static final Col151 col151 = Singleton.getInstance(Col151.class);
		public static final Col17 col17 = Singleton.getInstance(Col17.class);
		public static final Col138 col138 = Singleton.getInstance(Col138.class);
		public static final Col13 col13 = Singleton.getInstance(Col13.class);
		public static final Col139 col139 = Singleton.getInstance(Col139.class);
		public static final Col71 col71 = Singleton.getInstance(Col71.class);
		public static final Col169 col169 = Singleton.getInstance(Col169.class);
		public static final Col170 col170 = Singleton.getInstance(Col170.class);
		public static final Col100 col100 = Singleton.getInstance(Col100.class);
		public static final Col102 col102 = Singleton.getInstance(Col102.class);
		public static final Col103 col103 = Singleton.getInstance(Col103.class);
		public static final Col88 col88 = Singleton.getInstance(Col88.class);
		public static final Col153 col153 = Singleton.getInstance(Col153.class);
		public static final Col154 col154 = Singleton.getInstance(Col154.class);
		public static final Col155 col155 = Singleton.getInstance(Col155.class);
		public static final Col156 col156 = Singleton.getInstance(Col156.class);
		public static final Col157 col157 = Singleton.getInstance(Col157.class);
		public static final Col158 col158 = Singleton.getInstance(Col158.class);
		public static final Col159 col159 = Singleton.getInstance(Col159.class);
		public static final Col160 col160 = Singleton.getInstance(Col160.class);
		public static final Col161 col161 = Singleton.getInstance(Col161.class);
		public static final Col93 col93 = Singleton.getInstance(Col93.class);
		public static final Col106 col106 = Singleton.getInstance(Col106.class);
		public static final Col10 col10 = Singleton.getInstance(Col10.class);
		public static final Col144 col144 = Singleton.getInstance(Col144.class);
		public static final Col92 col92 = Singleton.getInstance(Col92.class);
		public static final Col146 col146 = Singleton.getInstance(Col146.class);
		public static final Col128 col128 = Singleton.getInstance(Col128.class);
		public static final Col136 col136 = Singleton.getInstance(Col136.class);
		public static final Col132 col132 = Singleton.getInstance(Col132.class);
		public static final Col137 col137 = Singleton.getInstance(Col137.class);
		public static final Col14 col14 = Singleton.getInstance(Col14.class);
		public static final Col37 col37 = Singleton.getInstance(Col37.class);
		public static final Col38 col38 = Singleton.getInstance(Col38.class);
		public static final Col140 col140 = Singleton.getInstance(Col140.class);
		public static final Col141 col141 = Singleton.getInstance(Col141.class);
		public static final Col119 col119 = Singleton.getInstance(Col119.class);
		public static final Col133 col133 = Singleton.getInstance(Col133.class);
		public static final Col95 col95 = Singleton.getInstance(Col95.class);
		public static final Col97 col97 = Singleton.getInstance(Col97.class);
		public static final Col134 col134 = Singleton.getInstance(Col134.class);
		public static final Col32 col32 = Singleton.getInstance(Col32.class);
		public static final Col46 col46 = Singleton.getInstance(Col46.class);
		public static final Col33 col33 = Singleton.getInstance(Col33.class);
		public static final Col54 col54 = Singleton.getInstance(Col54.class);
		public static final Col44 col44 = Singleton.getInstance(Col44.class);
		public static final Col18 col18 = Singleton.getInstance(Col18.class);
		public static final Col24 col24 = Singleton.getInstance(Col24.class);
		public static final Col22 col22 = Singleton.getInstance(Col22.class);
		public static final Col25 col25 = Singleton.getInstance(Col25.class);
		public static final Col23 col23 = Singleton.getInstance(Col23.class);
		public static final Col77 col77 = Singleton.getInstance(Col77.class);
		public static final Col49 col49 = Singleton.getInstance(Col49.class);
		public static final Col81 col81 = Singleton.getInstance(Col81.class);
		public static final Col111 col111 = Singleton.getInstance(Col111.class);
		public static final Col113 col113 = Singleton.getInstance(Col113.class);
		public static final Col48 col48 = Singleton.getInstance(Col48.class);
		public static final Col53 col53 = Singleton.getInstance(Col53.class);
		public static final Col112 col112 = Singleton.getInstance(Col112.class);
		public static final BalloomFee balloomFee = Singleton.getInstance(BalloomFee.class);
		public static final Col80 col80 = Singleton.getInstance(Col80.class);
		public static final Col35 col35 = Singleton.getInstance(Col35.class);
		public static final Col34 col34 = Singleton.getInstance(Col34.class);

		public static class Col30 extends COBISInputValue {
			public Col30() {
				this.init("VA_TEXTINPUTBOXYLL_293203","Ciudad");
			}
		}			

		public static class Col82 extends COBISInputValue {
			public Col82() {
				this.init("VA_TEXTINPUTBOXFHY_331203","Fechadeultimoproceso");
			}
		}			

		public static class Col91 extends COBISInputValue {
			public Col91() {
				this.init("VA_TEXTINPUTBOXXCX_878203","ClasedeCartera");
			}
		}			

		public static class Col11 extends COBISInputValue {
			public Col11() {
				this.init("VA_COL11DMRXFYBTRJ_832203","Fechadevencimiento");
			}
		}			

		public static class Col89 extends COBISInputValue {
			public Col89() {
				this.init("VA_TEXTINPUTBOXOZJ_807203","LineadeCredito");
			}
		}			

		public static class Col70 extends COBISInputValue {
			public Col70() {
				this.init("VA_TEXTINPUTBOXCLV_313203","NoDesembolsos");
			}
		}			

		public static class Col3 extends COBISInputValue {
			public Col3() {
				this.init("VA_TEXTINPUTBOXCEU_727203","NoTramite");
			}
		}			

		public static class Col74 extends COBISInputValue {
			public Col74() {
				this.init("VA_TEXTINPUTBOXZST_196203","MontoAprobado");
			}
		}			

		public static class Col4 extends COBISInputValue {
			public Col4() {
				this.init("VA_TEXTINPUTBOXKKT_290203","CupodeCredito");
			}
		}			

		public static class Col63 extends COBISInputValue {
			public Col63() {
				this.init("VA_TEXTINPUTBOXQVD_784203","MontoDesembolsado");
			}
		}			

		public static class Col28 extends COBISInputValue {
			public Col28() {
				this.init("VA_TEXTINPUTBOXFUR_725203","DestinoFinanciero");
			}
		}			

		public static class Col83 extends COBISInputValue {
			public Col83() {
				this.init("VA_TEXTINPUTBOXNLU_276203","SaldoCapital");
			}
		}			

		public static class Col127 extends COBISInputValue {
			public Col127() {
				this.init("VA_TEXTINPUTBOXXAE_419203","EdaddelaCartera");
			}
		}			

		public static class Col96 extends COBISInputValue {
			public Col96() {
				this.init("VA_TEXTINPUTBOXNUC_515203","SaldoTotalparaCancelacion");
			}
		}			

		public static class Col116 extends COBISInputValue {
			public Col116() {
				this.init("VA_TEXTINPUTBOXMIJ_255203","DiasdeMoraCapital");
			}
		}			

		public static class Col148 extends COBISInputValue {
			public Col148() {
				this.init("VA_COL148YHTMQIFBH_165203","ValorVencido");
			}
		}			

		public static class Col98 extends COBISInputValue {
			public Col98() {
				this.init("VA_COL98VYAYLZCUKZ_984203","DiasdeMoraTotal");
			}
		}			

		public static class Col149 extends COBISInputValue {
			public Col149() {
				this.init("VA_COL149ECRVIIDXJ_360203","ValorVencidoconReconocimiento");
			}
		}			

		public static class Col94 extends COBISInputValue {
			public Col94() {
				this.init("VA_TEXTINPUTBOXTXW_844203","CalificaciondeOrigen");
			}
		}			

		public static class Col150 extends COBISInputValue {
			public Col150() {
				this.init("VA_COL150TJUVFKMWM_571203","SaldoalaFecha");
			}
		}			

		public static class Col16 extends COBISInputValue {
			public Col16() {
				this.init("VA_TEXTINPUTBOXVHS_357203","CalificaciondeOrigen");
			}
		}			

		public static class Col151 extends COBISInputValue {
			public Col151() {
				this.init("VA_COL151XEUXPLAEA_433203","SaldoalaFechaconReconocimiento");
			}
		}			

		public static class Col17 extends COBISInputValue {
			public Col17() {
				this.init("VA_TEXTINPUTBOXVBB_693203","CalificaciondeSeguimiento");
			}
		}			

		public static class Col138 extends COBISInputValue {
			public Col138() {
				this.init("VA_TEXTINPUTBOXWVS_331203","ReconocimientoporAmortizarInicial");
			}
		}			

		public static class Col13 extends COBISInputValue {
			public Col13() {
				this.init("VA_TEXTINPUTBOXLAA_716203","FechadeAprobacion");
			}
		}			

		public static class Col139 extends COBISInputValue {
			public Col139() {
				this.init("VA_TEXTINPUTBOXEUN_350203","SaldodeReconocimientoporAmortizar");
			}
		}			

		public static class Col71 extends COBISInputValue {
			public Col71() {
				this.init("VA_TEXTINPUTBOXPCU_828203","FechadeDesembolso");
			}
		}			

		public static class Col169 extends COBISInputValue {
			public Col169() {
				this.init("VA_COL169OXNPIMJZK_188203","ValordeTasaEfectivaAnual");
			}
		}			

		public static class Col170 extends COBISInputValue {
			public Col170() {
				this.init("VA_COL170OEOBJNBNE_695203","TasadeCostoEfectivoAnual");
			}
		}			

		public static class Col100 extends COBISInputValue {
			public Col100() {
				this.init("VA_TEXTINPUTBOXVBP_896203","SituaciondelCliente");
			}
		}			

		public static class Col102 extends COBISInputValue {
			public Col102() {
				this.init("VA_COL102IZHQPGLGQ_823203","CausaldelCliente");
			}
		}			

		public static class Col103 extends COBISInputValue {
			public Col103() {
				this.init("VA_TEXTINPUTBOXSFC_390203","ActividadProductiva");
			}
		}			

		public static class Col88 extends COBISInputValue {
			public Col88() {
				this.init("VA_TEXTINPUTBOXZSP_614203","DirecciondelCliente");
			}
		}			

		public static class Col153 extends COBISInputValue {
			public Col153() {
				this.init("VA_COL153PEYBRIIBA_813203","PresidenteGrupo");
			}
		}			

		public static class Col154 extends COBISInputValue {
			public Col154() {
				this.init("VA_COL154WEXTAMOTB_871203","CategoriaCredito");
			}
		}			

		public static class Col155 extends COBISInputValue {
			public Col155() {
				this.init("VA_COL155VLXVEOBDY_344203","ReferenciaGrupal");
			}
		}			

		public static class Col156 extends COBISInputValue {
			public Col156() {
				this.init("VA_COL156OKGIGKFEX_212203","deCiclosdelGrupo");
			}
		}			

		public static class Col157 extends COBISInputValue {
			public Col157() {
				this.init("VA_COL157AGGZBEULZ_816203","deCiclosdelCliente");
			}
		}			

		public static class Col158 extends COBISInputValue {
			public Col158() {
				this.init("VA_COL158WGHVVWVEK_572203","Fechaprimerpago");
			}
		}			

		public static class Col159 extends COBISInputValue {
			public Col159() {
				this.init("VA_COL159WPDNFJVTU_966203","TipodeoperacionGrupal");
			}
		}			

		public static class Col160 extends COBISInputValue {
			public Col160() {
				this.init("VA_COL160HJQNBSHMS_764203","AhorrominimoEsperado");
			}
		}			

		public static class Col161 extends COBISInputValue {
			public Col161() {
				this.init("VA_COL161CZCIPBKLM_114203","Administracion");
			}
		}			

		public static class Col93 extends COBISInputValue {
			public Col93() {
				this.init("VA_TEXTINPUTBOXXQS_367203","OrigendelosRecursos");
			}
		}			

		public static class Col106 extends COBISInputValue {
			public Col106() {
				this.init("VA_TEXTINPUTBOXDFL_233203","DestinoEconomico");
			}
		}			

		public static class Col10 extends COBISInputValue {
			public Col10() {
				this.init("VA_TEXTINPUTBOXLDN_789203","EntidadPrestamista");
			}
		}			

		public static class Col144 extends COBISInputValue {
			public Col144() {
				this.init("VA_TEXTINPUTBOXPRC_818203","LlaveFinagro");
			}
		}			

		public static class Col92 extends COBISInputValue {
			public Col92() {
				this.init("VA_TEXTINPUTBOXAYN_905203","ProgramadeCredito");
			}
		}			

		public static class Col146 extends COBISInputValue {
			public Col146() {
				this.init("VA_COL146AYXFKCRYI_168203","GarantiaFinagro");
			}
		}			

		public static class Col128 extends COBISInputValue {
			public Col128() {
				this.init("VA_TEXTINPUTBOXHNK_820203","EstadoCobranza");
			}
		}			

		public static class Col136 extends COBISInputValue {
			public Col136() {
				this.init("VA_TEXTINPUTBOXMWQ_662203","TelefonoAbogadoCasadeCobranza");
			}
		}			

		public static class Col132 extends COBISInputValue {
			public Col132() {
				this.init("VA_TEXTINPUTBOXYAE_738203","AbogadoCasadeCobranza");
			}
		}			

		public static class Col137 extends COBISInputValue {
			public Col137() {
				this.init("VA_TEXTINPUTBOXPRR_754203","DireccionAbogadoCasadeCobranza");
			}
		}			

		public static class Col14 extends COBISInputValue {
			public Col14() {
				this.init("VA_TEXTINPUTBOXFJI_119203","FechadeCastigo");
			}
		}			

		public static class Col37 extends COBISInputValue {
			public Col37() {
				this.init("VA_TEXTINPUTBOXSJD_345203","PermiteRenovaciones");
			}
		}			

		public static class Col38 extends COBISInputValue {
			public Col38() {
				this.init("VA_TEXTINPUTBOXLZX_625203","NumerodeRenovacion");
			}
		}			

		public static class Col140 extends COBISInputValue {
			public Col140() {
				this.init("VA_TEXTINPUTBOXZYM_339203","OperacionPadre");
			}
		}			

		public static class Col141 extends COBISInputValue {
			public Col141() {
				this.init("VA_TEXTINPUTBOXTAU_538203","OperacionHija");
			}
		}			

		public static class Col119 extends COBISInputValue {
			public Col119() {
				this.init("VA_TEXTINPUTBOXWQL_188203","PermiteReestructuraciones");
			}
		}			

		public static class Col133 extends COBISInputValue {
			public Col133() {
				this.init("VA_TEXTINPUTBOXQNT_219203","DiferidoPorAmortizarInicial");
			}
		}			

		public static class Col95 extends COBISInputValue {
			public Col95() {
				this.init("VA_TEXTINPUTBOXXYN_505203","NumerodeReestructuracion");
			}
		}			

		public static class Col97 extends COBISInputValue {
			public Col97() {
				this.init("VA_TEXTINPUTBOXGBW_313203","FechaUltimaReestructuracion");
			}
		}			

		public static class Col134 extends COBISInputValue {
			public Col134() {
				this.init("VA_TEXTINPUTBOXKJW_728203","SaldoDiferidoPorAmortizar");
			}
		}			

		public static class Col32 extends COBISInputValue {
			public Col32() {
				this.init("VA_COL32CDFPUYWBGD_758203","FormadePago");
			}
		}			

		public static class Col46 extends COBISInputValue {
			public Col46() {
				this.init("VA_COL46RBGZXOSXUD_578203","PagoAdicionalporDefecto");
			}
		}			

		public static class Col33 extends COBISInputValue {
			public Col33() {
				this.init("VA_COL33GXLNAEOZIW_513203","Referencia");
			}
		}			

		public static class Col54 extends COBISInputValue {
			public Col54() {
				this.init("VA_COL54TKWEEBKVXN_134203","DiadePago");
			}
		}			

		public static class Col44 extends COBISInputValue {
			public Col44() {
				this.init("VA_COL44RQKRIFDDCK_361203","TipodeCobroporDefecto");
			}
		}			

		public static class Col18 extends COBISInputValue {
			public Col18() {
				this.init("VA_COL18MPQAUPJEQF_886203","Plazo");
			}
		}			

		public static class Col24 extends COBISInputValue {
			public Col24() {
				this.init("VA_COL24NFMYARIPPW_188203","PeriodosdeGraciaCapital");
			}
		}			

		public static class Col22 extends COBISInputValue {
			public Col22() {
				this.init("VA_COL22GPNCCEADAN_455203","PeriodosPagodeCapital");
			}
		}			

		public static class Col25 extends COBISInputValue {
			public Col25() {
				this.init("VA_COL25RWYMCMPQKL_227203","PeriodosdeGraciaInteres");
			}
		}			

		public static class Col23 extends COBISInputValue {
			public Col23() {
				this.init("VA_COL23ZUQVNTSTGF_643203","PeriodosPagodeInteres");
			}
		}			

		public static class Col77 extends COBISInputValue {
			public Col77() {
				this.init("VA_COL77JLESNGFECP_839203","MesdeGracia");
			}
		}			

		public static class Col49 extends COBISInputValue {
			public Col49() {
				this.init("VA_COL49ZEUCHXHDSZ_263203","TipodeTabladeAmortizacion");
			}
		}			

		public static class Col81 extends COBISInputValue {
			public Col81() {
				this.init("VA_COL81JBFTYRSPYI_282203","EvitardiasFeriados");
			}
		}			

		public static class Col111 extends COBISInputValue {
			public Col111() {
				this.init("VA_COL111PZXDZUYUC_787203","BasedeCalculo");
			}
		}			

		public static class Col113 extends COBISInputValue {
			public Col113() {
				this.init("VA_COL113YQSWHDUHL_890203","UltimodiaHabil");
			}
		}			

		public static class Col48 extends COBISInputValue {
			public Col48() {
				this.init("VA_COL48UDRRPRVRAD_844203","DiasdelAno");
			}
		}			

		public static class Col53 extends COBISInputValue {
			public Col53() {
				this.init("VA_COL53CZDOJNOMFT_346203","DiasdeGraciaporCuota");
			}
		}			

		public static class Col112 extends COBISInputValue {
			public Col112() {
				this.init("VA_COL112OCPGNLXFG_495203","RecalcularDias");
			}
		}			

		public static class BalloomFee extends COBISInputValue {
			public BalloomFee() {
				this.init("VA_BALLOOMFEEERNAZ_793203","CuotaBalloon");
			}
		}			

		public static class Col80 extends COBISInputValue {
			public Col80() {
				this.init("VA_COL80ASFOWXJRDC_132203","Reajustable");
			}
		}			

		public static class Col35 extends COBISInputValue {
			public Col35() {
				this.init("VA_COL35HREVITBWJO_552203","FechaProximoReajuste");
			}
		}			

		public static class Col34 extends COBISInputValue {
			public Col34() {
				this.init("VA_COL34HWLCGTUDDY_405203","PeriodosdeReajuste");
			}
		}			
	}

	public static class LoanInstancia {
	
		private LoanInstancia() {
			throw new IllegalStateException("GeneralInformationFormForm is a utility class");
		}
		
	}

	public static class OperationPaymentColumn {
	
		private OperationPaymentColumn() {
			throw new IllegalStateException("GeneralInformationFormForm is a utility class");
		}
		
		public static final Attribute1 attribute1 = Singleton.getInstance(Attribute1.class);
		public static final Attribute2 attribute2 = Singleton.getInstance(Attribute2.class);
		public static final Attribute7 attribute7 = Singleton.getInstance(Attribute7.class);
		public static final Attribute3 attribute3 = Singleton.getInstance(Attribute3.class);
		public static final Attribute4 attribute4 = Singleton.getInstance(Attribute4.class);
		public static final Attribute5 attribute5 = Singleton.getInstance(Attribute5.class);
		public static final Attribute6 attribute6 = Singleton.getInstance(Attribute6.class);

		public static class Attribute1 extends COBISRadioButtonList {
			public Attribute1() {
				this.init("VA_1FGSVHUUVWIKFUH_287203","Attribute1");
			}
		}			

		public static class Attribute2 extends COBISRadioButtonList {
			public Attribute2() {
				this.init("VA_2SRBPZVHVQZKGLJ_978203","Attribute2");
			}
		}			

		public static class Attribute7 extends COBISRadioButtonList {
			public Attribute7() {
				this.init("VA_7HLMTHMOBEPUKDK_450203","Attribute7");
			}
		}			

		public static class Attribute3 extends COBISRadioButtonList {
			public Attribute3() {
				this.init("VA_3NNEJBUKBEXSHGE_308203","CalcularvalordedevolucionparaIntAnticipado");
			}
		}			

		public static class Attribute4 extends COBISRadioButtonList {
			public Attribute4() {
				this.init("VA_4FLCMFUIKOOYYCR_921203","Seaceptanpagosadicionales");
			}
		}			

		public static class Attribute5 extends COBISRadioButtonList {
			public Attribute5() {
				this.init("VA_5KYGLTQZCBSQIFR_819203","SolopagosdeCuotaCompleta");
			}
		}			

		public static class Attribute6 extends COBISRadioButtonList {
			public Attribute6() {
				this.init("VA_6ECRCCEMLGMWTWN_816203","PermitePagosporCaja");
			}
		}			
	}
}

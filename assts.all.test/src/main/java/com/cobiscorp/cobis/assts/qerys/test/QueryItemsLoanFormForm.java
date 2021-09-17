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

public class QueryItemsLoanFormForm{

	public static final GridLoanEntry gridLoanEntry = Singleton.getInstance(GridLoanEntry.class);
	private QueryItemsLoanFormForm() {
		throw new IllegalStateException("QueryItemsLoanFormForm is a utility class");
	}
	
	public static class GridLoanEntry extends COBISGrid {
		public GridLoanEntry() {
			this.init("QV_7536_43842", "QV_7536_43842");
		} 

		public static final Description description = Singleton.getInstance(Description.class);
		public static final Concept concept = Singleton.getInstance(Concept.class);
		public static final PaymentMethod paymentMethod = Singleton.getInstance(PaymentMethod.class);
		public static final ItemType itemType = Singleton.getInstance(ItemType.class);
		public static final Priority priority = Singleton.getInstance(Priority.class);
		public static final Value value = Singleton.getInstance(Value.class);
		public static final LatePayment latePayment = Singleton.getInstance(LatePayment.class);
		public static final Reference reference = Singleton.getInstance(Reference.class);
		public static final Sign sign = Singleton.getInstance(Sign.class);
		public static final Cause cause = Singleton.getInstance(Cause.class);
		public static final PointsValue pointsValue = Singleton.getInstance(PointsValue.class);
		public static final PointsType pointsType = Singleton.getInstance(PointsType.class);
		public static final ValueTotalRate valueTotalRate = Singleton.getInstance(ValueTotalRate.class);
		public static final NegotiatedRate negotiatedRate = Singleton.getInstance(NegotiatedRate.class);
		public static final AnnualEfecRate annualEfecRate = Singleton.getInstance(AnnualEfecRate.class);
		public static final ReajustmenSign reajustmenSign = Singleton.getInstance(ReajustmenSign.class);
		public static final ReajustmentValuePoints reajustmentValuePoints = Singleton.getInstance(ReajustmentValuePoints.class);
		public static final ReajustmentReference reajustmentReference = Singleton.getInstance(ReajustmentReference.class);
		public static final Gain gain = Singleton.getInstance(Gain.class);
		public static final BaseCalculation baseCalculation = Singleton.getInstance(BaseCalculation.class);
		public static final ChargeForRinging chargeForRinging = Singleton.getInstance(ChargeForRinging.class);
		public static final WarrantyType warrantyType = Singleton.getInstance(WarrantyType.class);
		public static final WarrantyNumber warrantyNumber = Singleton.getInstance(WarrantyNumber.class);
		public static final CoveragePercentage coveragePercentage = Singleton.getInstance(CoveragePercentage.class);
		public static final WarrantyValue warrantyValue = Singleton.getInstance(WarrantyValue.class);
		public static final DividendType dividendType = Singleton.getInstance(DividendType.class);
		public static final InterestPeriod interestPeriod = Singleton.getInstance(InterestPeriod.class);
		public static final TableOtherRate tableOtherRate = Singleton.getInstance(TableOtherRate.class);
		public static final Financed financed = Singleton.getInstance(Financed.class);
		public static final MinRate minRate = Singleton.getInstance(MinRate.class);
		public static final MaxRate maxRate = Singleton.getInstance(MaxRate.class);

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXWQQ_927129","Descripcion");
			}
		}			

		public static class Concept extends COBISInputValue {
			public Concept() {
				this.init("VA_TEXTINPUTBOXPWL_897129","Rubro");
			}
		}			

		public static class PaymentMethod extends COBISInputValue {
			public PaymentMethod() {
				this.init("VA_TEXTINPUTBOXGZZ_547129","FdePago");
			}
		}			

		public static class ItemType extends COBISInputValue {
			public ItemType() {
				this.init("VA_TEXTINPUTBOXELD_365129","TipoRubro");
			}
		}			

		public static class Priority extends COBISInputValue {
			public Priority() {
				this.init("VA_TEXTINPUTBOXUKJ_377129","Prioridad");
			}
		}			

		public static class Value extends COBISInputValue {
			public Value() {
				this.init("VA_TEXTINPUTBOXVJT_905129","Valor");
			}
		}			

		public static class LatePayment extends COBISInputValue {
			public LatePayment() {
				this.init("VA_TEXTINPUTBOXPWU_574129","PagaMora");
			}
		}			

		public static class Reference extends COBISInputValue {
			public Reference() {
				this.init("VA_TEXTINPUTBOXEHI_505129","Referencia");
			}
		}			

		public static class Sign extends COBISInputValue {
			public Sign() {
				this.init("VA_TEXTINPUTBOXUAW_754129","Signo");
			}
		}			

		public static class Cause extends COBISInputValue {
			public Cause() {
				this.init("VA_TEXTINPUTBOXRPV_709129","Causa");
			}
		}			

		public static class PointsValue extends COBISInputValue {
			public PointsValue() {
				this.init("VA_TEXTINPUTBOXXZQ_673129","ValorPuntos");
			}
		}			

		public static class PointsType extends COBISInputValue {
			public PointsType() {
				this.init("VA_TEXTINPUTBOXZDB_612129","TipoPuntos");
			}
		}			

		public static class ValueTotalRate extends COBISInputValue {
			public ValueTotalRate() {
				this.init("VA_TEXTINPUTBOXBHL_158129","ValorTasaTotal");
			}
		}			

		public static class NegotiatedRate extends COBISInputValue {
			public NegotiatedRate() {
				this.init("VA_TEXTINPUTBOXGKJ_582129","TasaNegociada");
			}
		}			

		public static class AnnualEfecRate extends COBISInputValue {
			public AnnualEfecRate() {
				this.init("VA_TEXTINPUTBOXILF_690129","Tasaefectivaanual");
			}
		}			

		public static class ReajustmenSign extends COBISInputValue {
			public ReajustmenSign() {
				this.init("VA_TEXTINPUTBOXAOL_704129","Signoreaj");
			}
		}			

		public static class ReajustmentValuePoints extends COBISInputValue {
			public ReajustmentValuePoints() {
				this.init("VA_TEXTINPUTBOXLYN_413129","ValorPuntosdeReaj");
			}
		}			

		public static class ReajustmentReference extends COBISInputValue {
			public ReajustmentReference() {
				this.init("VA_TEXTINPUTBOXIGC_163129","ReferenciadeReaj");
			}
		}			

		public static class Gain extends COBISInputValue {
			public Gain() {
				this.init("VA_TEXTINPUTBOXIBA_173129","Gracia");
			}
		}			

		public static class BaseCalculation extends COBISInputValue {
			public BaseCalculation() {
				this.init("VA_TEXTINPUTBOXPTQ_834129","BasedeCalculo");
			}
		}			

		public static class ChargeForRinging extends COBISInputValue {
			public ChargeForRinging() {
				this.init("VA_TEXTINPUTBOXNUQ_510129","PorCobrarTIMBRE");
			}
		}			

		public static class WarrantyType extends COBISInputValue {
			public WarrantyType() {
				this.init("VA_TEXTINPUTBOXYID_261129","TipoGarantia");
			}
		}			

		public static class WarrantyNumber extends COBISInputValue {
			public WarrantyNumber() {
				this.init("VA_TEXTINPUTBOXBRS_263129","NroGarantia");
			}
		}			

		public static class CoveragePercentage extends COBISInputValue {
			public CoveragePercentage() {
				this.init("VA_TEXTINPUTBOXTRE_710129","CoberturaGar");
			}
		}			

		public static class WarrantyValue extends COBISInputValue {
			public WarrantyValue() {
				this.init("VA_TEXTINPUTBOXTXW_242129","ValorGarantia");
			}
		}			

		public static class DividendType extends COBISInputValue {
			public DividendType() {
				this.init("VA_TEXTINPUTBOXJJD_513129","TipoDividendo");
			}
		}			

		public static class InterestPeriod extends COBISInputValue {
			public InterestPeriod() {
				this.init("VA_TEXTINPUTBOXBFF_919129","NoPeriodosInt");
			}
		}			

		public static class TableOtherRate extends COBISInputValue {
			public TableOtherRate() {
				this.init("VA_TEXTINPUTBOXOBK_430129","TablaOtrasTasas");
			}
		}			

		public static class Financed extends COBISComboBox {
			public Financed() {
				this.init("VA_COMBOBOXHRNMMDE_659129","Financiado");
			}
		}			

		public static class MinRate extends COBISInputValue {
			public MinRate() {
				this.init("VA_TEXTINPUTBOXZVO_565129","TasaMin");
			}
		}			

		public static class MaxRate extends COBISInputValue {
			public MaxRate() {
				this.init("VA_TEXTINPUTBOXYXS_454129","TasaMax");
			}
		}			
	}
}

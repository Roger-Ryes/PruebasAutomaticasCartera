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

public class DisbursementFormForm{
	public static final LoanAdditionalInformation loanAdditionalInformation = Singleton.getInstance(LoanAdditionalInformation.class);
	public static final DisbursementResult disbursementResult = Singleton.getInstance(DisbursementResult.class);
	public static final LiquidateResult liquidateResult = Singleton.getInstance(LiquidateResult.class);

	public static final GridDetailPaymentForm gridDetailPaymentForm = Singleton.getInstance(GridDetailPaymentForm.class);
	public static final GridDetailAmountsToCancel gridDetailAmountsToCancel = Singleton.getInstance(GridDetailAmountsToCancel.class);
	private DisbursementFormForm() {
		throw new IllegalStateException("DisbursementFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTDISBURSTD cmdCommand1IdCMTDISBURSTD = Singleton.getInstance(CmdCommand1IdCMTDISBURSTD.class);
		
		public static class CmdCommand1IdCMTDISBURSTD extends COBISButton{
			public CmdCommand1IdCMTDISBURSTD () {
				this.init("CM_TDISBURS_TD_", "Enviar");
			}
		}
	

	}
	

	public static class LoanAdditionalInformation {
	
		private LoanAdditionalInformation() {
			throw new IllegalStateException("DisbursementFormForm is a utility class");
		}
		
		public static final LoanDate loanDate = Singleton.getInstance(LoanDate.class);
		public static final CurrencyOp currencyOp = Singleton.getInstance(CurrencyOp.class);
		public static final Quotation quotation = Singleton.getInstance(Quotation.class);
		public static final QuoteTypeOP quoteTypeOP = Singleton.getInstance(QuoteTypeOP.class);
		public static final LblAmountToCancel lblAmountToCancel = Singleton.getInstance(LblAmountToCancel.class);

		public static class LoanDate extends COBISDatePicker {
			public LoanDate() {
				this.init("Spacer2433","FechaDesembolso");
			}
		}			

		public static class CurrencyOp extends COBISDropDownList {
			public CurrencyOp() {
				this.init("VA_CURRENCYOPUEQVI_819405","MonedaOperacion");
			}
		}			

		public static class Quotation extends COBISInputValue {
			public Quotation() {
				this.init("VA_QUOTATIONRUCNOK_902405","Cotizacion");
			}
		}			

		public static class QuoteTypeOP extends COBISInputValue {
			public QuoteTypeOP() {
				this.init("VA_QUOTETYPEOPVPYS_926405","TipoCotizacion");
			}
		}			

		public static class LblAmountToCancel extends COBISInputValue {
			public LblAmountToCancel() {
				this.init("VA_9687YKSEJAICISC_489405","Cotizacion");
			}
		}			
	}

	public static class DisbursementResult {
	
		private DisbursementResult() {
			throw new IllegalStateException("DisbursementFormForm is a utility class");
		}
		
		public static final SumTotal sumTotal = Singleton.getInstance(SumTotal.class);
		public static final Difference difference = Singleton.getInstance(Difference.class);

		public static class SumTotal extends COBISInputValue {
			public SumTotal() {
				this.init("Spacer1865","TotaldelDesembolso");
			}
		}			

		public static class Difference extends COBISInputValue {
			public Difference() {
				this.init("Spacer2275","Diferencia");
			}
		}			
	}

	public static class LiquidateResult {
	
		private LiquidateResult() {
			throw new IllegalStateException("DisbursementFormForm is a utility class");
		}
		
		public static final SumTotal sumTotal = Singleton.getInstance(SumTotal.class);

		public static class SumTotal extends COBISInputValue {
			public SumTotal() {
				this.init("Spacer1176","TotalaLiquidar");
			}
		}			
	}
	
	public static class GridDetailPaymentForm extends COBISGrid {
		public GridDetailPaymentForm() {
			this.init("QV_5973_48889", "QV_5973_48889");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}



		public static final BtnGridCommandIdCEQV201QV597348889606 btnGridCommandIdCEQV201QV597348889606 = Singleton.getInstance(BtnGridCommandIdCEQV201QV597348889606.class);

		public static class BtnGridCommandIdCEQV201QV597348889606 extends COBISButton {
			public BtnGridCommandIdCEQV201QV597348889606() {
				this.init("CEQV_201QV_5973_48889_606","Crear");
			}
		}
	}
		public static final DisbursementId disbursementId = Singleton.getInstance(DisbursementId.class);
		public static final Disbursementrate disbursementrate = Singleton.getInstance(Disbursementrate.class);
		public static final CurrencyId currencyId = Singleton.getInstance(CurrencyId.class);
		public static final CurrencyDescription currencyDescription = Singleton.getInstance(CurrencyDescription.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final TypeQuotation typeQuotation = Singleton.getInstance(TypeQuotation.class);
		public static final Quote quote = Singleton.getInstance(Quote.class);
		public static final AmountOp amountOp = Singleton.getInstance(AmountOp.class);
		public static final QuoteTypeOp quoteTypeOp = Singleton.getInstance(QuoteTypeOp.class);
		public static final QuoteOp quoteOp = Singleton.getInstance(QuoteOp.class);
		public static final AmountMn amountMn = Singleton.getInstance(AmountMn.class);
		public static final Account account = Singleton.getInstance(Account.class);
		public static final Beneficiary beneficiary = Singleton.getInstance(Beneficiary.class);
		public static final OfficeId officeId = Singleton.getInstance(OfficeId.class);
		public static final OfficeName officeName = Singleton.getInstance(OfficeName.class);
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);
		public static final ProductCategory productCategory = Singleton.getInstance(ProductCategory.class);
		public static final PreNotification preNotification = Singleton.getInstance(PreNotification.class);
		public static final Observations observations = Singleton.getInstance(Observations.class);

		public static class DisbursementId extends COBISInputValue {
			public DisbursementId() {
				this.init("VA_TEXTINPUTBOXHUQ_857405","No");
			}
		}			

		public static class Disbursementrate extends COBISInputValue {
			public Disbursementrate() {
				this.init("VA_TEXTINPUTBOXOKM_482405","Forma");
			}
		}			

		public static class CurrencyId extends COBISInputValue {
			public CurrencyId() {
				this.init("VA_TEXTINPUTBOXDPF_455405","Mon");
			}
		}			

		public static class CurrencyDescription extends COBISInputValue {
			public CurrencyDescription() {
				this.init("VA_TEXTINPUTBOXLVA_650405","Moneda");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXAKE_256405","Valor");
			}
		}			

		public static class TypeQuotation extends COBISInputValue {
			public TypeQuotation() {
				this.init("VA_TEXTINPUTBOXPIY_824405","TC");
			}
		}			

		public static class Quote extends COBISInputValue {
			public Quote() {
				this.init("VA_TEXTINPUTBOXFBW_549405","Cotiz");
			}
		}			

		public static class AmountOp extends COBISInputValue {
			public AmountOp() {
				this.init("VA_TEXTINPUTBOXNRM_694405","ValorOP");
			}
		}			

		public static class QuoteTypeOp extends COBISInputValue {
			public QuoteTypeOp() {
				this.init("VA_TEXTINPUTBOXGJS_417405","TCOP");
			}
		}			

		public static class QuoteOp extends COBISInputValue {
			public QuoteOp() {
				this.init("VA_TEXTINPUTBOXHKY_687405","CotizOP");
			}
		}			

		public static class AmountMn extends COBISInputValue {
			public AmountMn() {
				this.init("VA_TEXTINPUTBOXOQY_980405","ValorMN");
			}
		}			

		public static class Account extends COBISInputValue {
			public Account() {
				this.init("VA_TEXTINPUTBOXRFX_333405","Referencia");
			}
		}			

		public static class Beneficiary extends COBISInputValue {
			public Beneficiary() {
				this.init("VA_TEXTINPUTBOXPHT_403405","Beneficiario");
			}
		}			

		public static class OfficeId extends COBISInputValue {
			public OfficeId() {
				this.init("VA_TEXTINPUTBOXEZU_598405","CodOficina");
			}
		}			

		public static class OfficeName extends COBISInputValue {
			public OfficeName() {
				this.init("VA_TEXTINPUTBOXUJF_534405","Oficina");
			}
		}			

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_TEXTINPUTBOXIMM_485405","Secuencial");
			}
		}			

		public static class ProductCategory extends COBISInputValue {
			public ProductCategory() {
				this.init("VA_TEXTINPUTBOXXLH_478405","Categoria");
			}
		}			

		public static class PreNotification extends COBISInputValue {
			public PreNotification() {
				this.init("VA_TEXTINPUTBOXAPS_637405","InsACH");
			}
		}			

		public static class Observations extends COBISInputValue {
			public Observations() {
				this.init("VA_TEXTINPUTBOXKEH_204405","ConceptoGeneral");
			}
		}			
	}
	
	public static class GridDetailAmountsToCancel extends COBISGrid {
		public GridDetailAmountsToCancel() {
			this.init("QV_1603_21320", "QV_1603_21320");
		} 

		public static final Description description = Singleton.getInstance(Description.class);
		public static final Value value = Singleton.getInstance(Value.class);

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXBKP_698405","Descripcion");
			}
		}			

		public static class Value extends COBISInputValue {
			public Value() {
				this.init("VA_TEXTINPUTBOXXMW_735405","Valor");
			}
		}			
	}
}

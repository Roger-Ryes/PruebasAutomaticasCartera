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

public class PaymentsFormForm{
	public static final Payment payment = Singleton.getInstance(Payment.class);

	public static final GridPriorities gridPriorities = Singleton.getInstance(GridPriorities.class);
	public static final GridQuotationCurrency gridQuotationCurrency = Singleton.getInstance(GridQuotationCurrency.class);
	public static final GridQuoteDetails gridQuoteDetails = Singleton.getInstance(GridQuoteDetails.class);
	private PaymentsFormForm() {
		throw new IllegalStateException("PaymentsFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class Payment {
	
		private Payment() {
			throw new IllegalStateException("PaymentsFormForm is a utility class");
		}
		
		public static final Date date = Singleton.getInstance(Date.class);
		public static final Currency currency = Singleton.getInstance(Currency.class);
		public static final Quotation quotation = Singleton.getInstance(Quotation.class);
		public static final TypeQuotationTr typeQuotationTr = Singleton.getInstance(TypeQuotationTr.class);
		public static final PaymentsTypes paymentsTypes = Singleton.getInstance(PaymentsTypes.class);
		public static final Customer customer = Singleton.getInstance(Customer.class);
		public static final Reference reference = Singleton.getInstance(Reference.class);
		public static final Value value = Singleton.getInstance(Value.class);
		public static final SimpleLabel923141 simpleLabelVAVASIMPLELABELLL923141 = Singleton.getInstance(SimpleLabel923141.class);
		public static final NumCheck numCheck = Singleton.getInstance(NumCheck.class);
		public static final Bank bank = Singleton.getInstance(Bank.class);
		public static final Retention retention = Singleton.getInstance(Retention.class);
		public static final OnLine onLine = Singleton.getInstance(OnLine.class);
		public static final Notes notes = Singleton.getInstance(Notes.class);
		public static final OperationCurrencyType operationCurrencyType = Singleton.getInstance(OperationCurrencyType.class);
		public static final QuotationValue quotationValue = Singleton.getInstance(QuotationValue.class);
		public static final TypeQuotationOp typeQuotationOp = Singleton.getInstance(TypeQuotationOp.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final FinePrepayment finePrepayment = Singleton.getInstance(FinePrepayment.class);
		public static final AmountPrepayment amountPrepayment = Singleton.getInstance(AmountPrepayment.class);
		public static final AmountPayment amountPayment = Singleton.getInstance(AmountPayment.class);

		public static class Date extends COBISDatePicker {
			public Date() {
				this.init("VA_DATEGYMPIXSZGYL_543141","Fecha");
			}
		}			

		public static class Currency extends COBISDropDownList {
			public Currency() {
				this.init("VA_CURRENCYSPEYFQA_285141","MonedadelPago");
			}
		}			

		public static class Quotation extends COBISInputValue {
			public Quotation() {
				this.init("VA_QUOTATIONEPFTUZ_479141","Cotizacion");
			}
		}			

		public static class TypeQuotationTr extends COBISInputValue {
			public TypeQuotationTr() {
				this.init("VA_TYPEQUOTATIOTNN_114141","TipoCotizacion");
			}
		}			

		public static class PaymentsTypes extends COBISDropDownList {
			public PaymentsTypes() {
				this.init("VA_TEXTINPUTBOXCFY_310141","FormadePago");
			}
		}			

		public static class Customer extends COBISInputTextButton {
			public Customer() {
				this.init("VA_TEXTINPUTBOXHQX_290141","Cobrara");
			}
		}			

		public static class Reference extends COBISInputTextButton {
			public Reference() {
				this.init("VA_REFERENCECGUXXB_239141","Referencia");
			}
		}			

		public static class Value extends COBISInputValue {
			public Value() {
				this.init("VA_VALUEEFNQCTRLMP_628141","Monto");
			}
		}			
		public static class SimpleLabel923141 extends COBISSimpleLabel {
			public SimpleLabel923141() {
				this.init("VA_VASIMPLELABELLL_923141","Conversion23400USDCotizacion134");
			}
		}			

		public static class NumCheck extends COBISInputValue {
			public NumCheck() {
				this.init("VA_NUMCHECKQLTBIOX_669141","Cheque");
			}
		}			

		public static class Bank extends COBISComboBox {
			public Bank() {
				this.init("VA_TEXTINPUTBOXSJQ_831141","Banco");
			}
		}			

		public static class Retention extends COBISInputValue {
			public Retention() {
				this.init("VA_TEXTINPUTBOXPMM_746141","Retencion");
			}
		}			

		public static class OnLine extends COBISCheckBox {
			public OnLine() {
				this.init("VA_CHECKBOXIPQLEBS_550141","Aplicaenlinea");
			}
		}			

		public static class Notes extends COBISInputValue {
			public Notes() {
				this.init("VA_TEXTINPUTBOXIKP_805141","Descripcion");
			}
		}			

		public static class OperationCurrencyType extends COBISDropDownList {
			public OperationCurrencyType() {
				this.init("VA_OPERATIONCURYEE_868141","MonedaOperacion");
			}
		}			

		public static class QuotationValue extends COBISInputValue {
			public QuotationValue() {
				this.init("VA_QUOTATIONVALUEE_804141","Cotizacion");
			}
		}			

		public static class TypeQuotationOp extends COBISInputValue {
			public TypeQuotationOp() {
				this.init("VA_TYPEQUOTATIOPNO_482141","TipoCot");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_AMOUNTGSUZWEZJK_997141","SaldoOperacion");
			}
		}			

		public static class FinePrepayment extends COBISInputValue {
			public FinePrepayment() {
				this.init("VA_FINEPREPAYMETTT_628141","MultaPrecancelacionincluyeiva");
			}
		}			

		public static class AmountPrepayment extends COBISInputValue {
			public AmountPrepayment() {
				this.init("VA_AMOUNTPREPAYTME_876141","SaldoPrecancelacion");
			}
		}			

		public static class AmountPayment extends COBISInputValue {
			public AmountPayment() {
				this.init("VA_AMOUNTPAYMENTTT_215141","ValoraPagar");
			}
		}			
	}
	
	public static class GridPriorities extends COBISGrid {
		public GridPriorities() {
			this.init("QV_3510_91785", "QV_3510_91785");
		} 

		public static final Item item = Singleton.getInstance(Item.class);
		public static final Priority priority = Singleton.getInstance(Priority.class);

		public static class Item extends COBISInputValue {
			public Item() {
				this.init("VA_TEXTINPUTBOXRNV_593141","Item");
			}
		}			

		public static class Priority extends COBISInputValue {
			public Priority() {
				this.init("VA_TEXTINPUTBOXPSA_455141","Priority");
			}
		}			
	}
	
	public static class GridQuotationCurrency extends COBISGrid {
		public GridQuotationCurrency() {
			this.init("QV_1156_30060", "QV_1156_30060");
		} 

		public static final CurrencyType currencyType = Singleton.getInstance(CurrencyType.class);
		public static final Date date = Singleton.getInstance(Date.class);
		public static final Value value = Singleton.getInstance(Value.class);
		public static final Result result = Singleton.getInstance(Result.class);

		public static class CurrencyType extends COBISInputValue {
			public CurrencyType() {
				this.init("VA_TEXTINPUTBOXZKD_152141","CurrencyType");
			}
		}			

		public static class Date extends COBISDatePicker {
			public Date() {
				this.init("VA_DATEFIELDMQBLSD_801141","Date");
			}
		}			

		public static class Value extends COBISInputValue {
			public Value() {
				this.init("VA_TEXTINPUTBOXUVG_286141","Value");
			}
		}			

		public static class Result extends COBISInputValue {
			public Result() {
				this.init("VA_TEXTINPUTBOXBHX_855141","Result");
			}
		}			
	}
	
	public static class GridQuoteDetails extends COBISGrid {
		public GridQuoteDetails() {
			this.init("QV_2540_50573", "QV_2540_50573");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}



		public static final BtnGridCommandIdCEQV201QV254050573362 btnGridCommandIdCEQV201QV254050573362 = Singleton.getInstance(BtnGridCommandIdCEQV201QV254050573362.class);

		public static class BtnGridCommandIdCEQV201QV254050573362 extends COBISButton {
			public BtnGridCommandIdCEQV201QV254050573362() {
				this.init("CEQV_201QV_2540_50573_362","Detalledecuota");
			}
		}
	}
		public static final Description description = Singleton.getInstance(Description.class);
		public static final Expired expired = Singleton.getInstance(Expired.class);
		public static final Active active = Singleton.getInstance(Active.class);
		public static final Inactive inactive = Singleton.getInstance(Inactive.class);
		public static final Total total = Singleton.getInstance(Total.class);

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXEYP_949141","Descripcion");
			}
		}			

		public static class Expired extends COBISInputValue {
			public Expired() {
				this.init("VA_TEXTINPUTBOXVNN_469141","Vencido");
			}
		}			

		public static class Active extends COBISInputValue {
			public Active() {
				this.init("VA_TEXTINPUTBOXJHA_669141","Vigente");
			}
		}			

		public static class Inactive extends COBISInputValue {
			public Inactive() {
				this.init("VA_TEXTINPUTBOXBDE_877141","NoVigente");
			}
		}			

		public static class Total extends COBISInputValue {
			public Total() {
				this.init("VA_TEXTINPUTBOXQVI_445141","Total");
			}
		}			
	}
}

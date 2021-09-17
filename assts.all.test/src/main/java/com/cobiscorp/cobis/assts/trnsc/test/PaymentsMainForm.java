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

public class PaymentsMainForm{
	public static final PaymentGroup paymentGroup = Singleton.getInstance(PaymentGroup.class);
	public static final Loan loan = Singleton.getInstance(Loan.class);
	public static final LoanPaymentGroup loanPaymentGroup = Singleton.getInstance(LoanPaymentGroup.class);
	public static final Payment payment = Singleton.getInstance(Payment.class);

	public static final GridPaymentListGroupClient gridPaymentListGroupClient = Singleton.getInstance(GridPaymentListGroupClient.class);
	public static final GridPriorities gridPriorities = Singleton.getInstance(GridPriorities.class);
	public static final GridQuotationCurrency gridQuotationCurrency = Singleton.getInstance(GridQuotationCurrency.class);
	public static final GridQuoteDetails gridQuoteDetails = Singleton.getInstance(GridQuoteDetails.class);
	private PaymentsMainForm() {
		throw new IllegalStateException("PaymentsMainForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand2IdCMPAYMENTST3A cmdCommand2IdCMPAYMENTST3A = Singleton.getInstance(CmdCommand2IdCMPAYMENTST3A.class);
		
		public static class CmdCommand2IdCMPAYMENTST3A extends COBISButton{
			public CmdCommand2IdCMPAYMENTST3A () {
				this.init("CM_PAYMENTS_T3A", "Guardar");
			}
		}
	
		public static final CmdCommand2IdCMPAYMENTSSS1 cmdCommand2IdCMPAYMENTSSS1 = Singleton.getInstance(CmdCommand2IdCMPAYMENTSSS1.class);
		
		public static class CmdCommand2IdCMPAYMENTSSS1 extends COBISButton{
			public CmdCommand2IdCMPAYMENTSSS1 () {
				this.init("CM_PAYMENTS_SS1", "Sobrantes");
			}
		}
	
		public static final CmdCommand3IdCMPAYMENTST7N cmdCommand3IdCMPAYMENTST7N = Singleton.getInstance(CmdCommand3IdCMPAYMENTST7N.class);
		
		public static class CmdCommand3IdCMPAYMENTST7N extends COBISButton{
			public CmdCommand3IdCMPAYMENTST7N () {
				this.init("CM_PAYMENTS_T7N", "Negociación");
			}
		}
	
		public static final CmdCommand4IdCMPAYMENTSNNS cmdCommand4IdCMPAYMENTSNNS = Singleton.getInstance(CmdCommand4IdCMPAYMENTSNNS.class);
		
		public static class CmdCommand4IdCMPAYMENTSNNS extends COBISButton{
			public CmdCommand4IdCMPAYMENTSNNS () {
				this.init("CM_PAYMENTS_NNS", "Prioridades");
			}
		}
	
		public static final CmdCommand5IdCMTPAYMENTMA5 cmdCommand5IdCMTPAYMENTMA5 = Singleton.getInstance(CmdCommand5IdCMTPAYMENTMA5.class);
		
		public static class CmdCommand5IdCMTPAYMENTMA5 extends COBISButton{
			public CmdCommand5IdCMTPAYMENTMA5 () {
				this.init("CM_TPAYMENT_MA5", "Condonaciones");
			}
		}
	
		public static final CmdCommand6IdCMTPAYMENTY2 cmdCommand6IdCMTPAYMENTY2 = Singleton.getInstance(CmdCommand6IdCMTPAYMENTY2.class);
		
		public static class CmdCommand6IdCMTPAYMENTY2 extends COBISButton{
			public CmdCommand6IdCMTPAYMENTY2 () {
				this.init("CM_TPAYMENT_Y_2", "Guardar");
			}
		}
	
		public static final BtnVAVABUTTONWVITZRQ108612IdVAVABUTTONWVITZRQ108612 btnVAVABUTTONWVITZRQ108612IdVAVABUTTONWVITZRQ108612 = Singleton.getInstance(BtnVAVABUTTONWVITZRQ108612IdVAVABUTTONWVITZRQ108612.class);
		
		public static class BtnVAVABUTTONWVITZRQ108612IdVAVABUTTONWVITZRQ108612 extends COBISButton{
			public BtnVAVABUTTONWVITZRQ108612IdVAVABUTTONWVITZRQ108612 () {
				this.init("VA_VABUTTONWVITZRQ_108612", "Mas Información");
			}
		}
	
		public static final BtnVAVABUTTONORYJAMS468612IdVAVABUTTONORYJAMS468612 btnVAVABUTTONORYJAMS468612IdVAVABUTTONORYJAMS468612 = Singleton.getInstance(BtnVAVABUTTONORYJAMS468612IdVAVABUTTONORYJAMS468612.class);
		
		public static class BtnVAVABUTTONORYJAMS468612IdVAVABUTTONORYJAMS468612 extends COBISButton{
			public BtnVAVABUTTONORYJAMS468612IdVAVABUTTONORYJAMS468612 () {
				this.init("VA_VABUTTONORYJAMS_468612", "Buscar");
			}
		}
	

	}
	

	public static class PaymentGroup {
	
		private PaymentGroup() {
			throw new IllegalStateException("PaymentsMainForm is a utility class");
		}
		
		public static final Date date = Singleton.getInstance(Date.class);
		public static final PaymentsType paymentsType = Singleton.getInstance(PaymentsType.class);
		public static final Reference reference = Singleton.getInstance(Reference.class);
		public static final CurrencyType currencyType = Singleton.getInstance(CurrencyType.class);
		public static final Value value = Singleton.getInstance(Value.class);

		public static class Date extends COBISDatePicker {
			public Date() {
				this.init("VA_6IXQVXOJTRUVSHF_737816","FechaPago");
			}
		}			

		public static class PaymentsType extends COBISComboBox {
			public PaymentsType() {
				this.init("VA_1MVJRDIJAIBEKBY_880816","FormaPago");
			}
		}			

		public static class Reference extends COBISInputValue {
			public Reference() {
				this.init("VA_2PVZZFNDSNWIITT_119816","Referencia");
			}
		}			

		public static class CurrencyType extends COBISComboBox {
			public CurrencyType() {
				this.init("VA_3NOEHOUBCWRSQSM_770816","Moneda");
			}
		}			

		public static class Value extends COBISInputValue {
			public Value() {
				this.init("VA_4NBXAHKTENRTSQZ_638816","Monto");
			}
		}			
	}

	public static class Loan {
	
		private Loan() {
			throw new IllegalStateException("PaymentsMainForm is a utility class");
		}
		
		public static final SimpleLabel143612 simpleLabelVAVASIMPLELABELLL143612 = Singleton.getInstance(SimpleLabel143612.class);
		public static final LoanBankID loanBankID = Singleton.getInstance(LoanBankID.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final BalanceDue balanceDue = Singleton.getInstance(BalanceDue.class);
		public static final Status status = Singleton.getInstance(Status.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static class SimpleLabel143612 extends COBISSimpleLabel {
			public SimpleLabel143612() {
				this.init("VA_VASIMPLELABELLL_143612","Cliente");
			}
		}			

		public static class LoanBankID extends COBISTextLink {
			public LoanBankID() {
				this.init("VA_VASIMPLELABELLL_867612","Prestamo");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_5034UOFCASVGKTK_993612","TipoCredito");
			}
		}			

		public static class BalanceDue extends COBISInputValue {
			public BalanceDue() {
				this.init("VA_2463BHBNLZPKLMU_865612","SaldoExigible");
			}
		}			

		public static class Status extends COBISInputValue {
			public Status() {
				this.init("VA_3853RRTWBIRUGHQ_533612","Estado");
			}
		}			

		public static class Office extends COBISInputValue {
			public Office() {
				this.init("VA_7292SEAHPRAXOKC_868612","Oficina");
			}
		}			
	}

	public static class LoanPaymentGroup {
	
		private LoanPaymentGroup() {
			throw new IllegalStateException("PaymentsMainForm is a utility class");
		}
		
		public static final VencidoGrupal vencidoGrupal = Singleton.getInstance(VencidoGrupal.class);
		public static final VencidoInterciclo vencidoInterciclo = Singleton.getInstance(VencidoInterciclo.class);
		public static final VigenteGrupal vigenteGrupal = Singleton.getInstance(VigenteGrupal.class);
		public static final VigenteInterciclo vigenteInterciclo = Singleton.getInstance(VigenteInterciclo.class);
		public static final TotalExigible totalExigible = Singleton.getInstance(TotalExigible.class);
		public static final TotalPrecancelar totalPrecancelar = Singleton.getInstance(TotalPrecancelar.class);

		public static class VencidoGrupal extends COBISInputValue {
			public VencidoGrupal() {
				this.init("VA_1FUPLRKCFOKJMDX_830816","VencidoGrupal");
			}
		}			

		public static class VencidoInterciclo extends COBISInputValue {
			public VencidoInterciclo() {
				this.init("VA_2VIZAKMOCHSERDM_494816","VencidoInterciclo");
			}
		}			

		public static class VigenteGrupal extends COBISInputValue {
			public VigenteGrupal() {
				this.init("VA_3NNJJQYPQRVUXZJ_555816","VigenteGrupal");
			}
		}			

		public static class VigenteInterciclo extends COBISInputValue {
			public VigenteInterciclo() {
				this.init("VA_6GLPWPZTYAOQYNQ_267816","VigenteInterciclos");
			}
		}			

		public static class TotalExigible extends COBISInputValue {
			public TotalExigible() {
				this.init("VA_7FPUHKLPJGMGQXS_535816","TotalExigible");
			}
		}			

		public static class TotalPrecancelar extends COBISInputValue {
			public TotalPrecancelar() {
				this.init("VA_8RLTRDREBRIGTVW_871816","TotalPreliquidar");
			}
		}			
	}

	public static class Payment {
	
		private Payment() {
			throw new IllegalStateException("PaymentsMainForm is a utility class");
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
	
	public static class GridPaymentListGroupClient extends COBISGrid {
		public GridPaymentListGroupClient() {
			this.init("QV_YE76_DAK33", "QV_YE76_DAK33");
		} 

		public static final Etiqueta etiqueta = Singleton.getInstance(Etiqueta.class);
		public static final Codigo codigo = Singleton.getInstance(Codigo.class);
		public static final Descripcion descripcion = Singleton.getInstance(Descripcion.class);

		public static class Etiqueta extends COBISInputValue {
			public Etiqueta() {
				this.init("VA_TEXTINPUTBOXNNP_119816","Etiqueta");
			}
		}			

		public static class Codigo extends COBISInputValue {
			public Codigo() {
				this.init("VA_TEXTINPUTBOXLGR_859816","Codigo");
			}
		}			

		public static class Descripcion extends COBISInputValue {
			public Descripcion() {
				this.init("VA_TEXTINPUTBOXTET_747816","Descripcion");
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

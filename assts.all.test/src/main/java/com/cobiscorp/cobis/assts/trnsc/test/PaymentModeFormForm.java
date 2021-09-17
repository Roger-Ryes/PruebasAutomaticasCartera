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

public class PaymentModeFormForm{
	public static final DisbursementResult disbursementResult = Singleton.getInstance(DisbursementResult.class);
	public static final PaymentForm paymentForm = Singleton.getInstance(PaymentForm.class);

	private PaymentModeFormForm() {
		throw new IllegalStateException("PaymentModeFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTPAYMENTNS7 cmdCommand1IdCMTPAYMENTNS7 = Singleton.getInstance(CmdCommand1IdCMTPAYMENTNS7.class);
		
		public static class CmdCommand1IdCMTPAYMENTNS7 extends COBISButton{
			public CmdCommand1IdCMTPAYMENTNS7 () {
				this.init("CM_TPAYMENT_NS7", "Aceptar");
			}
		}
	
		public static final CmdCommand2IdCMTPAYMENTTEC cmdCommand2IdCMTPAYMENTTEC = Singleton.getInstance(CmdCommand2IdCMTPAYMENTTEC.class);
		
		public static class CmdCommand2IdCMTPAYMENTTEC extends COBISButton{
			public CmdCommand2IdCMTPAYMENTTEC () {
				this.init("CM_TPAYMENT_TEC", "Cancelar");
			}
		}
	

	}
	

	public static class DisbursementResult {
	
		private DisbursementResult() {
			throw new IllegalStateException("PaymentModeFormForm is a utility class");
		}
		
		public static final SumTotal sumTotal = Singleton.getInstance(SumTotal.class);
		public static final Difference difference = Singleton.getInstance(Difference.class);

		public static class SumTotal extends COBISInputValue {
			public SumTotal() {
				this.init("VA_SUMTOTALIXKGRMZ_574216","TotaldelDesembolso");
			}
		}			

		public static class Difference extends COBISInputValue {
			public Difference() {
				this.init("VA_DIFFERENCELFJSU_881216","DiferenciaaLiquidar");
			}
		}			
	}

	public static class PaymentForm {
	
		private PaymentForm() {
			throw new IllegalStateException("PaymentModeFormForm is a utility class");
		}
		
		public static final CurrencyId currencyId = Singleton.getInstance(CurrencyId.class);
		public static final PayAmount payAmount = Singleton.getInstance(PayAmount.class);
		public static final AmountTr amountTr = Singleton.getInstance(AmountTr.class);
		public static final QuotationTr quotationTr = Singleton.getInstance(QuotationTr.class);
		public static final QuoteTypeTr quoteTypeTr = Singleton.getInstance(QuoteTypeTr.class);
		public static final OfficeId officeId = Singleton.getInstance(OfficeId.class);
		public static final PayFormId payFormId = Singleton.getInstance(PayFormId.class);
		public static final ClientFullName clientFullName = Singleton.getInstance(ClientFullName.class);
		public static final AccountNumber accountNumber = Singleton.getInstance(AccountNumber.class);
		public static final Concept concept = Singleton.getInstance(Concept.class);
		public static final CheckNumber checkNumber = Singleton.getInstance(CheckNumber.class);
		public static final RestrictiveCrossing restrictiveCrossing = Singleton.getInstance(RestrictiveCrossing.class);
		public static final EconomicDestination economicDestination = Singleton.getInstance(EconomicDestination.class);
		public static final SimpleLabel582216 simpleLabelVAVASIMPLELABELLL582216 = Singleton.getInstance(SimpleLabel582216.class);

		public static class CurrencyId extends COBISDropDownList {
			public CurrencyId() {
				this.init("VA_4212YIFTVBCOPPD_140216","MonedaDesembolso");
			}
		}			

		public static class PayAmount extends COBISInputValue {
			public PayAmount() {
				this.init("VA_8983QPJHQZZOSML_321216","Valor");
			}
		}			

		public static class AmountTr extends COBISInputValue {
			public AmountTr() {
				this.init("VA_AMOUNTTROZKVYME_221216","ValorOp");
			}
		}			

		public static class QuotationTr extends COBISInputValue {
			public QuotationTr() {
				this.init("VA_QUOTATIONTRMFKT_807216","Cotizacion");
			}
		}			

		public static class QuoteTypeTr extends COBISInputValue {
			public QuoteTypeTr() {
				this.init("VA_QUOTETYPETRDZXF_817216","TipoCotizacion");
			}
		}			

		public static class OfficeId extends COBISDropDownList {
			public OfficeId() {
				this.init("Spacer2237","Oficina");
			}
		}			

		public static class PayFormId extends COBISDropDownList {
			public PayFormId() {
				this.init("Spacer2675","FormadePago");
			}
		}			

		public static class ClientFullName extends COBISInputTextButton {
			public ClientFullName() {
				this.init("VA_6386FQVBTKCYFWG_461216","Beneficiario");
			}
		}			

		public static class AccountNumber extends COBISInputTextButton {
			public AccountNumber() {
				this.init("VA_2481BBVZTGCBDCR_830216","Referencia");
			}
		}			

		public static class Concept extends COBISInputValue {
			public Concept() {
				this.init("Spacer2254","Concepto");
			}
		}			

		public static class CheckNumber extends COBISInputValue {
			public CheckNumber() {
				this.init("Spacer2495","Cheque");
			}
		}			

		public static class RestrictiveCrossing extends COBISCheckBox {
			public RestrictiveCrossing() {
				this.init("Spacer2547","CruceRestrictivo");
			}
		}			

		public static class EconomicDestination extends COBISComboBox {
			public EconomicDestination() {
				this.init("Spacer1695","DestinoEconomico");
			}
		}			
		public static class SimpleLabel582216 extends COBISSimpleLabel {
			public SimpleLabel582216() {
				this.init("VA_VASIMPLELABELLL_582216","PayQuoteLbl");
			}
		}			
	}
}

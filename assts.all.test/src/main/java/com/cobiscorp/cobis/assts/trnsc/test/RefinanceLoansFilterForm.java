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

public class RefinanceLoansFilterForm{
	public static final RefinanceLoanFilter refinanceLoanFilter = Singleton.getInstance(RefinanceLoanFilter.class);

	public static final GridRefinanceLoans gridRefinanceLoans = Singleton.getInstance(GridRefinanceLoans.class);
	private RefinanceLoansFilterForm() {
		throw new IllegalStateException("RefinanceLoansFilterForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroupLayout1925IdGREFINANTFN452515 lytGroupLayout1925IdGREFINANTFN452515 = Singleton.getInstance(LytGroupLayout1925IdGREFINANTFN452515.class);
		
		public static class LytGroupLayout1925IdGREFINANTFN452515 extends COBISCollapsable {
			public LytGroupLayout1925IdGREFINANTFN452515(){
				this.init("G_REFINANTFN_452515", "Búsqueda");
			}
		}
		
		public static final LytGroupLayout1652IdGREFINANNRN173515 lytGroupLayout1652IdGREFINANNRN173515 = Singleton.getInstance(LytGroupLayout1652IdGREFINANNRN173515.class);
		
		public static class LytGroupLayout1652IdGREFINANNRN173515 extends COBISCollapsable {
			public LytGroupLayout1652IdGREFINANNRN173515(){
				this.init("G_REFINANNRN_173515", "Resumen");
			}
		}
		
		public static final LytGroupLayout2706IdGREFINANANR384515 lytGroupLayout2706IdGREFINANANR384515 = Singleton.getInstance(LytGroupLayout2706IdGREFINANANR384515.class);
		
		public static class LytGroupLayout2706IdGREFINANANR384515 extends COBISCollapsable {
			public LytGroupLayout2706IdGREFINANANR384515(){
				this.init("G_REFINANANR_384515", "Nueva Operación");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTREFINAN9NC cmdCommand1IdCMTREFINAN9NC = Singleton.getInstance(CmdCommand1IdCMTREFINAN9NC.class);
		
		public static class CmdCommand1IdCMTREFINAN9NC extends COBISButton{
			public CmdCommand1IdCMTREFINAN9NC () {
				this.init("CM_TREFINAN_9NC", "Guardar");
			}
		}
	
		public static final CmdCommand3IdCMTREFINAN4A cmdCommand3IdCMTREFINAN4A = Singleton.getInstance(CmdCommand3IdCMTREFINAN4A.class);
		
		public static class CmdCommand3IdCMTREFINAN4A extends COBISButton{
			public CmdCommand3IdCMTREFINAN4A () {
				this.init("CM_TREFINAN_4A_", "Limpiar");
			}
		}
	
		public static final BtnVAVABUTTONWHPHXJL793515IdVAVABUTTONWHPHXJL793515 btnVAVABUTTONWHPHXJL793515IdVAVABUTTONWHPHXJL793515 = Singleton.getInstance(BtnVAVABUTTONWHPHXJL793515IdVAVABUTTONWHPHXJL793515.class);
		
		public static class BtnVAVABUTTONWHPHXJL793515IdVAVABUTTONWHPHXJL793515 extends COBISButton{
			public BtnVAVABUTTONWHPHXJL793515IdVAVABUTTONWHPHXJL793515 () {
				this.init("VA_VABUTTONWHPHXJL_793515", "Buscar");
			}
		}
	

	}
	

	public static class RefinanceLoanFilter {
	
		private RefinanceLoanFilter() {
			throw new IllegalStateException("RefinanceLoansFilterForm is a utility class");
		}
		
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final SimpleLabel382515 simpleLabelVAVASIMPLELABELLL382515 = Singleton.getInstance(SimpleLabel382515.class);
		public static final SimpleLabel337515 simpleLabelVAVASIMPLELABELLL337515 = Singleton.getInstance(SimpleLabel337515.class);
		public static final SimpleLabel584515 simpleLabelVAVASIMPLELABELLL584515 = Singleton.getInstance(SimpleLabel584515.class);
		public static final CapitalBalanceNew capitalBalanceNew = Singleton.getInstance(CapitalBalanceNew.class);
		public static final CapitalBalanceLocal capitalBalanceLocal = Singleton.getInstance(CapitalBalanceLocal.class);
		public static final SimpleLabel975515 simpleLabelVAVASIMPLELABELLL975515 = Singleton.getInstance(SimpleLabel975515.class);
		public static final OtherBalanceNew otherBalanceNew = Singleton.getInstance(OtherBalanceNew.class);
		public static final OtherBalanceLocal otherBalanceLocal = Singleton.getInstance(OtherBalanceLocal.class);
		public static final SimpleLabel604515 simpleLabelVAVASIMPLELABELLL604515 = Singleton.getInstance(SimpleLabel604515.class);
		public static final AditionalBalanceNew aditionalBalanceNew = Singleton.getInstance(AditionalBalanceNew.class);
		public static final AditionalBalanceLocal aditionalBalanceLocal = Singleton.getInstance(AditionalBalanceLocal.class);
		public static final CapitalizeBalance capitalizeBalance = Singleton.getInstance(CapitalizeBalance.class);
		public static final SimpleLabel324515 simpleLabelVAVASIMPLELABELLL324515 = Singleton.getInstance(SimpleLabel324515.class);
		public static final TotalRefinance totalRefinance = Singleton.getInstance(TotalRefinance.class);
		public static final SimpleLabel441515 simpleLabelVAVASIMPLELABELLL441515 = Singleton.getInstance(SimpleLabel441515.class);
		public static final ValuePay valuePay = Singleton.getInstance(ValuePay.class);
		public static final SimpleLabel416515 simpleLabelVAVASIMPLELABELLL416515 = Singleton.getInstance(SimpleLabel416515.class);
		public static final TotalToRenew totalToRenew = Singleton.getInstance(TotalToRenew.class);
		public static final PreventionProgram preventionProgram = Singleton.getInstance(PreventionProgram.class);
		public static final BasicInsurance basicInsurance = Singleton.getInstance(BasicInsurance.class);
		public static final BankOperation bankOperation = Singleton.getInstance(BankOperation.class);
		public static final OperationType operationType = Singleton.getInstance(OperationType.class);
		public static final NewLoanCurrency newLoanCurrency = Singleton.getInstance(NewLoanCurrency.class);
		public static final OverDue overDue = Singleton.getInstance(OverDue.class);
		public static final Periodicity periodicity = Singleton.getInstance(Periodicity.class);
		public static final NewLoanTerm newLoanTerm = Singleton.getInstance(NewLoanTerm.class);
		public static final TypeFee typeFee = Singleton.getInstance(TypeFee.class);
		public static final TermInterest termInterest = Singleton.getInstance(TermInterest.class);
		public static final TermCapital termCapital = Singleton.getInstance(TermCapital.class);
		public static final FixedPayDay fixedPayDay = Singleton.getInstance(FixedPayDay.class);
		public static final PaymentDay paymentDay = Singleton.getInstance(PaymentDay.class);
		public static final TermGraceCap termGraceCap = Singleton.getInstance(TermGraceCap.class);
		public static final TermGraceInt termGraceInt = Singleton.getInstance(TermGraceInt.class);
		public static final TypeGrace typeGrace = Singleton.getInstance(TypeGrace.class);
		public static final TypeRenovation typeRenovation = Singleton.getInstance(TypeRenovation.class);
		public static final PayMethodCurrency payMethodCurrency = Singleton.getInstance(PayMethodCurrency.class);
		public static final AddicionalPayMethod addicionalPayMethod = Singleton.getInstance(AddicionalPayMethod.class);
		public static final AdditionalValue additionalValue = Singleton.getInstance(AdditionalValue.class);
		public static final Account account = Singleton.getInstance(Account.class);

		public static class ClientName extends COBISInputTextButton {
			public ClientName() {
				this.init("VA_CLIENTNAMEBGXWU_198515","Cliente");
			}
		}			
		public static class SimpleLabel382515 extends COBISSimpleLabel {
			public SimpleLabel382515() {
				this.init("VA_VASIMPLELABELLL_382515","MonedaOpNueva");
			}
		}			
		public static class SimpleLabel337515 extends COBISSimpleLabel {
			public SimpleLabel337515() {
				this.init("VA_VASIMPLELABELLL_337515","MonLocal");
			}
		}			
		public static class SimpleLabel584515 extends COBISSimpleLabel {
			public SimpleLabel584515() {
				this.init("VA_VASIMPLELABELLL_584515","SaldoCapital");
			}
		}			

		public static class CapitalBalanceNew extends COBISInputValue {
			public CapitalBalanceNew() {
				this.init("VA_CAPITALBALANNEC_663515","CapitalBalanceNew");
			}
		}			

		public static class CapitalBalanceLocal extends COBISInputValue {
			public CapitalBalanceLocal() {
				this.init("VA_CAPITALBALANLEC_808515","CapitalBalanceLocal");
			}
		}			
		public static class SimpleLabel975515 extends COBISSimpleLabel {
			public SimpleLabel975515() {
				this.init("VA_VASIMPLELABELLL_975515","SaldoOtros");
			}
		}			

		public static class OtherBalanceNew extends COBISInputValue {
			public OtherBalanceNew() {
				this.init("VA_OTHERBALANCENEW_148515","OtherBalanceNew");
			}
		}			

		public static class OtherBalanceLocal extends COBISInputValue {
			public OtherBalanceLocal() {
				this.init("VA_OTHERBALANCELCL_661515","OtherBalanceLocal");
			}
		}			
		public static class SimpleLabel604515 extends COBISSimpleLabel {
			public SimpleLabel604515() {
				this.init("VA_VASIMPLELABELLL_604515","ValorAdicional");
			}
		}			

		public static class AditionalBalanceNew extends COBISInputValue {
			public AditionalBalanceNew() {
				this.init("VA_ADITIONALBALAAA_694515","AditionalBalanceNew");
			}
		}			

		public static class AditionalBalanceLocal extends COBISInputValue {
			public AditionalBalanceLocal() {
				this.init("VA_ADITIONALBALNCC_423515","AditionalBalanceLocal");
			}
		}			

		public static class CapitalizeBalance extends COBISRadioButtonList {
			public CapitalizeBalance() {
				this.init("VA_CAPITALIZEBANNE_580515","CapitalizaSaldosOtros");
			}
		}			
		public static class SimpleLabel324515 extends COBISSimpleLabel {
			public SimpleLabel324515() {
				this.init("VA_VASIMPLELABELLL_324515","TotalOperaciones");
			}
		}			

		public static class TotalRefinance extends COBISInputValue {
			public TotalRefinance() {
				this.init("VA_TOTALREFINANEEC_261515","TotalRefinance");
			}
		}			
		public static class SimpleLabel441515 extends COBISSimpleLabel {
			public SimpleLabel441515() {
				this.init("VA_VASIMPLELABELLL_441515","ValoraPagar");
			}
		}			

		public static class ValuePay extends COBISInputValue {
			public ValuePay() {
				this.init("VA_VALUEPAYWZSKCBS_499515","ValuePay");
			}
		}			
		public static class SimpleLabel416515 extends COBISSimpleLabel {
			public SimpleLabel416515() {
				this.init("VA_VASIMPLELABELLL_416515","TotalaRenovar");
			}
		}			

		public static class TotalToRenew extends COBISInputValue {
			public TotalToRenew() {
				this.init("VA_TOTALTORENEWXJM_469515","TotalToRenew");
			}
		}			

		public static class PreventionProgram extends COBISComboBox {
			public PreventionProgram() {
				this.init("VA_PREVENTIONPRRAM_747515","ProgramadePrevencion");
			}
		}			

		public static class BasicInsurance extends COBISRadioButtonList {
			public BasicInsurance() {
				this.init("VA_BASICINSURANCEC_861515","AplicaSeguroBasico");
			}
		}			

		public static class BankOperation extends COBISInputValue {
			public BankOperation() {
				this.init("VA_BANKOPERATIONNN_476515","OperacionGenerada");
			}
		}			

		public static class OperationType extends COBISDropDownList {
			public OperationType() {
				this.init("VA_OPERATIONTYPEEE_619515","TipoOperacion");
			}
		}			

		public static class NewLoanCurrency extends COBISDropDownList {
			public NewLoanCurrency() {
				this.init("VA_NEWLOANCURRENNN_364515","Moneda");
			}
		}			

		public static class OverDue extends COBISDropDownList {
			public OverDue() {
				this.init("VA_OVERDUEVFBXKALY_348515","NaceVencido");
			}
		}			

		public static class Periodicity extends COBISDropDownList {
			public Periodicity() {
				this.init("VA_PERIODICITYSUIR_653515","TipoPlazo");
			}
		}			

		public static class NewLoanTerm extends COBISInputValue {
			public NewLoanTerm() {
				this.init("VA_NEWLOANTERMUQHR_494515","Plazo");
			}
		}			

		public static class TypeFee extends COBISDropDownList {
			public TypeFee() {
				this.init("VA_TYPEFEENRTBGEUS_485515","TipoCuota");
			}
		}			

		public static class TermInterest extends COBISInputValue {
			public TermInterest() {
				this.init("VA_TERMINTERESTPBJ_596515","PInt");
			}
		}			

		public static class TermCapital extends COBISInputValue {
			public TermCapital() {
				this.init("VA_TERMCAPITALURQB_743515","PCap");
			}
		}			

		public static class FixedPayDay extends COBISCheckBox {
			public FixedPayDay() {
				this.init("VA_FIXEDPAYDAYMGTF_298515","FechadePagoFija");
			}
		}			

		public static class PaymentDay extends COBISDropDownList {
			public PaymentDay() {
				this.init("VA_PAYMENTDAYUXWKU_656515","DiaPago");
			}
		}			

		public static class TermGraceCap extends COBISInputValue {
			public TermGraceCap() {
				this.init("VA_TERMGRACECAPDVU_578515","PerGraciaCap");
			}
		}			

		public static class TermGraceInt extends COBISInputValue {
			public TermGraceInt() {
				this.init("VA_TERMGRACEINTJNV_305515","PerGraciaInt");
			}
		}			

		public static class TypeGrace extends COBISDropDownList {
			public TypeGrace() {
				this.init("VA_TYPEGRACECCQFCY_562515","FormaCobroGracia");
			}
		}			

		public static class TypeRenovation extends COBISDropDownList {
			public TypeRenovation() {
				this.init("VA_TYPERENOVATIONO_499515","TipoRenovacion");
			}
		}			

		public static class PayMethodCurrency extends COBISDropDownList {
			public PayMethodCurrency() {
				this.init("VA_PAYMETHODCURCYE_344515","Moneda");
			}
		}			

		public static class AddicionalPayMethod extends COBISDropDownList {
			public AddicionalPayMethod() {
				this.init("VA_ADDICIONALPAYOH_649515","Formadepago");
			}
		}			

		public static class AdditionalValue extends COBISInputValue {
			public AdditionalValue() {
				this.init("VA_ADDITIONALVAUUU_896515","Valor");
			}
		}			

		public static class Account extends COBISInputTextButton {
			public Account() {
				this.init("VA_ACCOUNTYATVYIRL_740515","CuentadeAhorro");
			}
		}			
	}
	
	public static class GridRefinanceLoans extends COBISGrid {
		public GridRefinanceLoans() {
			this.init("QV_3375_11342", "QV_3375_11342");
		} 

		public static final Selected selected = Singleton.getInstance(Selected.class);
		public static final Loan loan = Singleton.getInstance(Loan.class);
		public static final Line line = Singleton.getInstance(Line.class);
		public static final CurrencyType currencyType = Singleton.getInstance(CurrencyType.class);
		public static final InitialAmount initialAmount = Singleton.getInstance(InitialAmount.class);
		public static final OriginalTerm originalTerm = Singleton.getInstance(OriginalTerm.class);
		public static final CapitalBalance capitalBalance = Singleton.getInstance(CapitalBalance.class);
		public static final InterestBalance interestBalance = Singleton.getInstance(InterestBalance.class);
		public static final DefaultBalance defaultBalance = Singleton.getInstance(DefaultBalance.class);
		public static final OtherConceptsBalance otherConceptsBalance = Singleton.getInstance(OtherConceptsBalance.class);
		public static final ResidualTerm residualTerm = Singleton.getInstance(ResidualTerm.class);
		public static final OverdueFees overdueFees = Singleton.getInstance(OverdueFees.class);
		public static final ProcedureId procedureId = Singleton.getInstance(ProcedureId.class);

		public static class Selected extends COBISCheckBox {
			public Selected() {
				this.init("VA_CHECKBOXKZZRISM_582515","Seleccione");
			}
		}			

		public static class Loan extends COBISInputValue {
			public Loan() {
				this.init("VA_TEXTINPUTBOXMHS_260515","NroPrestamo");
			}
		}			

		public static class Line extends COBISInputValue {
			public Line() {
				this.init("VA_TEXTINPUTBOXSSV_745515","TipoPrestamo");
			}
		}			

		public static class CurrencyType extends COBISDropDownList {
			public CurrencyType() {
				this.init("VA_TEXTINPUTBOXYEW_490515","Moneda");
			}
		}			

		public static class InitialAmount extends COBISInputValue {
			public InitialAmount() {
				this.init("VA_TEXTINPUTBOXFDY_704515","MontoOriginal");
			}
		}			

		public static class OriginalTerm extends COBISInputValue {
			public OriginalTerm() {
				this.init("VA_TEXTINPUTBOXFFP_550515","PlazoOriginal");
			}
		}			

		public static class CapitalBalance extends COBISInputValue {
			public CapitalBalance() {
				this.init("VA_TEXTINPUTBOXROR_675515","SaldoCapital");
			}
		}			

		public static class InterestBalance extends COBISInputValue {
			public InterestBalance() {
				this.init("VA_TEXTINPUTBOXPZA_248515","SaldoInteres");
			}
		}			

		public static class DefaultBalance extends COBISInputValue {
			public DefaultBalance() {
				this.init("VA_TEXTINPUTBOXEQH_169515","SaldoMora");
			}
		}			

		public static class OtherConceptsBalance extends COBISInputValue {
			public OtherConceptsBalance() {
				this.init("VA_TEXTINPUTBOXIKG_248515","SaldoOtrosRubros");
			}
		}			

		public static class ResidualTerm extends COBISInputValue {
			public ResidualTerm() {
				this.init("VA_TEXTINPUTBOXMUB_575515","PlazoResidual");
			}
		}			

		public static class OverdueFees extends COBISInputValue {
			public OverdueFees() {
				this.init("VA_TEXTINPUTBOXIFR_825515","CuotasVencida");
			}
		}			

		public static class ProcedureId extends COBISInputValue {
			public ProcedureId() {
				this.init("VA_TEXTINPUTBOXTFN_867515","ProcedureId");
			}
		}			
	}
}

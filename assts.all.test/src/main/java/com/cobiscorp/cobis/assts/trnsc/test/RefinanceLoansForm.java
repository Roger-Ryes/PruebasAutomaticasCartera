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

public class RefinanceLoansForm{
	public static final RefinanceDetailLoans refinanceDetailLoans = Singleton.getInstance(RefinanceDetailLoans.class);

	public static final GridRefinanceLoansItems gridRefinanceLoansItems = Singleton.getInstance(GridRefinanceLoansItems.class);
	public static final GridRefinanceLoans gridRefinanceLoans = Singleton.getInstance(GridRefinanceLoans.class);
	private RefinanceLoansForm() {
		throw new IllegalStateException("RefinanceLoansForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroup1975IdGREFINANNAA790881 lytGroup1975IdGREFINANNAA790881 = Singleton.getInstance(LytGroup1975IdGREFINANNAA790881.class);
		
		public static class LytGroup1975IdGREFINANNAA790881 extends COBISCollapsable {
			public LytGroup1975IdGREFINANNAA790881(){
				this.init("G_REFINANNAA_790881", "PRÉSTAMOS A RENOVAR");
			}
		}
		
		public static final LytGroup2901IdGREFINANCAE644881 lytGroup2901IdGREFINANCAE644881 = Singleton.getInstance(LytGroup2901IdGREFINANCAE644881.class);
		
		public static class LytGroup2901IdGREFINANCAE644881 extends COBISCollapsable {
			public LytGroup2901IdGREFINANCAE644881(){
				this.init("G_REFINANCAE_644881", "RUBROS PARA CANCELAR PRÉSTAMO ANTERIOR");
			}
		}
		
		public static final LytGroup2215IdGREFINANASL130881 lytGroup2215IdGREFINANASL130881 = Singleton.getInstance(LytGroup2215IdGREFINANASL130881.class);
		
		public static class LytGroup2215IdGREFINANASL130881 extends COBISCollapsable {
			public LytGroup2215IdGREFINANASL130881(){
				this.init("G_REFINANASL_130881", "DATOS DE LA RENOVACIÓN");
			}
		}
		
	}
	
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class RefinanceDetailLoans {
	
		private RefinanceDetailLoans() {
			throw new IllegalStateException("RefinanceLoansForm is a utility class");
		}
		
		public static final SimpleLabel975881 simpleLabelVAVASIMPLELABELLL975881 = Singleton.getInstance(SimpleLabel975881.class);
		public static final LoanAmount loanAmount = Singleton.getInstance(LoanAmount.class);
		public static final SimpleLabel799881 simpleLabelVAVASIMPLELABELLL799881 = Singleton.getInstance(SimpleLabel799881.class);
		public static final AmountToCancel amountToCancel = Singleton.getInstance(AmountToCancel.class);
		public static final SimpleLabel584881 simpleLabelVAVASIMPLELABELLL584881 = Singleton.getInstance(SimpleLabel584881.class);
		public static final DeliverCustomer deliverCustomer = Singleton.getInstance(DeliverCustomer.class);
		public static final Observations observations = Singleton.getInstance(Observations.class);
		public static class SimpleLabel975881 extends COBISSimpleLabel {
			public SimpleLabel975881() {
				this.init("VA_VASIMPLELABELLL_975881","TotaldelaRenovacion");
			}
		}			

		public static class LoanAmount extends COBISInputValue {
			public LoanAmount() {
				this.init("VA_LOANAMOUNTTKXCD_133881","LoanAmount");
			}
		}			
		public static class SimpleLabel799881 extends COBISSimpleLabel {
			public SimpleLabel799881() {
				this.init("VA_VASIMPLELABELLL_799881","TotalPrestamoanterior");
			}
		}			

		public static class AmountToCancel extends COBISInputValue {
			public AmountToCancel() {
				this.init("VA_AMOUNTTOCANCELL_703881","AmountToCancel");
			}
		}			
		public static class SimpleLabel584881 extends COBISSimpleLabel {
			public SimpleLabel584881() {
				this.init("VA_VASIMPLELABELLL_584881","Entregaralcliente");
			}
		}			

		public static class DeliverCustomer extends COBISInputValue {
			public DeliverCustomer() {
				this.init("VA_DELIVERCUSTOEER_870881","DeliverCustomer");
			}
		}			

		public static class Observations extends COBISInputValue {
			public Observations() {
				this.init("VA_OBSERVATIONSLWS_588881","Observaciones");
			}
		}			
	}
	
	public static class GridRefinanceLoansItems extends COBISGrid {
		public GridRefinanceLoansItems() {
			this.init("QV_6687_51127", "QV_6687_51127");
		} 

		public static final Concept concept = Singleton.getInstance(Concept.class);
		public static final ConceptStatus conceptStatus = Singleton.getInstance(ConceptStatus.class);
		public static final PreviowsDuty previowsDuty = Singleton.getInstance(PreviowsDuty.class);
		public static final QuotaStatus quotaStatus = Singleton.getInstance(QuotaStatus.class);

		public static class Concept extends COBISInputValue {
			public Concept() {
				this.init("VA_TEXTINPUTBOXPBU_986881","Concepto");
			}
		}			

		public static class ConceptStatus extends COBISInputValue {
			public ConceptStatus() {
				this.init("VA_TEXTINPUTBOXMRT_873881","EstadoConcepto");
			}
		}			

		public static class PreviowsDuty extends COBISInputValue {
			public PreviowsDuty() {
				this.init("VA_TEXTINPUTBOXYKF_264881","ObligAnterior");
			}
		}			

		public static class QuotaStatus extends COBISInputValue {
			public QuotaStatus() {
				this.init("VA_TEXTINPUTBOXPBQ_251881","EstadoCuota");
			}
		}			
	}
	
	public static class GridRefinanceLoans extends COBISGrid {
		public GridRefinanceLoans() {
			this.init("QV_2890_45043", "QV_2890_45043");
		} 

		public static final Loan loan = Singleton.getInstance(Loan.class);
		public static final Line line = Singleton.getInstance(Line.class);
		public static final InitialAmount initialAmount = Singleton.getInstance(InitialAmount.class);
		public static final TotalToRefinance totalToRefinance = Singleton.getInstance(TotalToRefinance.class);
		public static final TotalBalance totalBalance = Singleton.getInstance(TotalBalance.class);
		public static final CurrencyCode currencyCode = Singleton.getInstance(CurrencyCode.class);
		public static final Quotation quotation = Singleton.getInstance(Quotation.class);

		public static class Loan extends COBISInputValue {
			public Loan() {
				this.init("VA_TEXTINPUTBOXALW_956881","NoOperacion");
			}
		}			

		public static class Line extends COBISInputValue {
			public Line() {
				this.init("VA_TEXTINPUTBOXETM_405881","Linea");
			}
		}			

		public static class InitialAmount extends COBISInputValue {
			public InitialAmount() {
				this.init("VA_TEXTINPUTBOXUBE_349881","MontoOriginal");
			}
		}			

		public static class TotalToRefinance extends COBISInputValue {
			public TotalToRefinance() {
				this.init("VA_TEXTINPUTBOXVQU_400881","TotalRenovar");
			}
		}			

		public static class TotalBalance extends COBISInputValue {
			public TotalBalance() {
				this.init("VA_TEXTINPUTBOXCEP_986881","SaldoTotal");
			}
		}			

		public static class CurrencyCode extends COBISInputValue {
			public CurrencyCode() {
				this.init("VA_TEXTINPUTBOXIGO_683881","Moneda");
			}
		}			

		public static class Quotation extends COBISInputValue {
			public Quotation() {
				this.init("VA_TEXTINPUTBOXLYL_557881","Cotizacion");
			}
		}			
	}
}

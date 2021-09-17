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

public class SimulateMainForm{
	public static final Loan loan = Singleton.getInstance(Loan.class);
	public static final Payment payment = Singleton.getInstance(Payment.class);

	public static final GridQuoteDetails gridQuoteDetails = Singleton.getInstance(GridQuoteDetails.class);
	private SimulateMainForm() {
		throw new IllegalStateException("SimulateMainForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMTASSTSSZC3T cmdCommand1IdCMTASSTSSZC3T = Singleton.getInstance(CmdCommand1IdCMTASSTSSZC3T.class);
		
		public static class CmdCommand1IdCMTASSTSSZC3T extends COBISButton{
			public CmdCommand1IdCMTASSTSSZC3T () {
				this.init("CM_TASSTSSZ_C3T", "Negociación");
			}
		}
	
		public static final CmdCommand2IdCMTASSTSSZ7 cmdCommand2IdCMTASSTSSZ7 = Singleton.getInstance(CmdCommand2IdCMTASSTSSZ7.class);
		
		public static class CmdCommand2IdCMTASSTSSZ7 extends COBISButton{
			public CmdCommand2IdCMTASSTSSZ7 () {
				this.init("CM_TASSTSSZ___7", "Calcular");
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
	

	public static class Loan {
	
		private Loan() {
			throw new IllegalStateException("SimulateMainForm is a utility class");
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

	public static class Payment {
	
		private Payment() {
			throw new IllegalStateException("SimulateMainForm is a utility class");
		}
		
		public static final AmountPrepayment amountPrepayment = Singleton.getInstance(AmountPrepayment.class);
		public static final AmountPayment amountPayment = Singleton.getInstance(AmountPayment.class);
		public static final CurrencyType currencyType = Singleton.getInstance(CurrencyType.class);

		public static class AmountPrepayment extends COBISInputValue {
			public AmountPrepayment() {
				this.init("VA_3114DYOIQOVZVVS_763982","MontodePrecancelacion");
			}
		}			

		public static class AmountPayment extends COBISInputValue {
			public AmountPayment() {
				this.init("VA_9325HMVCFBYGKEC_795982","MontodePago");
			}
		}			

		public static class CurrencyType extends COBISComboBox {
			public CurrencyType() {
				this.init("VA_2369DGOLAKHUZKA_978982","MonedadelaOperacion");
			}
		}			
	}
	
	public static class GridQuoteDetails extends COBISGrid {
		public GridQuoteDetails() {
			this.init("QV_AV40_EIS41", "QV_AV40_EIS41");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}



		public static final BtnGridCommandIdCEQV201QVAV40EIS41373 btnGridCommandIdCEQV201QVAV40EIS41373 = Singleton.getInstance(BtnGridCommandIdCEQV201QVAV40EIS41373.class);

		public static class BtnGridCommandIdCEQV201QVAV40EIS41373 extends COBISButton {
			public BtnGridCommandIdCEQV201QVAV40EIS41373() {
				this.init("CEQV_201QV_AV40_EIS41_373","TabladeAmortizacion");
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
				this.init("VA_TEXTINPUTBOXHZE_443982","Descripcion");
			}
		}			

		public static class Expired extends COBISInputValue {
			public Expired() {
				this.init("VA_TEXTINPUTBOXFRJ_728982","Vencido");
			}
		}			

		public static class Active extends COBISInputValue {
			public Active() {
				this.init("VA_TEXTINPUTBOXFZY_802982","Vigente");
			}
		}			

		public static class Inactive extends COBISInputValue {
			public Inactive() {
				this.init("VA_TEXTINPUTBOXPDW_447982","NoVigente");
			}
		}			

		public static class Total extends COBISInputValue {
			public Total() {
				this.init("VA_TEXTINPUTBOXPRK_338982","Total");
			}
		}			
	}
}

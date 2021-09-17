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

public class ValueDateMainForm{
	public static final Loan loan = Singleton.getInstance(Loan.class);
	public static final ValueDateFilter valueDateFilter = Singleton.getInstance(ValueDateFilter.class);

	public static final GridTransactionLoan gridTransactionLoan = Singleton.getInstance(GridTransactionLoan.class);
	private ValueDateMainForm() {
		throw new IllegalStateException("ValueDateMainForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final CmdCommand1IdCMVALUEDATNNN cmdCommand1IdCMVALUEDATNNN = Singleton.getInstance(CmdCommand1IdCMVALUEDATNNN.class);
		
		public static class CmdCommand1IdCMVALUEDATNNN extends COBISButton{
			public CmdCommand1IdCMVALUEDATNNN () {
				this.init("CM_VALUEDAT_NNN", "Aplicar");
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
	
		public static final BtnConfirmCreation btnConfirmCreation = Singleton.getInstance(BtnConfirmCreation.class);
		
		public static class BtnConfirmCreation extends COBISButton{
			public BtnConfirmCreation () {
				this.init("", "Aceptar","//div[contains(@class,'k-widget k-window')]//button[contains(@class,'btn btn-primary navbar-btn')]");
			}
		}
		
		public static final BtnClose btnClose = Singleton.getInstance(BtnClose.class);
		
		public static class BtnClose extends COBISButton{
			public BtnClose () {
				this.init("", "Aceptar","//button[contains(@class,'close')]");
			}
		}

		public static final ConfirmMsg confirmMsg = Singleton.getInstance(ConfirmMsg.class);
		public static class ConfirmMsg extends COBISInputValue{
			public ConfirmMsg (){
				this.init("","¿Está Seguro de Reversar la Transacción Seleccionada?", 
						"//div[contains(@class,'k-widget k-window')]//div[contains(@class,'cb-flex cb-gutters')]");
			}
		}

	}
	

	public static class Loan {
	
		private Loan() {
			throw new IllegalStateException("ValueDateMainForm is a utility class");
		}
		
		public static final SimpleLabel143612 simpleLabelVAVASIMPLELABELLL143612 = Singleton.getInstance(SimpleLabel143612.class);
		public static final LoanBankID loanBankID = Singleton.getInstance(LoanBankID.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final BalanceDue balanceDue = Singleton.getInstance(BalanceDue.class);
		public static final Status status = Singleton.getInstance(Status.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final LastProcessDate lastProcessDate = Singleton.getInstance(LastProcessDate.class);
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

		public static class LastProcessDate extends COBISDatePicker {
			public LastProcessDate() {
				this.init("VA_LASTPROCESSDEET_724866","Ultproceso");
			}
		}			
	}

	public static class ValueDateFilter {
	
		private ValueDateFilter() {
			throw new IllegalStateException("ValueDateMainForm is a utility class");
		}
		
		public static final ValueDate valueDate = Singleton.getInstance(ValueDate.class);
		public static final Observation observation = Singleton.getInstance(Observation.class);
		public static final ErrorObservation errorObservation = Singleton.getInstance(ErrorObservation.class);

		public static class ValueDate extends COBISDatePicker {
			public ValueDate() {
				this.init("VA_3610ZOUUEMDZQED_313866","FechaValor");
			}
		}			

		public static class Observation extends COBISInputValue {
			public Observation() {
				this.init("VA_OBSERVATIONDKBP_175866","Observacion");
			}
		}			
		
		public static class ErrorObservation extends COBISInputValue {
			public ErrorObservation() {
				this.init("ValueDateFilter_observation-error","ErrorObservacion");
			}
		}
	}
	
	public static class GridTransactionLoan extends COBISGrid {
		public GridTransactionLoan() {
			this.init("QV_1244_89323", "QV_1244_89323");
		} 

		public static final TransactionId transactionId = Singleton.getInstance(TransactionId.class);
		public static final Secuential secuential = Singleton.getInstance(Secuential.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final DateTran dateTran = Singleton.getInstance(DateTran.class);
		public static final DateRef dateRef = Singleton.getInstance(DateRef.class);
		public static final Status status = Singleton.getInstance(Status.class);
		public static final User user = Singleton.getInstance(User.class);

		public static class TransactionId extends COBISInputValue {
			public TransactionId() {
				this.init("VA_TEXTINPUTBOXIIN_213866","Transaccion");
			}
		}			

		public static class Secuential extends COBISInputValue {
			public Secuential() {
				this.init("VA_TEXTINPUTBOXMEP_425866","Secuencial");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_TEXTINPUTBOXQOK_378866","Prestamo");
			}
		}			

		public static class DateTran extends COBISInputValue {
			public DateTran() {
				this.init("VA_TEXTINPUTBOXSNL_252866","FechaTrn");
			}
		}			

		public static class DateRef extends COBISInputValue {
			public DateRef() {
				this.init("VA_TEXTINPUTBOXYSE_969866","FechaRef");
			}
		}			

		public static class Status extends COBISInputValue {
			public Status() {
				this.init("VA_TEXTINPUTBOXZAT_127866","Estado");
			}
		}			

		public static class User extends COBISInputValue {
			public User() {
				this.init("VA_TEXTINPUTBOXARG_897866","Usuario");
			}
		}			
	}
}

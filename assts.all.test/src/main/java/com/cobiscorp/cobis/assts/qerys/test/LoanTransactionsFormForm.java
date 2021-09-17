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

public class LoanTransactionsFormForm{

	public static final GridReversedTransaction gridReversedTransaction = Singleton.getInstance(GridReversedTransaction.class);
	public static final GridActiveTransaction gridActiveTransaction = Singleton.getInstance(GridActiveTransaction.class);
	public static final GridCausation gridCausation = Singleton.getInstance(GridCausation.class);
	private LoanTransactionsFormForm() {
		throw new IllegalStateException("LoanTransactionsFormForm is a utility class");
	}
	public static class Layouts {
		private Layouts() {
			throw new IllegalStateException("Layouts is a utility class");
		}
		public static final LytGroup2420IdGLOANTRATNT710261 lytGroup2420IdGLOANTRATNT710261 = Singleton.getInstance(LytGroup2420IdGLOANTRATNT710261.class);
		
		public static class LytGroup2420IdGLOANTRATNT710261 extends COBISCollapsable {
			public LytGroup2420IdGLOANTRATNT710261(){
				this.init("G_LOANTRATNT_710261", "Transacciones Activas");
			}
		}
		
		public static final LytGroup2836IdGLOANTRAIIT578261 lytGroup2836IdGLOANTRAIIT578261 = Singleton.getInstance(LytGroup2836IdGLOANTRAIIT578261.class);
		
		public static class LytGroup2836IdGLOANTRAIIT578261 extends COBISCollapsable {
			public LytGroup2836IdGLOANTRAIIT578261(){
				this.init("G_LOANTRAIIT_578261", "Transacciones Reversadas");
			}
		}
		
		public static final LytGroup2691IdGLOANTRASNN270261 lytGroup2691IdGLOANTRASNN270261 = Singleton.getInstance(LytGroup2691IdGLOANTRASNN270261.class);
		
		public static class LytGroup2691IdGLOANTRASNN270261 extends COBISCollapsable {
			public LytGroup2691IdGLOANTRASNN270261(){
				this.init("G_LOANTRASNN_270261", "Causaciones");
			}
		}
		
	}
	
	
	public static class GridReversedTransaction extends COBISGrid {
		public GridReversedTransaction() {
			this.init("QV_OB55_ZQG31", "QV_OB55_ZQG31");
		} 

		public static final Transaction transaction = Singleton.getInstance(Transaction.class);
		public static final Secuential secuential = Singleton.getInstance(Secuential.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final DateTransaction dateTransaction = Singleton.getInstance(DateTransaction.class);
		public static final DateReverd dateReverd = Singleton.getInstance(DateReverd.class);
		public static final Stare stare = Singleton.getInstance(Stare.class);
		public static final User user = Singleton.getInstance(User.class);

		public static class Transaction extends COBISInputValue {
			public Transaction() {
				this.init("VA_TEXTINPUTBOXAIY_111261","TRANSACCION");
			}
		}			

		public static class Secuential extends COBISInputValue {
			public Secuential() {
				this.init("VA_TEXTINPUTBOXLVK_757261","SECUENCIAL");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_TEXTINPUTBOXUSP_618261","PRESTAMO");
			}
		}			

		public static class DateTransaction extends COBISInputValue {
			public DateTransaction() {
				this.init("VA_TEXTINPUTBOXSTF_666261","FECHATRN");
			}
		}			

		public static class DateReverd extends COBISInputValue {
			public DateReverd() {
				this.init("VA_TEXTINPUTBOXDDL_288261","FECHAREF");
			}
		}			

		public static class Stare extends COBISInputValue {
			public Stare() {
				this.init("VA_TEXTINPUTBOXOWN_417261","ESTADO");
			}
		}			

		public static class User extends COBISInputValue {
			public User() {
				this.init("VA_TEXTINPUTBOXSLU_243261","USUARIO");
			}
		}			
	}
	
	public static class GridActiveTransaction extends COBISGrid {
		public GridActiveTransaction() {
			this.init("QV_HK73_UEC23", "QV_HK73_UEC23");
		} 

		public static final Transaction transaction = Singleton.getInstance(Transaction.class);
		public static final Secuential secuential = Singleton.getInstance(Secuential.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final DateTransaction dateTransaction = Singleton.getInstance(DateTransaction.class);
		public static final DateReverd dateReverd = Singleton.getInstance(DateReverd.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final User user = Singleton.getInstance(User.class);

		public static class Transaction extends COBISInputValue {
			public Transaction() {
				this.init("VA_TEXTINPUTBOXOQC_136261","TRANSACCION");
			}
		}			

		public static class Secuential extends COBISInputValue {
			public Secuential() {
				this.init("VA_TEXTINPUTBOXCIZ_585261","SECUENCIAL");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_TEXTINPUTBOXZGU_968261","PRESTAMO");
			}
		}			

		public static class DateTransaction extends COBISInputValue {
			public DateTransaction() {
				this.init("VA_TEXTINPUTBOXHVV_957261","FECHATRN");
			}
		}			

		public static class DateReverd extends COBISInputValue {
			public DateReverd() {
				this.init("VA_TEXTINPUTBOXMIY_681261","FECHAREF");
			}
		}			

		public static class State extends COBISInputValue {
			public State() {
				this.init("VA_TEXTINPUTBOXRSE_162261","ESTADO");
			}
		}			

		public static class User extends COBISInputValue {
			public User() {
				this.init("VA_TEXTINPUTBOXTEB_188261","USUARIO");
			}
		}			
	}
	
	public static class GridCausation extends COBISGrid {
		public GridCausation() {
			this.init("QV_IY91_WMD36", "QV_IY91_WMD36");
		} 

		public static final DateTransation dateTransation = Singleton.getInstance(DateTransation.class);
		public static final DateReverd dateReverd = Singleton.getInstance(DateReverd.class);
		public static final Dividend dividend = Singleton.getInstance(Dividend.class);
		public static final Concept concept = Singleton.getInstance(Concept.class);
		public static final Coin coin = Singleton.getInstance(Coin.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final AmountMn amountMn = Singleton.getInstance(AmountMn.class);
		public static final State state = Singleton.getInstance(State.class);
		public static final Price price = Singleton.getInstance(Price.class);

		public static class DateTransation extends COBISInputValue {
			public DateTransation() {
				this.init("VA_TEXTINPUTBOXQMP_236261","FECHATRN");
			}
		}			

		public static class DateReverd extends COBISInputValue {
			public DateReverd() {
				this.init("VA_TEXTINPUTBOXZNB_496261","FECHAREF");
			}
		}			

		public static class Dividend extends COBISInputValue {
			public Dividend() {
				this.init("VA_TEXTINPUTBOXNBV_612261","DIVIDENDO");
			}
		}			

		public static class Concept extends COBISInputValue {
			public Concept() {
				this.init("VA_TEXTINPUTBOXVNW_997261","CONCEPTO");
			}
		}			

		public static class Coin extends COBISInputValue {
			public Coin() {
				this.init("VA_TEXTINPUTBOXSQW_891261","MONEDA");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXOCJ_749261","MONTO");
			}
		}			

		public static class AmountMn extends COBISInputValue {
			public AmountMn() {
				this.init("VA_TEXTINPUTBOXGPN_538261","MONTOMN");
			}
		}			

		public static class State extends COBISInputValue {
			public State() {
				this.init("VA_TEXTINPUTBOXFME_318261","ESTADO");
			}
		}			

		public static class Price extends COBISInputValue {
			public Price() {
				this.init("VA_TEXTINPUTBOXIFY_228261","Cotizacion");
			}
		}			
	}
}

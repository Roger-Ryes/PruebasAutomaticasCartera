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

public class RefinancedLoansFormForm{

	public static final GridRefinanceLoans gridRefinanceLoans = Singleton.getInstance(GridRefinanceLoans.class);
	private RefinancedLoansFormForm() {
		throw new IllegalStateException("RefinancedLoansFormForm is a utility class");
	}
	
	public static class GridRefinanceLoans extends COBISGrid {
		public GridRefinanceLoans() {
			this.init("QV_1949_60600", "QV_1949_60600");
		} 

		public static final TransactionID transactionID = Singleton.getInstance(TransactionID.class);
		public static final Type type = Singleton.getInstance(Type.class);
		public static final Loan loan = Singleton.getInstance(Loan.class);
		public static final InitialAmount initialAmount = Singleton.getInstance(InitialAmount.class);
		public static final TotalToRefinance totalToRefinance = Singleton.getInstance(TotalToRefinance.class);
		public static final Line line = Singleton.getInstance(Line.class);
		public static final OfficialID officialID = Singleton.getInstance(OfficialID.class);

		public static class TransactionID extends COBISInputValue {
			public TransactionID() {
				this.init("VA_TEXTINPUTBOXICW_312587","Tramite");
			}
		}			

		public static class Type extends COBISInputValue {
			public Type() {
				this.init("VA_TEXTINPUTBOXWTS_867587","Tipo");
			}
		}			

		public static class Loan extends COBISInputValue {
			public Loan() {
				this.init("VA_TEXTINPUTBOXLUN_357587","Operacion");
			}
		}			

		public static class InitialAmount extends COBISInputValue {
			public InitialAmount() {
				this.init("VA_TEXTINPUTBOXDPQ_833587","MontoOriginal");
			}
		}			

		public static class TotalToRefinance extends COBISInputValue {
			public TotalToRefinance() {
				this.init("VA_TEXTINPUTBOXFFS_866587","SaldoRenovado");
			}
		}			

		public static class Line extends COBISInputValue {
			public Line() {
				this.init("VA_TEXTINPUTBOXJOJ_919587","TipoCredito");
			}
		}			

		public static class OfficialID extends COBISInputValue {
			public OfficialID() {
				this.init("VA_TEXTINPUTBOXOYD_123587","Funcionario");
			}
		}			
	}
}

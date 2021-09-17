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
package com.cobiscorp.cobis.assts.cmmns.test;
import com.cobiscorp.cobis.utils.base.Singleton;
import com.cobiscorp.cobis.utils.controls.impl.*;

public class StatusListFormForm{
	public static final Loan loan = Singleton.getInstance(Loan.class);

	public static final GridLoanStatusChange gridLoanStatusChange = Singleton.getInstance(GridLoanStatusChange.class);
	private StatusListFormForm() {
		throw new IllegalStateException("StatusListFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}

	}
	

	public static class Loan {
	
		private Loan() {
			throw new IllegalStateException("StatusListFormForm is a utility class");
		}
		
	}
	
	public static class GridLoanStatusChange extends COBISGrid {
		public GridLoanStatusChange() {
			this.init("QV_5541_56326", "QV_5541_56326");
		} 

		public static final NewStatus newStatus = Singleton.getInstance(NewStatus.class);

		public static class NewStatus extends COBISInputValue {
			public NewStatus() {
				this.init("VA_TEXTINPUTBOXQCD_746707","EstadosDisponibles");
			}
		}			
	}
}

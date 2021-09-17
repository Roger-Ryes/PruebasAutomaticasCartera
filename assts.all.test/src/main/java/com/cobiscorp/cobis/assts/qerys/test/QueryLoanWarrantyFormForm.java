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

public class QueryLoanWarrantyFormForm{

	public static final GridLoanWarranty gridLoanWarranty = Singleton.getInstance(GridLoanWarranty.class);
	private QueryLoanWarrantyFormForm() {
		throw new IllegalStateException("QueryLoanWarrantyFormForm is a utility class");
	}
	
	public static class GridLoanWarranty extends COBISGrid {
		public GridLoanWarranty() {
			this.init("QV_1941_28530", "QV_1941_28530");
		} 

		public static final Warranty warranty = Singleton.getInstance(Warranty.class);
		public static final StatusWarranty statusWarranty = Singleton.getInstance(StatusWarranty.class);
		public static final Description description = Singleton.getInstance(Description.class);
		public static final CustomerID customerID = Singleton.getInstance(CustomerID.class);
		public static final Customer customer = Singleton.getInstance(Customer.class);
		public static final CurrentValue currentValue = Singleton.getInstance(CurrentValue.class);
		public static final CurrencyID currencyID = Singleton.getInstance(CurrencyID.class);
		public static final CreatedOn createdOn = Singleton.getInstance(CreatedOn.class);

		public static class Warranty extends COBISInputValue {
			public Warranty() {
				this.init("VA_TEXTINPUTBOXASD_283867","Garantia");
			}
		}			

		public static class StatusWarranty extends COBISInputValue {
			public StatusWarranty() {
				this.init("VA_TEXTINPUTBOXLGJ_305867","EstadoGarantia");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXGCL_579867","Descripcion");
			}
		}			

		public static class CustomerID extends COBISInputValue {
			public CustomerID() {
				this.init("VA_TEXTINPUTBOXYZM_796867","CodigoCliente");
			}
		}			

		public static class Customer extends COBISInputValue {
			public Customer() {
				this.init("VA_TEXTINPUTBOXYSC_521867","NombreCliente");
			}
		}			

		public static class CurrentValue extends COBISInputValue {
			public CurrentValue() {
				this.init("VA_TEXTINPUTBOXIAU_379867","Valoractual");
			}
		}			

		public static class CurrencyID extends COBISInputValue {
			public CurrencyID() {
				this.init("VA_TEXTINPUTBOXVWC_252867","Moneda");
			}
		}			

		public static class CreatedOn extends COBISInputValue {
			public CreatedOn() {
				this.init("VA_TEXTINPUTBOXRQN_217867","FechaIng");
			}
		}			
	}
}

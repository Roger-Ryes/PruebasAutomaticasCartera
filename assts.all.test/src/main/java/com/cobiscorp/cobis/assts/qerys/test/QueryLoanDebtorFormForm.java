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

public class QueryLoanDebtorFormForm{

	public static final GridLoanDebtor gridLoanDebtor = Singleton.getInstance(GridLoanDebtor.class);
	private QueryLoanDebtorFormForm() {
		throw new IllegalStateException("QueryLoanDebtorFormForm is a utility class");
	}
	
	public static class GridLoanDebtor extends COBISGrid {
		public GridLoanDebtor() {
			this.init("QV_6719_92672", "QV_6719_92672");
		} 

		public static final CustomerID customerID = Singleton.getInstance(CustomerID.class);
		public static final IdentityCard identityCard = Singleton.getInstance(IdentityCard.class);
		public static final Role role = Singleton.getInstance(Role.class);
		public static final CustomerName customerName = Singleton.getInstance(CustomerName.class);
		public static final Phone phone = Singleton.getInstance(Phone.class);
		public static final Address address = Singleton.getInstance(Address.class);
		public static final CentralCollection centralCollection = Singleton.getInstance(CentralCollection.class);

		public static class CustomerID extends COBISInputValue {
			public CustomerID() {
				this.init("VA_TEXTINPUTBOXEKG_185252","CodigoCliente");
			}
		}			

		public static class IdentityCard extends COBISInputValue {
			public IdentityCard() {
				this.init("VA_TEXTINPUTBOXRPO_508252","CENIT");
			}
		}			

		public static class Role extends COBISInputValue {
			public Role() {
				this.init("VA_TEXTINPUTBOXOOO_135252","Rol");
			}
		}			

		public static class CustomerName extends COBISInputValue {
			public CustomerName() {
				this.init("VA_TEXTINPUTBOXBZS_504252","Nombre");
			}
		}			

		public static class Phone extends COBISInputValue {
			public Phone() {
				this.init("VA_TEXTINPUTBOXJET_751252","Telefono");
			}
		}			

		public static class Address extends COBISInputValue {
			public Address() {
				this.init("VA_TEXTINPUTBOXHKU_739252","Direccion");
			}
		}			

		public static class CentralCollection extends COBISInputValue {
			public CentralCollection() {
				this.init("VA_TEXTINPUTBOXXKU_150252","CobCentral");
			}
		}			
	}
}

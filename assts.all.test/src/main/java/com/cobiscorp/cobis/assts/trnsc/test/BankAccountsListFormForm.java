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

public class BankAccountsListFormForm{

	public static final GridBankAccount gridBankAccount = Singleton.getInstance(GridBankAccount.class);
	private BankAccountsListFormForm() {
		throw new IllegalStateException("BankAccountsListFormForm is a utility class");
	}
	
	public static class GridBankAccount extends COBISGrid {
		public GridBankAccount() {
			this.init("QV_1987_42894", "QV_1987_42894");
		} 

		public static final Account account = Singleton.getInstance(Account.class);
		public static final CustomerCode customerCode = Singleton.getInstance(CustomerCode.class);
		public static final AccountName accountName = Singleton.getInstance(AccountName.class);

		public static class Account extends COBISInputValue {
			public Account() {
				this.init("VA_TEXTINPUTBOXSGC_732561","Cuenta");
			}
		}			

		public static class CustomerCode extends COBISInputValue {
			public CustomerCode() {
				this.init("VA_TEXTINPUTBOXTWF_198561","Cliente");
			}
		}			

		public static class AccountName extends COBISInputValue {
			public AccountName() {
				this.init("VA_TEXTINPUTBOXGBN_738561","Nombre");
			}
		}			
	}
}

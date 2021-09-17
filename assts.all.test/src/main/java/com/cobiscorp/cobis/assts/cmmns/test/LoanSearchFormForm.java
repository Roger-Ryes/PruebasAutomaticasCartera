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

public class LoanSearchFormForm{
	public static final LoanSearchFilter loanSearchFilter = Singleton.getInstance(LoanSearchFilter.class);

	public static final GridLoan gridLoan = Singleton.getInstance(GridLoan.class);
	private LoanSearchFormForm() {
		throw new IllegalStateException("LoanSearchFormForm is a utility class");
	}
	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons is a utility class");
		}
		public static final BtnVAVABUTTONBCZSHFM208508IdVAVABUTTONBCZSHFM208508 btnVAVABUTTONBCZSHFM208508IdVAVABUTTONBCZSHFM208508 = Singleton.getInstance(BtnVAVABUTTONBCZSHFM208508IdVAVABUTTONBCZSHFM208508.class);
		
		public static class BtnVAVABUTTONBCZSHFM208508IdVAVABUTTONBCZSHFM208508 extends COBISButton{
			public BtnVAVABUTTONBCZSHFM208508IdVAVABUTTONBCZSHFM208508 () {
				this.init("VA_VABUTTONBCZSHFM_208508", "Buscar");
			}
		}
	

	}
	

	public static class LoanSearchFilter {
	
		private LoanSearchFilter() {
			throw new IllegalStateException("LoanSearchFormForm is a utility class");
		}
		
		public static final NumIdentification numIdentification = Singleton.getInstance(NumIdentification.class);
		public static final Operation operation = Singleton.getInstance(Operation.class);
		public static final NumProcedures numProcedures = Singleton.getInstance(NumProcedures.class);
		public static final Office office = Singleton.getInstance(Office.class);
		public static final CodCurrency codCurrency = Singleton.getInstance(CodCurrency.class);
		public static final DisbursementDate disbursementDate = Singleton.getInstance(DisbursementDate.class);
		public static final Status status = Singleton.getInstance(Status.class);
		public static final MigratedOper migratedOper = Singleton.getInstance(MigratedOper.class);
		public static final Type type = Singleton.getInstance(Type.class);
		public static final AvanceSearch avanceSearch = Singleton.getInstance(AvanceSearch.class);
		public static final Group group = Singleton.getInstance(Group.class);

		public static class NumIdentification extends COBISInputTextButton {
			public NumIdentification() {
				this.init("VA_CODCLIENTCIXLEY_866508","CodigoCliente");
			}
		}			

		public static class Operation extends COBISInputValue {
			public Operation() {
				this.init("VA_OPERATIONZDFLWM_772508","NumPrestamo");
			}
		}			

		public static class NumProcedures extends COBISInputValue {
			public NumProcedures() {
				this.init("VA_NUMPROCEDURESSS_195508","NumTramite");
			}
		}			

		public static class Office extends COBISDropDownList {
			public Office() {
				this.init("VA_OFFICEVEGBCEQOG_104508","Oficina");
			}
		}			

		public static class CodCurrency extends COBISDropDownList {
			public CodCurrency() {
				this.init("VA_CODCURRENCYKYKA_122508","Moneda");
			}
		}			

		public static class DisbursementDate extends COBISDatePicker {
			public DisbursementDate() {
				this.init("VA_DISBURSEMENTDTD_602508","FechaDesembolso");
			}
		}			

		public static class Status extends COBISDropDownList {
			public Status() {
				this.init("VA_STATUSRUGGOTSMF_965508","EstadoPrestamo");
			}
		}			

		public static class MigratedOper extends COBISInputValue {
			public MigratedOper() {
				this.init("VA_MIGRATEDOPERFRB_417508","PrestamoMigrado");
			}
		}			

		public static class Type extends COBISDropDownList {
			public Type() {
				this.init("VA_TYPEDCJJSHZRQGI_148508","TipoOperacion");
			}
		}			

		public static class AvanceSearch extends COBISCheckBox {
			public AvanceSearch() {
				this.init("VA_AVANCESEARCHMXA_533508","CriteriosSecundarios");
			}
		}			

		public static class Group extends COBISCheckBox {
			public Group() {
				this.init("VA_8665NTBOQUTYEHZ_620508","Grupal");
			}
		}			
	}
	
	public static class GridLoan extends COBISGrid {
		public GridLoan() {
			this.init("QV_3009_96085", "QV_3009_96085");
		} 

		public static final DesOperationType desOperationType = Singleton.getInstance(DesOperationType.class);
		public static final LoanBankID loanBankID = Singleton.getInstance(LoanBankID.class);
		public static final ClientID clientID = Singleton.getInstance(ClientID.class);
		public static final ClientName clientName = Singleton.getInstance(ClientName.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final Status status = Singleton.getInstance(Status.class);
		public static final ExpirationDate expirationDate = Singleton.getInstance(ExpirationDate.class);
		public static final CodCurrency codCurrency = Singleton.getInstance(CodCurrency.class);
		public static final DisbursementDate disbursementDate = Singleton.getInstance(DisbursementDate.class);
		public static final NumProcedure numProcedure = Singleton.getInstance(NumProcedure.class);
		public static final Group group = Singleton.getInstance(Group.class);
		public static final CategoryGroup categoryGroup = Singleton.getInstance(CategoryGroup.class);
		public static final IsDisbursment isDisbursment = Singleton.getInstance(IsDisbursment.class);
		public static final Category category = Singleton.getInstance(Category.class);
		public static final Tipo tipo = Singleton.getInstance(Tipo.class);

		public static class DesOperationType extends COBISInputValue {
			public DesOperationType() {
				this.init("VA_TEXTINPUTBOXDAN_761508","TipoPrestamo");
			}
		}			

		public static class LoanBankID extends COBISInputValue {
			public LoanBankID() {
				this.init("VA_TEXTINPUTBOXFXZ_333508","NumPrestamo");
			}
		}			

		public static class ClientID extends COBISInputValue {
			public ClientID() {
				this.init("VA_TEXTINPUTBOXEUM_243508","CodCliente");
			}
		}			

		public static class ClientName extends COBISInputValue {
			public ClientName() {
				this.init("VA_TEXTINPUTBOXBPY_504508","NombreCliente");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXWLO_792508","MontoPrestamo");
			}
		}			

		public static class Status extends COBISInputValue {
			public Status() {
				this.init("VA_TEXTINPUTBOXLLX_842508","EstadoPrestamo");
			}
		}			

		public static class ExpirationDate extends COBISDatePicker {
			public ExpirationDate() {
				this.init("VA_DATEFIELDDDLJHB_303508","Fechavencimiento");
			}
		}			

		public static class CodCurrency extends COBISDropDownList {
			public CodCurrency() {
				this.init("VA_TEXTINPUTBOXVFT_322508","Moneda");
			}
		}			

		public static class DisbursementDate extends COBISDatePicker {
			public DisbursementDate() {
				this.init("VA_DATEFIELDLYQLTD_622508","FechaDesembolso");
			}
		}			

		public static class NumProcedure extends COBISInputValue {
			public NumProcedure() {
				this.init("VA_TEXTINPUTBOXXJI_412508","NumTramite");
			}
		}			

		public static class Group extends COBISInputValue {
			public Group() {
				this.init("VA_TEXTINPUTBOXBHQ_121508","Grupo");
			}
		}			

		public static class CategoryGroup extends COBISInputValue {
			public CategoryGroup() {
				this.init("VA_TEXTINPUTBOXGYK_201508","Categoria");
			}
		}			

		public static class IsDisbursment extends COBISInputValue {
			public IsDisbursment() {
				this.init("VA_TEXTINPUTBOXBCW_500508","IsDisbursment");
			}
		}			

		public static class Category extends COBISInputValue {
			public Category() {
				this.init("VA_TEXTINPUTBOXQYB_745508","Category");
			}
		}			

		public static class Tipo extends COBISInputValue {
			public Tipo() {
				this.init("VA_TEXTINPUTBOXOXY_700508","Tipo");
			}
		}			
	}
}

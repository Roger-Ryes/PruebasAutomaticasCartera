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

public class PaymentQueryFormForm{

	public static final GridPayment gridPayment = Singleton.getInstance(GridPayment.class);
	private PaymentQueryFormForm() {
		throw new IllegalStateException("PaymentQueryFormForm is a utility class");
	}
	
	public static class GridPayment extends COBISGrid {
		public GridPayment() {
			this.init("QV_5030_22532", "QV_5030_22532");
		} 

		public static final Status status = Singleton.getInstance(Status.class);
		public static final Sequential sequential = Singleton.getInstance(Sequential.class);
		public static final SequentialPay sequentialPay = Singleton.getInstance(SequentialPay.class);
		public static final Date date = Singleton.getInstance(Date.class);
		public static final DatePay datePay = Singleton.getInstance(DatePay.class);
		public static final PaymentType paymentType = Singleton.getInstance(PaymentType.class);
		public static final Amount amount = Singleton.getInstance(Amount.class);
		public static final CurrencyType currencyType = Singleton.getInstance(CurrencyType.class);
		public static final User user = Singleton.getInstance(User.class);
		public static final EntireFee entireFee = Singleton.getInstance(EntireFee.class);
		public static final Advance advance = Singleton.getInstance(Advance.class);
		public static final ReductionType reductionType = Singleton.getInstance(ReductionType.class);
		public static final CollectionType collectionType = Singleton.getInstance(CollectionType.class);
		public static final Category category = Singleton.getInstance(Category.class);
		public static final ReferencedAccount referencedAccount = Singleton.getInstance(ReferencedAccount.class);
		public static final Note note = Singleton.getInstance(Note.class);
		public static final Regional regional = Singleton.getInstance(Regional.class);
		public static final Retention retention = Singleton.getInstance(Retention.class);
		public static final QuerySequential querySequential = Singleton.getInstance(QuerySequential.class);

		public static class Status extends COBISInputValue {
			public Status() {
				this.init("VA_TEXTINPUTBOXUWP_909154","Estado");
			}
		}			

		public static class Sequential extends COBISInputValue {
			public Sequential() {
				this.init("VA_TEXTINPUTBOXMUO_385154","SecIng");
			}
		}			

		public static class SequentialPay extends COBISInputValue {
			public SequentialPay() {
				this.init("VA_TEXTINPUTBOXBSJ_689154","SecPag");
			}
		}			

		public static class Date extends COBISDatePicker {
			public Date() {
				this.init("VA_DATEFIELDPDCJAA_495154","FechaIng");
			}
		}			

		public static class DatePay extends COBISDatePicker {
			public DatePay() {
				this.init("VA_DATEFIELDEMXTST_413154","FechaPag");
			}
		}			

		public static class PaymentType extends COBISInputValue {
			public PaymentType() {
				this.init("VA_TEXTINPUTBOXXSF_766154","FormadePago");
			}
		}			

		public static class Amount extends COBISInputValue {
			public Amount() {
				this.init("VA_TEXTINPUTBOXZVE_754154","Monto");
			}
		}			

		public static class CurrencyType extends COBISInputValue {
			public CurrencyType() {
				this.init("VA_TEXTINPUTBOXDLC_207154","Moneda");
			}
		}			

		public static class User extends COBISInputValue {
			public User() {
				this.init("VA_TEXTINPUTBOXBYZ_445154","Usuario");
			}
		}			

		public static class EntireFee extends COBISInputValue {
			public EntireFee() {
				this.init("VA_TEXTINPUTBOXPKV_144154","CuotaCompleta");
			}
		}			

		public static class Advance extends COBISInputValue {
			public Advance() {
				this.init("VA_TEXTINPUTBOXRRC_423154","Anticipos");
			}
		}			

		public static class ReductionType extends COBISInputValue {
			public ReductionType() {
				this.init("VA_TEXTINPUTBOXHER_720154","TipoReduccion");
			}
		}			

		public static class CollectionType extends COBISInputValue {
			public CollectionType() {
				this.init("VA_TEXTINPUTBOXMFE_161154","TipoCobro");
			}
		}			

		public static class Category extends COBISInputValue {
			public Category() {
				this.init("VA_TEXTINPUTBOXQCM_915154","Clase");
			}
		}			

		public static class ReferencedAccount extends COBISInputValue {
			public ReferencedAccount() {
				this.init("VA_TEXTINPUTBOXKJZ_326154","CuentaReferencia");
			}
		}			

		public static class Note extends COBISInputValue {
			public Note() {
				this.init("VA_TEXTINPUTBOXGMT_221154","Comentario");
			}
		}			

		public static class Regional extends COBISInputValue {
			public Regional() {
				this.init("VA_TEXTINPUTBOXZNQ_252154","Regional");
			}
		}			

		public static class Retention extends COBISInputValue {
			public Retention() {
				this.init("VA_TEXTINPUTBOXZQK_755154","Retencion");
			}
		}			

		public static class QuerySequential extends COBISInputValue {
			public QuerySequential() {
				this.init("VA_TEXTINPUTBOXEXW_393154","SecConsulta");
			}
		}			
	}
}

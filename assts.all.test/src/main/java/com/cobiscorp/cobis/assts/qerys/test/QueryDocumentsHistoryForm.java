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

public class QueryDocumentsHistoryForm{

	public static final GridQueryDocumentHistory gridQueryDocumentHistory = Singleton.getInstance(GridQueryDocumentHistory.class);
	private QueryDocumentsHistoryForm() {
		throw new IllegalStateException("QueryDocumentsHistoryForm is a utility class");
	}
	
	public static class GridQueryDocumentHistory extends COBISGrid {
		public GridQueryDocumentHistory() {
			this.init("QV_9834_40050", "QV_9834_40050");
		} 

	public static class Buttons {
		private Buttons() {
			throw new IllegalStateException("Buttons Grid is a utility class");
		}


		public static final BtnVAGRIDROWCOMMMDNA321376IdVAGRIDROWCOMMMDNA321376 btnVAGRIDROWCOMMMDNA321376IdVAGRIDROWCOMMMDNA321376 = Singleton.getInstance(BtnVAGRIDROWCOMMMDNA321376IdVAGRIDROWCOMMMDNA321376.class);

		public static class BtnVAGRIDROWCOMMMDNA321376IdVAGRIDROWCOMMMDNA321376 extends COBISButton {
			public BtnVAGRIDROWCOMMMDNA321376IdVAGRIDROWCOMMMDNA321376() {
				this.init("VA_GRIDROWCOMMMDNA_321376","Button321376");
			}
		}

	}
		public static final Description description = Singleton.getInstance(Description.class);
		public static final CustomerId customerId = Singleton.getInstance(CustomerId.class);
		public static final ProcessInstance processInstance = Singleton.getInstance(ProcessInstance.class);
		public static final File file = Singleton.getInstance(File.class);
		public static final Uploaded uploaded = Singleton.getInstance(Uploaded.class);
		public static final Extension extension = Singleton.getInstance(Extension.class);
		public static final DocumentId documentId = Singleton.getInstance(DocumentId.class);
		public static final DateVersion dateVersion = Singleton.getInstance(DateVersion.class);
		public static final Version version = Singleton.getInstance(Version.class);
		public static final GroupId groupId = Singleton.getInstance(GroupId.class);

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXUCJ_187376","Description");
			}
		}			

		public static class CustomerId extends COBISInputValue {
			public CustomerId() {
				this.init("VA_TEXTINPUTBOXISB_944376","CustomerId");
			}
		}			

		public static class ProcessInstance extends COBISInputValue {
			public ProcessInstance() {
				this.init("VA_TEXTINPUTBOXBDA_275376","ProcessInstance");
			}
		}			

		public static class File extends COBISInputValue {
			public File() {
				this.init("VA_TEXTINPUTBOXICT_522376","File");
			}
		}			

		public static class Uploaded extends COBISInputValue {
			public Uploaded() {
				this.init("VA_TEXTINPUTBOXTMH_728376","Uploaded");
			}
		}			

		public static class Extension extends COBISInputValue {
			public Extension() {
				this.init("VA_TEXTINPUTBOXAHA_602376","Extension");
			}
		}			

		public static class DocumentId extends COBISInputValue {
			public DocumentId() {
				this.init("VA_TEXTINPUTBOXYHD_526376","DocumentId");
			}
		}			

		public static class DateVersion extends COBISDatePicker {
			public DateVersion() {
				this.init("VA_DATEFIELDBTAXCR_437376","Fecha");
			}
		}			

		public static class Version extends COBISInputValue {
			public Version() {
				this.init("VA_TEXTINPUTBOXZZB_709376","Version");
			}
		}			

		public static class GroupId extends COBISInputValue {
			public GroupId() {
				this.init("VA_TEXTINPUTBOXMTC_398376","GroupId");
			}
		}			
	}
}

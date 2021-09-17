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

public class CondonableConceptsListFormForm{

	public static final GridCondonableConcepts gridCondonableConcepts = Singleton.getInstance(GridCondonableConcepts.class);
	private CondonableConceptsListFormForm() {
		throw new IllegalStateException("CondonableConceptsListFormForm is a utility class");
	}
	
	public static class GridCondonableConcepts extends COBISGrid {
		public GridCondonableConcepts() {
			this.init("QV_2096_93069", "QV_2096_93069");
		} 

		public static final Concept concept = Singleton.getInstance(Concept.class);
		public static final Description description = Singleton.getInstance(Description.class);

		public static class Concept extends COBISInputValue {
			public Concept() {
				this.init("VA_TEXTINPUTBOXNQQ_137726","Rubro");
			}
		}			

		public static class Description extends COBISInputValue {
			public Description() {
				this.init("VA_TEXTINPUTBOXQEJ_639726","Descripcion");
			}
		}			
	}
}

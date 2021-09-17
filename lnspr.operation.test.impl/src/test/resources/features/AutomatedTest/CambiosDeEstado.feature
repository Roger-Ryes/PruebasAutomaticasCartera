#language : es
#Author : esteban.vallejo@clearminds-it.com
Característica: Verificar la correcta creacion de un prestamo para una persona natural y persona juridica, moneda base, con tipo de pago mensual

	COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de cartera 
	QUIERO  aplicar un cambio de estado para el préstamo no vigente de una persona natural 
	PARA  evidenciar  la aplicación exitosa del estado anulado de un  préstamo de una persona natural
	
	Antecedentes: 
    Dado que usuario realiza login en el sistema cobis
    Dado que navega desde "Operaciones>>Cartera" hacia "Datos del Préstamo"
    
    #QA-CAR-S452280 - Esc1 - Cambiar el estado de un prestamo Individual estado No Vigente para persona natural
    @CambioEstadoIndividualNoVigenteNatural
    Esquema del escenario: Cambiar el estado de un prestamo Individual estado No Vigente para persona natural
    	Cuando realiza la busqueda por <BuscarPor> o con numero <numeroDeOperacion>
    	Y selecciona de la grilla una operacion en estado no vigente
    	Y selecciona del menu de acciones la opcion "Cambio de Estado"
    	Y selecciona Nuevo Estado <estado>
    	Y Presiona el boton "Guardar"
    Entonces se valida que ejecute la accion y muestre mensaje "La transacción se realizó exitosamente"

    	Ejemplos:
    		| BuscarPor       |numeroDeOperacion	|estado			|
      | 'Num. Préstamo' | '0001000375'      | 'ANULADO' |
    
    #QA-CAR-S452280 - Esc2 - Cambiar el estado de un prestamo Individual estado JUDICIAL para persona natural
    @CambioEstadoIndividualJudicialNaturalCastigado
    Esquema del escenario: Cambiar el estado de un prestamo Individual estado JUDICIAL para persona natural
    	Cuando realiza la busqueda por <BuscarPor> o con numero <numeroDeOperacion>
    	Y selecciona de la grilla una operacion en estado no vigente
    	Y selecciona del menu de acciones la opcion "Cambio de Estado"
    	Y selecciona Nuevo Estado <estado>
    	Y Presiona el boton "Guardar"
    	Entonces el sistema despliega el mensaje de alerta "La transacción se realizó exitosamente", y en Datos del Prestamo se valida nuevo <estado>
    	
    		Ejemplos:
    		| BuscarPor       |numeroDeOperacion	|estado				|
      #QA-CAR-S452280 - Esc2 - Cambiar el estado de un prestamo Individual estado JUDICIAL para persona natural
      | 'Num. Préstamo' | '0001000066'      | 'CASTIGADO' |
    #QA-CAR-S452280 - Esc3 - Cambiar el estado de un prestamo Individual estado JUDICIAL para persona natural
      | 'Num. Préstamo' | '0001000072'      | 'SUSPENSO'  |
    #QA-CAR-S452280 - Esc4 - Cambiar el estado de un prestamo Individual estado SUSPENSO para persona natural
      | 'Num. Préstamo' | '0001000064'      | 'JUDICIAL'  |
    #QA-CAR-S452280 - Esc5 - Cambiar el estado de un prestamo Individual estado SUSPENSO para persona natural
      | 'Num. Préstamo' | '0001000349'      | 'CASTIGADO' |
    
    #QA-CAR-S452454 - Esc1 - Cambiar el estado de un prestamo Individual estado No Vigente para persona juridica
    @CambioEstadoIndividualNoVigenteJuridicaAnulado
    Esquema del escenario: Cambiar el estado de un préstamo Individual estado No Vigente para persona jurídica
    	Cuando realiza la busqueda por <BuscarPor> o con numero <numeroDeOperacion>
    	Y selecciona de la grilla una operacion en estado no vigente
    	Y selecciona del menu de acciones la opcion "Cambio de Estado"
    	Y selecciona Nuevo Estado <estado>
    	Y Presiona el boton "Guardar"
    Entonces se valida que ejecute la accion y muestre mensaje "La transacción se realizó exitosamente"
    	
    	Ejemplos:
    		| BuscarPor       |numeroDeOperacion	|estado				|
      | 'Num. Préstamo' | '0001000376'      | 'ANULADO' |
    		
		#QA-CAR-S452454 - Esc2 - Cambiar el estado de un prestamo Individual estado JUDICIAL para persona juridica
		@CambioEstadoIndividualJudicialJuridicaCastigado
		Esquema del escenario: Cambiar el estado de un préstamo Individual estado JUDICIAL para persona jurídica
			Cuando realiza la busqueda por <BuscarPor> o con numero <numeroDeOperacion>
    	Y selecciona de la grilla una operacion en estado no vigente
    	Y selecciona del menu de acciones la opcion "Cambio de Estado"
    	Y selecciona Nuevo Estado <estado>
    	Y Presiona el boton "Guardar"
    	Entonces el sistema despliega el mensaje de alerta "La transacción se realizó exitosamente", y en Datos del Prestamo se valida nuevo <estado>
    	
    	Ejemplos:
    		| BuscarPor       |numeroDeOperacion	|estado				|
      #QA-CAR-S452454 - Esc2 - Cambiar el estado de un prestamo Individual estado JUDICIAL para persona juridica
      | 'Num. Préstamo' | '0001000124'      | 'CASTIGADO' |
		#QA-CAR-S452454 - Esc3 - Cambiar el estado de un prestamo Individual estado JUDICIAL para persona juridica
      | 'Num. Préstamo' | '0001000126'      | 'SUSPENSO'  |
		#QA-CAR-S452454 - Esc4 - Cambiar el estado de un prestamo Individual estado SUSPENSO para persona juridica
      | 'Num. Préstamo' | '0001000130'      | 'JUDICIAL'  |
		#QA-CAR-S452454 - Esc5 - Cambiar el estado de un prestamo Individual estado SUSPENSO para persona juridica
      | 'Num. Préstamo' | '0001000199'      | 'CASTIGADO' |

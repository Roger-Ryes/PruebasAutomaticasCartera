#language : es
#Author : esteban.vallejo@clearminds-it.com
Característica: Verificar la correcta creacion de un prestamo para una persona natural y persona juridica, moneda base, con tipo de pago mensual
  
  COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de Cartera
  QUIERO crear un Prestamos para una persona natural
  PARA   evidenciar la creacion de un prestamo con una tabla de amortizacion con un plazo alto

  Antecedentes: 
    Dado que usuario realiza login en el sistema cobis
    Dado que navega desde "Operaciones>>Cartera" hacia "Datos del Préstamo"

  #QA-CAR-S506223 - Esc1 - Reverso de un desembolso sin marcar registro a reversar
  @ReversoDesembolsoSinMarcarRegistro
  Esquema del escenario: Reverso de un desembolso sin marcar registro a reversar
    Cuando se busca por Prestamo <BuscarPor> con <numeroDeOperacion>
    Y se presiona el boton de Accion opcion "Reversos Transacciones"
    Y llenamos campo Observacion <observacion>
    Y presionamos el boton "Aplicar"
    Entonces se valida que muestre mensaje "Seleccione una Transacción"

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | observacion |
      | 'Num. Préstamo' | '0001000346'      | 'RF'        |

  #QA-CAR-S506223 - Esc2 - Reverso de un desembolso seleccionando registro
  @ReversoDesembolsoSeleccionandoRegistro
  Esquema del escenario: Reverso de un desembolso seleccionando registro
    Cuando se busca por Prestamo <BuscarPor> con <numeroDeOperacion>
    Y se presiona el boton de Accion opcion "Reversos Transacciones"
    Y se selecciona el registro a reversar llenamos campo Observacion <observacion>
    Y presionamos el boton "Aplicar" y validamos que muestre mensaje "¿Está Seguro de Reversar la Transacción Seleccionada?" se presiona opcion "Aceptar"
    Entonces se valida que ejecute la accion y muestre mensaje "La transacción se realizó exitosamente"

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | observacion   |
      | 'Num. Préstamo' | '0001000346'      | 'prueba esc2' |

  # QA-CAR-S506215 - Esc1 - Verificar reverso de un abono
  @ReversoUltimoAbono
  Esquema del escenario: reverso de ultimo abono
    Cuando se busca por Prestamo <BuscarPor> con <numeroDeOperacion>
    Y se presiona el boton de Accion opcion "Reversos Transacciones"
    Y selecciona el ultimo abono, se llena el campo <observacion>
    Y presionamos el boton "Aplicar", luego presionar "Aceptar"
    Y se valida que muestre mensaje "La transacción se realizó exitosamente" y cerrar ventana
    Entonces se valida que la transaccion se muestre "RV" en la pestaña "Abonos", luego en la Pestaña "Transacciones", Transacciones Reversadas se valida el registro

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | observacion |
      | 'Num. Préstamo' | '0001000351'      | 'PR'        |

  # QA-CAR-S506215 - Esc2 - Reverso de abono intermedio
  @ReversoAbonoIntermedio
  Esquema del escenario: Reverso de abono intermedio
    Cuando se busca por Prestamo <BuscarPor> con <numeroDeOperacion>
    Y se presiona el boton de Accion opcion "Reversos Transacciones"
    Y selecciona el abono intermedio, se llena el campo <observacion>
    Y presionamos el boton "Aplicar", luego presionar "Aceptar"
    Y se valida que muestre mensaje "La transacción se realizó exitosamente" y cerrar ventana
    Entonces se valida que la transaccion se muestre "RV" en la pestaña "Abonos", luego en la Pestaña "Transacciones", Transacciones Reversadas se valida el registro

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | observacion |
      | 'Num. Préstamo' | '0001000351'      | 'ESCENARIO 2' |

  # QA-CAR-S515129 - Reverso de abono: Validar mandatoriedad de los campos
  @ReversoAbonoValidarMandatoriedad
  Esquema del escenario: Validar mandatoriedad de los campos
    Cuando se busca por Prestamo <BuscarPor> con <numeroDeOperacion>
    Y se presiona el boton de Accion opcion "Reversos Transacciones"
    Y se selecciona el registro a reversar llenamos campo Observacion <observacion>
    Y presionamos el boton "Aplicar"
    Entonces se valida el mensaje en el campo observacion "La observación es obligatoria"

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | observacion |
      | 'Num. Préstamo' | '0001000355'      | ''          |
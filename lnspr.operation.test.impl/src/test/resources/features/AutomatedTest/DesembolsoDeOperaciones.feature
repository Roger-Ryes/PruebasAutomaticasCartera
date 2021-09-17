#language : es
#Author : roger.reyes@clearminds-it.com
Característica: Desembolso de un Prestamo
  
  COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de cartera 
  QUIERO crear un desembolso para un ente natural 
  PARA  evidenciar el desembolso exitoso del préstamo de un ente natural

  Antecedentes: 
    Dado que usuario realiza login en el sistema cobis
    Dado que navega desde "Operaciones>>Cartera" hacia "Datos del Préstamo"

  # QA-CAR-S448070-Desembolso de un Préstamo para una Persona Natural
  @DesembolsoDePrestamoNatural
  Esquema del escenario: Desembolso de un prestamo para una Persona Natural
    Cuando realiza la busqueda por <BuscarPor> con el <numeroDeOperacion>
    Y selecciona del menu de acciones la opcion "Desembolso de Préstamo"
    Y precionar "crear" y llenar la informacion <MonedaDeDesembolso>, <Valor%>, <oficina>, <FormaDePago>, <Referencia> y presionar "Aceptar"
    Y se presenta el mensaje "La transacción se realizó exitosamente" y se presiona "Enviar"
    Entonces se despliega los mensajes de alerta <MensajeAlerta>

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | MonedaDeDesembolso | Valor% | oficina | FormaDePago                     | Referencia | MensajeAlerta                               |
      # Esc1 - Desembolso préstamo Crédito Individual persona natural con moneda en dolares y forma de pago
      | "Num. Préstamo" | '0001000024'      | "DOLAR"            | ""     | ""      | "EFECTIVO MONEDA NACIONAL (POR" | "123"      | 'La transacción se realizó exitosamente'    |
      # Esc2 - Desembolso préstamo Crédito Individual persona natural con moneda en dolares y forma de pago BANCO BANBIF
      | "Num. Préstamo" | '0001000030'      | "DOLAR"            | ""     | ""      | "BANCO BANBIF"                  | "123"      | 'La transacción se realizó exitosamente'    |
      # Esc3 - Desembolso préstamo Crédito Individual persona natural con moneda en dolares, monto Valor de desembolso menor
      | "Num. Préstamo" | '0002000019'      | "DOLAR"            | "90"   | ""      | "BANCO BANBIF"                  | "123"      | "La Diferencia del Préstamo Debe ser Cero." |

  # QA-CAR-S448070 - Esc4 - Desembolso préstamo Crédito Individual persona natural con moneda en dolares, monto Valor igual a Total a Liquidar
  @DesembolsoDePrestamoTotalLiquidarNatural
  Esquema del escenario: Desembolso prestamo Credito Individual persona natural con moneda en dolares, monto Valor igual a Total a Liquidar
    Cuando realiza la busqueda por <BuscarPor> con el <numeroDeOperacion>
    Y selecciona del menu de acciones la opcion "Desembolso de Préstamo"
    Y diligencia el formulario de Desembolso de Prestamo, seleccionar el registro ingresado y "Eliminar", presenta mensaje "¿Está seguro que desea borrar la fila seleccionada?" se presiona "Aceptar"
    Y precionar "crear" y llenar la informacion <MonedaDeDesembolso>, <Valor>, <oficina>, <FormaDePago>, <Referencia> y presionar "Aceptar"
    Y se presenta el mensaje "La transacción se realizó exitosamente" y se presiona "Enviar"
    Entonces se despliega los mensajes de alerta <MensajeAlerta>

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | MonedaDeDesembolso | Valor | oficina | FormaDePago    | Referencia | MensajeAlerta                            |
      | "Num. Préstamo" | '0002000019'      | "DOLAR"            | ""    | ""      | "BANCO BANBIF" | "123"      | 'La transacción se realizó exitosamente' |

  # QA-CAR-S450933-Desembolso de un Préstamo para una Persona Jurídica
  @DesembolsoDePrestamoJuridico
  Esquema del escenario: Desembolso de un prestamo para una Persona Juridica
    Cuando realiza la busqueda por <BuscarPor> con el <numeroDeOperacion>
    Y selecciona del menu de acciones la opcion "Desembolso de Préstamo"
    Y precionar "crear" y llenar la informacion <MonedaDeDesembolso>, <Valor%>, <oficina>, <FormaDePago>, <Referencia> y presionar "Aceptar"
    Y se presenta el mensaje "La transacción se realizó exitosamente" y se presiona "Enviar"
    Entonces se despliega los mensajes de alerta <MensajeAlerta>

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | MonedaDeDesembolso | Valor% | oficina | FormaDePago                     | Referencia | MensajeAlerta                               |
      # Esc1 - Desembolso préstamo Crédito Individual persona jurídica con moneda en dolares y forma de pago
      | "Num. Préstamo" | '0001000357'      | "DOLAR"            | ""     | ""      | "EFECTIVO MONEDA NACIONAL (POR" | "123"      | 'La transacción se realizó exitosamente'    |
      # Esc2 - Desembolso préstamo Crédito Individual persona jurídica con moneda en dolares y forma de pago BANCO BANBIF
      | "Num. Préstamo" | '0001000358'      | "DOLAR"            | ""     | ""      | "BANCO BANBIF"                  | "123"      | 'La transacción se realizó exitosamente'    |
      # Esc3 - Desembolso préstamo Crédito Individual persona jurídica con moneda en dolares, monto Valor de desembolso menor
      | "Num. Préstamo" | '0001000359'      | "DOLAR"            | "80"   | ""      | "BANCO BANBIF"                  | "123"      | "La Diferencia del Préstamo Debe ser Cero." |

  # QA-CAR-S450933 - Esc4 - Desembolso préstamo Crédito Individual persona jurídica con moneda en dolares, monto Valor igual a Total a Liquidar
  @DesembolsoDePrestamoTotalLiquidarJuridico
  Esquema del escenario: Desembolso prestamo Credito Individual persona juridica con moneda en dolares, monto Valor igual a Total a Liquidar
    Cuando realiza la busqueda por <BuscarPor> con el <numeroDeOperacion>
    Y selecciona del menu de acciones la opcion "Desembolso de Préstamo"
    Y diligencia el formulario de Desembolso de Prestamo, seleccionar el registro ingresado y "Eliminar", presenta mensaje "¿Está seguro que desea borrar la fila seleccionada?" se presiona "Aceptar"
    Y precionar "crear" y llenar la informacion <MonedaDeDesembolso>, <Valor>, <oficina>, <FormaDePago>, <Referencia> y presionar "Aceptar"
    Y se presenta el mensaje "La transacción se realizó exitosamente" y se presiona "Enviar"
    Entonces se despliega los mensajes de alerta <MensajeAlerta>

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | MonedaDeDesembolso | Valor | oficina | FormaDePago    | Referencia | MensajeAlerta                            |
      | "Num. Préstamo" | '0001000259'      | "DOLAR"            | ""    | ""      | "BANCO BANBIF" | "123"      | 'La transacción se realizó exitosamente' |
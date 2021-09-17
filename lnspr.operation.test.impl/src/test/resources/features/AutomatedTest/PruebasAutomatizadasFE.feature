#language : es
#Author : esteban.vallejo@clearminds-it.com
Característica: Verificar la correcta creacion de los pagos prestamo para una persona natural y persona juridica, moneda base, con tipo de pago mensual
  
  COMO usuario de la plataforma Cobis , usando filial , oficina y rol del modulo de cartera 
  QUIERO  aplicar un abono extraordinario para un préstamo  
  PARA  evidenciar la aplicación exitosa del pago y la regeneración correcta de la tabla de amortización

  Antecedentes: 
    Dado que usuario realiza login en el sistema cobis
    Dado que navega desde "Operaciones>>Cartera" hacia "Datos del Préstamo"

  #CAR-S452410-QA - Esc1 - Abono extraordinario con reduccion de tiempo
  @AbonoExtraordinarioReduccionTiempo
  Esquema del escenario: Abono extraordinario con reduccion de tiempo
    Cuando realiza la busqueda por <BuscarPor> con <numeroDeOperacion>
    Y mediante los botones de Accion selecciona la opcion "Pagos" --> boton "Negociación" --> Tipo Pago extraordinario: <TipoPago>
    Y presionamos el boton "Aceptar"
    Y diligencia el formulario pagos <MonedaPago>, <FormaPago>, <Referemcia>, <Monto>, <Descripcion> y precionar "Guardar"
    Y se valida que muestre mensaje "Transacción exitosa" y cerrar ventana
    Entonces en pestaña de "Estado Actual" se valida la tabla de amortización modificada

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | TipoPago              | MonedaPago  | FormaPago                             | Referemcia | Monto  | Descripcion |
      | 'Num. Préstamo' | '0001000280'      | "Reducción de Tiempo" | "0 - DOLAR" | "APLSOBRAN - APLICACION DE SOBRANTES" | "123"      | "1000" | ""          |
      #CAR-S452410-QA - Esc2 - Abono extraordinario con reduccion de cuota
      | 'Num. Préstamo' | '0001000280'      | "Reducción de Cuota"  | "0 - DOLAR" | "APLSOBRAN - APLICACION DE SOBRANTES" | "123"      | "1000" | ""          |
      #CAR-S452410-QA - Esc3 - Abono extraordinario con Pago Normal
      | 'Num. Préstamo' | '0001000280'      | "Pago normal"         | "0 - DOLAR" | "APLSOBRAN - APLICACION DE SOBRANTES" | "123"      | "1000" | ""          |

  # CAR-S504684
  @VencimientoDeCuotaConFecha
  Esquema del escenario: Realizar Pagos con fecha anterior y al vencimiento de la cuota
    Cuando realiza la busqueda por <BuscarPor> con el <numeroDeOperacion>
    Y selecciona del menu de acciones la opcion "Pagos"
    Y diligencia el formulario pagos <MonedaPago>, <FormaPago>, <Referemcia>, <Monto>, <Descripcion> y precionar "Guardar"
    Y se valida que muestre mensaje "Transacción exitosa" y cerrar ventana
    Entonces en Pestaña "Abonos" se marca el registro correspondiente para verificar el abono realizado

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | MonedaPago  | FormaPago                             | Referemcia | Monto | Descripcion |
      # Escenario 1: Pago con fecha anterior al vencimiento de la cuota
      | "Num. Préstamo" | '0001000359'      | "0 - DOLAR" | "APLSOBRAN - APLICACION DE SOBRANTES" | "123"      | "300" | ""          |
      # Escenario 2: Pago con fecha igual a la fecha de proceso
			| "Num. Préstamo" | '0001000359'      | "0 - DOLAR" | "APLSOBRAN - APLICACION DE SOBRANTES" | "123"      | "300" | ""          |
			
  # CAR-S517150
  @DevengamientoDeInteres
  Esquema del escenario: Devengamiento de intereses corrientes y de mora
    Cuando realiza la busqueda por <BuscarPor> con el <numeroDeOperacion>
    Y selecciona del menu de acciones la opcion "Fecha Valor"
    Y en Fecha valor ingresar la <fechaValor> y presionar boton "Aplicar" y presionar "Aceptar"
    Y se valida que muestre mensaje "La transacción se realizó exitosamente" y cerrar ventana
    Y en la pestaña "Estado Actual", en la tabla de amortización se selecciona el estado "VIGENTE"
    Entonces se valida el devengamiento de intereses corrientes

    Ejemplos: 
      | BuscarPor       | numeroDeOperacion | fechaValor |
      # Escenario 1: Devengamiento de intereses corrientes
      | "Num. Préstamo" | "0001000359"      | "03/05/2021" |
      # Escenario 2: Devengamiento de Rubro IMO
      | "Num. Préstamo" | "0001000359"      | "03/05/2021" |

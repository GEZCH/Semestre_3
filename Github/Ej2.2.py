def calcular_pago_casa(ingresos, costo_casa):
    if ingresos >= 80000:
        pie = 0.15 * costo_casa
        pago_mes = (costo_casa - pie) / (120)
    else:
        pie = 0.30 * costo_casa
        pago_mes = (costo_casa - pie) / (84)
    return pie, pago_mes

ingresos = 1
while  ingresos != 0  :
    print("Si quiere salir del programa tipee 0")
    ingresos = int(input("Tipee los ingresos: "))
    if  ingresos == 0 :
        print("Fin del programa")
        break

    costo_casa = int(input("Ingrese el costo de la casa: "))
    while ingresos < 0 or costo_casa < 0:
        print("Error, ingrese numeros positivos")
        ingresos = int(input("Tipee los ingresos: "))
        costo_casa = int(input("Ingrese el costo de la casa: "))

    pie_resultado, pago_mes_resultado = calcular_pago_casa(ingresos, costo_casa)

    print("El comprador debe pagar un pie de: ",pie_resultado, "clp")
    print("El comprador debe realizar pagos mensuales de $", pago_mes_resultado, "clp")

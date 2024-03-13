def calc_pago_casa(ingresos, costo_casa):   
    if ingresos >= 80000:
        pie = int(0.15 * costo_casa)  
        pago_mes = (costo_casa - pie) / (120)  
    else:
        pie = int(0.30 * costo_casa) 
        pago_mes = (costo_casa - pie) / (84) 

    return pie, pago_mes

ingresos = int(input("Tipee ingresos :"))
costo_casa = int(input("Tipee el costo de la casa: "))

pie_resultado, pago_mes_resultado = calc_pago_casa(ingresos, costo_casa)

print(f"El comprador debe pagar ${pie_resultado}")
print(f"El comprador debe realizar pagos mensuales de ${pago_mes_resultado}")

def calc_desc(edad):
    desc_cat = {5:0.35, 15:0.25, 20: 0.10, 46: 0.25, 66: 0.35}
    for categoria, descuento in sorted(desc_cat.items(), reverse=True):
        if edad>= categoria:
            return descuento
    return 0
def calc_desc_tot(clientes):
    tot_desc=sum(calc_desc(edad) for edad in clientes)
    return tot_desc

num_cli=int(input("ingresar cantidad de clientes:"))
edad_cli=[int(input(f"ingrese edad del cliente {i + 1}:")) for i in range (num_cli)]
desc_total = calc_desc_tot(edad_cli)
print(f"perdidas: {desc_total * 100}")
    
def calc_desc(edad):
    if 5 <= edad >=14:
        return 0.35 
    elif 15<= edad >= 19:
        return 0.25
    elif 20 <= edad >= 45:
        return 0.10
    elif 46 <= edad >= 65 :
        return 0.25
    elif edad >= 66:
        return 0.35
    else:
        return 0

def calc_des_tot(clientes):
    tot_desc = 0
    for edad_cl in clientes:
        desc = calc_desc(edad_cl)
        tot_desc += desc
    return tot_desc

num_cli = int(input("Ingresar cantidad de clientes: "))
edades_cli = []

for i in range(num_cli):
    edad = int(input(f"Ingresar edad {i + 1}: "))
    edades_cli.append(edad)

desc_tot = calc_des_tot(edades_cli)
print(f"La perdida por descuentos es de: {desc_tot * calc_desc()} clp ")





    

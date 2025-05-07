# w) Elaborar um programa que leia uma medida em pés e apresente o seu valor convertido em 
# metros, lembrando que um pé mede 0,3048 metro, ou seja, um pé é igual a 30,48 centímetros.

import math

pes = float(input("Digite a medida (em pés): "))

# Converte a medida para metros
metros = pes * 0.3048

print(f"{pes} pés equivalem a {metros:.2f} metros.")
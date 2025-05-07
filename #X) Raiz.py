#x) Elaborar um programa que calcule uma raiz de base qualquer com índice qualquer.

import math

base = float(input("Digite a base: "))
indice = float(input("Digite o índice da raiz (por exemplo, 2 para raiz quadrada, 3 para cúbica, etc.): "))

# Calcula a raiz utilizando a fórmula base^(1/índice)
raiz = base ** (1 / indice)

print(f"A raiz {indice}-ésima de {base} é {raiz:.4f}")
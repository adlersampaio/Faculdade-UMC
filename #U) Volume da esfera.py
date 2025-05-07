#u) Elaborar um programa de computador que calcule e apresente o valor do volume de uma esfera. 
# Utilize a fórmula VOLUME <- (4 / 3) * 3.14159 * (RAIO j 3)

import math

raio = float(input("Digite o raio da esfera: "))

volume = (4 / 3) * math.pi * (raio**3)

print(f"O volume da esfera é {volume:.2f} unidades cúbicas") 
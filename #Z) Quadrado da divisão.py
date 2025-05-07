#z) Ler dois valores numéricos inteiros (representados pelas variáveis A e B) e apresentar o 
# resultado do quadrado da divisão do primeiro valor (variável A) em relação ao segundo valor (variável B).

import math

A = int(input("Digite o valor de A: "))
B = int(input("Digite o valor de B: "))

# Calcula o quadrado da divisão de A por B
resultado = (A / B) ** 2

print(f"O quadrado da divisão de {A} por {B} é {resultado:.2f}")

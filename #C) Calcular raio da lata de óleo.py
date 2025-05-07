#C) Calcular raio da lata de óleo

import math

# Função para calcular o volume da lata de óleo
def calcular_volume(raio, altura):
    pi = 3.14159
    volume = pi * (raio ** 2) * altura
    return volume

print ("Calculo do raio da lata de óleo :) ")

raio = float (input ("Digite o raio da lata de óleo:"))
altura = float (input("Digite a altura da lata de óleo:"))

volume = calcular_volume(raio, altura)

print(f"O volume da lata de óleo é: {volume:.2f} metros cúbicos.")
#N) Construir um programa que leia três valores numéricos inteiros (representados pelas variáveis A, 
#B e C) e apresente como resultado final o valor do quadrado da soma dos três valores lidos.

import math

#Entrada de Dados
A = int(input("Digite o valor de A:"))
B = int(input("Digite o valor de B:"))
C = int(input("Digite o valor de C:"))

#Calculo e Apresentação
soma_dos_valores = A + B + C

calculo_quadrado = soma_dos_valores **2

#Apresentação

print ("O resultado do quadrado da soma dos três valores é:", calculo_quadrado)
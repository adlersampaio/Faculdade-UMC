#M) Construir um programa que leia três valores numéricos inteiros (representados pelas variáveis A, 
#B e C) e apresente como resultado final o valor da soma dos quadrados dos três valores lidos.

import math

#Entrada de Dados
A = int(input("Digite o valor de A:"))
B = int(input("Digite o valor de B:"))
C = int(input("Digite o valor de C:"))

#Calculo e Apresentação
soma_dos_quadrados = A**2 + B**2 + C**2
#Apresentação
print ("A soma dos quadrados é:", soma_dos_quadrados)
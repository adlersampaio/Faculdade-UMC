#S) Elaborar um programa que leia dois valores numéricos reais desconhecidos representados pelas 
#variáveis A e B. Calcular e apresentar os resultados das quatro operações aritméticas básicas. 

import math

A = float (input("Digite o valor de A:"))
B = float (input("Digite o valor de B:"))

#Calculo

soma = A + B
subtracao = A - B
multiplicacao = A * B
divisao = A / B

#Apresentação dos resultados
print ("O resultado da soma dos valores é:", soma)

print ("O resultado da subtração dos valores é:", subtracao)

print ("O resultado da multiplicação é:", multiplicacao)

print ("O resultado da divisão é:", divisao)
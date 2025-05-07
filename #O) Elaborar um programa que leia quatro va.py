#Elaborar um programa que leia quatro valores numéricos inteiros (variáveis A, B, C e D). Ao final 
#o programa deve apresentar o resultado do produto (variável P) do primeiro com o terceiro valor, 
#e o resultado da soma (variável S) do segundo com o quarto valor. 

import math

#Coleta de Dados
A = int(input("Digite o valor de A:"))
B = int(input("Digite o valor de B:"))
C = int(input("Digite o valor de C:"))
D = int(input("Digite o valor de D:"))

#Apresentação de Dados
P = A * C 
print ("O resultado do produto variável entre o primeiro e o terceiro valor é:", P)

S = B + D
print ("O resultado da soma do segundo e quarto valor é:", S)
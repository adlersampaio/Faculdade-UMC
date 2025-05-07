#P) Elaborar um programa que leia o valor numérico correspondente ao salário mensal (variável SM) 
#de um trabalhador e também faça a leitura do valor do percentual de reajuste (variável PR) a ser 
#atribuído. Apresentar o valor do novo salário (variável NS).

import math

#Entrada de Dados
SM = float(input("Digite o valor do salário mensal:"))
PR = float(input("Digite o percentual (%) de reajuste:"))

#Apresentação de Dados
NS = print("O salário reajustado é:", SM + (SM * PR / 100))
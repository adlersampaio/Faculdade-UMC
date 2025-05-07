#T) Construir um programa que calcule e apresente em metros por segundo o valor da velocidade de 
#um projétil que percorre uma distância em quilômetros a um espaço de tempo em minutos. Utilize 
#a fórmula VELOCIDADE+- (DISTÂNCIA* 1000) /(TEMPO* 60).

import math

#Entrada de dados
distancia = float (input("Digite a distância percorrida em KM:"))
tempo = float (input("Digite o tempo em minutos que levou para atingir o alvo:"))

#Calculo
velocidade = (distancia * 1000) / (tempo * 60)

#Apresentação
print ("A velocidade do projétil em metros por segundo é", velocidade)

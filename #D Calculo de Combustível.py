#D Calculo de Combustível
import math

#Variáveis
tempo = float
velocidade = float
distancia = float
litros_usados = float

tempo = float (input("Digite o tempo gasto na viagem:"))
velocidade = float (input("Digite a velocidade média:"))
distancia = (velocidade * tempo)

print (f"A distancia percorrida foi:{distancia} KM")

litros_usados = distancia / 12

print (f"Os litros de gasolina gastos foram:{litros_usados}")
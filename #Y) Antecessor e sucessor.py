# y) Construir um programa que leia um valor numérico inteiro e apresente como resultado os seus valores sucessor e antecessor.

import math

valor = int(input("Digite um valor: "))

antecessor = valor - 1 
sucessor = valor + 1

print(f"O antecessor do valor {valor} é {antecessor}")
print(f"O sucessor do valor {valor} é {sucessor}")
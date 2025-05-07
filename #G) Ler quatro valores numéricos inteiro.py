#G) Ler quatro valores numéricos inteiros e apresentar o resultado das adições e das multiplicações 
#utilizando o mesmo raciocínio aplicado quando do uso de propriedades distributivas para a 
#máxima combinação possível entre as quatro variáveis. Não é para calcular a propriedade distri
#butiva, apenas para usar a sua forma de combinação. Considerando a leitura de valores para as 
#variáveis A, B, C e D, devem ser feitas seis adições e seis multiplicações, ou seja, deve ser com
#binada a variável A com a variável B, a variável A com a variável C, a variável A com a variável D. 
#Depois é necessário combinar a variável B com a variável C e a variável B com a variável D e, 
#por fim, a variável C será combinada com a variável D.

import math

#Leitura dos valores

A = int(input ("Digite o valor de A:"))
B = int(input ("Digite o valor de B:"))
C = int(input ("Digite o valor de C:"))
D = int(input ("Digite o valor de D:"))

#Somas
print(f"A + B = {A + B}")
print(f"A + C = {A + C}")
print(f"A + D = {A + D}")
print(f"B + C = {B + C}")
print(f"B + D = {B + D}")
print(f"C + D = {C + D}")

#Multiplicação
print(f"A x B = {A * B}")
print(f"A x C = {A * C}")
print(f"A x D = {A * D}")
print(f"B x C = {B * C}")
print(f"B x D = {B * D}")
print(f"C x D = {C * D}")
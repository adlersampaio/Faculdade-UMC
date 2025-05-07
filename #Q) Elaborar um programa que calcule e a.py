#Q) Elaborar um programa que calcule e apresente o valor do resultado da área de uma circunfe
#rência (variável A). O programa deve solicitar a entrada do valor do raio da circunferência (variá
#vel R). Para a execução deste problema utilize a fórmula A+- 3.14159265* R j 2. 

import math

R = float (input("Digite o valor do raio da circunferência:"))

A = math.pi * R ** 2

A = print ("O valor da area da circunferência é", A)
#F) Ler dois valores para as variáveis A e B e efetuar a troca dos valores de forma que a variável A 
#passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apre
#sentar os valores após a efetivação do processamento da troca.


A = input("Digite o valor de A: ")
B = input("Digite o valor de B: ")

A, B = B, A

print(f"Depois da troca: A = {A}, B = {B}")
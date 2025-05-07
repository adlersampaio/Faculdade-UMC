#E) Efetuar o cálculo e apresentar o valor de uma prestação de um bem em atraso, utilizando a 
#fórmula PRESTAÇÃO+-- VALOR+ (VALOR* (TAXA/100) * TEMPO).

#Variaveis
#valor
#taxa
#tempo

# Entrada de dados
valor = float(input("Digite o valor da prestação: R$ "))
taxa = float(input("Digite a taxa de juros (% ao mês): "))
tempo = int(input("Digite o tempo de atraso (em meses): "))

# Cálculo do valor da prestação em atraso
prestacao = valor + (valor * (taxa / 100) * tempo)

# Exibição do resultado
print(f"O valor da prestação em atraso é: R$ {prestacao:.2f}")

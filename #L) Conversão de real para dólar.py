# L) Conversão de real para dólar

cotacao_dolar = float(input("Digite a cotação atual do dólar (US$ -> R$): "))

quantidade_reais = float(input("Digite a quantidade de reais disponível: "))

valor_em_dolares = quantidade_reais / cotacao_dolar

print(f"\nCom R$ {quantidade_reais:.2f} e a cotação de R$ {cotacao_dolar:.2f}, você tem US$ {valor_em_dolares:.2f}.")
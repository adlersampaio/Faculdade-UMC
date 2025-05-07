# K) Conversão de dólar para real 


cotacao_dolar = float(input("Digite a cotação atual do dólar (US$ -> R$): "))

quantidade_dolar = float(input("Digite a quantidade de dólares disponível: "))

valor_em_reais = cotacao_dolar * quantidade_dolar

print(f"\nCom US$ {quantidade_dolar:.2f} e a cotação de R$ {cotacao_dolar:.2f}, você tem R$ {valor_em_reais:.2f}.")
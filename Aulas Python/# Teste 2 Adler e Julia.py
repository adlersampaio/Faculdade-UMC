# Teste
# Conversor de Reais para Dólares

# Cotação do dólar (pode ser atualizada manualmente)
cotacao_dolar = float(input("Digite a cotação atual do dólar (ex: 5.15): "))

# Valor em reais a ser convertido
valor_reais = float(input("Digite o valor em reais (R$): "))

# Conversão
valor_dolares = valor_reais / cotacao_dolar

# Resultado
print(f"R$ {valor_reais:.2f} equivalem a US$ {valor_dolares:.2f}")

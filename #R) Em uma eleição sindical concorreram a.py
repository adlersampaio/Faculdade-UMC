#R Em uma eleição sindical concorreram ao cargo de presidente três candidatos (representados 
#pelas variáveis A, B e C). Durante a apuração dos votos foram computados votos nulos e em 
#branco, além dos votos válidos para cada candidato. Deve ser criado um programa de compu
#tador que faça a leitura da quantidade de votos válidos para cada candidato, além de também ler 
#a quantidade de votos nulos e em branco. Ao final o programa deve apresentar o número total 
#de eleitores, considerando votos válidos, nulos e em branco; o percentual correspondente de 
#votos válidos em relação à quantidade de eleitores; o percentual correspondente de votos válidos 
#do candidato A em relação à quantidade de eleitores; o percentual correspondente de 
#votos válidos do candidato B em relação à quantidade de eleitores; o percentual correspondente 
#de votos válidos do candidato C em relação à quantidade de eleitores; o percentual 
#correspondente de votos nulos em relação à quantidade de eleitores; e por último o 
#percentual correspondente de votos em branco em relação à quantidade de eleitores.

# Leitura dos votos
votos_A = int(input("Digite a quantidade de votos para o candidato A: "))
votos_B = int(input("Digite a quantidade de votos para o candidato B: "))
votos_C = int(input("Digite a quantidade de votos para o candidato C: "))
votos_nulos = int(input("Digite a quantidade de votos nulos: "))
votos_brancos = int(input("Digite a quantidade de votos em branco: "))

# Cálculo do total de eleitores
total_eleitores = votos_A + votos_B + votos_C + votos_nulos + votos_brancos

# Cálculo dos percentuais
percentual_validos = ((votos_A + votos_B + votos_C) / total_eleitores) * 100
percentual_A = (votos_A / total_eleitores) * 100
percentual_B = (votos_B / total_eleitores) * 100
percentual_C = (votos_C / total_eleitores) * 100
percentual_nulos = (votos_nulos / total_eleitores) * 100
percentual_brancos = (votos_brancos / total_eleitores) * 100

# Exibição dos resultados
print("Resultado da eleição:")
print("Total de eleitores:", total_eleitores)
print("Percentual de votos válidos: {:.2f}%".format(percentual_validos))
print("Percentual de votos para o candidato A: {:.2f}%".format(percentual_A))
print("Percentual de votos para o candidato B: {:.2f}%".format(percentual_B))
print("Percentual de votos para o candidato C: {:.2f}%".format(percentual_C))
print("Percentual de votos nulos: {:.2f}%".format(percentual_nulos))
print("Percentual de votos em branco: {:.2f}%".format(percentual_brancos))

itens = []
precos = []

quantidade = int(input("Quantos itens deseja adicionar? "))

for i in range(quantidade):
    item = input("Digite o nome do item: ")
    preco = float(input("Digite o preço do item: "))

    itens.append(item)
    precos.append(preco)

total = 0

for i in range(quantidade):
    total = total + precos[i]

print("\n--- RESUMO DA COMPRA ---")

for i in range(quantidade):
    print(itens[i], "- R$", precos[i])

print("Total: R$", total)

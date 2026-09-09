texto = input("Digite uma palavra ou frase: ")
invertido = ""
for i in range(len(texto) - 1, -1, -1):
    invertido = invertido + texto[i]
print(invertido)

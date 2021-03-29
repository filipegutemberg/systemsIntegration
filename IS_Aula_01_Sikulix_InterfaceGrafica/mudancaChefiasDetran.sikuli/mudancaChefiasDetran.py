import sys
fileName = "C:/Users/filipegutemberg/Desktop/d.txt"
chefia = 46833
servidor = 44792

#doubleClick(Location(539, 417))
#type(str(servidor))
arquivo = open(fileName, 'r')
text = arquivo.read()
arquivo.close()
textArray = text.split(";")
test = 0
print(len(textArray))

for x in range(0,len(textArray)-1,2):
    click(Location(352, 671))#click mat servidor
    type(textArray[x])
    click(Location(173, 697))#click Botao
    wait(8)
    doubleClick(Location(539, 417))#click matricula chefe
    type(textArray[x+1])  

#servidores = []
#for x in text:
#    type(x)
#    break
#    tupla = x.split(";")
#    type(str(tupla))
#    break
#    for y in tupla:
#        servidores.append(y)

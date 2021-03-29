import sys
nome = sys.argv[1]
email = sys.argv[2]
site = "https://personal-7qvumdob.outsystemscloud.com/IntegracaoDeSistemasSiculix/FuncionarioDetail?_ts=637515209826200612"
click("1616417510116.png")
wait(2)
type("edge\n")
sleep(3)
type(site)
type("\n")

for x in range(0,2):
    doubleClick("1616410961689.png")
    type(nome)
    type(Key.TAB)
    type(email + '\n')
    click(Pattern("1616411333434.png").targetOffset(240,2))

import string

alph = list(string.ascii_lowercase)
alph.insert(0, " ")

for i in range(int(input())):
    line = list(input())
    value = line.pop(0)
    message = line [1:]
    
    if(value == "d"):
        count = 0
        decrypt = ""
        for i in message:
            line = alph.index(i)
            for j in range(27):
                if((j + count)% 27 == line):
                    count += j
                    decrypt += alph[j]
                    break;
        print(decrypt)
        
    else:
        count = 0
        encrypt = ""
        for i in message:
          encrypt += alph[(count + alph.index(i))%27]
          count += alph.index(i)
        print(encrypt)
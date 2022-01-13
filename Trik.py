s = input("")
location = 1

for i in s:
    if i == "A":
        if(location == 1):
            location = 2
        elif location == 2:
            location = 1
    elif(i == "B"):
        if(location == 2):
            location = 3
        elif location == 3:
            location = 2
    elif i == "C":
        if location == 1:
            location = 3
        elif location == 3:
            location = 1
            
print(location)
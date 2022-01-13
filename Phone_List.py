def checker(num):
    checker = 1;
    val=set()
    for i in num:
        if i in val:
            checker=0
            break
        for j in range(1,len(i)+1):
            val.add(i[:j])
    return checker

for test in range(eval(input())):
    Numbers=[]
    for phone in range(eval(input())):
        Numbers.append(input())
    
    Numbers.sort(reverse = True)
    temp = checker(Numbers)
    if(temp == 0):
        print("NO")
    else:
        print("YES")
test = int(input())
for c in range(1, test+1):
    line = [int(x) for x in input().split()][1:]
    count = 0
    for i in range(1, len(line)):
        temp = line[i]
        j = i - 1
        while j >= 0 and line[j] > temp:
            line[j + 1] = line[j]
            j -= 1
            count += 1
        line[j + 1] = temp
    print(c, count)
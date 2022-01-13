for i in range(int(input())):
    line = input()
    for j in range(1, len(line) + 1):
        if line == (line[0:j] * (1000))[0:len(line)]:
            print(j)
            break
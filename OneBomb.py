def pro():
    n, m = map(int, input().split())
    a = []
    x = [0 for i in range(m)]
    y = [0 for i in range(n)]
    count = 0

    for i in range(n):
        a.append(list(input()))
        for j in range(len(a[i])):
            if a[i][j] == '*':
                x[j] += 1
                y[i] += 1
                count += 1
    for i in range(n): #СТОЛ
            for j in range(m): #СТРО
                if a[i][j] == '*' and x[j] + y[i] - 1 == count:
                    print('YES')
                    print(i + 1, j + 1)
                    exit(0)
                elif x[j] + y[i] == count and a[i][j] != '*':
                    print('YES')
                    print(i + 1, j + 1)
                    exit(0)
    print('NO')

pro()
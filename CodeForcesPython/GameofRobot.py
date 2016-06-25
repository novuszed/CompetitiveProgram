from sys import stdin

num, ind = map(int,stdin.readline().split())
a =list(map(int,stdin.readline().split()))

triangularNumSize=1

while(triangularNumSize<ind):
    ind-=triangularNumSize
    triangularNumSize+=1
print(a[ind-1])



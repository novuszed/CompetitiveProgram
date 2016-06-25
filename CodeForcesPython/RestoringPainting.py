__author__ = 'zihaozhu'
from sys import stdin
n,a,b,c,d = map(int,stdin.readline().split())

answer=0
for x in range (1,n+1):
    y= x + b - c
    z= x+a-d
    w= z+ b -c
    if(1<=y and y<= n and 1<=z and z<=n and 1<=w and w<=n):
        answer+=1

answer*=n
print(answer)
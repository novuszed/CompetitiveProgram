import os
from sys import stdin

numField = int(stdin.readline())
directions = stdin.readline()
length = list(map(int,stdin.readline().split(" ")))

answer = [length[i+1]-length[i] for i in range(numField-1) if(directions[i]=='R' and directions[i+1]=='L')]

if(answer):
    print(int(min(answer)/2))
else:
    print (-1)
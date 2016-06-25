__author__ = 'zihaozhu'
from sys import stdin

people, fence = map(int,stdin.readline().split())
height = list(map(int,stdin.readline().split()))
count = 0
for i in range (0,people):
    if(height[i]>fence):
        count+=2
    else:
        count+=1
print(count)
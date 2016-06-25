from sys import stdin
import math

level, second = map(int,stdin.readline().split())

counter=0
curr=[second]
for i in range (0,level):

    wine = [0] * (len(curr)+1)
    #print(curr)
    for j in range (len(curr)):
        #print(j)
        if(curr[j]>=1):
            counter+=1
            flow=curr[j]-1
            wine[j]+=flow/2
            wine[j+1]+=flow/2
            second-=1
        j+=1
    curr=wine
print(counter)
"""
n,t = [int(x) for x in input().split()]
curr = [t]
fill = 0
#print (curr)

while sum(curr)>0 and len(curr)<=n:
    nex = [0]*(len(curr)+1)
    print(curr)
    for i in range(len(curr)):

        if curr[i]>=1:
            print("curr: "+str(curr[i]))
            fill+=1
            flow = curr[i]-1
            nex[i]+=flow/2
            nex[i+1]+=flow/2
    curr = nex

#print(fill)
"""
from sys import stdin

num, height, smash = map(int,stdin.readline().split())
potatoes = list(map(int,stdin.readline().split()))

second = 0
currPot = 0
counter=0
#Potatoe:5,2,
#Counter:1,
#second:1,

#1
#2
while(counter<len(potatoes)):
    if(currPot+potatoes[counter] <= height):
        currPot=currPot+potatoes[counter]
        second+=currPot//smash
        currPot=currPot%smash
        counter+=1
    else:
        second+=1
        currPot -= smash
        if(currPot<0):
            currPot=0

if(currPot>0):
    second+=1
print((second))
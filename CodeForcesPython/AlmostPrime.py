__author__ = 'zihaozhu'
from sys import stdin
import math
number1 = int(stdin.readline())
numPrime=0
for number in range (1,number1+1):
    answer = set ()
    i=2
    while i*i < number:
        #print(i)
        #print(number)
        while(number % i == 0):
            answer.add(i)
            number/=i
         #   print(i)
        i+=1
    if(number>1):
        answer.add(number)
    if(len(answer)==2):
        #print("Here")
        numPrime+=1
print(numPrime)

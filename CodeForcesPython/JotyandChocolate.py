__author__ = 'zihaozhu'
from sys import stdin
from fractions import gcd
def lcm(x, y):
    return x * y // gcd(x, y)
n,a,b,p,q = map(int,stdin.readline().split())

temp=a*b
numA = n//a
numB = n//b
numC = n//temp

answer = (numA*p)
answer += (numB*q)
answer -= min(p,q)*(n // lcm(a,b))
print (answer)
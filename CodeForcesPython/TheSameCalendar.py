__author__ = 'zihaozhu'
from sys import stdin

def is_leap(year):
    return (year%400==0 or (year%100!=0 and year%4 == 0))

year = int(stdin.readline())
newyear=year
delta=0
while (year==newyear) or not (delta==0 and is_leap(year)==is_leap(newyear)):
    delta +=(365+int(is_leap(newyear)))
    delta %= 7
    newyear+=1
print(newyear)


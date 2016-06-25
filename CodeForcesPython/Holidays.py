from sys import stdin

days = int(stdin.readline())
min = 0
max = 0

tempDays = days

while(days>0):
    if(days-5>0):
        days -= 5
    else:
        break
    if(days-2>=0):
        days-=2
        min+=2
    else:
        min+=1
        break
while(tempDays>0):
    if(tempDays-2>=0):
        tempDays-=2
        max+=2
    else:
        max+=1
        break;
    if(tempDays-5>0):
        tempDays-=5
    else:
        break
print(str(min)+" "+str(max))
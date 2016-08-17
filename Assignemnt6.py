__author__ = 'zihaozhu'

def twosum_h(t, data, hashTable):
    for x in data:
        y = t-x
        if y in hashTable and x!=y:
            return (x,y)
    return None

lines = open("ass6.txt","r").read().splitlines()
data = list(map(int,lines))

hashTable = dict()
for x in data:
    hashTable[x] = True

count = 0
for t in range(-10000,10001):
    if(twosum_h(t,data,hashTable)):
        count+=1
print (count)
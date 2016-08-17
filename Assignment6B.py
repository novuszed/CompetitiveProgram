__author__ = 'zihaozhu'
import heapq

heap_low=None
heap_high=None

def heap_init():
    global heap_low
    global heap_high

    heap_low = []
    heap_high = []

def heap_insert(x):
    global heap_low
    global heap_high

    if(len(heap_low)==0):
        heapq.heappush(heap_low,-x)
    else:
        m = -heap_low[0]
        if(x>m):
            heapq.heappush(heap_high,x)
            if(len(heap_high)>len(heap_low)):
                y = heapq.heappop(heap_high)
                heapq.heappush(heap_low,y)
        else:
            heapq.heappush(heap_low,-x)
            if(len(heap_low)>len(heap_high)):
                y = -heapq.heappop(heap_low)
                heapq.heappush(heap_high,y)
    return -heap_low[0]

fh = open("median.txt","r")
lines = open('Median.txt').read().splitlines()
data = map(lambda x: int(x), lines)
medians = []

heap_init()

for x in data:
    median = heap_insert(x)
    medians.append(median)

sum=0
for med in medians:
    sum= sum+med%10000
sum = sum%10000
print(sum)
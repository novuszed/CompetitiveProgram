
__author__ = 'zihaozhu'
import sys
import queue
import heapq

class Graph(object):
    def __init__(self,start,weight):
        self.start=start
        self.weight=weight
    def __cmp__(self,other):
        return (self.weight>other.weight)-(self.weight<other.weight)

def make_graph(filename):

    fh = open(filename,'r')
    line_list = fh.readlines()

    G ={int(line.split()[0]): {int(tup.split(',')[0]):int(tup.split(',')[1])
    for tup in line.split()[1:] if tup} for line in line_list if line}
    print (G)

    fh.close()
    return G

def dijkstras(G,start):
    pq=[]
    D={}
    for vertex in G:
        D[vertex]=1000000
    D[start]=0
    item = [0,start]
    heapq.heappush(pq,item)
    while pq:
        weight,v = heapq.heappop(pq)
        print(weight,v)
        for vertex in G[v]:
            vwlength = D[v] + G[v][vertex]
            if (D[vertex]>vwlength):
                D[vertex] = vwlength
                item=[vwlength,vertex]
                heapq.heappush(pq,item)
    print(D[7])
    print(D[37])
    print(D[59])
    print(D[82])
G = make_graph("ass5.txt")
dijkstras(G,1)

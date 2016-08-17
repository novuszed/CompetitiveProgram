__author__ = 'zihaozhu'
from collections import defaultdict
import sys
import threading
import operator
threading.stack_size(67108864)
sys.setrecursionlimit(2**20)

def read_graph(input_file, reverse=False):

    G = defaultdict(list)

    for line in open(input_file):
        i, j = line.split()

        # initialise each node:
        # G = { node : [False, [outgoing arcs], ...}
        # where False indicates whether visited or not
        G[int(i)] = [False] if not G[int(i)] else G[int(i)]
        G[int(j)] = [False] if not G[int(j)] else G[int(j)]

        # read in the directed edges
        # read in straight for second DFS, read in reversed for first DFS
        if not reverse:
            G[int(i)].append(int(j))
        else:
            G[int(j)].append(int(i))

    return G



def magic_order(G):
    #G to store graph with the first index being whether its visited or not
    #stack to store the dfs stuff
    #finishtime to store the finishg time of each node
    global finishtime
    global stack
    keys = sorted(G.keys(),reverse=True)
    for node in keys:
        #if node is not visited, dfs it
        if not G[node][0]:
            stack.append(node)

            while stack:
                #grab the most recently added thing
                leader = stack[-1]
                try:
                    #mark as visited
                    G[leader][0] = True
                    outgoing = []
                    try:
                        outgoing = [j for j in G[leader][1:] if not G[j][0]]
                    except IndexError:
                        pass
                    if outgoing:
                        stack.extend(outgoing)
                    else:
                        #if no outoing edges, then its the final one, finished dfs, add to finish

                        finishtime.append(leader)
                        stack.pop()
                except KeyError:
                    finishtime.append(leader)

def magic_order2(G):
    #G to store graph with the first index being whether its visited or not
    #stack to store the dfs stuff
    #finishtime to store the finishg time of each node
    global finishtime
    global stack
    global answer
    leaderD = defaultdict(set)
    for node in finishtime[::-1]:
        #if node is not visited, dfs it
        if not G[node][0]:
            stack.append(node)
            count = 1
            print("NODE",node)
            while stack:
                #grab the most recently added thing
                leader = stack[-1]
                print("Leader",leader)
                try:
                    #mark as visited
                    G[leader][0] = True
                    outgoing = []
                    try:
                        outgoing = [j for j in G[leader][1:] if not G[j][0]]
                        print(outgoing)
                    except IndexError:
                        pass
                    if outgoing:
                        stack.extend(outgoing)
                    else:
                        #if no outoing edges, then its the final one, finished dfs, add to finish

                        stack.pop()

                except KeyError:
                    pass
                leaderD[node].add(leader)
            answer.append(len(leaderD[node]))
    return leaderD
finishtime=list()
t = 0
stack = list()
answer=list()
G = read_graph("test4.txt")
G_rev = read_graph("test4.txt",reverse=True)

magic_order(G)
print(finishtime)
stack = list()

di=magic_order2(G)
sortedAns = sorted(answer,reverse=True)
print(sortedAns[:5])

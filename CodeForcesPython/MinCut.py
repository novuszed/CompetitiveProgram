from sys import stdin
import random
import copy


class Adjacency(object):
    """Describes the adjacency relationship among the nodes in a graph.

    node: a list of one vertex, or contracted vertices.

    edge: a list of vertices that 'node' is adjacent to.
    """

    def __init__(self, node, edge):
        self.node = node
        self.edge = edge

    def contract(self, other):
        self.node += other.node
        self.edge = [i for i in self.edge + other.edge
                     if i not in self.node]

    def __repr__(self):
        return 'Adjacency(node = %r, edge = %r)' % (self.node, self.edge)


def cut(graph,times):
    if len(graph) == 2:
        return len(graph[0].edge)
    else:
        rand_pick =random.choice(graph)
        merge_node = random.choice(rand_pick.edge)
        merge_pick = [i for i in graph if merge_node in i.node]
        rand_pick.contract(merge_pick[0])
        graph.remove(merge_pick[0])
        return cut(graph,times+1)









fh = open ("mincut.txt","r")
data = [[[int(line.split()[0])], [int(i) for i in line.split()[1:]]]
        for line in fh]

graph = [Adjacency(i[0],i[1]) for i in data]
min_cut = cut(copy.deepcopy(graph),0)
for i in range(1,100):
    x = cut(copy.deepcopy(graph),0)

    if x<min_cut:
        min_cut = x
print (min_cut)
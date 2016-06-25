__author__ = 'zihaozhu'
from sys import stdin


vale=0
class Node:
    """
    def __init__(self,value):
        self.left=None
        self.right=None
        self.value=value
        self.parent=None
    """
    def __init__(self,value,par):
        self.left=None
        self.right=None
        self.value=value
        self.parent=par
class Tree(object):
    def __init__(self):
        self.root=None
    def getRoot(self):
        return str(self.root.value)
    def getParent(self):
        return self.parent
    def add(self,val):
        if (self.root==None):
            self.root=Node(val,val)

        else:
            self._add(val,self.root)
    def _add(self,val,node):
        if(val<node.value):
            if(node.left != None):
                self._add(val,node.left)
            else:
                node.left = Node(val,node.value)
        else:
            if(node.right!=None):
                self._add(val,node.right)
            else:
                node.right = Node(val,node.value)
    def find(self,val):
        if(self.root!=None):
            return self._find(val,self.root)
        else:
            return None
    def _find(self,val,node):
        if(val==node.value):
            print(str(node.parent), end=" "),
            return node
        elif(val<node.value and node.left != None):
            self._find(val,node.left)
        elif(val>node.value and node.right!=None):
            self._find(val,node.right)
    def printTree(self):
        if(self.root!=None):
            self._printTree(self.root)
    def _printTree(self,node):
        if(node!=None):
            self._printTree(node.left)
            print (str(node.value)+' ')
            self._printTree(node.right)

cases = int(stdin.readline())

numbers = list(map(int,stdin.readline().split()))

root = Tree()
for i in range (0,len(numbers)):
    root.add(numbers[i])
#root.printTree()
#print(root.getRoot())
#print("tteest")
#for i in range (1,len(numbers)):
#    print(root.find(numbers[i]).value)
for i in range(1,len(numbers)):
    root.find(numbers[i])
print()
"""
for i in range (1,len(numbers)):
   # print(numbers[i])
    test= (root.find(numbers[i]))
    print("test+"+str(test))
    #print (root.printTree())
    """
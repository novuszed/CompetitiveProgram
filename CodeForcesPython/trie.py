from sys import stdin

trie=[]
next_node=1
trie = [[0, 0]]
def next_nod():
    global next_node
    next_node=1



def best(val,maxBit):
    node = 0
    best =0
    for i in range(0,maxBit):
        bit = (val>>(maxBit-1)) & 1

        if trie[node][not bit]==0:
            maxBit-=1
            node=trie[node][bit]
            best = (best<<1) | (bit)


        else:
            maxBit-=1
            node=trie[node][not bit]
            best= (best<<1)|(not bit)

    return best
def insert(s,size):
    global next_node
    node = 0
    for i in range(0,size):
        child = int(s[i])
        while(node>=len(trie)):
            trie.append([0,0])
        if(trie[node][child]==0):
            trie[node][child] = next_node
            next_node+=1
        node = trie[node][child]
def main():
    cases = int(stdin.readline())
    for inp in range(cases):
        S, Q = map(int, stdin.readline().split())
        num = set(map(int, stdin.readline().split()))
        maxBit = max(num).bit_length()
        for n in num:
            bitSt = bin(n)[2:]
            bitSt = "0"*((maxBit)-len(bitSt))+bitSt
            insert(bitSt, len(bitSt))
        for q in range(Q):
            query = int(stdin.readline())
            print(best(query,maxBit))
main()


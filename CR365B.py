from sys import stdin

numcity, numcap = map(int,stdin.readline().split())
beauty = list(map(int,stdin.readline().split()))
capitals = list(map(int,stdin.readline().split()))

presum=0

for i in range(len(beauty)):
    if(i==len(beauty)-1):
        presum+=(beauty[0]*beauty[i])
    else:
        presum+=(beauty[i]*beauty[i+1])

dic = dict()

board = [[0 for x in range(len(beauty))] for y in range(len(beauty))]

for i in capitals:
    i-=1
    right = (i+1) % (len(beauty))
    left = ((i-1)+len(beauty))%len(beauty)
    board[i][right]=1
    board[i][left]=1
    board[i][i]=1
    for j in range(len(beauty)):
        if(board[i][j]!=1):
            presum+=(beauty[i]*beauty[j])
            #print("Capital %d matching with city %d",(i+1,j+1))
            board[i][j]=1
            board[j][i]=1
#print(board)
print(presum)
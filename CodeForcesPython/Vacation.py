from sys import stdin

size = int(stdin.readline())
inp = list(map(int,stdin.readline().split()))

board = [[0,0,0] for y in range(size)]
#0 for contest 1 for gym 2 for nothing
if(inp[0] == 0):
    board[0] = [0,0,0]
elif inp[0] == 1:
    board[0] = [0,1,0]
elif inp[0] == 2:
    board[0] = [0,0,1]
else:
    board[0] = [0,1,1]

for n in range(1,len(inp)):
    board[n][0] = max(board[n-1])
    if(inp[n]==1 or inp[n]==3):
        board[n][1]=max(board[n-1][0]+1,board[n-1][2]+1)
    if(inp[n]==2 or inp[n]==3):
        board[n][2] = max(board[n-1][1]+1,board[n-1][0]+1)
m = 0
for i in range(size):
    if(max(board[i])>m):
        m=max(board[i])

#print(board)
print(size-m)
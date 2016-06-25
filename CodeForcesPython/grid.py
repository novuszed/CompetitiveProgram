from sys import argv

def main():
    #opens up the file
    grid = open("grid.txt")
    size = int(grid.readline())
    #initializes the list
    arr = []
    #reads in the file and make the 2D array
    for i in range(0,size):
        arr.append(grid.readline().strip().split(" "))

    #a maximum to see the largest product
    max = 0
    #following code accounts for the maximum product of 4 numbers going from left
    #to right through all the rows
    for j in range (0,size-3):
        for k in range(0,size):

            down=(int(arr[j][k])*int(arr[j+1][k])*int(arr[j+2][k])*int(arr[j+3][k]))
            if(down>=max):
                max=down
    #following code accounts for the maximum product of 4 numbers going from top to bottom
    #through all the columns
    for j in range (0,size):
        for i in range(0,size-3):
            right=(int(arr[j][i])*int(arr[j][i+1])*int(arr[j][i+2])*int(arr[j][i+3]))
            if(right>=max):
                max=right
    #follow code accounts for the maximum diagnal product of 4 numbers both going from top left to bottom right
    #and from top right to bottom left
    for j in range (0,size-3):
        for i in range(0,size-3):
            diag_right=(int(arr[j][i+3])*int(arr[j+1][i+2])*int(arr[j+2][i+1])*int(arr[j+3][i]))
            diag=(int(arr[j][i])*int(arr[j+1][i+1])*int(arr[j+2][i+2])*int(arr[j+3][i+3]))
            if(diag>=max):
                max=diag
            if(diag_right>=max):
                max=diag_right

    print(max)
main()
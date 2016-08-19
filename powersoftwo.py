from sys import stdin
sum = 0
def subset(ind, arr, temparr, finalarr):
    global sum
    if(len(temparr)==2):
        tempsum=temparr[0]+temparr[1]
        if((tempsum&(tempsum-1))==0):
            sum+=1
        #finalarr.append(temparr)
        return
    for i in range(ind,len(arr)):
        temparr.append(arr[i])
        subset(i+1,arr,temparr,finalarr,)
        del temparr[len(temparr)-1]

    return
def main():
    num = int(stdin.readline())
    inp = list(map(int,stdin.readline().split()))
    subsets=()
    subset(0,inp,list(),subsets)
    #print (subsets)
main()
print(sum)








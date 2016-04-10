__author__ = 'zihaozhu'
import sys
def solve(arr, x):
    exponent=1
    sum=0
    if(len(arr)>0):
        sum+=arr[0]
    for i in range(1,len(arr)):
        sum+=arr[i]*(x**exponent)
        exponent+=1
    return sum
def binsearch(arr, answer):
        lo=0
        hi=answer
        while(lo<=hi):
            mid=((lo)+(hi))//2
            if(solve(arr,mid)>answer):
                hi=mid-1
            elif(solve(arr,mid)<answer):
                lo=mid+1
            elif(solve(arr,mid)==answer):
                print(mid)
                return;
        print("N/A")
def main():
    cases=int(input())
    for i in range(0,cases):
        temp=input().split(" ")
        coeff=int(temp[0])
        answer=int(temp[1])
        exponent=0
        temp=input().split(" ")
        arr=list()
        for k in range(0,coeff+1):
            arr.append(int(temp[k]))
        binsearch(arr,answer)


main()
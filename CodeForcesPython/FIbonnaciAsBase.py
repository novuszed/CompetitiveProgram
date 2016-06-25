__author__ = 'zihaozhu'

def main():
    dec_num = eval(input("Enter a number: "))
    f0=0
    f1=1
    sum = 1
    fib = []
    fib.append(0)
    fib.append(1)
    ind = 2
    while sum < dec_num:
        f0 = fib[ind-2]
        f1 = fib[ind-1]
        f2 = f0+f1
        sum = f2
        if(f2 > dec_num):
            break
        else:
            fib.append(f2)
        ind+=1
    print(fib)
    ind = len(fib)-1
    answer = ""
    while(ind>1):
        if (dec_num >= fib[ind]):
            answer=answer+"1"
            dec_num-=fib[ind]
        else:
            answer=answer+"0"
        ind-=1
    print(answer)
main()
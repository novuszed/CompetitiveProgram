__author__ = 'zihaozhu'

PIVOT_FIRST = 1
PIVOT_FINAL = 2
PIVOT_MEDIAN = 3

comparisons = 0


def swap(ar, i, j):
    t = ar[i]
    ar[i] = ar[j]
    ar[j] = t


def is_median(ar, i, j, k):
    '''
    Determines whether ar[i] is a median
    of ar[i], ar[j] and ar[k].
    '''
    return (ar[i] < ar[j] and ar[i] > ar[k]) or\
           (ar[i] > ar[j] and ar[i] < ar[k])


def _quickSort(ar, l, r, pivot):

    global comparisons

    # Base case
    if l >= r:
        return

    # Picking the pivot element
    p = 0
    if pivot == PIVOT_FIRST:
        p = ar[l]
    elif pivot == PIVOT_FINAL:
        p = ar[r]
        swap(ar, l, r)
    elif pivot == PIVOT_MEDIAN:
        m = l + ((r-l) >> 1)
        if is_median(ar, l, m, r):
            p = ar[l]
        elif is_median(ar, m, l, r):
            p = ar[m]
            swap(ar, l, m)
        else:
            p = ar[r]
            swap(ar, l, r)

    # Updating the comparisons counter
    comparisons += (r-l)

    # Partition (see lectures)
    i = l+1
    for j in range(l+1, r+1):
        if ar[j] < p:
            swap(ar, i, j)
            i += 1
    swap(ar, l, i-1)

    # Recursive calls
    _quickSort(ar, l, i-2, pivot)
    _quickSort(ar, i, r, pivot)



def quickSort(ar, pivot):
    '''
    Sorts the array in place using
    the given pivot picking strategy
    (PIVOT_FIRST/PIVOT_FINAL/PIVOT_MEDIAN).

    Expected running time is O(n*log(n)).
    '''
    _quickSort(ar, 0, len(ar)-1, pivot)



def main():

    global comparisons

    #test
    input_array = [1,3,5,2,4,6]
    quickSort(input_array, PIVOT_FIRST)
    print(input_array)

    # Assignment data
    f = open('qs.txt', 'r')
    lst = []

    # (!) Better approach to reading lines than in PA1
    for line in f.readlines():
        lst.append(int(line))


    # Task 1
    input_array = lst[:] # make a copy
    comparisons = 0
    quickSort(input_array, PIVOT_FIRST)
    print(comparisons)

    # Task 2
    input_array = lst[:] # make a copy
    comparisons = 0
    quickSort(input_array, PIVOT_FINAL)
    print(comparisons)

    # Task 3
    input_array = lst[:] # make a copy
    comparisons = 0
    quickSort(input_array, PIVOT_MEDIAN)
    print(comparisons)


if __name__ == '__main__':
    main()

"""
comparison=0
def swap(lst, ind1, ind2):

    t = lst[ind1]
    lst[ind1]=lst[ind2]
    lst[ind2]=t

def partition(lst,l,r):

    pivot = lst[r]
    swap(lst,l,r)
    i = l+1
    for index in range(l+1,r+1):
        if(lst[index]<pivot):
            swap(lst,i,index)
            i+=1
    swap(lst,i-1,l)
    return i-1

def is_median(ar, i, j, k):
    '''
    Determines whether ar[i] is a median
    of ar[i], ar[j] and ar[k].
    '''
    return (ar[i] < ar[j] and ar[i] > ar[k]) or(ar[i] > ar[j] and ar[i] < ar[k])

def quicksort(lst, l, r, pivo):
    global comparison
    if(l>=r):
        return
    pivot=0
    if(pivo=="first"):
        pivot=lst[l]
    elif(pivo=="second"):
        pivot=lst[r]
        swap(lst,l,r)
    elif(pivo=="last"):
        m = l+((r-l)>>1)
        if is_median(lst, l, m, r):
            pivot = lst[l]
        elif is_median(lst, m, l, r):
            pivot = lst[m]
            swap(lst, l, m)
        else:
            pivot = lst[r]
            swap(lst, l, r)

    comparison+=(r-1)


    i = l+1
    for index in range(l+1,r+1):
        if(lst[index]<pivot):
            swap(lst,i,index)
            i+=1
    swap(lst, l, i-1)

    quicksort(lst,l,i-2,pivo)
    quicksort(lst,i,r,pivo)

f = open('qs.txt', 'r')
elements = list()
for line in f:
    elements.append(int(line.strip("\n")))

quicksort(elements,0,len(elements)-1,"last")
print (comparison)

print(elements)
"""
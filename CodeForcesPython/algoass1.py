inversions = 0
file_handle = open("text.txt", "r")
array = []
for line in file_handle:
    array.append(int(line.strip("\r\n")))



def merge(left, right):
    global inversions
    result = []
    i, j = 0, 0
    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            inversions += len(left) - i
            j += 1
            #   print "result of the array before", result
    result += left[i:]
    result += right[j:]
    #   print "result of the array is ", result
    return result


def mergesort(lst):
    if len(lst) <= 1:
        return lst
    middle = int(len(lst) / 2)
    left = mergesort(lst[:middle])
    #   print "left part of the main array after left mergesort is ", left
    right = mergesort(lst[middle:])
    #   print "right part of the main array after right mergesort is ", right
    return merge(left, right)


print(mergesort(array))
print("number of inversions in the array---->", inversions)
"""

count = 0

def merge_sort(li):

    if len(li) < 2: return li
    m = int(len(li) / 2)
    return merge(merge_sort(li[:m]), merge_sort(li[m:]))

def merge(l, r):
    global count
    result = []
    i = j = 0
    while i < len(l) and j < len(r):
        if l[i] < r[j]:
            result.append(l[i])
            i += 1
        else:
            result.append(r[j])
            count = count + (len(l) - i)
            j += 1
    result.extend(l[i:])
    result.extend(r[j:])
    return result
def main():
    testlist=list()
    file = open('text.txt','r')

    for f in file:
        f=f.strip()
        testlist.append(f)
    print(testlist)
    merge_sort(testlist)
    print(count)
main()
"""
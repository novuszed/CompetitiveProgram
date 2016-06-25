__author__ = 'zihaozhu'

def reverseVowels(s):
    ptr1=0
    ptr2=len(s)-1
    stck=list()
    stck2=list()
    answer=list(s)
    vowels=['a','e','i','o','u']

    while(ptr1<=ptr2):
        if(s[ptr1] in vowels and s[ptr2] in vowels):
            answer[ptr1] = s[ptr2]
            answer[ptr2] = s[ptr1]
            ptr1+=1
            ptr2-=1
        elif (s[ptr2] in vowels):
            ptr1+=1
        elif (s[ptr1] in vowels):
            ptr2-=1
        else:
            ptr1+=1
            ptr2-=1
    return "".join(answer)

aaa="leetcode"
print(reverseVowels(aaa))
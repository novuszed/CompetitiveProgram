

def topKFrequent(nums,k):
    answer=dict()
    for i in nums:
        if(i in answer):
            answer[i]=answer[i]+1;
        else:
            answer[i]=1
    #print(answer)
    answer=sorted(answer, key=answer.get, reverse=True)
    #print(answer)
    answer = list(answer)
    #print(sorted(answer[0:k]))
    return(sorted(answer[0:k]))

nums=[4,1,-1,2,-1,2,3]
k=2
topKFrequent(nums,k)
#py
def TwoSum(array, target):
    for i in range(len(array)):
        difference = target - array[i]
        for x in range(i+1,len(array)):
            if difference == array[x]:
                return (i,x)



print(TwoSum([1,2,10,3,7,4],12))

list = []
 
# number of elements as input
n = int(input("Enter number of elements : "))
 
# iterating till the range
for i in range(0, n):
    ele = int(input())
    # adding the element
    list.append(ele) 

    print(list)
 #Sum Calculation   
print("sum of list: ",sum(list))
    
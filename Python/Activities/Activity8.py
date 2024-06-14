#numbers = [1,2,3,4,5,1]
#print("Given numbers are", numbers) 

lst = []
 
# number of elements as input
n = int(input("Enter number of elements : "))
 
# iterating till the range
for i in range(0, n):
    ele = int(input())
    # adding the element
    lst.append(ele) 

    print(lst)

#1st Element
firstnumber=lst[0]
print("First number is", lst[0])
#last Element
lastnumber=lst[-1]
print("Last number is", lst[-1])

#Validation
if(firstnumber==lastnumber):
    print("True")
else:
    print("False")
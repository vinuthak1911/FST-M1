lst = []
 
# number of elements as input
n = int(input("Enter number of elements : "))
 
# iterating till the range
for i in range(0, n):
    ele = int(input())
    # adding the element
    lst.append(ele) 
    tuplelst=lst
    print("Tuple list is:", tuplelst)

# empty list
dbyfive = []

for n in tuplelst:
    if (n%5==0):
        dbyfive.append(n)

print ("Numbers divisible by 5 are", dbyfive)

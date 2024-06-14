
#2 lists
list1 = [1,2,3,4,5,1]
print ("List 1 is", list1)
list2 = [10,43,23,70]
print ("List 2 is", list2)
#List 3
list3 = []
#Odd nums from list1
for n in list1:
    if (n%2>0):
        list3.append(n)
#even nums from list2
for n in list2:
    if (n%2==0):
        list3.append(n)
#print list3
print ("List 3 is", list3)
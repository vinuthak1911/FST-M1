
fruit_shop = {
    "apple": 240,
    "orange": 350,
}
print("Fruit List is: ",fruit_shop)

	
check = input("Certain Fruit available or no? ").lower()
 
if(check in fruit_shop):
    print("Fruit available")
else:
    print("Fruit not available")
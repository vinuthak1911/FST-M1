# Write a Python program to create the multiplication table (from 1 to 10) of a number.

number = int( input( "Enter a num: " ) )
for m in range (1,11):
    print(number, ' x ', m, ' = ', number*m)
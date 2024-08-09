# Define function to calculate sum
def sum(n):
  if n:
    return n+sum(n-1)
  else:
    return 0
#Call sum function
result = sum(10)
print(result)



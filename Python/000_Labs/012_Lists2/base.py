numbers = int(input("How many random numbers would you like? "))
import random
thislist=[]
for i in range(0,numbers):
    thislist.append(random.randrange(1,10))
print("Your numbers are: " + str(thislist))
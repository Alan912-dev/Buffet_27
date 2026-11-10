x = int(input("Please enter a number: "))
sum = 0
for count in range(1,x):
    print(count, end="+")
    sum = sum + count
print(x)
sum = sum + x
print("The sum is " + str(sum))
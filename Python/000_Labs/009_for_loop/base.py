x = int(input("Please enter line length: "))
x2 = input("Do you want a horizontal or vertical line? ")
num1 = "*"
if x2 == "vertical":
    for x in range(0,x):
        print(num1)
elif x2 == "horizontal":
    for x in range(0,x):
        print(num1, end=", ")
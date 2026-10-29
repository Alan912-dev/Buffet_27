num1 = int(input("Please enter a number: "))
num2 = input("Please enter an operation: ")
num3 = int(input("Please enter another number: "))
if num2 == "-":
    num4 = num1 - num3
    print(str(num1) + "-" + str(num3) + "=" + str(num4))
elif num2 == "+":
    num4 = num1 + num3
    print(str(num1) + "+" + str(num3) + "=" + str(num4))
elif num2 == "*":
    num4 = num1 * num3
    print(str(num1) + "*" + str(num3) + "=" + str(num4))
elif num2 == "/":
    num4 = num1 / num3
    print(str(num1) + "/" + str(num3) + "=" + str(num4))
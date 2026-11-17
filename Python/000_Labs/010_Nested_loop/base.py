s = input("What symbol would you like to use? ")
w = int(input("What's the width of your box? "))
h = int(input("What's the height of your box? "))
start = 0
count = 0
for start in range(1,h+1):
    for count in range(1,w):
        print(s, end=", ")
    print(s)
    
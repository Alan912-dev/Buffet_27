import requests
joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit").json()
joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()

# Jokes with 1 part just have a joke
# joke["joke"] -> References the String of the joke itself

# Jokes with 2 parts have a set up and delivery
# joke["setup"] -> References the String of the setup of the joke
# joke["delivery"] -> References the String of the delivery part of the joke
num = int(input("How many jokes would you like?"))
type = input("Single jokes or two part jokes? (single/double)")

if type == "single":
    for count in range(0,num):
        joke = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit").json()
        print(joke["joke"])
elif type == "double":
    for count in range(0,num):
        joke2Part = requests.get("https://v2.jokeapi.dev/joke/Any?blacklistFlags=nsfw,religious,political,racist,sexist,explicit&type=twopart").json()
        print(joke2Part["setup"])
        print(joke2Part["delivery"])
else:
    print("You didn't pick single or double.")
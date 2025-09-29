# while loop in Python is used to execute a block of code repeatedly as long as a given condition is true.
# Syntax:
# while condition:
#     # code block to be executed

count = 0
n = int(input("Enter the value of n: "))
while (count < n):
    count = count + 1
    print("Welcome to the world of Python")

i = 1
while i <= 5:
    print("Welcome to the world of Python")
    i += 1

while True:
    msg = input("Type 'exit' to exit: ")
    if msg == 'exit':
        break
    print("You typed:", msg)

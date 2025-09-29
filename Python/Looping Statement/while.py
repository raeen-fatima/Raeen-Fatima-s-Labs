# while loop in Python is used to execute a block of code repeatedly as long as a given condition is true.
# Syntax:
# while condition:
#     # code block to be executed
# example 1
count = 0
n = int(input("Enter the value of n: "))
while (count < n):
    count = count + 1
    print("Welcome to the world of Python")
# example 2
i = 1
while i <= 5:
    print("Welcome to the world of Python")
    i += 1
# example 3
while True:
    msg = input("Type 'exit' to exit: ")
    if msg == 'exit':
        break
    print("You typed:", msg)
    
# example 4
a = [1, 2, 3, 4, 5]
while a:
    print(a.pop())  # This will print the elements of the list in reverse order until the list is empty 

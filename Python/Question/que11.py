# Write a Python program to find the smallest of two numbers using if-else statement.
# x = 20
x = int(input("Enter the value of x: "))
y = int(input("Enter the value of y: "))
if (x < y):
    print(x," is smaller than ",y)
    print("I am in if Block")
else:
    print(x," is greater than or equal to ",y)
    print("I am in else Block")
print("welcome to Python")
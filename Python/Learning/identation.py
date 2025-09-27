# Indentation is crucial in Python as it defines the structure and flow of the code.
if True:
    print("This is indented")
print("This is not indented")
# Output:
# This is indented
# This is not indented
# Indentation is used to define blocks of code, such as the body of functions, loops, and conditionals.
x = 10
if x > 5:
    print("x is greater than 5")  # This line is indented and is part of the if block.
    if x > 8:
        print("x is also greater than 8")  # This line is further indented and is part of the nested if block.
else:
    print("x is not greater than 5")  # This line is indented and is part of the else block.
# Output:
# x is greater than 5
# x is also greater than 8
# Consistent indentation is important. Python typically uses 4 spaces per indentation level.
for i in range(3):
    print("Iteration", i)  # This line is indented and is part of the for loop.
    if i % 2 == 0:
        print(i, "is even")  # This line is further indented and is part of the if block.
    else:
        print(i, "is odd")  # This line is indented and is part of the else block.
# Output:
# Iteration 0
# 0 is even
# Iteration 1
# 1 is odd
# Iteration 2
# 2 is even

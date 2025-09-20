x = 5
y = 10
z = x + y
print(z)  # Output: 15
# z is always 15 when x is 5 and y is 10, demonstrating referential transparency.
# Referential transparency means that an expression can be replaced with its corresponding value without changing the program's behavior.
print(10 + 3)  # Output: 13
# Here, the expression 12 + 3 can be replaced with 15 without affecting the program's behavior.
def add(a, b):
    return a + b
print(add(2, 8))  # Output: 10
# The function call add(2, 8) can be replaced with 10, maintaining referential transparency.
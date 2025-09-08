# //Pure Function: Square of a number

def square(n):
    return n * n
print(square(5))  # Output: 25
print(square(10)) # Output: 100

# Recursion: Fibonacci 
def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n-1) + fibonacci(n-2)
# Print first 6 Fibonacci numbers
for i in range(6):
    print(fibonacci(i), end=' ')  # Output: 0 1 1 2 3 5

# Referential Transparency
x=5
y= x + 10
print(y)  # Output: 15
#  if we replace x with 5
print(5 + 10)  # Output: 15
# The expression x + 10 is referentially transparent because it can be replaced with its value (15) without changing the program's behavior.

# Higher-order Function

def apply_to_list(func, numbers):
    return [func(n) for n in numbers]
nums = [1, 2, 3, 4, 5]
result = apply_to_list(lambda x: x * x, nums)
print(result)  # Output: [1, 4, 9, 16, 25]

# Lambda + Map + Filter
numbers = [1, 2, 3, 4, 5, 6]

# Square all even numbers
even_squares = list(map(lambda x: x * x, filter(lambda x: x % 2 == 0, numbers)))
print(even_squares)  # Output: [4, 16, 36]

# Numbers greater than 10
greater_than_ten = list(filter(lambda x: x > 10, map(lambda x: x * 3, numbers)))
print(greater_than_ten)  # Output: [12, 15, 18


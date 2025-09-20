def factorial(n):
    if n == 0:
        return 1
    return n * factorial(n - 1)

print(factorial(5))  # 120
# Output: 120
# This is a simple example of a recursive function to calculate the factorial of a number.
# A factorial of a non-negative integer n is the product of all positive integers less than or equal to n.
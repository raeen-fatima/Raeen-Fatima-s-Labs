# Associativity of Operators
# In Python, the associativity of operators determines the order in which operators of the same precedence are evaluated.
# Most operators in Python are left-associative, meaning they are evaluated from left to right.
# For example:
result = 10 - 2 + 3  # Here, 10 - 2 is evaluated first, then + 3.
# Output:
# 11
print(result)  # Output: 11
# However, some operators are right-associative, meaning they are evaluated from right to left.
# The exponentiation operator (**) is an example of a right-associative operator.
result = 2 ** 3 ** 2  # Here, 3 ** 2 is evaluated first, then 2 ** 9.
# Output:
# 512
print(result)  # Output: 512
# Understanding operator associativity is important for writing correct expressions.
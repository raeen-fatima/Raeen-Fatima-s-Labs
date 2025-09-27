# Precedence of Operators
# In Python, operators have a specific precedence that determines the order in which they are evaluated.
# For example, multiplication has a higher precedence than addition.
result = 3 + 4 * 5  # Here, 4 * 5 is evaluated first.
# Output:
# 23
# Parentheses can be used to change the order of evaluation.
result = (3 + 4) * 5  # Here, 3 + 4 is evaluated first.
# Output:
# 35
# Understanding operator precedence is important for writing correct expressions.
print(result)  # Output: 35
# Here is a list of some common operators in order of precedence (from highest to lowest):
# 1. Parentheses: ()
# 2. Exponentiation: **
# 3. Multiplication, Division, Floor Division, Modulus: *, /, //, %
# 4. Addition, Subtraction: +, -, 
# 5. Bitwise Shift Operators: <<, >>, 
# 6. Bitwise AND: &         
# 7. Bitwise XOR: ^        
# 8. Bitwise OR: |
# 9. Comparison Operators: ==, !=, >, <, >=, <=
# 10. Assignment Operators: =, +=, -=, *=, /=, //=, %=, **=
# 11. Logical NOT: not
# 12. Logical AND: and
# 13. Logical OR: or
# Operators with the same precedence are evaluated from left to right.
# For example:
result = 10 - 2 + 3  # Here, 10 - 2 is evaluated first, then + 3.
# Output:
# 11
print(result)  # Output: 11
# It's a good practice to use parentheses to make the order of operations explicit, especially in complex expressions.
complex_result = (3 + 5) * (2 ** 3) / (4 - 1)
# Output:
# 21.333333333333332
print(complex_result)  # Output: 21.333333333333332
# In summary, understanding operator precedence helps in writing clear and correct expressions in Python.
# This knowledge is essential for both beginners and experienced programmers to avoid logical errors in their code.
# Bitwise AND operation example
bitwise_result_and = 7 & 8  # 7 AND 8 = 0
print(bitwise_result_and)  # Output: 0  # Bitwise AND
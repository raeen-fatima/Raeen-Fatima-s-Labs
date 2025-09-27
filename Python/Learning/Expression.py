# Expressions are combinations of values, variables, operators, and calls to functions.
# They are used to perform operations and produce new values.
# Expressions can be as simple as a single value or variable, or they can be more complex, involving multiple values and operators.
# Here are some examples of expressions:
x = 5
y = 10
z = x + y  # This is an expression that adds two variables.
print(z)  # Output: 15  

# constant expression
a = 3.14  # This is a constant expression representing the value of pi.
print(a)  # Output: 3.14

# string expression
greeting = "Hello, " + "world!"  # This is an expression that concatenates two strings.
print(greeting)  # Output: Hello, world!
# function call expression
length = len(greeting)  # This is an expression that calls the len() function to get the length of the string.
print(length)  # Output: 13

# complex expression
result = (x * 2) + (y / 2) - (a ** 2)  # This is a more complex expression involving multiple operations.
print(result)  # Output: 10.86      

# Expressions can also include comparisons and logical operations:
is_greater = x > y  # This is an expression that compares two values.
print(is_greater)  # Output: False

is_equal = (x + 5) == y  # This is an expression that checks for equality.
print(is_equal)  # Output: True
is_valid = (x < y) and (y < 20)  # This is an expression that uses logical operators.
print(is_valid)  # Output: True
is_invalid = (x > y) or (y > 20)  # This is another expression using logical operators.
print(is_invalid)  # Output: False

# arithmetic expression

arithmetic_result = (x + y) * (a - 1) / 2  # This is an arithmetic expression.
print(arithmetic_result)  # Output: 11.07   

# integer expression
int_result = x + y
print(int_result)  # Output: 15

# float expression
float_result = a * 2
print(float_result)  # Output: 6.28

# relational expression
relational_result = x < y
print(relational_result)  # Output: True    

# logical expression

logical_result = (x < y) and (y < 20)
print(logical_result)  # Output: True

# bitwise expression
bitwise_result = x & y  # Bitwise AND operation
print(bitwise_result)  # Output: 0
bitwise_result_or = x | y  # Bitwise OR operation
print(bitwise_result_or)  # Output: 15
bitwise_result_xor = x ^ y  # Bitwise XOR operation
print(bitwise_result_xor)  # Output: 15
bitwise_result_not = ~x  # Bitwise NOT operation
print(bitwise_result_not)  # Output: -6

# combined expression
combined_result = ((x + y) * 2) / (a - 1) > 10 and (y < 20)
print(combined_result)  # Output: True  

# In summary, expressions are fundamental building blocks in Python that allow you to perform calculations, manipulate data, and make decisions based on conditions.
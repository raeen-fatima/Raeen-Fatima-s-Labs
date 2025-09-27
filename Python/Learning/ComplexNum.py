# Program to demonstrate complex numbers in Python
# A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers, and i is the imaginary unit, which satisfies the equation i² = -1.
# In Python, complex numbers are represented by the built-in complex type.

# Creating complex numbers
a = 10
print("Type of a:", type(a))

b = 4.5
print("Type of b:", type(b))

# Complex number =>  real + imaginary*j part
c = 3 + 5j
print("\nType of c:", type(c))
#  Output:
# Type of a: <class 'int'>
# Type of b: <class 'float'>

# Type of c: <class 'complex'>

# Accessing real and imaginary parts
print("\nReal part of c:", c.real)
print("Imaginary part of c:", c.imag)

# Output:
# Real part of c: 3.0
# Imaginary part of c: 5.0  
# Note: In Python, the imaginary unit is represented by 'j' or 'J' instead of 'i'.


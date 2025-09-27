# tuples is an ordered collection of python objects similar to list. The only difference is that tuples are immutable, meaning that once a tuple is created, its elements cannot be changed, added, or removed. Tuples are defined by enclosing the elements in parentheses ().tuples can contain elements of different data types, including integers, strings, and even other tuples.

# Creating a tuple
my_tuple = (1, 2, 3, "hello", (4, 5))
print("Original Tuple:", my_tuple)
# Accessing elements in a tuple
print("First Element:", my_tuple[0])
print("Last Element:", my_tuple[-1])
# Slicing a tuple
print("Sliced Tuple:", my_tuple[1:4])
# Tuples are immutable, so the following line would raise an error if uncommented
# my_tuple[0] = 10  # This will raise a TypeError
# However, you can concatenate tuples to create a new tuple
new_tuple = my_tuple + (6, 7, 8)
print("Concatenated Tuple:", new_tuple)
# You can also repeat tuples
repeated_tuple = my_tuple * 2
print("Repeated Tuple:", repeated_tuple)
# Tuple methods
print("Count of 2 in Tuple:", my_tuple.count(2))
print("Index of 'hello' in Tuple:", my_tuple.index("hello"))
# Length of the tuple
print("Length of Tuple:", len(my_tuple))
# Iterating through a tuple
for item in my_tuple:
    print("Tuple Item:", item)
# Checking membership
print("Is 3 in Tuple?", 3 in my_tuple)
print("Is 10 in Tuple?", 10 in my_tuple)
# Unpacking a tuple
a, b, c, d, e = my_tuple
print("Unpacked Values:", a, b, c, d, e)
# Nested tuples
nested_tuple = (1, 2, (3, 4), (5, 6))
print("Nested Tuple:", nested_tuple)
print("Element from Nested Tuple:", nested_tuple[2][1])  # Accessing element 4 from nested tuple
# Tuple with single element (note the comma)
single_element_tuple = (42,)
print("Single Element Tuple:", single_element_tuple)
print("Type of Single Element Tuple:", type(single_element_tuple))
# Converting a list to a tuple
my_list = [1, 2, 3, 4]
converted_tuple = tuple(my_list)
print("Converted Tuple from List:", converted_tuple)

# output:
# Original Tuple: (1, 2, 3, 'hello', (4, 5))
# First Element: 1
# Last Element: (4, 5)
# Sliced Tuple: (2, 3, 'hello')
# Concatenated Tuple: (1, 2, 3, 'hello', (4, 5), 6, 7, 8)
# Repeated Tuple: (1, 2, 3, 'hello', (4, 5), 1, 2, 3, 'hello', (4, 5))
# Count of 2 in Tuple: 1
# Index of 'hello' in Tuple: 3
# Length of Tuple: 5
# Tuple Item: 1
# Tuple Item: 2
# Tuple Item: 3
# Tuple Item: hello
# Tuple Item: (4, 5)
# Is 3 in Tuple? True
# Is 10 in Tuple? False
# Unpacked Values: 1 2 3 hello (4, 5)
# Nested Tuple: (1, 2, (3, 4), (5, 6))
# Element from Nested Tuple: 4
# Single Element Tuple: (42,)
# Type of Single Element Tuple: <class 'tuple'>
# Converted Tuple from List: (1, 2, 3, 4)   
# Note: Tuples are often used to group related data together and can be used as keys in dictionaries due to their immutability.
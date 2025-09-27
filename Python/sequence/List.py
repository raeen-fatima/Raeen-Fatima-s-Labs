""" In python, lists are mutable, meaning that they can be changed after they are created.
This means that we can modify, add, or remove elements from a list after it has been created.
For example, we can change the value of an element in a list by accessing it using its index and assigning a new value.
We can also use methods like append(), extend(), and remove() to modify a list.
"""

''' Creating a list'''
List = []
print("\nEmpty list: ", List)
List = [1, 2, 3, 4, 5]
print("\nList with integers: ", List)
List = ['Hello', 'World', 1, 2, 3, 4, 5]
print("\nList with mixed data types: ", List)
List = ["Welcome to the python world"]
print("\nList with a single string: ", List)
List = ["welcome", "to", "the", "python", "world"]
print("\nList with multiple strings: ", List)
print(List[0])  # Accessing the first element of the list
print(List[1])  # Accessing the second element of the list
print(List[2])  # Accessing the third element of the list
List = [['Python', 'Java', 'C++'], ['HTML', 'CSS', 'JavaScript']]
print("\nMulti-dimensional list: ", List)
print(List[0])  # Accessing the first element of the multi-dimensional list
print(List[1])  # Accessing the second element of the multi-dimensional list

# Accessing elements of the inner lists
print(List[0][0])  # Accessing the first element of the first inner list
print(List[0][1])  # Accessing the second element of the first inner list
print(List[0][2])  # Accessing the third element of the first inner list
print(List[1][0])  # Accessing the first element of the second inner list
print(List[1][1])  # Accessing the second element of the second inner list
print(List[1][2])  # Accessing the third element of the second inner list   

# Output:
# Empty list:  []
# List with integers:  [1, 2, 3, 4, 5]
# List with mixed data types:  ['Hello', 'World', 1, 2, 3, 4, 5]
# List with a single string:  ['Welcome to the python world']
# List with multiple strings:  ['welcome', 'to', 'the', 'python', 'world']
# welcome
# to
# the
# Multi-dimensional list:  [['Python', 'Java', 'C++'], ['HTML', 'CSS', 'JavaScript']]
# ['Python', 'Java', 'C++']
# ['HTML', 'CSS', 'JavaScript']
# Python
# Java
# C++
# HTML
# CSS
# JavaScript
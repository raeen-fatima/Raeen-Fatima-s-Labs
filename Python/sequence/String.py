# In python , strings are arrays of bytes representing unicode characters.
# However, Python does not have a character data type, a single character is simply a string with a length of 1.
# Square brackets can be used to access elements of the string.
# in python, strings are immutable, meaning that they cannot be changed after they are created.
# single quotes and double quotes and triple quotes can be used to represent strings in python.
# Triple quotes are used to represent multi-line strings. 

string1  = 'Welcome to the python world'
print("String when we use single quotes: ", string1)
print("type of string1 is: ", type(string1))

string2 ="Welcome to the pyhton"
print("String when we use double quotes: " , string2)
print("type of string2 is: ", type(string2))

string3 = '''this is a multi-line string. '''
print("String when we use triple quotes: ", string3)
print("type of string3 is : " ,type(string3))

multi_string = '''this is a multi-line string.
                      it can extend multiple lines.
                      this is the third line of the string.
                      this is the fourth line of the string.'''
                      
print("multi -line string is:", multi_string)
print("type of multi_line_string is: ", type(multi_string))

# Output:
# String when we use single quotes:  Welcome to the python world
# type of string1 is:  <class 'str'>
# String when we use double quotes:  Welcome to the pyhton
# type of string2 is:  <class 'str'>
# String when we use triple quotes:  this is a multi-line string.
# type of string3 is :  <class 'str'>
# multi -line string is: this is a multi-line string.
#                       it can extend multiple lines.
#                       this is the third line of the string.
#                       this is the fourth line of the string.
# type of multi_line_string is:  <class 'str'>
# Note: In python, strings are immutable, meaning that they cannot be changed after they are created.
# For example, the following code will raise an error:
# string1[0] = 'w' # This will raise an error
# TypeError: 'str' object does not support item assignment
# However, we can create a new string by concatenating or slicing the existing string.
string1 = 'w' + string1[1:]
print("Modified string1 is: ", string1)
# Output:
# Modified string1 is:  welcome to the python world
# Note: Strings in python are immutable, meaning that they cannot be changed after they are created.
# However, we can create a new string by concatenating or slicing the existing string.

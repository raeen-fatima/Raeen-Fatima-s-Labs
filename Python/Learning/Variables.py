# A variable is simply a name for value.
# A variable is assigned a value using the assignment statement.
# The assignment statement consists of a variable name, an equal sign (=), and a value.
# The value can be of any data type, including numbers, strings, lists, tuples,
# dictionaries, and even functions. 
# The variable name must start with a letter or an underscore (_), followed by letters, digits, or underscores.
# Variable names are case-sensitive, meaning that 'myVar' and 'myvar' are different variables.
# You can assign a value to a variable using the assignment operator (=).

message = "Hello, World!"
print(message)  # Output: Hello, World!
x = 10
y = 20
sum = x + y
print(sum)  # Output: 30
# You can also assign the same value to multiple variables in a single line.
a = b = c = 5
print(a, b, c)  # Output: 5 5 5
# You can also assign different values to multiple variables in a single line.
p, q, r = 1, 2, 3
print(p, q, r)  # Output: 1 2 3
# You can change the value of a variable by reassigning it to a new value.
message = "Hello, Python!"
print(message)  # Output: Hello, Python!
# You can delete a variable using the del statement.
del message
print(message)  # This will raise a NameError because the variable 'message' has been deleted.
# You can use the type() function to check the data type of a variable.
print(type(x))  # Output: <class 'int'>
print(type(message))  # Output: <class 'str'>
# You can use the id() function to check the memory address of a variable.
print(id(x))  # Output: Memory address of the variable 'x'
print(id(y))  # Output: Memory address of the variable 'y'
# You can use the isinstance() function to check if a variable is of a specific data type.
print(isinstance(x, int))  # Output: True
print(isinstance(message, str))  # Output: False (because 'message' has been deleted)
# You can use the globals() function to get a dictionary of all global variables.
print(globals())  # Output: Dictionary of all global variables
# You can use the locals() function to get a dictionary of all local variables.
def my_function():
    local_var = 10
    print(locals())  # Output: Dictionary of all local variables
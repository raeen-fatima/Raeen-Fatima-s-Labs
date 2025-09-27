# Statements are instructions that perform an action.
# They do not produce a value like expressions do.
# Here are some examples of statements:

# assignment statement
x = 5  # This is an assignment statement that assigns the value 5 to the variable x.
print(x)  # Output: 5   

# print statement
print("Hello, world!")  # This is a print statement that outputs text to the console.
# Output: Hello, world!
# conditional statement
if x > 0:  # This is a conditional statement that checks if x is greater than 0.
    print("x is positive")  # Output: x is positive
    print("This will only print if x is positive.") 
else:
    print("x is not positive")  # Output: x is not positive
    print("This will only print if x is not positive.")
# loop statement
for i in range(5):  # This is a loop statement that iterates over a range of numbers.
    print(i)  # Output: 0 1 2 3 4 (each number on a new line)
# function definition statement
def greet(name):  # This is a function definition statement that defines a function named greet.
    print("Hello, " + name + "!")  # This function prints a greeting message.
greet("Alice")  # This calls the greet function with the argument "Alice".
# Output: Hello, Alice!

# Bitwise OR operation example
bitwise_result_or = 7 | 8  # 7 OR 8 = 15
print(bitwise_result_or)  # Output: 15  # Bitwise OR operation result

# Statements can also include control flow statements like break and continue:
for i in range(10):
    if i == 5:
        break  # This statement exits the loop when i equals 5.
    print(i)  # Output: 0 1 2 3 4 (each number on a new line)
for i in range(10):
    if i % 2 == 0:
        continue  # This statement skips the rest of the loop body for even numbers.
    print(i)  # Output: 1 3 5 7 9 (each number on a new line)
# Statements can also include import statements to include modules:
import math  # This is an import statement that imports the math module.
print(math.sqrt(16))  # Output: 4.0 (using the sqrt function from the math module)  # Output: 15  # Bitwise OR operation result 

# declare using continuation character

total = 1 + 2 + 3 + \
        4 + 5 + 6
print(total)  # Output: 21  

# declare using parentheses
total_paren = (1 + 2 + 3 +
               4 + 5 + 6)
print(total_paren)  # Output: 21

# declare using brackets
my_list = [1, 2, 3,
           4, 5, 6]
print(my_list)  # Output: [1, 2, 3, 4, 5, 6]  # Output: 15  # Bitwise OR operation result

# declare using braces
my_dict = {'one': 1,
           'two': 2,
           'three': 3}
print(my_dict)  # Output: {'one': 1, 'two': 2, 'three': 3}

# declare using multiline string
multiline_string = """This is a
multiline string
that spans multiple lines."""
print(multiline_string)
# Output:
# This is a
# multiline string
# that spans multiple lines.
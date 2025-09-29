# for loop in Python is used to iterate over a sequence (like a list, tuple, or string) or other iterable objects.
# Syntax:
# for variable in iterable:

#     # code block to be executed
fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print(fruit)
    
# example 2
for i in range (1,6):
    print(i)
# example 3

sum = 0
for x in [1, 2, 3, 4, 5]:
    sum += x
print("The sum is:", sum)

# example 4
product = 1
for x in [1, 2, 3, 4, 5]:
    product *= x
print("The product is:", product)

# example 5
num = int(input("Enter a number: "))
for i in range(1, 11):
    print(num, 'x', i, '=', num * i)
    
# example 6
word = input("Enter a word: ")
for letter in word:
    print(letter)
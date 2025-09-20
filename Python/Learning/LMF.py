#  Lambda + Map + Filter
numbers = [1, 2, 3, 4, 5, 12, 15]

# Square all even numbers
even_squares = list(map(lambda x: x * x, filter(lambda x: x % 2 == 0, numbers)))
print(even_squares)  # [4, 16, 144]

# Numbers greater than 10
greater_than_10 = list(filter(lambda x: x > 10, numbers))
print(greater_than_10)  # [12, 15]
# Sum of all numbers
total_sum = sum(numbers)
print(total_sum)  # 54

# Maximum number
max_number = max(numbers)
print(max_number)  # 15     

# here we are using lambda functions to create small anonymous functions for squaring numbers and filtering conditions.
# The map function applies a given function to all items in an input list (or any iterable) and returns a map object (which is an iterator).
# The filter function constructs an iterator from elements of an iterable for which a function returns true.
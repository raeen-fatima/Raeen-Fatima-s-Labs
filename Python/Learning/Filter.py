
# ✅ Filter (select items conditionally)
numbers = [1, 2, 3, 4, 5, 6]
even_numbers = list(filter(lambda x: x % 2 == 0, numbers))
print(even_numbers)
# Output: [2, 4, 6]

# The filter function constructs an iterator from elements of an iterable for which a function returns true.
# In this example, we use a lambda function to select only even numbers from the list.
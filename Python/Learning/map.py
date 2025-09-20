
# ✅ Map (apply function on all items)
numbers = [1, 2, 3, 4, 5]
squares = list(map(lambda x: x * x, numbers))
print(squares)
# Output: [1, 4, 9, 16, 25]

# The map function applies a given function to all items in an input list (or any iterable) and returns a map object (which is an iterator).
# In this example, we use a lambda function to square each number in the list.
# We then convert the map object to a list to see the results.
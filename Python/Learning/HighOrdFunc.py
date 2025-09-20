# Higher-Order Function
def square(x):
    return x * x
def apply(func, value):
    return func(value)
result = apply(square, 5)
print(f"The result of applying the function is: {result}")
# Output: The result of applying the function is: 25

# In Python, functions are first-class citizens.
# This means you can pass functions as arguments to other functions,
# return them from other functions, and assign them to variables.

def apply_to_list(func, numbers):
    return [func(x) for x in numbers]

nums = [1, 2, 3, 4, 5]
result = apply_to_list(lambda x: x * x, nums)
print(result)  # [1, 4, 9, 16, 25]
# Here, apply_to_list is a higher-order function because it takes another function (func) as an argument.
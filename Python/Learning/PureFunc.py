def pure_function_example(x, y):
    """A simple pure function that adds two numbers."""
    return x + y   
result = pure_function_example(3, 5)
print(f"The result of the pure function is: {result}") 

# Output: The result of the pure function is: 8
# pure_function_example is a pure function because:
# 1. It always produces the same output for the same inputs.
# 2. It has no side effects (it does not modify any external state).

def square(x):
    return x * x
print(square(5)) # => 25
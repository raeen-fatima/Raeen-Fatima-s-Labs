def fibonacci(n):
    """Return the nth Fibonacci number."""
    if n <= 1:
       return n
    return fibonacci(n-1) + fibonacci(n-2)
for i in range(10):
    print(fibonacci(i))

# Output the first 10 Fibonacci numbers


# In Python, we normally use for or while loops.
# In functional style, the function calls itself — that's called recursion.
# This is a simple example of a recursive function.

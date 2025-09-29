# Nested for loop example in Python
# A nested for loop is a loop inside another loop. The inner loop will be executed one time for each iteration of the outer loop.
# Syntax:
# for variable1 in iterable1:
#     for variable2 in iterable2:
#         # code block to be executed

for i in range(1,5):
    for j in range(i):
        print(i, end=' ')
    print()  # for new line after inner loop
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
    
# example 2: printing a pattern
rows = 4
cols = 5
for i in range(rows):
    for j in range(cols):
        print('*', end=' ')
    print()  # for new line after inner loop
    
# example 3: multiplication table
for i in range(1, 6):
    for j in range(1, 6):
        print(f"{i} x {j} = {i*j}", end='\t')
    print()  # for new line after inner loop
# example 4: right-angled triangle pattern
n = 5
for i in range(1, n + 1):
    for j in range(i):
        print('*', end='')
    print()  # for new line after inner loop
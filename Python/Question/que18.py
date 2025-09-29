# break statement is used to exit a loop prematurely when a certain condition is met.
# It can be used in both for and while loops.
# When the break statement is encountered, the loop is terminated immediately, and the program continues with the next statement after the loop.
# Example 1: Using break in a while loop
s = 'welcome to the world of python'
#using for loop
for char in s:
    if char == 'o':
        break
    print(char, end=' ')
print()
# Example 2: Using break in a for loop
for i in range(1, 10):
    if i == 5:
        break
    print(i, end=' ')
print()
# Example 3: Using break in a nested loop
for i in range(1, 4):
    for j in range(1, 4):
        if j == 2:
            break
        print(f"i = {i}, j = {j}")
    print()  # for new line after inner loop
# Example 4: Using break to exit an infinite loop
count = 0
while True:
    print("Count:", count)
    count += 1
    if count >= 5:
        break 
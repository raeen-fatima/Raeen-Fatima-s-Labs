# write a function that takes a list and returns the sum of all the elements in the list

def sum(numbers):
    total = 0
    for i in  numbers:
        total += i
    return total

print(sum([int(x) for x in input("Enter numbers separated by space: ").split()]))
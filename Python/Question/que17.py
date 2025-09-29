# program to illustrate the use of break statement in a for loop
names = ["Alice", "Bob", "Charlie", "David", "Eve"]
search = input("Enter a name to search: ")
for name in names:
    if name == search:
        print(f"{search} found in the list!")
        break
else:
    print(f"{search} is not found in the list.")
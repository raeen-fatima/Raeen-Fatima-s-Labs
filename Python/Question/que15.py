print("List Iteration")
list1 = ['welcome', 'to', 'the', 'world', 'of', 'python']
for i in list1:
    print(i)

print("\nTuple Iteration")
tuple1 = ('welcome', 'to', 'the', 'world', 'of', 'python')
for i in tuple1:
    print(i)

print("\nString Iteration")
string = "welcome"
for i in string:
    print(i)

print("\nDictionary Iteration")
dict1 = {'name': 'John', 'age': 25, 'city': 'New York'}
for i in dict1:
    print(i)  # prints the keys

print("\nDictionary Iteration with items()")
d = {'mno': 123, 'abc': 345, 'xyz': 567}
for key, value in d.items():
    print(f"{key} {value}")

print("\nSet Iteration")
set1 = {'apple', 'banana', 'cherry'}
for i in set1:
    print(i)
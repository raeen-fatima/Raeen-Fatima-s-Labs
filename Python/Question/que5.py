# Ask the user for a number. Use a loop to find and print all numbers from 1 to that number which divide it perfectly (i.e., remainder is 0).
num = int(input("Enter Number: "))
print(f"Numbers that divide {num} perfectly are: ", end="")

for i in range(1, num + 1):
    if num % i == 0:
        print(i, end=", ")

print("\b\b ")  # Remove the last comma and space

count = 0
for i in range(1, num + 1):
    if num % i == 0:
        count += 1
print(f"\nTotal count of numbers that divide {num} perfectly is: {count}")

# Output => Enter Number: 20
# Numbers that divide 20 perfectly are: 1,2,4,5,10,20
# Total count of numbers that divide 20 perfectly is: 6

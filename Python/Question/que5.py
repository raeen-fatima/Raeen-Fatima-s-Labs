# Ask the user for a number. Use a loop to find and print all numbers from 1 to that number which divide it perfectly (i.e., remainder is 0).

num = int(input("Enter NUmber: "))
print(f"Numbers that divide {num} perfectly are: ")
for i in range(1, num + 1):
    if num % i == 0:
        print(i)
        
'''Enter NUmber: 20
Numbers that divide 20 perfectly are: 
1
2
4
5
10
20'''

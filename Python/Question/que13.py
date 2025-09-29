#Print a square of numbers from 1 to n
n = int(input("Enter the number of rows: "))
for i in range( n ):
    for j in range( n ):
        print("*", end=' ')
    print()  # for new line after inner loop
    
#printing a pattern
for i in range(1 , 4):
    for j in range(i):
        print(i, end=' ')
    print()  # for new line after inner loop
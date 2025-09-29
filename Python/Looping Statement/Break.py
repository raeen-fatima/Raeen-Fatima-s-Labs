# program to illustrate the use of break statement
while True:
    num = int(input("Enter a number (0 to quit): "))
    if num == 0:
        break
    print("You entered:", num)
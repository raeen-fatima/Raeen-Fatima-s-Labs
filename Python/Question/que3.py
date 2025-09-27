#Write a program that keeps asking the user for a number and checks if it is divisible by both 3 and 5. If not, ask again. Exit only when a valid number is entered.

while True: 
    num = int(input("Enter a number: "))
    if num % 3 == 0 and num % 5 == 0:
        print(f"{num} is divisible by both 3 and 5.")
        break
    else:
        print(f"{num} is not divisible by both 3 and 5. please try again.")
# End of the program
#output:
#Enter a number: 7
#7 is not divisible by both 3 and 5. please try again.
#Enter a number: 15
#15 is divisible by both 3 and 5.   
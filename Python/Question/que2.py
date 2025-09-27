# Write a program to get the remainder of two numbers using whille loop and modulus operator.

while True: # Start an infinite loop
    a = input('Do you want to continue or not (Y/N): ') # Ask user if they want to continue
    if a.upper() != 'Y': # If user enters anything other than 'Y', exit loop
        break # Exit the loop
    a = int(input('Enter first number: ')) # Get first number from user
    b = int(input('Enter second number: ')) # Get second number from user
    print(a, '%', b, '=', a % b) # Print the remainder of a divided by b
    print(b, '%', a, '=', b % a) # Print the remainder of b divided by a
    
# End of the program
#output:
#Do you want to continue or not (Y/N): Y
#Enter first number: 10
#Enter second number: 3
#10 % 3 = 1
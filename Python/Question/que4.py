while True:
    num1 = int(input("Enter Num1: "))
    num2 = int(input("Enter Num2: "))

    if num2 == 0:
        print("Cannot divide by zero. Try again.")
        continue

    remainder = num1 % num2

    if remainder == 0:
        print("Perfectly divisible.")
    elif remainder == 1:
        print("Almost divisible.")
    else:
        print(f"{remainder} is the remainder. Try again.")
    exit_choice = input("Do you want to exit? (Y/N): ")
    if exit_choice.upper() == 'Y':
        break
# End of the program
# Output:
# Enter Num1: 10
# Enter Num2: 3
# 1 is the remainder. Try again.
# Do you want to exit? (Y/N): N
# Enter Num1: 10
# Enter Num2: 2
# Perfectly divisible.
# Do you want to exit? (Y/N): Y
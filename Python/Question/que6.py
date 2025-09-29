# Keep asking the user for a number. Check if it’s prime using modulus and loop. If not prime, print its smallest divisor. Exit only when a prime number is entered.

while True:
    num = int(input("Enter a number: "))
    if num  <= 1:
        print("Please enter a number greater than 1.")
        continue
    is_prime = True
    smallest_divisor = None
    for i in range(2, int(num**0.5)+1):
        if num % i == 0:
            is_prime = False
            smallest_divisor = i
            break
    if is_prime:
        print(f"{num} is a prime number.")
        break
    else:
        print(f"{num} is not a prime number. Its smallest divisor is {smallest_divisor}.")

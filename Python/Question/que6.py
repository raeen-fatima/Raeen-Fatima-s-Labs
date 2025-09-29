# Keep asking the user for a number. Check if it’s prime using modulus and loop. If not prime, print its smallest divisor. Exit only when a prime number is entered.

while True:
    num = int(input("Enter a number: "))
    if num  <= 1:
        print("Please enter a number greater than 1.")
        continue
    is_prime = True
    smallest_divisor = None
    for i in range(2, int(num**0.5)+1)

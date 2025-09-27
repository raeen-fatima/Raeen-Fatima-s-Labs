# Ask the user to enter two numbers. If the remainder of the first divided by second is 0, print “Perfectly divisible”. If remainder is 1, print “Almost divisible”. Else, print the remainder. Repeat until user exits.

while True:
  num1 = int(input("Enter Num1: "))
  num2 = int(input("Enter Num2: "))
  if num1 == 0:
    print("Cannot Divisible by zero.Try Again")
    continue
  remainder = num1 % num2
  if remainder == 0:
    print("Perfectly Divisible")
  elif remainder == 1:
      print("Almost Divisible.")
  else:
      print(f"{remainder}is the remainder. try Again")
   
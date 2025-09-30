# Function to print multiplication table of a given number
def multiplication(num):
    for i in range(1, 11):
        print(num , "x", i,  "=", num*i)
multiplication(4)
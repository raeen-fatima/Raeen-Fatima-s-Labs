# elif is short for "else if"
# It allows you to check multiple conditions in a sequence
# If the first condition is False, it checks the next one, and so on

marks = int(input("Enter your marks: "))
if marks >= 90:
    print("Grade: A")
elif marks >= 80:
    print("Grade: B")
elif marks >= 70:
    print("Grade: C")
elif marks >= 60:
    print("Grade: D")
else:
    print("Grade: F")
    
    # Output will depend on the input marks
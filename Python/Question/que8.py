# Write a Python program to check if a user is allowed to access a system based on their username and password.
username = input("Enter your username: ")
password = input("Enter your password: ")

if username == "admin" and password == "password123":
    print("Login Successful")
else:
    print("Invalid Credentials")
# Object-Oriented Programming (OOP)
class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def bark(self):
        return f"{self.name} says Woof!"
my_dog = Dog("Buddy", 3)
print(my_dog.bark())  # Output: Buddy says Woof!


# In this example, we define a Dog class with attributes name and age, and a method bark.
# We then create an instance of the Dog class and call its bark method. 
# This demonstrates the principles of encapsulation and object-oriented design.
# Classes are blueprints for creating objects (a particular data structure).
# Objects are instances of classes that can have attributes (data) and methods (functions).
# OOP helps in organizing code, making it reusable and easier to maintain.
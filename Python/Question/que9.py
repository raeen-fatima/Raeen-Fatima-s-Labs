# Write a Python program to simulate a traffic light system.
light = input("Enter the traffic light color (red, yellow, green): ").lower()
if light == "red":
    print("Stop")
elif light == "yellow":
    print("Get Ready")
elif light == "green":
    print("Go")
else:
    print("Invalid color")
variable = 10
while variable > 0:
    variable -= 1
    if variable == 5:
        continue
    print("Current variable value:", variable)
print("Loop ended.")

variable = 9
while variable > 0:
    print("Current variable value:", variable)
    variable -= 1
    if variable == 4:
        break
print("Loop ended.")

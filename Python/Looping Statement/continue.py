#pass statement is used as a placeholder for future code.
#It is used when a statement is required syntactically but you do not want any commands or code to execute.
#When the pass statement is executed, nothing happens, but you avoiding an error when empty code is not allowed.
i = 0
while i < 5:
    i += 1
    if i == 3:
        continue
    print(i)
else:
    print("No Break\n")
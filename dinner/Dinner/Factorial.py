number = int(input("Enter a number: "))

factorial = 1
for num in range(1, number + 1):
	if num <= number:
		factorial *= num
print(factorial)
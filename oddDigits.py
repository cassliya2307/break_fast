number = 54321
sum = 0
digit1 = (number % 10) // 1
digit2 = (number % 100) // 10	
digit3 = (number % 1000) // 100
digit4 = (number % 10000) // 1000
digit5 = (number % 100000) // 10000
digit = [digit1, digit2, digit3, digit4, digit5]


for numbers in digit:
	if digit[numbers - 1] % 2 != 0:
		sum += digit[numbers - 1]

print(sum)

num = 20
divide = 2
total = 0

for digits in range(num > 1):
	while(num % divide != 0):
		divide+=1
		num = num / divide
	total = total + divide

print(total)

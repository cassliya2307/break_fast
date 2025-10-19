minimum = 0
gcd = 1
first_number = 12
second_number = 8

if first_number < second_number:
	minimum = first_number


else:minimum = second_number

for count in range(1, minimum + 1):
	if first_number % count == 0 and first_number % count == 0:
		gcd = count

print(gcd)
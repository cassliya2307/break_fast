number = 6;
sum = 0;
isPerfect = True;
for count in range(1, number):
	if number % count == 0: sum += count


	if sum == number: isPerfect = True

		print(isPerfect)

	else:
		isPerfect = False

print(isPerfect)

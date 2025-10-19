year = 2025;
sum = 0
for days in range(1900 , year + 1):
	if days % 4 == 0 and days % 100 != 0:
		sum += 1
		



	elif days % 4 == 0 and days % 100 == 0 and days % 400 == 0:
		sum += 1
		


	elif days % 4 == 0 and days % 100 == 0 and days % 400 != 0:
		sum += 1
		
print(sum)
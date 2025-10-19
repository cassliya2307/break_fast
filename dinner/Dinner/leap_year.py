year = 2025;
for days in range(1900 , year + 1):
	if days % 4 == 0 and days % 100 != 0:
		print(days)



	elif days % 4 == 0 and days % 100 == 0 and days % 400 == 0:
		print(days)


	elif days % 4 == 0 and days % 100 == 0 and days % 400 != 0:
		print(days)


	 
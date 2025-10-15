number = [1,2,3,4,5,45,67,12,9,90]
count = 0

largest = number[0]
for num in range(len(number)):
	if largest < number[num]:
		largest = number[num]
	
print(largest)
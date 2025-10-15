number = [1,2,3,4,5,45,67,12,9,90]


smallest = number[0]
for num in range(len(number)):
	if smallest > number[num]:
		smallest = number[num]
	
print(smallest)
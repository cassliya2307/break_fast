string = "madagascar"
count = 0
for letters in string:
	count += 1
	print(string[count - 1], end = " , ")
	print(ord(string[count - 1]))
#Encryction of given data

data = int(input("Enter your four-digit password: "))


	
digit1 = (data % 10000)//1000
digit2 = (data % 1000)//100
digit3 = (data % 100)//10
digit4 = (data % 10)//1


digit1 = (digit1 + 7) % 10
digit2 = (digit2 + 7) % 10
digit3 = (digit3 + 7) % 10
digit4 = (digit4 + 7) % 10


temp1 = digit3
digit3 = digit1
digit1 = temp1

temp2 = digit4
digit4 = digit2
digit2 = temp2

print(digit1, end = " ")
print(digit2, end = " ")
print(digit3, end = " ")
print(digit4, end = " ")


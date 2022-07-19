def bubble(num):
	for i in range(0,len(num)):
		for j in range(i):
			if num[j] > num[j+1]:
				temp = num[j]
				num[j] = num[j+1]
				num[j+1] = temp


num = [1,4,6,2,8,9]
bubble(num)
print(num)
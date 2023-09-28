message = input().split('psst')

sum = 0
for i in range(1, len(message)):
    sum = sum + int(message[i][0])
print(sum)
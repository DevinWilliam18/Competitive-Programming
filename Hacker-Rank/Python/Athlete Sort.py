
#Use an insertion sort
def sortedBy(size,num):
    for i in range (1,len(num)):
        check_point = num[i]

        j = i - 1
        while(j >= 0 and num[j][size] > check_point[size]):
            num[j+1] = num[j]
            j -= 1
        
        num[j+1] = check_point

    return num
    




first_line = list(map(int, input().split()))
data = [list(map(int, input().split())) for N in range(first_line[0])]
K = int(input())
sorted_list = sortedBy(K, data)
for i in sorted_list:
    for j in i:
        print(j, end=' ')
    print()

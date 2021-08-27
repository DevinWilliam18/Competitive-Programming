def insertionSort1(n, arr):
    for i in range(1,n):
        check_point = arr[i]
        j = i - 1
        while(j>=0 and check_point < arr[j]):
            arr[j+1] = arr[j]
            for x in arr:
                print(x, end=" ")
            print()
            j -= 1
        arr[j+1] = check_point
    return arr
            
n = int(input().strip())

arr = list(map(int, input().rstrip().split()))
result = insertionSort1(n, arr)
for i in result:
    print(i, end=" ")

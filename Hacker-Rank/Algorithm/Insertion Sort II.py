def insertionSort2(n, data):
    for i in range(1,n):
        curr = data[i]
        
        j = i-1
        while j >= 0 and curr < data[j]:
            data[j+1] = data[j]
            j -= 1
        
        data[j+1] = curr
        for x in data:
            print(x,end=' ')
        print()

n = int(input().strip())

arr = list(map(int, input().rstrip().split()))

insertionSort2(n, arr)

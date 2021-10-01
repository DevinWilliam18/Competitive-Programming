def insertSort(data):
    ori = data.copy()
    new = data
    for i in range(len(new)):
        temp = new[i]
        j = i

        while j > 0 and temp < new[j-1]:
            new[j] = new[j-1]
            j -= 1
        
        new[j] = temp
    results = []
    for x in ori:
        results.append(new.index(x)+1)
    return results

length = int(input())
inputs = list(map(int, input().split(' ')))
result = insertSort(inputs)

for x in result:
    print(x,end=' ')



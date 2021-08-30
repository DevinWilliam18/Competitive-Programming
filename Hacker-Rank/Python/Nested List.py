def insertionSort(data):
    for i in range(1,len(data)):
        check_point = data[i]
        j = i - 1

        while j >= 0 and check_point[1] < data[j][1]:
            data[j+1] = data[j]
            j -= 1
        data[j+1] = check_point
    return data

def secondLowest(data):
    ListOfSecondVal = []
    SumOfSecondVal = 0
    i = 0
    while i <= len(data)-2:
        if (data[i][1] < data[i+1][1]) and (SumOfSecondVal == 0):
            ListOfSecondVal.append(data[i+1][0])
            SumOfSecondVal += 1
        elif data[i][1] == data[i+1][1] and SumOfSecondVal > 0:
            ListOfSecondVal.append(data[i+1][0])
            SumOfSecondVal += 1
        elif data[i][1] == data[i+1][1] and SumOfSecondVal == 0:
            pass
        else:
            break
        i += 1
    return ListOfSecondVal

data = [[input(), float(input())] for i in range(int(input()))]
result = insertionSort(data)
final = sorted(secondLowest(result))
for i in final:
    print(i)

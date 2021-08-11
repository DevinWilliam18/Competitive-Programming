
records = []
def secondLowest(arr):
    secondName = []
    for i in range(1, len(arr)):
        key = arr[i][1]
        j = i-1
        while((j>=0) & (key < arr[j][1])):
            temp = arr[j+1]
            arr[j+1] = arr[j]
            arr[j] = temp
            j -= 1
    i = 0
    
    while i < len(arr):
        check_point = i + 1 
        if arr[i][1] != arr[check_point][1]:
            pjg = len(arr)
            while check_point < pjg:
                next_point = check_point + 1
                if(arr[check_point][1] == arr[next_point][1]):
                    secondName.append(arr[check_point][0])
                    check_point += 1
                elif check_point > 1 & (arr[check_point][1] != arr[next_point][1]):
                    secondName.append(arr[check_point][0])
                    check_point = pjg
                elif ((check_point == 1) & (arr[check_point][1] != arr[next_point][1])):
                    secondName.append(arr[check_point][0])
                    check_point = pjg
                else:
                    check_point += 1

            i = len(arr)
        else:
            i+=1
    
    secondName.sort()

    return secondName 



for x in range(int(input())):
    subList = []
    name = input()
    score = float(input())
    subList.append(name)
    subList.append(score)
    records.append(subList)

secondNameResults = secondLowest(records)
for results in secondNameResults:
    print(results)

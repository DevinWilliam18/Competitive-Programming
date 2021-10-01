def bubSort(data):
    the_number_of_swapping = 0

    for x in range(0, len(data)-1):
        for y in range(0,len(data)-x-1):
            if data[y] > data[y+1]:
                temp = data[y]
                data[y] = data[y+1]
                data[y+1] = temp
                the_number_of_swapping += 1
    
    return the_number_of_swapping

length = int(input())
inputs = list(map(int, input().split(' ')))
print(bubSort(inputs))

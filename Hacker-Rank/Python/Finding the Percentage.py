banyak = int(input())
myDictionary = {}
isinya = []

def Average(lst):
    return "{:.2f}".format(sum(lst) / len(lst))


if banyak<=10 and banyak >=2:
    for x in range (banyak):
        value = input()
        value = value.split(" ")
        for i in range (1,4):
            isinya.append(value[i])
        konversi = [float(x) for x in isinya]
        myDictionary[value[0]] = Average(konversi)
        
        value.clear()
        isinya.clear()

cari = input()
print(myDictionary[cari])




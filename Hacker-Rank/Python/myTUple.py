n = int(input())
mySTring = input()
mySTring = mySTring.split(" ")

total = [int(x) for x in mySTring]
total = tuple(total)
print(hash(total))
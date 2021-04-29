string = input()
l = list(string)

angka, huruf = input().split()
angka = int(angka)

l[angka] = huruf
string = ''.join(l)
print(string)
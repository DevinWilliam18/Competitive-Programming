a = int(input())
b = int(input())

if (a >= 1 and a <= 10000000001) and (b >= 1 and b <= 10000000001):
    c = a + b;
    d = a-b;
    e = a*b;
    print(c)
    print(d)
    print(e)

else:
    print("Tidak ada")
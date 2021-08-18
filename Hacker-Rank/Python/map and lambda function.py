cube = lambda x: x*x*x
def fibonacci(n):
    fibo = []
    pertama = 0
    kedua = 1
    if n > 1:
        for i in range(1,n):
            if(pertama == 0 and kedua ==1):
                fibo.append(pertama)
                fibo.append(kedua)
                temp = pertama
                pertama = kedua
                kedua = temp + kedua
            else:
                fibo.append(kedua)
                temp = pertama
                pertama = kedua
                kedua = temp + kedua
        
    elif n == 1:
        fibo.append(pertama)

    return fibo
n = int(input())
print(list(map(cube, fibonacci(n))))

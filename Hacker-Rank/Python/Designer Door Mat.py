def cetak(N,M):
    d = 0
    wel = "WELCOME"
    c = ".|."
    if M == 3*N:
        #
        for i in range(0,int((N-1)/2)):
            print((c*(i+1+d)).center(M, '-'))
            d += 1
        #WELCOME
        print(wel.center(M, '-'))
        x = int((N-1)/2)
        while x > 0:
            print((c*(x*2-1)).center(M, '-'))
            x -= 1

#Input
s = input()
s = s.split(" ")
hasil = [int(x) for x in s]
n = hasil[0]
m = hasil[1]
cetak(n,m)

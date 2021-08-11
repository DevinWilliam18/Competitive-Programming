mlist = []

for i in range(int(input())):
    n = input().split()
    if(n[0] =='insert'):
        mlist.insert(int(n[1]),int(n[2]))
        n.clear()
    elif(n[0] =='remove'):
        mlist.remove(int(n[1]))
        n.clear()
    elif(n[0] =='append'):
        mlist.append(int(n[1]))
        n.clear()
    elif(n[0] =='sort'):
        mlist.sort()
        n.clear()
    elif(n[0] =='pop'):
        mlist.pop()
        n.clear()
    elif(n[0] =='reverse'):
        mlist.reverse()
        n.clear()
    elif(n[0] =='print'):
        print(mlist)
        n.clear()

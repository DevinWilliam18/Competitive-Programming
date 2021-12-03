def solve(s):
    list1 = []
    list1[:0] = s

    n = len(list1)
    for i,j in enumerate(list1):
        if i == 0:
            list1[i] = list1[i].upper()
            

        if j.isspace():
            n = i+1

        if n == i:
            list1[i] = list1[i].upper()
            
    return ''.join(list1)

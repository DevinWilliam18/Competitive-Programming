def swap_case(s):
    baru = list(s)
    for x in range(len(baru)):
        if baru[x].isupper():
            baru[x] = baru[x].lower()
        else:
            baru[x] = baru[x].upper()
    return "".join(baru)

s = input()
result = swap_case(s)
print(result)

def alphanumeric(s):
    count = 0
    #Alphanumeric characters
    for i in s:
        if i.isalnum() == True:
            count += 1
    if count > 0:
        return True
    else:
        return False

def alphabetical(s):
    count = 0
    #alphabetical characters
    for i in s:
        if i.isalpha() == True:
            count += 1
    
    if count > 0:
        return True
    else:
        return False
def digits(s):
    count = 0
    #digits
    for i in s:
        if i.isdigit() == True:
            count += 1
    if count > 0:
        return True
    else:
        return False
#Lowercase
def lowercase(s):
    count = 0
    for i in s:
        if i.islower() == True:
            count += 1
    if count > 0:
        return True
    else:
        return False
def uppercase(s):
    #Uppercase
    count = 0
    for i in s:
        if i.isupper() == True:
            count += 1
    if count > 0:
        return True
    else:
        return False

s = input()
print(alphanumeric(s))
print(alphabetical(s))
print(digits(s))
print(lowercase(s))
print(uppercase(s))

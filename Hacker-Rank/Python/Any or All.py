def value(elemnts):
    if elemnts > 0 :
        return True
    else: 
        return False

def print_rangoli(size):
    alphabet_list = list(map(int,input().split()))
    i = len(alphabet_list) - 1
    
    list_temp = []
    palindrome_check = []
    check_positive = []
    while i >= 0:
        subList_str = str(alphabet_list[i])
        j = len(subList_str) - 1
        
        if(j > 1):
            while j >= 0:
                palindrome_check.append(subList_str[j])
                j -= 1
            if '-' in palindrome_check:
                list_temp.append(False)
                palindrome_check.clear()
            elif int(', '.join(palindrome_check)) == alphabet_list[i]:
                list_temp.append(True)
                palindrome_check.clear()
            else:
                list_temp.append(False)
                palindrome_check.clear()
            temp = alphabet_list[i]
            check_positive.append(value(temp))
        elif j == 0:
            list_temp.append(True)
            temp = alphabet_list[i]
            check_positive.append(value(temp)) 
        else:
            list_temp.append(False)
            temp = alphabet_list[i]
            check_positive.append(value(temp))
        i-=1
    if ((all(check_positive) and any(list_temp)) is True):
        print('True')
    else: 
        print('False')
    

n = int(input())

print_rangoli(n)

def largest(arr,n):
    max = arr[0] # Initialize maximum element
    run = arr[n-1] #Runner-Up
  
    # Traverse array elements from second
    # and compare every element with 
    # current max
    for i in range(1, n):
        if arr[i] > max:
            max = arr[i]
    while(n >= 0):
        if arr[n-1-1] < run:
            run = arr[n-1-1]
            break;

        n -= 1

    return run


angka = int(input())
angka2 = input()
angka2 = angka2.split(" ")
isinya = [int(x) for x in angka2]
isinya.sort()
print(largest(isinya, angka))
   

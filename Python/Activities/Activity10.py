num_tuple = input("Enter a sequence of comma separated values :").split(",")
#num_tuple = (1,20,30,1001,250)
showTuple = tuple(num_tuple)
print("Given list is ", showTuple)
print("Elements that are divisible by 5:")
for num in num_tuple:
    if (num % 5 != 0):
        print(num)
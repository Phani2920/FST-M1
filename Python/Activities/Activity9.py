#list1 = input("Enter a sequence of comma separated values for first list:").split(",")
#list2 = input("Enter a sequence of comma separated values for second list:").split(",")
#print("First List", list1)
#print("Second List", list2)
#list3 = []
#for num in list1:
 #   if(int(num) % 2 != 0):
  #      list3.append(num)
#for num in list2:
 #   if(int(num) % 2 == 0):
  #      list3.append(num)
#print("Third list is:",list3)      
# Given lists
listOne = [10, 20, 23, 11, 17]
listTwo = [13, 43, 24, 36, 12]

# Print the lists
print("First List ", listOne)
print("Second List ", listTwo)

# Declare a third list that will contain the result
thirdList = []

# Iterate through first list to get odd elements
for num in listOne:
    if (num % 2 != 0):
        thirdList.append(num)
        
# Iterate through first list to get even elements
for num in listTwo:
    if (num % 2 == 0):
        thirdList.append(num)

# Print result
print("result List is:")
print(thirdList)  


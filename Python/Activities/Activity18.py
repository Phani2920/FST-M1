import pandas
dataframe = pandas.read_csv("Cred.csv")
print("FullData below:")
print(dataframe)
print("=======================")
print("Usernames:")
uName = dataframe["Usernames"]
uPass = dataframe["Passwords"]
print(uName)
print("========================")
print("Username:" +uName[1],"|" ,"Password:"+uPass[1])
print("===========================")
print(dataframe.sort_values('Usernames'))

print("====================================")
print("Data sorted in descending Passwords:")
print(dataframe.sort_values('Passwords', ascending=False))
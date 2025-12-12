import pandas
data = {
    "Usernames" :["admin","Charles","Deku"],
    "Passwords" :["password","Charl13","AllMight"]
}

loginDetails = pandas.DataFrame(data)
#print(loginDetails)
loginDetails.to_csv("Cred.csv",index=False)

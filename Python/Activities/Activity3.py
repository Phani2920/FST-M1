user1 = input("Player1 name:")
user2 = input("Player2 name:")
user1_choice = input(user1+ ",do you want to choose rock, paper or scissors?").lower()
user2_choice = input(user2+ ",do you want to choose rock, paper or scissors?").lower()
if user1_choice == user2_choice:
  print("Its a tie!")
elif user1_choice == 'rock':
 if user2_choice == 'scissors':
  print("Rock wins")
 else:
  print("paper wins")
elif user1_choice == 'scissors' :
 if user2_choice == 'paper':
  print("scissors wins")
 else:
  print("rock wins")
elif user1_choice == 'papaer':
 if user2_choice == 'rock':
  print("paper wins")
 else:
  print("scissors win")
else:
 print("Invalid input! You have not entered rock, paper or scissors, try again")  
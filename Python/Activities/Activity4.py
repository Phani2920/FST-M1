user1_name = input("Player1 name:")
user2_name = input("Player2 name:")
while True:
    user1_answer = input(user1_name+ ",do you want to choose rock, paper or scissors?").lower()
    user2_answer = input(user2_name+ ",do you want to choose rock, paper or scissors?").lower()
    if user1_answer == user2_answer:
        print("Its a tie")
    elif user1_answer == 'rock':
        if user2_answer == 'scissors':
            print("Rock wins")
        else:
            print("Paper Wins")
    elif user1_answer  == 'scissors':
        if user2_answer == 'paper':
            print("scissors wins")
        else:
            print("Rock wins")    
    elif user1_answer == 'paper':
        if user2_answer == 'rock':
            print('paper wins')
        else:
            print("scissors wins")    
    else:
        print("Invalid input! You have not entered rock, paper or scissors, try again.")   
    repeat = input('Do you want to play another round? Yes/No:').lower()
    if(repeat == 'yes'):      
     pass
    elif(repeat == 'no'):
        raise SystemExit
    else:
                print("You entered an invalid option. Exiting now.")
                raise SystemExit

        

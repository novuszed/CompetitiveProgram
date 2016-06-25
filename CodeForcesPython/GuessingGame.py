#  File: GuessingGame.py

#  Description:

#  Student Name: Heather Tolcher

#  Student UT EID: hmt473

#  Course Name: CS 303E

#  Unique Number:

#  Date Created: 4-13-16

#  Date Last Modified: 4-13-16

def main():
    print("Guessing Game")
    print()
    print("Think of a number between 1 and 100 inclusive.")
    print("And I will guess what it is in 7 tries or less.")
    print()
    ready = str(input("Are you ready? (y/n): "))
    while(ready!='n' and ready!='y'):
            ready = (input("Are you ready? (y/n): "))
            #print(type(ready))
    if ready == 'n':
        print("Bye")
        return -1
    elif ready == 'y':
        lo = 0
        hi = 100
        counter = 1


        while(lo<=hi):
            #lo =0
            #hi = 100
            #mid = lo +hi//2
            #while (mid>0 and mid<100):
            mid = (lo +hi) //2
            print("Guess  " + str(counter) + " :  " + "The number you thought of was " + str(mid))
            correct = eval(input("Enter 1 if my guess was high, -1 if low, and 0 if correct: "))
            #print()
            if correct == -1:
                lo = mid + 1
                #mid = (lo + hi) //2
            elif correct == 1:
                hi = mid-1
                #mid = (lo + hi)//2
            elif correct == 0:
                print("Thank you for playing the Guessing Game.")
                return -1
            counter += 1
            if counter == 7 and (correct == 1 or correct == -1):
                print("Either you guessed a number out of range or you had an incorrect entry.")
                break;



main()
# created by jenny trac
# created on nov 28 2017
# program uses an enumerator to determine the user's favourite day of the week

from enum import Enum

# enumerated type for days of the week
Days_of_the_week = Enum('Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday')

print("What # day of the week is your favourite? (Week starts on Sunday)")
chosen_day = int(input())

if chosen_day - 1 >= 0 and chosen_day - 1 <= 7:
    print(Days_of_the_week[chosen_day - 1])
else:
    print("That is not a day of the week. Please enter a number between 1 and 7.")

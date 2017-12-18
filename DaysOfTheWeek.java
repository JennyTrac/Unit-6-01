/* created by jenny trac
created on dec 15 2017
user inputs a number and program returns the day of the week
found how to use enum: https://www.javatpoint.com/enum-in-java  and. http://buraktas.com/java-enums-tutorial/ */

import java.util.Scanner;

public class DaysOfTheWeek {

    enum ValidDays {
        Sunday(1), Monday(2), Tuesday(3), Wednesday(4), Thursday(5), Friday(6), Saturday(7);
        
        private final int value;

        ValidDays(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
  
    public static void main(String[] args)
    {
    // input
    System.out.println("What # day of the week is favourite?");
    Scanner problem = new Scanner(System.in);
    int UserChoice = (problem.nextInt());
    //System.out.println(UserChoice);
    
    for (ValidDays day: ValidDays.values()) {
        if (UserChoice == day.getValue()) {
            System.out.println("Your favourite day is " + day);
            }
        }
    
    if (UserChoice > 1 || UserChoice > 7) {
        System.out.println("That is not a valid day. Please enter a number between 1 and 7.");
        }
    
    }

}

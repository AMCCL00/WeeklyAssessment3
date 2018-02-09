package com.company.Question_3;

import java.util.Scanner;

public class Switch {

    Scanner input = new Scanner(System.in);
    public void switchMethod(){
        System.out.println("What is your favorite TV show from the following list:");
        System.out.println("1. Game of Thones\n" +
                "2. Vikings\n" +
                "3. Stranger Things\n" +
                "4. American Horror Story");
        try{
            switch(input.nextInt()){
                case 1:
                    //GoT
                    System.out.print("You have a great taste in Shows!");
                    break;
                case 2:
                    //Vikings
                    System.out.print("My 2nd Favorite!");
                    break;
                case 3:
                    //Stranger Things
                    System.out.print("Never watched it... so...");
                    break;
                case 4:
                    //AHS
                    System.out.println("Yeaaaaa we are nothing alike.");
                    break;
                default:
                    input.nextLine();
                    System.out.println("Please enter one of the listed shows");
                    switchMethod();
            }

        }catch(Exception e){
            input.nextLine();
            System.out.println("Please enter one of the listed shows");
            switchMethod();
        }
    }
}

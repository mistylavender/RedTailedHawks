package com.nighthawk.csa.natasha.assignOne;
import java.util.*;

public class Mainmenu {



    /** Main - entry point class for this project
     1.'C' and Java have a main function/method that is the ENTRY into code execution. Both languages need a file to contain that ENTRY method/function.  Common convention for 'C': main.c.  Convention for Java: Main.java.
     2. Replit requires a "Main.java" file and a main class ("public Class Main").  Inside the class it expects a method named "public static void main(String[] args)"."
     3. Conventions and structures are part of a programming language and the tools you use.  Python people like to pick on these Java conventions, saying they are difficult.  What do you think?
     */
        public static void main(String[] args)  {  // open squig begins the method
            menu(); // 'coder' defined method/function call to a different code block
        } // close squig ends the method.  What did this method do?

        /**
         * menu - method that is activated by main, this will perform Java code
         */


        public static void menu() {
            //Prigmitive types: AP CSA Unit 1
            int selection;  //user selection variable of type Integer
            int menuNum = 0;
            int number = 0;
            String value = "";

            Scanner scan = new Scanner(System.in);

            System.out.println("How many values would you like in your menu?");
            try {
                menuNum = scan.nextInt();
                System.out.println("Enter the values in the order you would like them from 1 to " + menuNum + " below: ");
                HashMap<Integer, String> map = new HashMap<Integer, String>();
                for (int i = 1; i <= menuNum; i++) {
                    map.put(i, scan.next());
                }

                System.out.println("Here is your menu!");
                for(Map.Entry m : map.entrySet())
                {
                    System.out.println(m.getKey() + " " + m.getValue());
                }
                System.out.println("Would you like to replace any of the values? Enter 'yes' if you want to and 'no' to discontinue!");

                while (!(scan.next().equals("no"))) {

                    System.out.println("Which number do you want to replace?");
                    number = scan.nextInt();
                    System.out.println("What do you want to name it?");
                    value = scan.next();
                    map.put(number, value);

                    System.out.println("Here is your menu!");
                    for(Map.Entry m : map.entrySet())
                    {
                        System.out.println(m.getKey() + " " + m.getValue());
                    }
                    System.out.println("Would you like to replace any of the values? Enter 'yes' if you want to and 'no' to discontinue!");


                }
            } catch (InputMismatchException e){
                System.out.println(e + ": There was a mismatch between the type of input needed and the one you put in.");
            }



            //Using a Class: AP CSA Unit 2
            //Scanner is well know Java class for text based input
            //System.out.println -  A Class or Static method call that is used to output a message to the terminal.
            //The block of outputs below is used to present a menu to the user.
         /* System.out.println("-------------------------\n");
            System.out.println("Choose from these choices");
            System.out.println("-------------------------\n");
            System.out.println("1 - Hello");
            System.out.println("2 - Printy");
            System.out.println("3 - Loopy");
            System.out.println("4 - Classy Print");
            System.out.println("5 - Classy Poem");
            System.out.println("6 - Binary");
            System.out.println("7 - Termy");
            System.out.println("0 - Quit");

            //Using Scanner Class to get integer as input
            selection = scan.nextInt();  //Using nextInt() method to get an integer value

            //Control Statements: AP CSA Unit 3
            //Switch or Switch/Case is used to evaluate the input and execute the case that matches the selection.
            switch (selection) {
                case 0:
                    return;
                case 1:
                    //Prints message to console/terminal
                    System.out.println("Hello, World of Monkeys!");
                    break;
                case 2:
                    //Using a Class: AP CSA Unit 2
                    //Run Printy main method with null parameter
                    Printy.main(null);
                    break;
                case 3:
                    //Using a Class: AP CSA Unit 2
                    //Run MonkeyLoop() constructor and run a method from temporary object, defined in class
                    new MonkeyLoop().printPoem();
                    break;
                case 4:
                    //Using a Class: AP CSA Unit 2
                    //Run MonkeyList() constructor and run a method from temporary object, defined in class
                    new MonkeyList().print();
                    break;
                case 5:
                    //Using a Class: AP CSA Unit 2
                    //Create object to run methods from Classy.java
                    MonkeyList ml = new MonkeyList();
                    ml.print();
                    ml.printPoem();
                    break;

                case 6:
                    //Using a Class: AP CSA Unit 2
                    //Run Biny main method with null parameter
                    Biny.main(null);
                    break;

                case 7:
                    //Run Termy main method with null parameter
                    Termy.main(null);
                    break;

                default:
                    //Prints error message from console
                    System.out.println("Unexpected choice, try again."); */
            }

            //Recursion: AP CSA requirement 10
            //Calling the menu() method inside of the menu() code block is called recursion.
            //Using recursion we provide the ability to stay in program and select and additional option.
            //Repeating an operation is often called iteration.  Recursion is a special form of iteration.
            // menu();
        }


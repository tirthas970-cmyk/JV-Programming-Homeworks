//BY TIRTHA SAHA
import java.util.Scanner;


public class Game {
    static Scanner scanner = new Scanner(System.in); // console inputs 
    //variable; used later
    int courage = 2; 
    boolean talkToOldMan = false;
    boolean talkToTeen = false;
    boolean talkToNone = false;
    boolean explorengine = false;
    boolean checkLuggage = false;
    boolean doNothing = false;
    boolean tooolTicket = false;

    public static void askUserName() { //for user
        System.out.print("Enter username: ");
        String user = scanner.nextLine();
        System.out.println("Welcome " +  user);
    }

    public void gameMain() {  //actual story game

        while (true) {
        
        askUserName();
         System.out.println(); //empty line for space
        System.out.println("You boarded the last train of the night");
         System.out.println(); //empty line for space
        System.out.println("However, something feels off.");
         System.out.println(); //empty line for space

            while (true) {
        
            System.out.print("""
            You now have three choices:

            1) Talk to the old man
            2) Talk to the teenager
            3) Ignore everyone
            """);

            System.out.println();

            System.out.println("Pick a choice (1/2/3): ");
            String choice1 = scanner.nextLine().trim();

            if (choice1.equals("1")) {
                talkToOldMan = true;
                System.out.println("You approach the old man!");
                System.out.println(); //empty space
                System.out.println("""
                    The old man says:
                    "Not everything on this train is what it seems. 
                    Trust what you see, but check twice before you act. 
                    If you find a ticket with a strange mark, it may save you later.
                """);

               courage++; //courage increases
               break;
            } else if (choice1.equals("2")) {
                talkToTeen = true;
                System.out.println("You approach the teenager");
                System.out.println(); //empty
                System.out.println("""
                    The teen says 
                    'I-i-i saw something - a shadow moving
                    near the engine car'                       
                        """);
                courage++;
                break;

            } else if (choice1.equals("3")) {
                talkToNone = true;
                System.out.println("You talk to no one");
                System.out.println("The train starts to feel cold and the lights dim...");
                courage = courage - 1;               
            } else 
                continue;
            
        }
                
            System.out.println("You hear movement in back of the train");

            if (talkToOldMan == true) {
                System.out.println("You remember the old man's remark about a ticket...");  //hints
            } else if (talkToTeen == true) {
                System.out.println("You remember the teens warning about a figure"); //hints
            }

            while (true) {
                System.out.print("""
                        You now have 3 options:
                        1) Investigate engine room, where the movement was heard
                        2) Check luggage cart
                        3) Do nothing
                        """);
                
                System.out.println(); //empty
                System.out.print("Enter a choice (1/2/3): ");
                String choice2 = scanner.nextLine().trim();

                if (choice2.equals("1")) {
                    explorengine = true;
                    tooolTicket = true;

                    System.out.println("You enter the engine room");
                    System.out.println("Shadows dim around you");
                    System.out.println("On the floor, you see a crumbled up ticket. You pick it up");
                    System.out.println("Then, you see an emergency break lever");

                    courage++;
                    break;

                } else if (choice2.equals("2")) {
                    checkLuggage = true;
                    tooolTicket = true;

                    System.out.println("You check the luggage cart");
                    System.out.println("In there, you see a ticket.");
                    System.out.println("You pick the ticket up");

                    courage++;
                    break;

                } else if (choice2.equals("3")) {
                    System.out.println("You stay in your cart");
                    System.out.println("The train rattles around you, and a cold shiver runs down your spine.");
                    System.out.println("You sense that something strange is moving through the train…");

                    courage = courage - 1;
                    break;

                } else 
                    continue;
                
            }

            System.out.println("Suddenly, the train becomes dims fully.");
            System.out.println(); //empty
            System.out.println("You hear movement very clearly now");
            System.out.println(); //empty
            System.out.println("Something approaches you...");
            System.out.println(); //empty
            System.out.println("But you see the train door open");

            while (true) {
                System.out.print("""
                    You now have your final choice
                    1) Jump out of the train
                    2) Do nothing
                    """);
                    if (explorengine == true) {
                        System.out.println( "3) Pull the emergancy lever");
                    }

                System.out.println("Enter a choice (1/2/3): ");    
                String choice3 = scanner.nextLine().trim();

                if (choice3.equals("1")) {
                    System.out.println("You take a leap of faith and jump");

                    if (tooolTicket == true && courage >= 3) {
                        System.out.println("You hold your ticket tightly and brace for impact.");
                        System.out.println(); //empty
                        System.out.println("You hit the ground and escape safely");
                        System.out.println(); //empty
                        System.out.println("But the figure is still in the train, waiting for its next victim...");
                        break;
                    } else {
                        System.out.println("You jump, but the fog closes you");
                        System.out.println(); //empty
                        System.out.println("You are lost forever...");
                        break;
                    }
                    

                } else if (choice3.equals("2")) {
                    System.out.println("You stay in the cart");
                    System.out.println(); //empty
                    System.out.println("The darkness surrounds you");
                    System.out.println(); //empty
                    System.out.println("Eventually, the figure comes and gets you...You die");
                    break;
                

                } else if (choice3.equals("3")) {
                    if (courage >= 3 && explorengine == true) {
                        System.out.println("You pull the lever");
                        System.out.println(); //empty
                        System.out.println("The figure disappears with the fog");
                        System.out.println(); //empty
                        System.out.println("You survived, thanks you your courage");
                        break;
                    } else {
                      System.out.println("You are too scared to pull the lever");
                      System.out.println(); //empty
                      System.out.println("The figure comes and encloses you. You die");
                      break;

                    }

                } else {
                    continue;
                }

            }

            System.out.println("Thanks for playing");
            System.out.print("Do you want to play again to achieve a different ending? (yes/no): ");
            String check = scanner.nextLine().trim().toLowerCase();
            
            if (check.equals("yes")) {
                continue;
            } else if (check.equals("no")) {
                break;
            } else {
                break;
            }

            }

        }

}
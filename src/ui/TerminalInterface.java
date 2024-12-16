package ui;
import java.util.Scanner;
public class TerminalInterface {
    private final Scanner scanner;
    private boolean exitOption;

    public TerminalInterface(){
        this.scanner=new Scanner(System.in);
        this.exitOption = false;

    }

    public void startProgram(){
        System.out.println("Welcome to your Personal Finance Tracker");
        int selectOption;
        while (!exitOption){
            displayMenu();
            selectOption = getUserChoice();
            processChoice(selectOption);
        }
    }

    private void displayMenu(){
        System.out.println("\nMain Menu");
        System.out.println("1. Add Transaction");
        System.out.println("2. View Transactions");
        System.out.println("3. Generate Report");
        System.out.println("4. Exit");
        System.out.println("Please enter your choice: ");
    }

    private int getUserChoice(){
        int choice = 0;
        boolean validChoice = false;
        while(!validChoice){
            try{
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 0 && choice < 5){
                    validChoice = true;
                }else{
                    System.out.println("Invalid choice. Please enter a number between 1 and 4!");
                }
            }catch(NumberFormatException e){
                System.out.println("Invalid input. Please enter a number between 1 and 4!");

            }
        }
        return choice;
    }

    private void processChoice(int choice){
        switch(choice){
            case 1:
                System.out.println("Add Transaction - Feature coming soon");

                break;
            case 2:
                System.out.println("View Transactions - Feature coming soon");
                break;
            case 3:
                System.out.println("Generate Report - Feature coming soon");
                break;
            case 4:
                exitProgram();
                break;
            default: //Unnecessary since logic ensures value is between 1 and 4
                System.out.println("Unexpected error. Please try again.");

        }
    }

    private void exitProgram(){
        System.out.println("Exiting Application. Goodbye!");
        scanner.close();
        exitOption = true;
    }

}

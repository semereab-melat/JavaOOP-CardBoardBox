
import java.util.Scanner;

/***************************************************************
 Filename: TestCardBox
 Created by: Melat Semereab
 Created on: 12/11/2021
 Comment: A test or main method for CardBoardBox.java
 ***************************************************************/

 class Main {
    public static Scanner keyboard = new Scanner(System.in);
    public static int getValues(String message) {
          System.out.print(message);
          return keyboard.nextInt();
      }//getValues

  public static void main(String[] args) {
       //Declare variables
        int width, height, depth, volumeSugar;
        String colour;

        //Create myBox and print out the details
        System.out.println("Test myBox");
        System.out.println("=============");

        CardboardBox myBox = new CardboardBox();
        myBox.showAllDetails();

        //Create yourBox and print out the details
        System.out.println("Test yourBox");
        System.out.println("=============");
        CardboardBox yourBox = new CardboardBox(15, 5, 25);
        yourBox.showArea();

        //Create aBox and print out the details
        //Print out the Top Area, Front Area and Side Area of aBox
        System.out.println("Test aBox");
        System.out.println("=============");
        CardboardBox aBox = new CardboardBox(20,15,10,"Brown");
        aBox.showAllDetails();
        aBox.showArea();

        //Prompt the user for the 4 attributes and assign these
        System.out.println("Test myBox with setter");
        System.out.println("=============");
        width = getValues("Enter width: ");
        height = getValues("Enter height: ");
        depth = getValues("Enter depth: ");
        System.out.println("Enter the colour of the box: ");
        colour = keyboard.nextLine();
        keyboard.nextLine();

        //using the appropriate set methods to myBox
        //Print out all the details of myBox
        myBox.setAll(width,height,depth,colour);
        myBox.showAllDetails();

        //a test method for calculating a number of boxes for a given volume of sugar and dimensions of box
        System.out.println("Test testBox with setter");
        System.out.println("=============");
        CardboardBox testBox = new CardboardBox();
        volumeSugar = getValues("Please enter the volume of sugar that is to be stored in the box: ");
        width = getValues("Please enter width: ");
        height = getValues("Please enter height: ");
        depth = getValues("Please enter depth: ");
        testBox.setAll(width,height, depth, colour);
        System.out.println("The number of boxes needed are: " + testBox.requiredBoxes(volumeSugar));
        testBox.showAllDetails();

        System.out.println("=============");
        //Print out the number of boxes that have been created
        CardboardBox.noOfBoxess();

  }//main
}//class
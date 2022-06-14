/***************************************************************
 Filename: CardBoardBox
 Created by: Melat Semereab
 Created on: 12/11/2021
 Comment: print the sides of area and volume of a box.
 ***************************************************************/
public class CardboardBox {
    private static int numberOfBoxes = 0;
    private int width;
    private int height;
    private int depth;
    private String colour;


    public CardboardBox()
    {
        numberOfBoxes = numberOfBoxes + 1;
    }//default constructor

    public CardboardBox(int widthBox, int heightBox, int depthBox, String colourBox)
    {
        width = widthBox;
        height = heightBox;
        depth = depthBox;
        colour = colourBox;
        numberOfBoxes = numberOfBoxes + 1;
    }//alternative constructor

    public CardboardBox(int widthBox, int heightBox, int depthBox)
    {
        width = widthBox;
        height = heightBox;
        depth = depthBox;
        colour = "Unknown";
        numberOfBoxes = numberOfBoxes + 1;
    }//alternative constructor

    public void setAll(int widthBox, int heightBox, int depthBox, String colourBox)
    {
        width = widthBox;
        height = heightBox;
        depth = depthBox;
        colour = colourBox;
    }// setter method for all instance variables
    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public int getDepth()
    {
        return depth;
    }
    public String getColour()
    {
        return colour;
    }

    //get volume of the box
    private int volume()
    {
        return height * width * depth;
    }//volume()

    public int printTopArea()
    {
        return width * depth;
    }
    public int printfrontArea()
    {
        return width * height;
    }
    public int printSideArea()
    {
        return height * depth;
    }
    //method to print the top, front and side area of the box
    public void showArea()
    {
        System.out.println("Top Area of the box is : " + printTopArea());
        System.out.println("Front Area of the box is: " + printfrontArea());
        System.out.println("Side Area of the box is: " + printSideArea());
    }
    public static void noOfBoxess()
    {
        System.out.println("The number of boxes that have been created: "  + numberOfBoxes);
    }//noOfBoxes

    public int requiredBoxes(int volumeOfSugar)
    {
        int volumeOfBox;
        double result;
        volumeOfBox = volume();
        result = (double) volumeOfSugar / volumeOfBox;
        if ((double) volumeOfSugar % volumeOfBox != 0)
        {
            result = result + 1;
        }//if

        return (int)result;
    }

    public void showAllDetails()
    {
        int volumeResult;
        System.out.println("The WIDTH of the cardboard box is " + width + " units");
        System.out.println("The HEIGHT of the cardboard box is " + height + " units");
        System.out.println("The DEPTH of the cardboard box is " + depth + " units");
        System.out.println("The COLOUR of the cardboard box is " + colour + " .");
        volumeResult = volume();
        if (volumeResult == 0)
        {
            System.out.println("All imporatant datas are not give!");
        }
        else
            System.out.println("The VOLUME of the cardboard box is " + volumeResult + " units cube");
     }//showAlllDetails
}//class
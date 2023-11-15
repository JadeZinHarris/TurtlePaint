import java.awt.*;
import java.util.Scanner;

public class MainApp

{
    HomeScreen ui = new HomeScreen();
    public void display(){
    displayMenu();

}
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world,-100, -100);
        
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(45);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);


        
    }
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println(" Choose an option:");
            System.out.println("1 .) Add Shape");
            System.out.println("2 .) Save Shape ");
            System.out.println("0 .) Exit");

            System.out.print("You Chose: ");
            String input = scanner.nextLine().trim();


            switch (input) {
                case "1":
                    addAShape();
                    break;
                case "2":
                    saveAllShapes();
                    break;
                case "0":
                    running = false;
                    break;
            }

        }

    }

}

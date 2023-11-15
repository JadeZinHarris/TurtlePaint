import java.util.Scanner;

public class HomeScreen {
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
//    // public void addShape() {
//        Scanner scanner = new Scanner(System.in);
//
//        }
    }
}

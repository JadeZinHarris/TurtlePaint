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
         public void addAShape() {
        Scanner scanner = new Scanner(System.in);
        boolean adding = true;
        while (adding) = {
                System.out.println("Choose a shape: ");
                System.out.println("1.) Square");
                System.out.println("2.) Circle");
                System.out.println("3. Triangle");
                String input = scanner.nextLine().trim();

                switch (input) {
                    case "1":
                        square();
                    case "2":
                        circle();
                    case "3":
                        triangle();


                }
             }

        }
        public void saveAllShapes() {
            Scanner scanner = new Scanner(System.in);
            boolean saving = true;
            while (saving) = {
                System.out.println("Choose to save or delete: ");
                System.out.println("1.) Save");
                System.out.println("2.) Delete");

                String input = scanner.nextLine().trim();

                switch (input) {
                    case "1":
                        save();
                    case "2":
                        delete();


                }
            }

        }
    }


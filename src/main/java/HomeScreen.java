import java.util.Scanner;

public class HomeScreen {

         public void addAShape() {
        Scanner scanner = new Scanner(System.in);
        boolean adding = true;
        while (adding)  {
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
            while (saving)  {
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


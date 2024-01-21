import java.util.Scanner;

    public class DetectiveAdventureGame {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Detective Adventure Game!");
            System.out.println("You are a seasoned detective tasked with solving a series of mysterious crimes.");

            while (true) {
                System.out.println("\nSelect an action:");
                System.out.println("1. Investigate a crime scene.");
                System.out.println("2. Interrogate a suspect.");
                System.out.println("3. Analyze forensic evidence.");
                System.out.println("4. Quit");

                int choice = getUserChoice(scanner);

                switch (choice) {
                    case 1:
                        investigateCrimeScene();
                        break;
                    case 2:
                        interrogateSuspect();
                        break;
                    case 3:
                        analyzeForensicEvidence();
                        break;
                    case 4:
                        System.out.println("Thank you for playing! Case closed.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please choose again.");
                }
            }
        }

        private static int getUserChoice(Scanner scanner) {
            int choice = -1;
            while (choice == -1) {
                System.out.print("Enter your choice: ");
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
            return choice;
        }

        private static void investigateCrimeScene() {
            System.out.println("You arrive at the crime scene, a dimly lit alley with scattered evidence.");
            System.out.println("What do you want to do?");
            System.out.println("1. Examine the surroundings for clues.");
            System.out.println("2. Interview witnesses in the area.");
            System.out.println("3. Call for forensic support.");

            Scanner scanner = new Scanner(System.in);
            int choice = getUserChoice(scanner);

            if (choice == 1) {
                System.out.println("You discover a torn piece of a map hidden near the crime scene.");
            } else if (choice == 2) {
                System.out.println("Witnesses provide conflicting accounts, making your investigation challenging.");
            } else if (choice == 3) {
                System.out.println("Forensic experts find fingerprints on a suspicious object at the crime scene.");
            } else {
                System.out.println("Invalid choice. You continue your investigation in the alley.");
            }
        }

        private static void interrogateSuspect() {
            System.out.println("You bring in a suspect for questioning in the interrogation room.");
            System.out.println("What do you want to do?");
            System.out.println("1. Confront the suspect with evidence.");
            System.out.println("2. Appeal to the suspect's emotions.");
            System.out.println("3. Use a good cop/bad cop approach.");

            Scanner scanner = new Scanner(System.in);
            int choice = getUserChoice(scanner);

            if (choice == 1) {
                System.out.println("You present the evidence, putting pressure on the suspect to confess.");
            } else if (choice == 2) {
                System.out.println("You appeal to the suspect's emotions, trying to gain their trust.");
            } else if (choice == 3) {
                System.out.println("The good cop/bad cop approach yields valuable information from the suspect.");
            } else {
                System.out.println("Invalid choice. You continue your interrogation tactics.");
            }
        }

        private static void analyzeForensicEvidence() {
            System.out.println("You receive forensic reports with various pieces of evidence.");
            System.out.println("What do you want to analyze?");
            System.out.println("1. Analyze DNA samples.");
            System.out.println("2. Examine the results of ballistics tests.");
            System.out.println("3. Review security camera footage.");

            Scanner scanner = new Scanner(System.in);
            int choice = getUserChoice(scanner);

            if (choice == 1) {
                System.out.println("The DNA analysis links the suspect to the crime scene.");
            } else if (choice == 2) {
                System.out.println("Ballistics tests reveal a match between the suspect's weapon and the crime.");
            } else if (choice == 3) {
                System.out.println("Security camera footage captures the suspect at the scene during the crime.");
            } else {
                System.out.println("Invalid choice. You continue your analysis of forensic evidence.");
            }
        }
    }

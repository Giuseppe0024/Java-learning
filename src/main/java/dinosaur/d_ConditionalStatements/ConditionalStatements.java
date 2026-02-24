package dinosaur.d_ConditionalStatements;

import java.util.Scanner;

// LO SCANNER SI RIFERISCE ALLA Java API java.util, una delle librerie fornite da Java

public class ConditionalStatements {
    public static void main(String[] args) {
        example();
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        project();

    }

    static void example() {
        Scanner visual = new Scanner(System.in);
        System.out.println("enter a number from 1 to 10");
        int number = visual.nextInt();
        switch (number) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println(number + "is odd");
                break;

            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println(number + " is even");
                break;

            default:
                System.out.println("your number is not valid");
                break;
        }
    }

    static void exercise1() {
//                // DETERMINARE SE UN DINO È CARNIVORE OR HERBIVORE
//                    // SCRIVI UN IF STATEMENT CHE STAMPI SE A DINO IS CARN OR HERB BASATO SU UN BOOLEANO

        boolean carnivore = false;
        if (carnivore) {
            System.out.println("Dino is carnivore");
        } else {
            System.out.println("Dino is herbivore");
        }


    }

    static void exercise2() {
//        // SCRIVI UNO SWITCH CASE STATEMENTS CHE STAMPI LA DESCRIZIONE DI UN DINO
//        // BASATO SULLA PROPRIA SPECIE
        Scanner scanner = new Scanner(System.in);
        System.out.println("write an animal");
        String species = scanner.nextLine();
        switch (species) {
            case "Tyrannosaurus Rex":
                System.out.println(species + " is a giant carnivore with powerful hind legs and tiny arms, one of the most feared predators of the Cretaceous period.");
                break;
            case "Triceratops":
                System.out.println(species + " is an herbivore with three horns and a large bony frill on its head, used for defense and combat.");
                break;
            case "Stegosaurus":
                System.out.println(species + " is an herbivore with a row of bony plates along its back and spikes on its tail, likely used for thermoregulation and defense.");
                break;
            case "Brachiosaurus":
                System.out.println(species + " is a gigantic herbivore with an extremely long neck to reach high leaves, one of the largest dinosaurs that ever existed.");
                break;
            case "Velociraptor":
                System.out.println(species + " is a small but intelligent and fast carnivore with a large curved claw on each hind foot, hunted in groups.");
                break;

            default:
                System.out.println("unknown species.");
                break;

        }
    }


    //SCRIVI UN IF STATEMENTS CHE CONTROLLI (CHECK) SE IL NUMERO DI ANNI DI ESPERIENZA È ABBASTANZA ESPERIENZA PER
    //LAVORARE CON UN CERTO TIPO DI DINOSAURO
    static void exercise3() {
        int amountOfExperience = 50;
        if (amountOfExperience < 10) {
            System.out.println("You don't have enough exeperience to work with any dinosaur");
        } else if (amountOfExperience < 20) {
            System.out.println("You can handle only Tyrannosaurus Rex");
        } else if (amountOfExperience < 30) {
            System.out.println("You can handle only Tyrannosaurus Rex and Triceratops");
        } else if (amountOfExperience < 40) {
            System.out.println("You can handle only Tyrannosaurus Rex, Triceratops and Stegosaurus");
        } else if (amountOfExperience < 50) {
            System.out.println("You can handle only Tyrannosaurus Rex, Triceratops, Stegosaurus and Brachiosaurus");
        } else {
            System.out.println("You can handle all of these dinosaurs Tyrannosaurus Rex, Triceratops, Stegosaurus, " +
                    "Brachiosaurus and Velociraptor");
        }
    }

    static void exercise4() {
        int parkSafeRating = 13;
        if (parkSafeRating < 10) {
            System.out.println("WARNING: please be careful");
        } else {
            System.out.println("Enjoy your visit");
        }
    }

    static void exercise5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert your Dino Size. Available options: XS - S - M - L - XL");
        String size = scanner.nextLine();
        switch (size) {
            case "XS":
                System.out.println("XS - Compy Enclosure 2x2m. Metal mesh pen for tiny dinosaurs.");
                break;
            case "S":
                System.out.println("S - Velociraptor Pen 5x5m. Steel fencing with shaded areas.");
                break;
            case "M":
                System.out.println("M - Triceratops Habitat 10x15m. Double fencing with grazing areas.");
                break;
            case "L":
                System.out.println("L - T-Rex Arena 30x40m. Reinforced fencing with moats.");
                break;
            case "XL":
                System.out.println("XL - Sauropod Sanctuary 50x80m. Steel fencing with lakes and vegetation.");
                break;
        }
    }

    static void exercise6() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci il peso del tuo dinosauro");
        int weight = scanner.nextInt();

        if (weight < 5) {
            System.out.println("feeding 1 per day");
        } else if (weight < 10) {
            System.out.println("feeding 2 per day");
        } else if (weight < 20) {
            System.out.println("feeding 4 per day ");
        } else {
            System.out.println("feeding 5 per day");
        }
    }


    static void exercise7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify your job title:");
        String jobTitle = scanner.nextLine();
        switch (jobTitle) {
            case "junior":
                System.out.println("Junior: Clean enclosures. Feed dinosaurs. Learn care basics.");
                break;
            case "mid":
                System.out.println("Mid: Manage one habitat. Train juniors. Monitor health.");
                break;
            case "senior":
                System.out.println("Senior: Design habitats. Oversee multiple areas. Mentor staff.");
                break;
            case "manager":
                System.out.println("Manager: Manage park operations. Hire staff. Handle budgets.");
                break;
        }
    }


static void exercise8() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("E.T.A. ?");
    double e_t_a = scanner.nextDouble();
    if (e_t_a < 10.00) {
        System.out.println("closed");
    } else if (e_t_a <= 19.00) {
        System.out.println("we're open");
    } else {
        System.out.println("closed");
    }


}


static void project() {
    // PROGRAMMA CHE ASSEGNA TASK BASATI SUL RUOLO(JOB TITLE), SUL TEMPO( HOUR) E PARK SAFETY RATING.

    Scanner scanner = new Scanner(System.in);
    System.out.println("Write a safety rating based on a scale from 1 to 10.");
    int safetyRating = Integer.parseInt(scanner.nextLine()); // stampa e converte il valore di Integer con lo scanner
    System.out.println("Write an hour do you want to check. (ex. 10.37)");
    double hour = Double.parseDouble(scanner.nextLine()); // stampa e converte il valore di Double con lo scanner
    System.out.println("Write an job title choosing between: junior, mid, senior");
    String jobTitle = scanner.nextLine();

    if (safetyRating > 5) {
        System.out.println("Safety Rating: OK.");
        if (hour < 10.00) {
            System.out.println("we're closed.");
            switch (jobTitle) {
                case "junior":
                    System.out.println("Work day still not started.");
                    break;
                case "mid":
                    System.out.println("Work day still not started.");
                    break;
                case "senior":
                    System.out.println("Minding park business.");
                    break;
            }
        } else if (hour <= 19.00) {
            System.out.println("We're open.");
            switch (jobTitle) {
                case "junior":
                    System.out.println("meeting and greeting with visitors.");
                    break;
                case "mid":
                    System.out.println("Handling the biggest dinosaurs");
                    break;
                case "senior":
                    System.out.println("Checking emergency Response Protocol.");
                    break;
            }

        } else {
            System.out.println("we're closed.");
            switch (jobTitle) {
                case "junior":
                case "mid":
                case "senior":
                    System.out.println("Work day ended");
                    break;
            }

        }
    } else {
        System.out.println("Safety Rating: DANGER");
        if (hour < 10.00) {
            System.out.println("We're closed. ALARM");
            switch (jobTitle) {
                case "junior":
                case "mid":
                    System.out.println("Work day still not started. ALARM");
                    break;
                case "senior":
                    System.out.println("Minding park business. ALARM");
                    break;
            }
        } else if (hour < 19.00) {
            System.out.println("We're open. ALARM");
            switch (jobTitle) {
                case "junior":
                    System.out.println("leading visitors to the emergency exit.");
                    break;
                case "mid":
                    System.out.println("Caring about dinosaur's safety.");
                    break;
                case "senior":
                    System.out.println("Applying emergency Response Protocol.");
                    break;
            }

        } else {
            System.out.println("We're closed. ALARM");
            switch (jobTitle) {
                case "junior":
                case "mid":
                    System.out.println("Not available.");
                    break;
                case "senior":
                    System.out.println("Senior is calling 911.");
                    break;
            }
        }

    }


 }
}


// CORREGGI BUG, QUANDO USER METTE SAFETY RATING > 10 DEVE DARE ERRORE, RIGUARDA LA LOGICA DI BASE DEL PROGRAMMA
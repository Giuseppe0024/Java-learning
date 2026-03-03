package dinosaur.e_UnderstandingIteration;

import java.util.Scanner;

public class UnderstandingIteration {
    static void main(String[] args) {

        example();
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        project();

    }
    static void example () {
    // WHILE SERVE PER RIPETERE UN BLOCCO DI CODICE O UNA ESPRESSIONE BOOLEANA CHE RISULTI TRUE;
        // ---- Example ----
        int x = 1;
        while (x != 0) {
            System.out.println("your number is " + x);
            x++;
        }
//    // DO-WHILE ESEGUE UN CICLO (ALMENO UNA VOLTA) SENZA CONDIZIONE RICHIESTA, SE WHILE E' true ALLORA LO RIESEGUE
//     // FINCHÈ WHILE È true, IL CICLO VERRÀ RIESEGUITO.
//        // ---- Example ----
        Scanner input = new Scanner(System.in);
        int sum = 0;
        boolean keepGoing = true;
        do {
            System.out.print("Enter a number (negative to exit) : ");
            int number = input.nextInt();
            if (number < 0) {
                keepGoing = false;
            } else  {
                sum += number;
            }
        } while (keepGoing);
        System.out.println("The sum is " + sum);

//    // CICLO FOR RIPETE UN BLOCCO DI DOCICE, LO SI USA PRINCIPALMENTE QUANDO SAPPIAMO IL NUMERO ESATTO DI ITERAZIONI
//        // ---- Example ----
        int ia [] = {1,2,3};
        for(int n : ia) {
            System.out.println(n);
        }

//    // NESTED FOR, SERVONO PER CONTROLLARE array o collection
//        // ---- Example ----
        int[] data = {9, 3, 5, 7};
        System.out.println("[]\t[n]\tHistogram");
        for (int i=0; i<data.length; i++) {
            System.out.println(i + "\t" + data[i] + "\t");
            for (int j=1; j<=data[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




//    // BREAK BLOCCA SOLO L'USO DEL INNER FOR ( DEL CICLO INTERNO)
//        System.out.println("i,j"); // stampa i,j
        for(int i = 1; i <= 3; i++) { // dichiara i, se condizione è true, allora entra
            for(int j = 1; j <= 5; j++) { // dichiara j, se condizione è true, allora entra
                if(j == 3) { // se j == 3 allora fermati (break)
                    break;
                }
                System.out.println(i + "," + j); // stampa i valori attuali 1,1. Poi ricomincia da for J
                // perchè for J deve essere ancora completato con j++. Quando J diventerà 3 allora non lo stampare,
                // ferma il ciclo for J
            }
        }

    }

    static void exercise1 () {
        for(int i = 1; i <=100; i++) {
            System.out.println("dino" + i);
        }
    }

    static void exercise2 () {
        Scanner input = new Scanner (System.in);
        int number = 0;
        boolean valido = false;

        do {
            System.out.print("How hungry is your dino: \nwrite a number in a range from 1 to 10: ");
            number = input.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("error");
            } else {
                valido = true;
            }
        } while (!valido);

        if (number >= 1 && number < 5) {
            System.out.println("I'm starving");
        } else if (number >= 5 && number < 10) {
            System.out.println("I need some more");
        } else {
            System.out.println("I'm full");
        }

        input.close();
    }

    static void exercise3 () {
        int time = 10;
        System.out.println("current time is " + time);
        while (time != 0) {
            time++;
            System.out.println(time - 1);
            if (time == 0) {
                System.out.println("happy new year!!");
            }
        }
    }


    static void exercise4 () {
        int[] enclosure = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0; i < enclosure.length; i++){
            sum += enclosure[i];
        }
            System.out.print(sum);
    }

    static void exercise5 () {
        int maxTicket = 0;
        while (maxTicket <= 10) {
            if(maxTicket == 10) {
                System.out.println("ticket are sold out");
                break;
            }
            maxTicket++;
            System.out.println("we sold " +  maxTicket);
        }
    }


    static void exercise6() {

        Scanner input = new Scanner (System.in);


        boolean safetyRange = false;
        System.out.println("Is enclosure closed ? true/false");
        boolean isEnclosuresClosed = input.nextBoolean();
        System.out.println("How many kg weights you bag? Scale from 1 to 10 ");
        int bagWeight = input.nextInt();
        do {
            if (isEnclosuresClosed == false) {
                while (isEnclosuresClosed == false) {
                    System.out.println("To enter you need to close the enclosure. \n Check the enclosure please.\n Is enclosure closed ? true/false" );
                    isEnclosuresClosed = input.nextBoolean();
                    if (isEnclosuresClosed == true) {
                        System.out.println("enclosure is closed. thank you.");
                    }
                }

            }
            if (bagWeight < 10) {
                System.out.println(bagWeight + "kg. Security check OVER. You can enter.");
            } else if (bagWeight >= 10) {
                while (bagWeight >= 10) {
                    System.out.println("Error. Weight not Allowed. How many kg weights you bag? Scale from 1 to 10 ");
                    bagWeight = input.nextInt();
                }

            }

            if (isEnclosuresClosed == true && bagWeight < 10) {
                safetyRange = true;
            }



        } while (safetyRange == false);
        input.close();

        }


    static void project() {

        // DECLARING A VARIABLE TO HOLD THE CURRENT TIME
        Scanner input = new Scanner(System.in);
        System.out.println("Insert a feeding time choosing from 0 to 23");
        int feedingTimes = input.nextInt();
        do {
            if (feedingTimes < 0 || feedingTimes > 23) {
                System.out.println("Invalid input. Please try again. \nInsert a feeding time choosing from 0 to 23");
                feedingTimes = input.nextInt();
            }
        } while (feedingTimes < 0 || feedingTimes > 23);
        System.out.println("Time checked.");

        input.nextLine();

        System.out.println("Insert a dinosaur's name between t-rex or brachiosaurus");
        String dino = input.nextLine();
        do {
            if (!dino.equals("t-rex") && !dino.equals("brachiosaurus")) {
                System.out.println("error, please try again. ");
                dino = input.nextLine();
            }
        } while (!dino.equals("t-rex") && !dino.equals("brachiosaurus"));

        // ---- T-REX ----
        if (dino.equals("t-rex")) {
            System.out.println("T-rex could eat at 8 , 14 , 20");

            int[] trexMealTime = {8, 14, 20};

            boolean istrexMealTime = false;

            for (int i = 0; i < trexMealTime.length; i++) {
                if (feedingTimes == trexMealTime[i]) {
                    istrexMealTime = true;
                    break;

                }

            }

            if (istrexMealTime) {
                System.out.println("it's t-rex meal time");
            } else {
                System.out.println("it's not t-rex meal time");
            }

            int trexFeedingPortion = 100;

            if (dino.equals("t-rex")) {
                System.out.println("t-rex needs feeding " + trexFeedingPortion);
            }

        }

        // ---- BRACHIOSAURUS ----

        if (dino.equals("brachiosaurus")) {
            System.out.println("Brachiosaurus could eat at 7 , 11 , 15 , 19");

            int[] brachiosaurusMealTime = {7, 11, 15, 19};

            boolean isBrachiosaurusMealTime = false;

            for (int j = 0; j < brachiosaurusMealTime.length; j++) {
                if (feedingTimes == brachiosaurusMealTime[j]) {
                    isBrachiosaurusMealTime = true;
                    break;

                }
            }

            if (isBrachiosaurusMealTime) {
                System.out.println("it's brachiosaurus meal time");
            } else {
                System.out.println("it's not Brachiosaurus meal time");
            }

            int brachiosaurusFeedingPortion = 250;

            if (dino.equals("brachiosaurus")) {
                System.out.println("brachiosaurus needs feeding " + brachiosaurusFeedingPortion);
            }

        }


    }
}







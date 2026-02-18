package dinosaur.c_OperatosAndCasting;

public class OperatorAndCasting {
    public static void main ( String [] args ) {
        unaryOperators();
        logicalOperators();
        ternaryOperators();
        castingWideingAndNarrowing();
        exercise1to6();
        project();


    }

    // ---- Example Unary Operators ----
    static void unaryOperators() {
        int x=3; // dichiaro una variabile e ci assegno un valore
        ++x; // ++x si legge da destra a sinistra, quindi prima x=3, poi sul ++ diventa 4
        System.out.println(x); // stampa 4 (attuale valore)
        System.out.println(++x); // stampa 4 POI
        // aggiunge ++ e diventa 5
        System.out.println(x); // stampa 5 (attuale valore)


        int y=5; // dichiaro una variabile e ci assegno un valore
        y--; // y-- si legge da sinistra a destra, quindi prima y=5, poi sul -- diventa 4
        System.out.println(y); // stampa 4 (attuale valore)
        System.out.println(y--); // stampa 4 POI
        // diminuisce il valore con -- e diventa 3
        System.out.println(y); // stampa 3 (attuale valore)
    }

    // ---- Example Logical Operators ----
    static void logicalOperators() {

        boolean b1 = false, b2 = true; // b1 e b2 vengono dichiarate false
        boolean res = b1 && (b2 = false); // si risolve prima le parentesi, quindi b2 è falsa, b1 invece resta invariata
        // perciò abbiamo come risultato boolean res = false
        System.out.println(b1 + " " + b2 + " " + res);  // output finale è quindi false , true , false

        boolean b3 = false, b4 = false, b5 = false; // dichiaro 3 varibili booleane
        boolean bool = (b3 = true) || (b4 = true) && (b5 = true); // b3 = true rende || sempre true, quindi b4 && b5 non
        // viene letto dalla macchina
        System.out.println(b3 + " " + b4 +  " " + b5 ); // b3 quindi è true, b4 e b5 restano falsi
    }

    // ---- Example Ternary Operator ----
    static void ternaryOperators() {
        int m = 4;
        String s = m % 2 == 0 ? " is an even number" : " is an odd number";
        System.out.println(m + s);
    }

    // ---- Example Casting: Widing and Narrowing ----
    static void castingWideingAndNarrowing() {
        byte b = (byte) 233; // FROM BYTE TO INT range of 256, thus 233 - 256 = -23
        System.out.println(b); // 23 final result

        int z = (int) 3.33;
        System.out.println(z);
    }

    static void exercise1to6() {
        //---- Exercise1 ----
        double firstWeight = 1000;
        double secondWeight = 2000;
        double averageWeight = (firstWeight + secondWeight) / 2;

        System.out.println("Firs Dino weights 1000kg. " + "Second Dino weights 2000kg. " + "Average weights is " +
                averageWeight + "kg.");

        // ---- Exercise2 ----
        double amountWeight = 1000;
        double amountFood = (1000 / 100) * 5;
        System.out.println("Dino needs " + amountFood + "kg of food daily.");

        // ---- Exercise3 ----
        int year = 2026;
        String leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ?
                "It's a leap year" : "It's not a leap year.";
        System.out.println(leap);

        // ---- Exercise4 ----
        int maxCapacity = 100;
        int actualCapacity = 50;
        boolean isMaxReached = (actualCapacity >= maxCapacity);
        System.out.println("Max capacity reached: " + isMaxReached);

        // ---- Exercise5 ----
        int q = 16;
        int a = 7;
        int check = q - a >= 0 ? q - a : -(q - a);
        System.out.println("The age difference between two dinosaurs is " + check);

        // ---- Exercise6 ----
        int threshold = 50;
        int actualThreshold = 55;
        String verification = actualThreshold >= threshold ? "threshold is reached." : "threshold in not reached.";
        System.out.println("The " + verification);
    }

    static void project() {
        double firstDinoWeight = 50.0;
        double secondDinoWeight = 100.0;
        double firstProportionWeight = (firstDinoWeight * 10) / 100;
        double secondProportionWeight = (secondDinoWeight * 10) / 100;
        System.out.println("First dino eats 10% of his body weight" + " of his weight for a day. So he needs " +
                firstProportionWeight + "kg.");
        System.out.println("First dino eats 10% of his body weight" + " of his weight for a day. So he needs " +
                secondProportionWeight + "kg.");
        int numberOfFeedings = 4;
        double firstPortionWeight = firstProportionWeight / numberOfFeedings;
        double secondPortionWeight = secondProportionWeight / numberOfFeedings;
        System.out.println("Our " + firstDinoWeight + "kg dinosaur needs " + firstProportionWeight + "kg daily," +
                "so he needs " + firstPortionWeight + "kg per feeding.");
        System.out.println("Our " + secondDinoWeight + "kg dinosaur needs " + secondPortionWeight + "kg daily," +
                "so he needs " + secondPortionWeight + "kg per feeding.");

    }
}

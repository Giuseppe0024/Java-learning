package dinosaur.c_OperatosAndCasting;

public class OperatorAndCasting {
    public static void main ( String [] args ) {

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


        System.out.println(3+4.0); // Java trasforma implicitamente il 3 int in 3.0 double
        System.out.println(4 == 4.0); // Java trasforma implicitamente il 4 int in 4.0 double


        boolean b1 = false, b2 = true; // b1 e b2 vengono dichiarate false
        boolean res = b1 && (b2 = false); // si risolve prima le parentesi, quindi b2 è falsa, b1 invece resta invariata
        // perciò abbiamo come risultato boolean res = false
        System.out.println(b1 + " " + b2 + " " + res);  // l'output finale è quindi false , true , false

        boolean b3 = false, b4 = false, b5 = false; // dichiaro 3 varibili booleane
        boolean bool = (b3 = true) || (b4 = true) && (b5 = true); //
        System.out.println(b3 + " " + b4 +  " " + b5 );






    }
}

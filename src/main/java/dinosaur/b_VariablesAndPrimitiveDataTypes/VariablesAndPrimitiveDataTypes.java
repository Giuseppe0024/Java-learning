package dinosaur.b_VariablesAndPrimitiveDataTypes;

public class VariablesAndPrimitiveDataTypes {
    public static void main (String [] args ) {
        int height  = 25;
        int lenght = 30;
        System.out.println(height);
        System.out.println(lenght);

        int age = 10;
        String name = "T-runnino";
        boolean carnivore = true;

        System.out.println("il nostro piccolo " + name + " di soli " + age + " anni.");

        if (carnivore)  {
            System.out.println("Si mangia molta carne.");

        } else {
            System.out.println("ciao");
        }


        String employeeName = "Giuseppe" ;
        System.out.println("employee name is " + employeeName);

        int safetyAverage = 10;
        System.out.println("Our park is a safety place where to be. Indeed visitors rated our safety service " +
                safetyAverage);

        System.out.println (age + " " + name + " " + carnivore);


        char species = 't';
        System.out.println(species);















    }
}

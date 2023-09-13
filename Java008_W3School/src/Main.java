public class Main {

    public static void main (String[] args)
    {
        // wyświetlanie tekstu

        System.out.println ("Siemka World");
        System.out.println ("to jest kolejna linia");
        System.out.println ("a tutaj znowu linia tekstu");
        System.out.print ("Teraz sprawdzam co bedzie jak dam samo print bez >ln<");
        System.out.print ("PRAWDOPODOBNIE tekst nie zaczyna się od nowej lini tylko kontynuujue kolejną\n\n");

        // wyświetlanie liczb

        System.out.println(3);
        System.out.println(358);
        System.out.println(50000 +"\n");

        // operacje matematyczne

        System.out.println("suma      7+7:  " + (7+7));
        System.out.println("różnica  21-7:  " + (21-7));
        System.out.println("iloraz   14:2:  " + (28/2));
        System.out.println("iloczyn  7x 2:  " + (7*2));

        System.out.println ("\nZMIENNE");

        int myNum = 15;
        System.out.println (myNum);
        myNum = 20;
        System.out.println (myNum);

        final int myFinalnum = 10;
        System.out.println (myFinalnum);
        float myFloatNum = 5.99f;
        System.out.println (myFloatNum);
        char myLetter = 'D';
        System.out.println (myLetter);
        boolean myBool = true;
        System.out.println (myBool);
        String myText = "Hello";
        System.out.println (myText);

        String firstName = "Olesia ";
        String lastName = "Kowalska";
        String fullName = firstName + lastName;
        System.out.println("\n"+ (fullName));

        byte myByte = 4;
        System.out.println("\n myByte:   " + (myByte));

        short myShort = 5000;
        System.out.println("myShort:    " + (myShort));

        float myFloat = 5.75f;
        System.out.println("myFloat:    " + (myFloat));

        double myDouble = 19.99d;
        System.out.println("myDouble:   " + (myDouble));

        char myChar = 'A';
        System.out.println ("myChar:    " + (myChar));

    }

}
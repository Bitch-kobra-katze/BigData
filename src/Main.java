import java.lang.reflect.Array;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        // initialize boomfiler
        BoomFilter boomfilet = new BoomFilter( 3,30);

        // a)
        // add six elements - current flase positiv???
        System.out.println("---Exercice 3a)------------------------------------------");
        int elemntCounter = 0;
        String[] elementArray = {"halloWorld", "Pruefunsphase", "Mittagspause", "Vorlesung", "Einheitskreis", "Projektarbeit", "Verfügbarkeit"};

        for(int i = 0; i < elementArray.length; i++){
            boomfilet.addElement(elementArray[i]);
            //FalsePos
            System.out.println( Math.pow(( 1 - Math.pow(Math.E, ((-90)/(i+1)))), 3) );
        }

        // b)
        System.out.println("---Exercice 3b)------------------------------------------");
        boomfilet.vector.print();
        String[] compareElementArray = {"der", "die", "das", "den", "wem", "dann"};

        for(int i = 0; i < compareElementArray.length; i++){
            Boolean exists = boomfilet.checkIfElementExists(compareElementArray[i]);
            System.out.println(compareElementArray[i]+" "+ exists+ " \n");
        }

        // c)
        System.out.println("---Exercice 3c)------------------------------------------");
        String[] otherElementArray = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
        for (String s : otherElementArray) {
            boomfilet.addElement(s);
        }

        // d)
        System.out.println("---Exercice 3d)------------------------------------------");
        for(int i = 0; i < compareElementArray.length; i++){
            Boolean exists = boomfilet.checkIfElementExists(compareElementArray[i]);
            if( exists){
                System.out.println("Element "+compareElementArray[i]+" is now false-"+ exists+ " \n");
            }

        }

    }
}



public class Main {

    public static void main(String[] args) {

        //BitVector1 test = new BitVector1(8);
        //test.print();
        //test.mutator(4,1);
        //Byte i = test.accessor(4);
        //test.print();
        //System.out.println("Accessor "+i);
        //System.out.println(te);

        // initialize boomfiler
        BoomFilter boomfilet = new BoomFilter( 3,30);

        // a)
        // add six elements - current flase positiv???
        System.out.println("---Exercice 3a)------------------------------------------");
        int elemntCounter = 0;
        boomfilet.addElement("halloWorld");
        elemntCounter++;
        System.out.println( Math.pow(( 1 - Math.pow(Math.E, ((-90)/elemntCounter))), 3) );
        boomfilet.addElement("Pruefunsphase");
        elemntCounter++;
        System.out.println( Math.pow(( 1 - Math.pow(Math.E, ((-90)/elemntCounter))), 3) );
        boomfilet.addElement("Mittagspause");
        elemntCounter++;
        System.out.println( Math.pow(( 1 - Math.pow(Math.E, ((-90)/elemntCounter))), 3) );
        boomfilet.addElement("Vorlesung");
        elemntCounter++;
        System.out.println( Math.pow(( 1 - Math.pow(Math.E, ((-90)/elemntCounter))), 3) );
        boomfilet.addElement("Einheitskreis");
        elemntCounter++;
        System.out.println( Math.pow(( 1 - Math.pow(Math.E, ((-90)/elemntCounter))), 3) );
        boomfilet.addElement("Projektarbeit");
        elemntCounter++;
        System.out.println( Math.pow(( 1 - Math.pow(Math.E, ((-90)/elemntCounter))), 3) );
        boomfilet.addElement("Verfügbarkeit");
        elemntCounter++;
        System.out.println( Math.pow(( 1 - Math.pow(Math.E, ((-90)/elemntCounter))), 3) );

        // b)
        System.out.println("---Exercice 3b)------------------------------------------");
        boomfilet.vector.print();
        Boolean exists = boomfilet.checkIfElementExists("der");
        Boolean exists1 = boomfilet.checkIfElementExists("die");
        Boolean exists2 = boomfilet.checkIfElementExists("das");
        Boolean exists3 = boomfilet.checkIfElementExists("den");
        Boolean exists4 = boomfilet.checkIfElementExists("wem");
        Boolean exists5 = boomfilet.checkIfElementExists("dann");
        System.out.println(exists+" "+exists1+" "+exists2+" "+exists3+" "+exists4+" "+exists5+" ");

        // c)
        System.out.println("---Exercice 3c)------------------------------------------");
        boomfilet.addElement("Montag");
        boomfilet.addElement("Dienstag");
        boomfilet.addElement("Mittwoch");
        boomfilet.addElement("Donnerstag");
        boomfilet.addElement("Freitag");
        boomfilet.addElement("Samstag");
        boomfilet.addElement("Sonntag");
    }
}

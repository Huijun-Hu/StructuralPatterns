public class Driver {
    public static void main(String[] args) {
        CharacterPropertiesFactory propFactory = new CharacterPropertiesFactory();
        DocumentEditor doc = new DocumentEditor("Flyweight/src/text.txt");

        Character H = new Character('H', propFactory.getProperties("Arial", "Black",
                12)); // Style 1
        Character e = new Character('e', propFactory.getProperties("Calibri", "Blue",
                12)); // Style 2
        Character l = new Character('l', propFactory.getProperties("Calibri",
                "Black", 12)); // Style 3
        Character o = new Character('o', propFactory.getProperties("Calibri", "Blue",
                12));
        Character W = new Character('W', propFactory.getProperties("Verdana",
                "Black", 14)); // Style 4
        Character o2 = new Character('o', propFactory.getProperties("Verdana",
                "Black", 14));
        Character r = new Character('r', propFactory.getProperties("Verdana",
                "Black", 14));
        Character l2 = new Character('l', propFactory.getProperties("Verdana",
                "Black", 14));
        Character d = new Character('d', propFactory.getProperties("Verdana",
                "Black", 14));

        Character C = new Character('C', propFactory.getProperties("Arial", "Red",
                14)); // Style 5
        Character S = new Character('S', propFactory.getProperties("Arial", "Red",
                14));

        Character five = new Character('5', propFactory.getProperties("Verdana",
                "Blue", 16)); // Style 6
        Character eight = new Character('8', propFactory.getProperties("Verdana",
                "Blue", 16));
        Character zero = new Character('0', propFactory.getProperties("Verdana",
                "Blue", 16));

        doc.add(H);
        doc.add(e);
        doc.add(l);
        doc.add(l);
        doc.add(o);
        doc.add(W);
        doc.add(o2);
        doc.add(r);
        doc.add(l2);
        doc.add(d);
        doc.add(C);
        doc.add(S);
        doc.add(five);
        doc.add(eight);
        doc.add(zero);
        doc.add(zero);

        System.out.println("Character " + C.getContent() + " has font: " +
                C.getProperties().getFont()
                + " color: " + C.getProperties().getColor() + " and size: " +
                C.getProperties().getSize());
        System.out.println("Character properties combination # :" +
                propFactory.getSize());

        // A new style made
        doc.edit(C, propFactory.getProperties("Arial", "Blue", 16)); // style 7

        System.out.println("Character " + C.getContent() + " has font: " +
                C.getProperties().getFont()
                + " color: " + C.getProperties().getColor() + " and size: " +
                C.getProperties().getSize());
        System.out.println("Character properties combination # :" +
                propFactory.getSize());

        doc.save();
        System.out.println(doc.load());

    }
}

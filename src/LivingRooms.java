public class LivingRooms {
    public static void main(String[] args) {
        Armchair armchair1 = new Armchair(2, "green");
        Couch couch1 = new Couch(1, "Sofia", "green", armchair1);

        Armchair armchair2 = new Armchair(1, "blue");
        Couch couch2 = new Couch(2, "Elena", "blue", armchair2);


        System.out.println("Living Room nr: " + couch1.livingRomNumber + " ," + "Couch Name: " + couch1.name + " ," + "Colour: " + couch1.colour + " ,"
                + " ," + "Armchair quantity: " + couch1.armchair.quantity + " ," + "Armchair colour: " + couch1.armchair.colour);

        System.out.println("Living Room nr: " + couch2.livingRomNumber + " ," + "Couch Name: " + couch2.name + " ," + "Colour: " + couch2.colour + " ,"
                + " ," + "Armchair quantity: " + couch2.armchair.quantity + " ," + "Armchair colour: " + couch2.armchair.colour);


    }
}

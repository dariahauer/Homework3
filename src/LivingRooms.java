public class LivingRooms {
    public static void main(String[] args) {
        Couch couch1 = new Couch();
        couch1.livingRomNumber=1;
        couch1.name = "Sofia";
        couch1.colour="green";
        couch1.armchair = new Armchair();
        couch1.armchair.quantity=2;
        couch1.armchair.colour="greeen";
        couch1.armchair.quantity=2;


        Couch couch2 = new Couch();
        couch2.livingRomNumber=2;
        couch2.name="Elena";
        couch2.colour="blue";
        couch2.armchair = new Armchair();
        couch2.armchair.quantity=1;
        couch2.armchair.colour="blue";

        System.out.println("Living Room nr: " + couch1.livingRomNumber + " ," + "Couch Name: " + couch1.name + " ," + "Colour: " + couch1.colour + " ,"
                + " ," + "Armchair quantity: " + couch1.armchair.quantity + " ," + "Armchair colour: " + couch1.armchair.colour);

        System.out.println("Living Room nr: " + couch2.livingRomNumber + " ," + "Couch Name: " + couch2.name + " ," + "Colour: " + couch2.colour + " ,"
                + " ," + "Armchair quantity: " + couch2.armchair.quantity + " ," + "Armchair colour: " + couch2.armchair.colour);


    }
}

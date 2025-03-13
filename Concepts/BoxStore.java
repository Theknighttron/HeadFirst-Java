class Box {
    private double width;
    private double height;
    private double depth;

    // Pass object to a constructor
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Constructor used when all dimensions are specified
    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // Constructor used when no dimensions are specified
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }

    // Compute the volume
    double volume() {
        double vol = (width * height * depth);
        return vol;
    }

    // set box dimensions
    // void setDim(double w, double h, double d) {
    // width = w;
    // height = h;
    // depth = d;
    // }
}

class BoxWeight extends Box {
    double weight;

    // Constructor for an object
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    // Constructor when all the parameter are specified
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); // Call superclass constructor
        weight = m;
    }

    // Constructor when no parameter is specified
    BoxWeight() {
        super();
        weight = -1;
    }

    // Constructor when the cube is created
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight {
    double cost;

    // Pass object to the constructor
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    // Constructor when all the parameter are passed
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // Constructor when no parameter are passed
    Shipment() {
        super();
        cost = -1;
    }

    // Constructor when cube is created
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

public class BoxStore {
    public static void main(String[] args) {
        // Box mybox1 = new Box(10, 20, 15);
        // Box mybox2 = new Box(3, 6, 9);

        // Assign new values to mybox's
        // mybox.setDim(10, 20, 15);

        // System.out.println("Box one volume is: " + mybox1.volume());
        // System.out.println("Box two volume is: " + mybox2.volume());

        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.5);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.007);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight cube = new BoxWeight(3, 2);
        BoxWeight clone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume of mybox1: " + vol);
        System.out.println("Weight of mybox1: " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Volume of mybox2: " + vol);
        System.out.println("Weight of mybox2: " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Volume of mybox2: " + vol);
        System.out.println("Weight of mybox3: " + mybox3.weight);
        System.out.println();

        vol = cube.volume();
        System.out.println("Volume of cube: " + vol);
        System.out.println("Weight of cube: " + cube.weight);
        System.out.println();

        vol = clone.volume();
        System.out.println("Volume of clone: " + vol);
        System.out.println("Weight of cube: " + clone.weight);

    }
}

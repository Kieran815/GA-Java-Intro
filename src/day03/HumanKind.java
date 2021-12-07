package day03;

public class HumanKind {

    // Constructors MUST have the SAME NAME AS THE CLASS
    // Constructors are ALWAYS PUBLIC
        // have to be to create instances of class
    // Constructors get INVOKED FIRST
        // Class constructor sets up object, so creating a `new` instance calls to constructor first
    public HumanKind() {
        System.out.println("Creating HumanKind Object...");

    }

    // STATIC VARIABLES BELONG TO THE CLASS
        // not to the instance

    // var set to `private` won't be accessible to classes outside where it was made
//    private static String getHumanType = "Homosapien";
    public static String humanType = "Homosapien";

    // below var belongs to class
        // `static` variables belong to the class, not to the instance
        // this prevents instances from changing/accessing variable data/value;
    private static String zoomLInk = "https://zoom.com";

    // Instance Variables, aka `Fields` (receive params and pass as args to newly created object)
    private int id;
    private String name;
    private String address;

    // `final` variables cannot be changed during runtime:
    private static final String LOCATION = "CHI";


    // to update instance variables
    // CREATE A `setter`
    public void setId(int id ) {
        this.id = id;
    }

    // to retrieve data,
    // CREATE A 'getter`
    public int getId() {
        return id;
    }


    // PRACTICE: WRITE SETTER AND GETTER FOR NAME AND ADDRESS:
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
}

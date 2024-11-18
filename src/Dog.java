public class Dog extends  Animal{
    private String earShape;
    private String tailShape;
    public Dog(){
        super("Mutt" , "wood" , 150);
    }

    public Dog(String type , double weight){
        this(type , weight, "Perky" , "Curled" );
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "Small" : weight < 35 ? "Medium" : "Large" , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}

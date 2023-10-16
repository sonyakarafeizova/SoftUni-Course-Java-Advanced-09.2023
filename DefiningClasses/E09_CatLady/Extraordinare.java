package DefiningClasses.E09_CatLady;

public class Extraordinare extends Cat {

    private double decibelsOfMeows;
    public Extraordinare(String name, String type,double decibelsOfMeows) {
        super(name, type);
        this.decibelsOfMeows=decibelsOfMeows;
    }
    public String toString() {
        return String.format("%s %.2f",super.toString(),this.decibelsOfMeows);
    }
}

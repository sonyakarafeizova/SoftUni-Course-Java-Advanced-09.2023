package DefiningClasses.E04_RawData;

public class Tyres {
    double tyre1Pressure;
    int tyre1Age;
    double tyre2Pressure;
    int tyre2Age;
    double tyre3Pressure;
    int tyre3Age;
    double tyre4Pressure;
    int tyre4Age;


    public Tyres(double tyre1Pressure, int tyre1Age, double tyre2Pressure, int tyre2Age, double tyre3Pressure, int tyre3Age, double tyre4Pressure, int tyre4Age) {
        this.tyre1Pressure = tyre1Pressure;
        this.tyre1Age = tyre1Age;
        this.tyre2Pressure = tyre2Pressure;
        this.tyre2Age = tyre2Age;
        this.tyre3Pressure = tyre3Pressure;
        this.tyre3Age = tyre3Age;
        this.tyre4Pressure = tyre4Pressure;
        this.tyre4Age = tyre4Age;
    }
    public boolean hasTyresWithPressureUnder1(){
        return tyre1Pressure<1||tyre2Pressure<1||tyre3Pressure<1||tyre4Pressure<1;
    }
}

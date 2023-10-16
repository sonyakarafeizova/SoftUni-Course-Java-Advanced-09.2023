package DefiningClasses.E04_RawData;

public class Engine {

    int engineSpeed;
    int enginePower;

    public Engine(int engineSpeed,int enginePower){
        this.engineSpeed=engineSpeed;
        this.enginePower=enginePower;
    }
    public boolean hasTyresEngineABove250(){
        return enginePower>250;
    }
}

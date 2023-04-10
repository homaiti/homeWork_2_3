public class Bicycle extends Transport{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void checkTrailer() {
        return;
    }
    @Override
    public void checkEngine() {
        return;
    }
}

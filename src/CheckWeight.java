public class CheckWeight implements CheckUnit{
    @Override
    public boolean check(Tank tank) {
        return tank.getWEIGHT()<=600;
    }
}

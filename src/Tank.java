public class Tank extends BattleUnit{
    private final int ENGINEPOWER;
    private final int CALIBER;
    private final int SPEED;
    private final int POWER;
    private final int HOWMANYGUNS;


    public Tank(int weight, String name,boolean humanoid, String race, int enginePower, int caliber, int speed, int howmanyguns) {
        super(weight, name,humanoid, race);
        ENGINEPOWER = enginePower;
        POWER = enginePower;
        CALIBER = caliber;
        SPEED = speed;
        HOWMANYGUNS = howmanyguns;
    }

    public int getENGINEPOWER() {
        return ENGINEPOWER;
    }

    public int getCALIBER() {
        return CALIBER;
    }

    public int getSPEED() {
        return SPEED;
    }

    public int getPOWER() {
        return POWER;
    }

    public int getHOWMANYGUNS() {
        return HOWMANYGUNS;
    }

    @Override
    public String toString() {
        return "Tank{" +
                "ENGINEPOWER=" + ENGINEPOWER +
                ", CALIBER=" + CALIBER +
                ", SPEED=" + SPEED +
                ", POWER=" + POWER +
                ", HOWMANYGUNS=" + HOWMANYGUNS +
                '}';
    }
}

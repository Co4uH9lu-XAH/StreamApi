public class Aircraft extends BattleUnit{
    private final int BOMBPOWER;
    private final int CLIMB;
    private final int ROCKETLAUNCHER;
    private final int HOWMANYMASHINGUNS;
    private final int RANGE;



    public Aircraft(int weight, String name, boolean humanoid, String race, int bombpower, int climb, int rocketlauncher, int howmanymashinguns, int range) {
        super(weight, name, humanoid, race);
        BOMBPOWER = bombpower;
        CLIMB = climb;
        ROCKETLAUNCHER = rocketlauncher;
        HOWMANYMASHINGUNS = howmanymashinguns;
        RANGE = range;
    }

    public int getBOMBPOWER() {
        return BOMBPOWER;
    }

    public int getCLIMB() {
        return CLIMB;
    }

    public int getROCKETLAUNCHER() {
        return ROCKETLAUNCHER;
    }

    public int getHOWMANYMASHINGUNS() {
        return HOWMANYMASHINGUNS;
    }

    public int getRANGE() {
        return RANGE;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "BOMBPOWER=" + BOMBPOWER +
                ", CLIMB=" + CLIMB +
                ", ROCKETLAUNCHER=" + ROCKETLAUNCHER +
                ", HOWMANYMASHINGUNS=" + HOWMANYMASHINGUNS +
                ", RANGE=" + RANGE +
                '}';
    }
}

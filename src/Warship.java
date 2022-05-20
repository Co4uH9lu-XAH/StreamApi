public class Warship extends BattleUnit{
    private final int HOWMANYARTILLERY;
    private final int TORPEDOLAUNCHER;
    private final int MINELAUNCHER;

    public Warship(int weight, String name, boolean humanoid, String race, int howmanyartillery, int torpedolauncher, int minelauncher) {
        super(weight, name,humanoid, race);
        HOWMANYARTILLERY = howmanyartillery;
        TORPEDOLAUNCHER = torpedolauncher;
        MINELAUNCHER = minelauncher;
    }
}

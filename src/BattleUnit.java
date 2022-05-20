public abstract class BattleUnit {
    private final int WEIGHT;
    private final String NAME;
    private final boolean HUMANOID;
    private final String RACE;

    public BattleUnit(int weight, String name, boolean humanoid, String race) {
        WEIGHT = weight;
        NAME = name;
        HUMANOID = humanoid;
        RACE = race;
    }

    public int getWEIGHT() {
        return WEIGHT;
    }

    public String getNAME() {
        return NAME;
    }

    public boolean isHUMANOID() {
        return HUMANOID;
    }

    public String getRACE() {
        return RACE;
    }
}

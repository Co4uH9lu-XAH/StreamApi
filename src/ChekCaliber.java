// ***
public class ChekCaliber implements CheckUnit{

    @Override
            // ****
    public boolean check(Tank tank) {
        return tank.getCALIBER()<300;
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Tank tank1 = new Tank(56, "Mamont-tank", true, "SovietUnion", 1000, 115, 36, 2);
        Tank tank2 = new Tank(130, "Devastator", true, "Harkonnen", 3000, 155, 46, 2);
        Tank tank3 = new Tank(130, "Ratte", true, "NaziGermany", 100500, 205, 15, 5);
        Tank tank4 = new Tank(130, "Mouse", true, "NaziGermany", 1500, 155, 15, 2);
        Tank tank5 = new Tank(500, "IronKaput", true, "KeiserGermany", 100, 506, 1, 1);

        Aircraft aircraft1 = new Aircraft(1, "И-16", true, "SovietUnion", 50, 15, 6, 4, 300);
        Aircraft aircraft2 = new Aircraft(2, "FokkeWolf", true, "NaziGermany", 100, 20, 0, 4, 350);
        Aircraft aircraft3 = new Aircraft(3, "Zero", true, "JapanEmpire", 0, 25, 0, 2, 150);
        Aircraft aircraft4 = new Aircraft(4, "B-24", true, "USA", 1500, 10, 0, 8, 1500);
        Aircraft aircraft5 = new Aircraft(5, "SuperFortes", true, "USA", 100, 5, 0, 10, 2500);

        Warship warship1 = new Warship(100500, "Yamato", true,"JapanEmpire", 9, 6, 0 );
        Warship warship2 = new Warship(100500, "Bismark", true,"NaziGermany", 12, 9, 3 );
        Warship warship3 = new Warship(100500, "QueenGeorge", true,"GreatBritain", 10, 3, 8);
        Warship warship4 = new Warship(100500, "Marat", true,"SovietUnion", 6, 0, 0 );
        Warship warship5 = new Warship(100500, "Сanoe", true,"Indian", 0, 0, 0 );

        TrueWeapon trueWeapon1 = new TrueWeapon(500, "Send Worm", false, "ArrakisBeast");
        TrueWeapon trueWeapon2 = new TrueWeapon(30, "Ultralisk", false, "Zerg");
        TrueWeapon trueWeapon3 = new TrueWeapon(1, "Shaadarah", false, "OldGods");
        TrueWeapon trueWeapon4 = new TrueWeapon(2, "Hydrolisk", false, "Zerg");
        TrueWeapon trueWeapon5 = new TrueWeapon(3, "Robocop", false, "Police");

        ArrayList<Tank> array = new ArrayList<>();

        array.add(tank1);
        array.add(tank2);
        array.add(tank3);
        array.add(tank4);
        array.add(tank5);

        sort(array, 200);

    }

    static void sort (ArrayList<Tank> array, int a ){
        for (Tank tank: array){
            if(tank.getENGINEPOWER()>a){
                System.out.println(tank);
            }
        }
    }
}

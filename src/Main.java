import java.util.ArrayList;

/*
Список с танками отсортирован таким образом:
* - Создал интерфейс CheckUnit, с boolean методом принимающим в качестве аргумента сортируемый объект.
** - В классе Main создал foEach, в котором вывожу на экран требуемые обекты, критерии сортировки которых
определяются в классе, реализовывающем интерфейс. *** В данном случае public class ChekCaliber implements CheckUnit
**** - критерии сортировки определяются в переопределенном методе check().
 */

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

        Warship warship1 = new Warship(100500, "Yamato", true, "JapanEmpire", 9, 6, 0);
        Warship warship2 = new Warship(100500, "Bismark", true, "NaziGermany", 12, 9, 3);
        Warship warship3 = new Warship(100500, "QueenGeorge", true, "GreatBritain", 10, 3, 8);
        Warship warship4 = new Warship(100500, "Marat", true, "SovietUnion", 6, 0, 0);
        Warship warship5 = new Warship(100500, "Сanoe", true, "Indian", 0, 0, 0);

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

        ArrayList<Aircraft> airs = new ArrayList<>();

        airs.add(aircraft1);
        airs.add(aircraft2);
        airs.add(aircraft3);
        airs.add(aircraft4);
        airs.add(aircraft5);

        Main test = new Main();
        test.checkUnit(array, new ChekCaliber());
        System.out.println("++++++++++++++++++++++++++++++++++++++++");

        // Сортировка списка air с помощью анонимного класса. Все тоже самое, но не нужно создавать класс, в
        // котором будет переопредеоен метод проверки. Просто передаем в аргументы метода chekUnit2
        // список и public interface CheckAirs и IDEA сгенерирует все сама.
        
        test.checkUnit2(airs, new CheckAirs() {
            @Override
            public boolean check(Aircraft air) {
                return air.getRANGE()>400;
            }
        });
        System.out.println("-----------------------------------------");

        // А вот и само лямбда-выражение. По сути, это упрощенная запись сортировки анонимного класса
        // записи выше. Вместо создания анонимного класса и переопределения метода  chekUnit2 просто пишем
        // это: (Aircraft air) -> {return air.getCLIMB()<10;});

        test.checkUnit2(airs, (Aircraft air) -> {return air.getCLIMB()<10;});

        System.out.println("///////////////////////////////////////////////////");

        // Еще более короткая запись лямбды (список,объект -> условие возврата true);
        test.checkUnit(array, tank -> tank.getSPEED()>=30);

        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        // Если лямбда планируется использоваться много раз, можно присвоить его переменной ca вот так:
        CheckAirs ca = (Aircraft a) -> a.getBOMBPOWER()>200;
        // И затем передавать в метод в качестве параметра
        test.checkUnit2(airs, ca);

        // Итого: лямбда-выражения работают с интерфейсами, в котором имеется только 1 абстрактный метод.
        // Затем, для написания лямбды нужен метод, принимающий в качестве параметра интерфейс.
        // И воуля: можно писать лямбду. 

    }
    //**
    void checkUnit(ArrayList<Tank> array, ChekCaliber cc){
        for (Tank tank: array){
            if(cc.check(tank)){
                System.out.println(tank);
            }
        }
    }

    void checkUnit(ArrayList<Tank> array, CheckUnit cw){
        for (Tank tank: array){
            if(cw.check(tank)){
                System.out.println(tank);
            }
        }
    }

    void checkUnit2(ArrayList<Aircraft> array, CheckAirs cr) {
        for (Aircraft air : array) {
            if (cr.check(air)) {
                System.out.println(air);
            }
        }
    }
}

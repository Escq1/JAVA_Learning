import com.sun.org.apache.xpath.internal.objects.XString;

public class Sereja {
    public static void main(String[] args) {
        int doorsCountX = 0;
        doorsCountX = addDoor(doorsCountX); //10
        returnDoors(doorsCountX);

        doorsCountX = removeDoor(doorsCountX);//5
        returnDoors(doorsCountX);

        doorsCountX = cycleDoors(doorsCountX);//10

        doorsCountX = doorsCountX +3;
        returnDoors(doorsCountX);

}
    private static int addDoor(int doorsCount10) {
        doorsCount10 = doorsCount10 + 10;
        return doorsCount10;
    }
    private static int removeDoor(int doorsCount5) {
        doorsCount5 = doorsCount5 - 5;
        return doorsCount5;
    }
    // Задание 3: Сделать отдельный метод для вывода в консоль колличества дверей
    private static void returnDoors(int doorsCountY) {
        System.out.println("Колличество дверей = " + doorsCountY);

    }
// Задание 4*: Сделать отдельный метод в котором вы добавляете по 1 двери в цикле и выводите на консоль
    private static int cycleDoors(int doorsCountZ) {
        for (int i=0; i<5;) {
            doorsCountZ = doorsCountZ + 1;
            returnDoors(doorsCountZ);
            i++;
        }
        return doorsCountZ;
        }

    }



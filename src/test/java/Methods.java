// Задание 1: Добавить ещё 10 дверей к существующим
// Задание 2: Убрать 5 дверей
// Задание 3: Сделать отдельный метод для вывода в консоль колличества дверей
// Задание 4*: Сделать отдельный метод в котором вы добавляете по 1 двери в цикле и выводите на консоль
// Пройти по циклу надо 5 раз
// Попробовать использовать уже существующие методы в новом

public class Methods {
    public static void main(String[] args) {
        int doorsCount = 0;

// Добавляем дверь
        doorsCount = addOneDoor(doorsCount);
// Выводим двери
        printNumDoors(doorsCount);

// Добавляем 10 дверей
        for(int i=0;i<10;i++){
            doorsCount = addOneDoor(doorsCount);
        }
// Выводим двери
        printNumDoors(doorsCount);

// Убираем 5 дверей
        for(int i=0;i<5;i++){
            doorsCount=decOneDoor(doorsCount);
        }
// Выводим двери
        printNumDoors(doorsCount);

// Двери в цикле (+5)
       doorsCount = cycleDoors(doorsCount);

    }

    private static int addOneDoor(int addDoor) {
        addDoor++;
        return addDoor;
    }

    private static int decOneDoor(int decDoor) {
        decDoor--;
        return decDoor;
    }

    private static void printNumDoors(int numDoors){
        System.out.println("Current numbers of Doors is: " + numDoors);
    }

    private static int cycleDoors(int addDoor){
        for (int i=0;i<5;i++){
            addDoor = addOneDoor(addDoor);
            printNumDoors(addDoor);
        }
        return addDoor;
    }

}

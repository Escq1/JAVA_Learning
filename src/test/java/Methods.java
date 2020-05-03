public class Methods {
    public static void main(String[] args) {
        int doorsCount = 5;
        System.out.println("Колличество дверей: " + doorsCount);

        doorsCount = addOneDoor(doorsCount);
        System.out.println("Колличество дверей: " + doorsCount);

        doorsCount = addTwoDoors(doorsCount);
        System.out.println("Колличество дверей: " + doorsCount);

        // Задание 1: Добавить ещё 10 дверей к существующим
        // Задание 2: Убрать 5 дверей
        // Задание 3: Сделать отдельный метод для вывода в консоль колличества дверей
        // Задание 4*: Сделать отдельный метод в котором вы добавляете по 1 двери в цикле и выводите на консоль
        // Пройти по циклу надо 5 раз
        // Попробовать использовать уже существующие методы в новом
    }

    private static int addOneDoor(int doorsCountOlolo) {
        doorsCountOlolo = doorsCountOlolo + 1;
        return doorsCountOlolo;
    }

    private static int addTwoDoors(int doorsCountOlolo) {
        doorsCountOlolo = doorsCountOlolo + 2;
        return doorsCountOlolo;
    }

}

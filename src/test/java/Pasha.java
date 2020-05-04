public class Pasha {

    public static void main(String[] args) {
        int X = 0;
        int[] array = {1, 2, 4, 10, 2, 5, 9, 0, 3, 5};

        X = comparMax(array);
        returnToConsole(X);

        X = comparMin(array);
        returnToConsole(X);

        bubleArray(array);

        comparAvg(array);
    }

// Поиск максимального значения
    public static int comparMax(int[] myarray) {
        int Max = myarray[0];
        for(int i=0; i<myarray.length;i++){
            if(Max < myarray[i]){
                Max =myarray[i];
            }
        }
        return Max;
    }

// Поиск минимального значения
    public static int comparMin(int[] myarray){
        int Min = myarray[0];
        for(int i=0;i<myarray.length;i++){
            if(Min > myarray[i]){
                Min = myarray[i];
            }
        }
        return Min;
    }

// Вывод среднего значения
    public static void comparAvg(int[] myarray) {
        int avg = 0;
        for (int i = 0; i < myarray.length; i++) {
          avg=avg+myarray[i];
        }
        avg = avg/myarray.length;
        System.out.println("\n" + "Average element is: " + avg);
    }

// Задание* Упорядочить все элементы массива
    public static void bubleArray(int[] myarray){
        int less = myarray[0];
        int more = myarray[0];
        int avg = myarray[0];
        for(int y=0; y<myarray.length;y++) {
            for (int i = 0; i < myarray.length - 1; i++) {
                if (myarray[i] > myarray[i + 1]) {
                    less = myarray[i + 1];
                    more = myarray[i];
                    myarray[i] = less;
                    myarray[i + 1] = more;
                }
            }
        }
        for(int i=0;i<myarray.length;i++) {
            System.out.print(myarray[i] + " ");
        }
    }

// Вывод на консоль
    public static void returnToConsole(int number){
        System.out.println(number);
    }
}
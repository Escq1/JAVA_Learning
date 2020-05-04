public class Pasha {


    public static void main(String[] args) {
        int X = 0;

        int[] array = new int[] {1, 2, 4, 10, 2, 5, 9, 0, 3, 5};

        X = comparison(array);
        returnToConsole(X);
    }



    public static int comparison(int[] myarray) {
        int X = myarray[0];
        for(int i=0; i<myarray.length-1;i++){
            if(X < myarray[i]){
                X =myarray[i];
            }
        }
        return X;
    }

    public static void returnToConsole(int number){
        System.out.println(number);
    }

}

// Массив из 10 чисел, поиск самого максимального значения
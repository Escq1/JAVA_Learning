import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.jar.JarOutputStream;

public class ElementaryAlgorithms {
    public static void searchMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length;) {
            if (max < array[i]) {
                max = array[i];
            }
            i++;
        }
        System.out.println("Максимально значение массива = " + max);

    }
    public static void searchMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length;) {
            if (min > array[i]) {
                min = array[i];
            }
            i++;
        }
        System.out.println("Минимальное значение массива = " + min);
    }
    public static void searchIncrease(int[] array) {
        int min, max;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {  // {40,5,34,41,58}
                max = array[i];
                min = array[i+1];
                array[i] = min;
                array[i+1] = max;
            }


        }
        System.out.print("Сортировка по возрастанию : " );
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" ");
        }
        System.out.println();
    }
    public static void searchAvg(int[] array) {
        double sum = array[0];
        for( int i = 1; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avg = sum/array.length;
        System.out.println("Среднее значение = " + avg);
    }

    }
// упорядочить все эллементы в массиве по возрастанию**
// вывод минимального значения.
// вывод среднего значения(написать отдельные методы).


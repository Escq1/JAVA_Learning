public class For {


    public static void main(String[] args) {
//        String[] names = new String[] { "Маша", "Саша", "Даша", "Серёжа","Пашок"};
//        for (int i = 1; i < 4; i++) {
//            if (names[i].equals("Даша")) { // икулс-метод для сравнения обЪектов, который создаются на основе классов (вместо "==")
//                continue; //пропускает выбранное значение и переходит к следующей итерации
//            }
//
//            System.out.println("Имя № " + i + " " + names[i]);
//        }
//        for (String name : names) {
//            if(name.equals("Даша")) {
//                break;// заканчивает цикл и выходит
//            }
//            System.out.println("Имя № " + name);
//        }

        int[] array ={40,5,34,41,58};
        ElementaryAlgorithms.searchMax(array);
        ElementaryAlgorithms.searchMin(array);
        ElementaryAlgorithms.searchIncrease(array);
        ElementaryAlgorithms.searchAvg(array);
    }


}




import java.util.Arrays;
import java.util.Scanner;

public class Zadanie {
    //    public static void main(String[] args) {
//        System.out.println("Wrait your weight: ");
//        Scanner scan = new Scanner(System.in);
//        double weight = scan.nextDouble();//вес
//        System.out.println("Wrait your height: ");
//        double height = scan.nextDouble(); //рост
//        Bum.massBody(weight, height);
//
//    }
//
//    public static class Bum {
//        public static void massBody(double weight, double height) {
//            double delem =  weight / (height*height);
//            if (delem >= 16 && delem <= 18.5) {
//                System.out.println("Eh bolhte");
//            }else if (delem >= 18.5 && delem <= 25) {
//                System.out.println("Eh bolhte");
//            }else if (delem >= 25 && delem <= 30) {
//                System.out.println("Normal");
//            }else if (delem >= 30 && delem <= 35) {
//                System.out.println("not Normal");
//            }else if (delem >= 35 && delem <= 40) {
//                System.out.println("very not Normal");
//            }else{
//                System.out.println("not true");
//            }
//
//        }
//    }
//}


//    public static void main(String[] args) {
//        String n = "Ivan Ivanov";
//        String n1 = "ivan ivanov";
//        checkUserName(n,n1);
//    }
//
//    public static void checkUserName (String n, String n1) {
//            if (n.equalsIgnoreCase(n1) == true) {
//                System.out.println(" not cjrectli");
//                System.out.println(" This is: " + n.length());
//            } else {
//                System.out.println("Nice name");
//            }
//
//    }


//    public class Main {
//        public static void main(String[] args) {
//            System.out.println(removeWhiteSpaces("А роза упала на лапу Азора"));
//        }
//
//        private static String removeWhiteSpaces(String str) {
//            return str.replaceAll(" ", "");
//        }
//    }
//}


//    public static void main(String[] args) {
//        String n = "Sam Sam";
//        String n1 = "sam sam";
//        checkUserName(n, n1);
//    }
//
//        private static void checkUserName(String n,String n1) {
//        String n2copy = n1.replace(" ", "");
//            if (n.equalsIgnoreCase(n1) == true) {
//                System.out.println("not correct");
//            }else {
//                System.out.print("cool");
//                System.out.print("COOL neme" + n1.length());
//                System.out.println(" a not probel this num " + n2copy.length() );
//
//            }
//        }
//}


//import java.util.Scanner;
//
//    public class Main {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//            boolean isCorrectName = false;
//            while (!isCorrectName) {
//                String name = scanner.nextLine(); //Считывает строку из System.in
//                isCorrectName = checkName(name);
//                if (!isCorrectName) System.out.println("Введите корректное имя!");
//            }
//        }
//
//        private static boolean checkName(String name) {
//            String[] word = name.trim().split(" ");
//            return word.length == 3;
//        }
//    }
//}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        boolean isCorrectName = false;
//        while (!isCorrectName) {
//            String name = scanner.nextLine(); //Считывает строку из System.in
//            isCorrectName = checkName(name);
//            if (!isCorrectName) {
//                System.out.println("Введите корректное имя!");
//            } else {
//                System.out.println(formatName(name));
//            }
//        }
//    }
//
//    private static boolean checkName(String name) {
//        String[] words = name.trim().split(" ");
//        return words.length == 3;
//    }
//
//    private static String formatName(String name) {
//        String[] words = name.trim().split(" ");
//        sortByLength(words);
//
//    }
//
//    private static void sortByLength(String[] words) {
//        //Написать код здесь
//    }
//}

//public static void main(String[] srgs){
//    int[] num = { 5, 24, 3, 66, 38, 16, 27};
//    Arrays.sort(num);
//    System.out.println(num[2]);
//}
//}


//задача 2 строки
//   public static void main(String[] srgs){
//      System.out.println("Name: "); // введлите имя
//      Scanner scan = new Scanner(System.in);// консоль для ввода
//      String name = scan.nextLine(); // счит имя
//      System.out.println("Possword: ");
//      Scanner scanPos = new Scanner(System.in);
//      String possword = scanPos.nextLine();// счит пароль
//
//      if (possword.length() < 8 || possword.length() > 15){ // если : длинна пароля < 8 ||(и) длин пароля > 15
//          do{// действие тело цикла
//              System.out.println(" ot 8 do 15 simvolov");
//              possword = scanPos.nextLine();// счит строки пороля
//          }while (possword.length() < 8 || possword.length() > 15);// условие выполнения
//          // выполняет пока дает значение true
//      }
//       System.out.printf("Nice jop Your name:  %s    Your possword: %n",name,possword);
// }
//}

    public static void main(String[] srgs){
        int i,j; // создаем
        String[] res = new String[5];// создаем строовой массив res  с 5 ячейками
    int [][] balls ={ //создаем [] в [] balls для баллов
            {2,3,4,5,6},
            {1,2,3,4,5},
            {3,4,5,6,7},
            {2,4,3,5,6},
            {1,3,2,4,5}
    };

    int [] sumBal = new int[5]; // создаем Int-овый массив для с ячейками для суммы баллов
    String[] name = {"Sv","Co","Gr","PO","Va"}; // создаем строковой массив  для имени

        for (i = 0; i < name.length;i++) { // ???? i проходит по всем именам
            for (j = 0; j < balls[i].length; j++) // j проходит по всем баллам?????
                sumBal[i] += balls[i][j];// не понимаю что происходит в цикле for
        }
        res[i] = name[i] + " " + sumBal[i]; // ???????
        System.out.println(res[i]);

    }
}


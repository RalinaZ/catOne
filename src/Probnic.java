import java.util.Scanner;

public class Probnic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = scanner.nextInt();
        int result = 0;
        // обнуление текущего результата и реализована проверка не знаю как сделать, еще думаю над этим


        while (true) {
            char operation = scanner.next().charAt(0);
            int operand2 = scanner.nextInt();


            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
                case 'C':
                    System.out.println("Agein");
                    break;
                case 's':
                    System.out.println("Exit");
                default:
                    System.out.println("not correct");
                    break;
            }
            System.out.println("Result: " + result);
            operand1 = result ;

        }
   }
}


import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);
// beolvassuk az első számot
            System.out.print("Enter the first number / Add meg az első számot: ");
            double first = reader.nextDouble();
            System.out.print("Enter second numbers/ Add meg a második számot: ");

// válassz műveletet
            double second = reader.nextDouble();
            System.out.print("Enter an operator/ Válassz műveletet  +, -, *, / : ");
            char operator = reader.next().charAt(0);
            double result;
//switch case for each of the operations
            switch(operator)
            {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    result = first / second;
                    break;
// operator doesn't match any case constant (+, -, *, /)


                default:
                    System.out.printf("Érvénytelen műveletet adtál meg");
                    return;
            }
//printing the result of the operations
            System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
        }
    }
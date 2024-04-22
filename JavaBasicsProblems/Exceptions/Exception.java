import java.io.*;
import java.util.*;

public class Solution {

    public static boolean is32BitSignedInteger(int number) {
        return (number >= -2147483648 && number <= 2147483647);
    }

    public static int getValidInput(String number) {
        try {
            Integer integer = Integer.valueOf(number);
            if(is32BitSignedInteger(integer.intValue()))
                return integer.intValue();
            else
                throw new InputMismatchException("java.util.InputMismatchException");
        } catch (NumberFormatException e) {
            throw new InputMismatchException("java.util.InputMismatchException");
        }
    }

    public static int getComputationResult( int x, int y) throws Exception{
        return x/y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        try{
            int result = getComputationResult(getValidInput(x),getValidInput(y));
            System.out.print(result);
        }catch(InputMismatchException exception){
            System.out.print(exception.getMessage());
            scanner.close();
        }catch(ArithmeticException arithmeticException){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }catch(Exception exception){
            System.out.println(exception.getClass());
        }
    }
}

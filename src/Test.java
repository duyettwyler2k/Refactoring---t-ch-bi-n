import java.util.Scanner;

public class Test {
    public static boolean isDivisibleBy3(int number){
        return number%3==0;
    }
    public static boolean isDivisibleBy5(int number){
        return number%5==0;
    }
    public static final String FIZZ="FIZZ";
    public static final String BUZZ="BUZZ";
    public static final String FIZZ_BUZZ="FIZZ BUZZ";
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so");
        number = scanner.nextInt();
        boolean isDivisibleBy3AndBy5=isDivisibleBy3(number) &&isDivisibleBy5(number);
        if (isDivisibleBy3AndBy5) {
            System.out.println(FIZZ_BUZZ);
        } else if (isDivisibleBy5(number)) {
            System.out.println(BUZZ);
        } else if (isDivisibleBy3(number)){
            System.out.println(FIZZ);
        } else System.out.println(number);
    }
}


import java.util.Scanner;

public class Main {

    static int powerRec(int base, int pow){
        if (base == 1 || pow == 0) return 1;
        if (pow == 1) return base;
        return base * powerRec(base,pow - 1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int base, pow, result;
        System.out.print("Taban sayısı : ");
        base = scan.nextInt();
        System.out.print("Üs değeri : ");
        pow = scan.nextInt();
        result = powerRec(base,pow);
        System.out.println("Sonuc : " + result);
    }
}


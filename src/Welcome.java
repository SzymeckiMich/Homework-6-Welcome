import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Give name");
            names[i]=scanner.nextLine();
        }
        for(int i = names.length-1; i>=0; i--){
            System.out.println("Cześć "+names[i]);
        }
    }
}

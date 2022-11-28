import java.util.Scanner;

public class SannerHelper {

    public static String getAString(String question) {
        System.out.println(question);
        return scan().nextLine();
    }


    public static int getAnInt(String question) {
        System.out.println(question);
        return scan().nextInt();
    }

    public static String get(String question) {
        System.out.println(question);
        return scan().nextLine();
    }



    public static Scanner scan() {
        return new Scanner(System.in);
    }

}



import java.io.*;
import java.util.Scanner;

public class Cat {
    public static void cat(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < args.length; i++) {
            String path = args[i];
            File file = new File(path);
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());

            sc.close();
        }

    }
}
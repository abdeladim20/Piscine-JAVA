public class SortArgs {
    public static void sort(String[] args) {
        if (args.length == 0) {
            System.out.println();
            return;
        }
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                int temp = 0;
                if (Integer.parseInt(args[i]) > Integer.parseInt(args[j])) {
                    temp = Integer.parseInt(args[i]);
                    args[i] = args[j];
                    args[j] = "" + temp;
                }
            }
        }
        for (int i = 0; i < args.length; i++) {
            if (i < args.length - 1) {
                System.out.print(args[i] + " ");
            } else {
                System.out.println(args[i]);
            }
        }
    }
}
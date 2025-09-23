import java.io.*;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            boolean firstLine = true;

            while ((line = reader.readLine()) != null) {

                if (!firstLine) {
                    writer.newLine();
                }
                String[] words = line.trim().split("\\s+");
                StringBuilder resultBuilder = new StringBuilder();
                for (int i = 0; i < words.length; i++) {
                    String word = words[i];
                    if (!word.isEmpty()) {
                        resultBuilder.append(Character.toUpperCase(word.charAt(0)));
                        resultBuilder.append(word.substring(1));
                        if (i < words.length - 1) {
                            resultBuilder.append(" ");
                        }
                    }
                }
                writer.write(resultBuilder.toString());
                firstLine = false;
            }
        }
    }
}
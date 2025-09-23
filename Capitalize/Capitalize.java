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

            StringBuilder text = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append(" ");
            }

            String content = text.toString();
            String[] words = content.trim().split("\\s+");

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                if (!word.isEmpty()) {
                    result.append(Character.toUpperCase(word.charAt(0)));
                    result.append(word.substring(1));

                    if (i < words.length - 1) {
                        result.append(" ");
                    }
                }
            }
            writer.write(result.toString());
        }
    }
}

// true
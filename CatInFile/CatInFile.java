import java.io.*;

public class CatInFile {
    public static void cat(String[] args) throws IOException {
        String fileName = args[0];
        InputStream inputStream = System.in;
        OutputStream output = new FileOutputStream(fileName);
            byte[] buffer = new byte[4096]; 
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }
    }
}
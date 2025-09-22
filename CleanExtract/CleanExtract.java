public class CleanExtract {
    public static String extract(String s) {
        String[] result = s.split("\\|");

        for (int i = 0; i < result.length; i++) {
            String part = result[i];
            int firstDot = part.indexOf('.');
            int lastDot = part.lastIndexOf('.');

            String word = "";
            if (i == 0 && firstDot == -1 && lastDot == -1) {
                word = part.trim();
            } else if (firstDot == lastDot) {
                word = part.substring(firstDot + 1).trim();
            } else if (firstDot != -1 && lastDot != -1) {
                word = part.substring(firstDot + 1, lastDot).trim();
            }
            result[i] = word;
        }

        return join(result);
    }
    static String join(String[] arr){
        String res = "";
        for (int i =0; i < arr.length; i++) {
            if (arr[i] != "") {
                res += arr[i].trim();
                if (i!= arr.length-1) {
                    res += " ";
                }
            }
        }
        return res;
    }
}
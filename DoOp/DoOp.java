public class DoOp {
    public static String operate(String[] args) {
        // your code here
        if (args.length <= 2) {
            return "Error";
        }
        int num1 = Integer.parseInt(args[0]);
        String operation_sign = args[1];
        int num2 = Integer.parseInt(args[2]);
        String result = switch (operation_sign) {
            case "-" -> String.valueOf(num1 - num2);
            case "+" -> String.valueOf(num1 + num2);
            case "*" -> String.valueOf(num1 * num2);
            case "/" -> (num2 != 0) ? String.valueOf(num1 / 2) : "Error";
            case "%" -> (num2 != 0) ? String.valueOf(num1 % num2) : "Error";
            default -> "Error";
        };
        return result;
    }
}
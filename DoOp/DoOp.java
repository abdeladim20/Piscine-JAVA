public class DoOp {
    public static String operate(String[] args) {
        // your code here
        if (args.length <= 2) {
            return "it depend on the input.";
        }
        int num1 = Integer.parseInt(args[0]);
        String operation_sign = args[1];
        int num2 = Integer.parseInt(args[2]);
        String result = switch (operation_sign) {
            case "-" -> String.valueOf(num1 - num2);
            case "+" -> String.valueOf(num1 + num2);
            case "*" -> String.valueOf(num1 * num2);
            case "/" -> String.valueOf(num1 / num2);
            default -> "Error";
        };
        // String.valueOf(result);
        return result;
    }
}

/*
 * 3
 * 0
 * Error
 * it depend on the input.
 */
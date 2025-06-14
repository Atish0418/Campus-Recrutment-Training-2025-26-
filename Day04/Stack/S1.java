import java.util.*;

public class S1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        System.out.print("Enter the values to caluclate (Operand and operators) : ");
        String input = scanner.nextLine();
        
        int num = 0;
        boolean buildingNumber = false;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Skip spaces
            if (ch == ' ') continue;

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
                 buildingNumber = true;
            } else {
                if (buildingNumber) {
                    operands.push(num);
                    num = 0;
                    buildingNumber = false;
                }

                // Operator encountered
                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
                    evaluate(operands, operators);
                }
                operators.push(ch);
            }
        }

        // Last number push
        if (buildingNumber) {
            operands.push(num);
        }

        // Evaluate remaining
        while (!operators.isEmpty()) {
            evaluate(operands, operators);
        }

        System.out.println("Result: " + operands.pop());
    }

    private static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        else if (op == '*' || op == '/') return 2;
        return 0;
    }

    private static void evaluate(Stack<Integer> operands, Stack<Character> operators) {
        int b = operands.pop();
        int a = operands.pop();
        char op = operators.pop();
        int result = 0;

        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
        }

        operands.push(result);
    }
}

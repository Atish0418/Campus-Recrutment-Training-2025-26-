//infix to postfix

class Mystack {
    char[] stack;
    int top;
    String str;

    public Mystack(int size) {
        stack = new char[size];
        top = -1;
        str = "(a+b)*cg-";
    }

    public boolean isoperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    public int presedence(char ch) {
        switch (ch) {
            case '+':
                return 1;
            case '-':
                return 1;
            case '*':
                return 2;
            case '/':
                return 2;
        }
        return 0;
    }

    public void intopo() {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (isoperator(ch)) {
                if (top == -1) {
                    stack[++top] = ch;
                } else {
                    while (top != -1 && presedence(stack[top]) >= presedence(ch)) {
                        System.out.print(" " + stack[top]);
                        top--;
                    }
                    stack[++top] = ch;
                }
            } 
            else if (ch == '(') {
                stack[++top] = ch;
            } 
            else if (ch == ')') {
                while (top != -1 && stack[top] != '(') {
                    System.out.print(" " + stack[top]);
                    top--;
                }
                if (top != -1 && stack[top] == '(') {
                    top--;
                }
            } 
            else {
                System.out.print(" " + ch);
            }
        }
        while (top != -1) {
            System.out.print(" " + stack[top--]);
        }
    }
}

public class InfixToPostfix {
    public static void main(String[] args) {
        Mystack s = new Mystack(10);
        s.intopo();

    }
}
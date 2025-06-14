
class Mystack {
    char[] stack;
    int top;
    String str;
    int count, open;

    public Mystack(int size) {
        stack = new char[size];
        top = -1;
        str = ")()((())";
        count = 0;
        open = 0;
    }

    public void para() {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                stack[++top] = ch;
                open++;
            } else if (ch == ')' && open > 0) {
                open--;
                top--;
                count += 2;
            }
        }
        System.out.println(count);
    }

}

public class Parenthesis {
    public static void main(String[] args) {
        Mystack s = new Mystack(10);
        s.para();
    }
}
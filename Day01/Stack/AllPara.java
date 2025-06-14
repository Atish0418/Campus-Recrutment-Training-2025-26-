
//multiple brackets                                                                                                                                                                                 import java.util.*;
import java.util.*;
class Mystack {
    char[] stack;
    int top;
    String str;
    int count, open;
    Map<Character, Character> map = new HashMap<>();

    public Mystack(int size) {
        stack = new char[size];
        top = -1;
        str = "{([]){}}";
        count = 0;
        open = 0;
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
    }

    public void para() {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
                open++;
            } else if ((ch == ')' || ch == '}' || ch == ']') && open > 0) {
                if (stack[top] == map.get(ch)) {
                    open--;
                    top--;
                    count += 2;
                }
            }
        }
        System.out.println("Total number of matched brackets : "+count);
    }

}

public class AllPara {
    public static void main(String[] args) {
        Mystack s = new Mystack(10);
        s.para();

    }
}
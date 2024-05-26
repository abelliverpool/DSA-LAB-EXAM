import java.util.Stack;

class ReverseStringUsingStack {
    public static String reverseString(String str) {
        char[] reverseString = new char[str.length()];
        Stack<Character> stack = new Stack<>();
        
        //push
        
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        // Pop
        int i = 0;
        while (!stack.isEmpty()) {
            reverseString[i++] = stack.pop();
        }

        // Convert character  to string
        return new String(reverseString);
    }

    public static void main(String[] args) {
        String input1 = "hello";
        System.out.println("Input: " + input1);
        System.out.println("Reversed: " + reverseString(input1));

        String input2 = "GeeksForGeeks";
        System.out.println("Input: " + input2);
        System.out.println("Reversed: " + reverseString(input2));
    }
}

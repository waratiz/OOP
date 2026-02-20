package Lab9;

public record TestSTack() {
    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<String>();
        stack.push("Tom");
        stack.push("George");
        stack.push("Peter");
        System.out.println(stack.getSize());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}

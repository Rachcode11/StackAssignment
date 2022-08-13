package Assignment;

public class Stack  {
    public static void main(String[] args) {
        java.util.Stack<String> books = new java.util.Stack<>();

        // method push(add).
        books.push("AudioBook");
        books.push("PrintBook");

        System.out.println("Stack: " + books);

        // method pop(LIFO).
        String item = books.pop();
        System.out.println("Remove item " + item);

        // method peek().
        String item1 = books.peek();
        System.out.println("The item at the top is " + item1);

        //method search(returns item position from the top).
        int position = books.search("PrintBook");
        System.out.println("the position of PrintBook is " + position);

        //method empty().
        boolean result = books.empty();
        System.out.println("Is the stack empty? \t" + result);

    }


}




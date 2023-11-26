import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> Animal=new Stack<>();
        //push a element
        Animal.push("duck");
        Animal.push("fish");
        Animal.push("girrafe");
//print a element
        System.out.println("Animals:" +Animal);
        //peek top most element
        System.out.println(Animal.peek());
        //pop element
        Animal.pop();
        System.out.println("Animals:" +Animal);

        System.out.println(Animal.peek());
    }
}

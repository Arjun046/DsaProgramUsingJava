public abstract class Shape {
    abstract void draw();

    }
    class Rectangle extends Shape{

        void draw() {
        System.out.println("Drawing Rectangle");
        }

        }
    class Circles1 extends Shape{

        void draw() {
        System.out.println("Drawing Circles");
        }
}
        class TestAbstraction1{
    public static void main(String args[]) {
        Shape s=new Circles1();
        s.draw();
    }
    }

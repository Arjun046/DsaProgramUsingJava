class Singelton1 {
    private static Singelton1 Single_instance = null;

    public String s;

    private Singelton1() {
        s = "Hello I am a string part of Singleton class";
    }

    public static synchronized Singelton1 getInstance() {
        if (Single_instance == null)
            Single_instance = new Singelton1();
            return Single_instance;
    }
}
public class Singleton {
    public static void main(String[]args){
        Singelton1 x=Singelton1.getInstance();
        Singelton1 y=Singelton1.getInstance();
        Singelton1 z=Singelton1.getInstance();
        System.out.println("Hashcode of x is " +  x.hashCode());
        System.out.println("Hashcode of y is " +  y.hashCode());
        System.out.println("Hashcode of z is " +  z.hashCode());
        if(x==y && y==z) {
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {

            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }


    }
}


public class Sum {
    public int sum(int a,int b){
        return (a+b);

    }
    public int sum(int a,int b,int c){
        return (a+b+c);
    }
    public double sum(double a,double b){
        return (a*b);
    }
    public static void main(String[]args){
        Sum s=new Sum();
        System.out.println(s.sum(1,2));
        System.out.println(s.sum(2,3,4));
        System.out.println(s.sum(10.5,4.5));
    }
}

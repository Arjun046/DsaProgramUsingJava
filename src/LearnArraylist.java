import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class LearnArraylist {
    public static void main(String[] args) {
        ArrayList<String> student=new ArrayList<>();
        student.add("Rakesh");
        student.add("mukesh");
        student.add("mahesh");

        System.out.println(student);

        student.add(2,"pratap");//this will add pratap in 2 index
        System.out.println(student);

        ArrayList<String> newlist=new ArrayList<>();//another list are created
        newlist.add("hdhh");
        newlist.add("uur");
        newlist.add("jdf");

        student.addAll(newlist);//add all new list element to student
        System.out.println(student);//this will remove the element
        System.out.println(student.get(1));//get the element

//        student.remove(2);
//        System.out.println(student);
//
//        student.remove(String.valueOf("mahesh"));
//        System.out.println(student);
//
//        student.clear();
//        System.out.println(student);
//
//        student.removeAll(student);//remove all element to list
//        System.out.println(student);

//        student.set(2,"prakash");//update the element
//        System.out.println(student);
//
//        System.out.println(student.contains("prakash"));//element at present or not
//
//three method to iterate element
//        for (int i=0;i<student.size();i++){//iterate to element
//            System.out.println("The student is :" + student.get(i));
//        }
//
//        for (String element: student) {
//            System.out.println("the student is:" +element);
//        }
//        Iterator<String> it =student.iterator();
//        while(it.hasNext()){
//            System.out.println("iterator :" +it.next() );
//        }
//
//        //sort the element
//        Collections.sort(student);
//        System.out.println(student);

//        ArrayList<Integer> list=new ArrayList<>();
//        list.add(12);
//        list.add(32);
//        list.add(43);
//        System.out.println(list.toArray());
//
//        student.lastIndexOf(1);
//        System.out.println(student);




    }
}

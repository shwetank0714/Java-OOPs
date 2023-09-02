import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Struct head = new Struct(90);

        System.out.println(head.getNodeVal());

        head.changeNodeVal(78);

        System.out.println(head.getNodeVal());

        ArrayList<Integer> arr = new ArrayList();
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);

        System.out.println(arr);
        changeVal(arr);
        System.out.println(arr);
    }

    static void changeVal(ArrayList<Integer> arr){
        arr.set(0, 99);
    }
}
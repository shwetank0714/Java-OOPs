public class Contruct {


    public static void main(String[] args) {

        MyStruct temp = new MyStruct(90, "Hello");
        MyStruct temp2 = new MyStruct(92, "Hello");
        MyStruct temp3 = new MyStruct(93, "Hello");
        temp.val = 95;

        Integer[] a = new Integer[90];

        final int h = 10;


        MyStruct newTemp = new MyStruct(temp);
        //newtemp.val = 88;



        System.out.println(newTemp.to_String());

    }


    static void swap(Integer a, Integer b){
        Integer t = a;
        b = a;
        a = t;
    }
}




class MyStruct{
    int val;
    String name;

    static int count = 0;
    MyStruct(int val, String name){
        this.val = val;
        this.name = name;
        increaseCount();
    }

    MyStruct(MyStruct other){
        this.val = other.val;
        this.name = other.name;
        increaseCount();
    }

    String to_String(){

          String k =  "[" + this.val + ", " + this.name +"]";

          return k;

    }

    public static void increaseCount(){
        count++;
        System.out.println("Count is: "+ count);
    }

    MyStruct(){
        // Calling another constructor from the constructor
        this(88, "Temporary");
        increaseCount();
    }
}

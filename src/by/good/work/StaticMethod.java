package by.good.work;

public class StaticMethod {

    public static final int k;
    public int l = 9;
    static {
        k = 5;
    }

    public static void go(){
        System.out.println("StaticMethod go");
       // System.out.println(k);
    }
    public void cool(){
        System.out.println("StaticMethod cool");
      //  System.out.println(l);
    }

}

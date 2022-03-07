package co.postgres.sql;

public class FinelTest {
   static int x = 189;

    public void testGo(final int x){
        System.out.println(x);


    }

    public static void main(String[] args) {
        FinelTest f = new FinelTest();
        ++f.x;
        f.testGo(f.x++);
        ++f.x;
        f.testGo(f.x++);

        FinelTest f2 = new FinelTest();
        f2.x++;
        f2.testGo(f2.x++);
        ++f2.x;
        f2.testGo(f2.x);

        int r = 7 ;
        int r2 = r;
        r = 9 ;
        System.out.println(r2);

        assert r > 0;
        System.out.println(r);
    }
}

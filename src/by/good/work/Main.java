package by.good.work;

public class Main {
    public static void main(String[] args) {



        StaticMethod staticMethod = new SimpleMethod();
        staticMethod.go();
        staticMethod.cool();

        SimpleMethod simpleMethod = new SimpleMethod();
        simpleMethod.go();
        simpleMethod.cool();
        double i =  Math.random();

        StaticMethod staticMethodX = null;
        SimpleMethod simpleMethodX = null;
        MethodX methodX = null;



        staticMethodX.go();
        simpleMethodX.go();
        methodX.go();

        if (i < 0.5){
            simpleMethodX = new SimpleMethod();

        }else {
            simpleMethodX = new MethodX();
        }

        staticMethodX.go();
        simpleMethodX.cool();


    }
}

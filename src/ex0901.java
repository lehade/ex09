public class ex0901 {

    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        //напишите тут ваш код
        StackTraceElement[] method1 = Thread.currentThread().getStackTrace();

        return method1;
    }

    public static StackTraceElement[] method2() {
        method3();
        //напишите тут ваш код
        StackTraceElement[] method2 = Thread.currentThread().getStackTrace();

        return method2;
    }

    public static StackTraceElement[] method3() {
        method4();
        //напишите тут ваш код
        StackTraceElement[] method3 = Thread.currentThread().getStackTrace();

        return method3;
    }

    public static StackTraceElement[] method4() {
        method5();
        //напишите тут ваш код
        StackTraceElement[] method4 = Thread.currentThread().getStackTrace();

        return method4;
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        StackTraceElement[] method5 = Thread.currentThread().getStackTrace();

        return method5;

    }

}
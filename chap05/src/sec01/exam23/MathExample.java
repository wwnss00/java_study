package sec01.exam23;

public class MathExample {
    public static void main(String[] args) {
        //절대값
        int v1 = Math.abs(-5);
        double v2 = Math.abs(-3.14);
        System.out.println("v1=" + v1);
        System.out.println("v2=" + v2);

        //올림값
        double v3 = Math.ceil(5.3);
        double v4 = Math.ceil(-5.3);
        System.out.println("v3=" + v3);
        System.out.println("v4=" + v4);

        //버림값
        double v5 = Math.floor(5.3);
        double v6 = Math.floor(-5.3);
        System.out.println("v5=" + v5);
        System.out.println("v6=" + v6);

        //최대값
        int v7 = Math.max(5,9);
        double v8 = Math.max(5.3,2.5);
        System.out.println("v7=" + v7);
        System.out.println("v8=" + v8);

        //최소값
        int v9 = Math.min(5,9);
        double v10 = Math.min(5.3,2.5);

    }
}

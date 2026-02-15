package Khodro;

public class Ranande {
    private String noeGovahiname = "payeh 1";
    private static String nam = "Ali";

    // Non-static Nested class: Inner class
    public class Govahiname {
        public void print() {
            System.out.println("Class Non static: ");
            System.out.println(noeGovahiname);
            System.out.println(nam);
        }
    }

    // static Nested class
    public static class StaticGovahiname {
        public void print() {
            System.out.println("Class static: ");

            System.out.println(nam);
        }
    }


}

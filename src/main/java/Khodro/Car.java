package Khodro;

public class Car extends Khodro implements SandoghDar, GearBox {
    public static int tedadeForosh;

    private boolean darMashinBaste;
    private String mark;
    private int gonjayeshSandogh;
    private String noeDandeh;

    public Car() {
        System.out.println("yek mashin sakhteh shod");
    }
    Car(String mark){
        this.mark = mark;
        System.out.println("yek mashin sakhteh shod");
    }

    public Car(String mark, int gonjayeshSandogh, String noeDandeh) {
        this.mark = mark;
        this.gonjayeshSandogh = gonjayeshSandogh;
        this.noeDandeh = noeDandeh;
    }

    void darMashinBaz() {
        System.out.println("Dar Mashin Baz Ast");
        darMashinBaste = false;
    }
    void darMashinBasteh() {
        System.out.println("Dar Mashin Basteh Ast");
        darMashinBaste = true;
    }
    public boolean harekat() {
        protectedMethod();
        if (darMashinBaste && ayaRoshan) {
            System.out.println("Mashin harekat mikonad");
            return true;
        } else {
            System.out.println("Mashin park ast");
            return false;
        }
    }

    @Override
    public String typeDande() {
        return "Automatic";
    }

    @Override
    public int gonjayeshSandogh() {
        return 100;
    }
    @Override
    public String getMark() {
        return mark;
    }

}

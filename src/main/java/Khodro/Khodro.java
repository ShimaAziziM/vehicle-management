package Khodro;

public abstract class  Khodro {
    boolean ayaRoshan;

    public void Roshan() {
        System.out.println("Mashin Roshan Ast");
        ayaRoshan = true;
    }
    public void Khamosh() {
        System.out.println("Mashin Khamosh Ast");
        ayaRoshan = false;
    }
    protected void protectedMethod() {
        System.out.println("protected method");
    }

    public abstract boolean harekat();

    public abstract String getMark();
}

package Khodro;

public class NamKhodroChopKon {
    Khodro[] Khodroha;
    //Constructor
    public NamKhodroChopKon(Khodro[] Khodroha) {
        this.Khodroha = Khodroha;

    }
    public String execute() {
        String namkhodroha =  "";
        for (int i = 0; i < Khodroha.length; i++) {
            Khodro k = Khodroha[i];
            if (i != Khodroha.length - 1) {
                namkhodroha = namkhodroha + k.getMark() + "-";
            } else {
                namkhodroha = namkhodroha + k.getMark();
            }

        }
        return namkhodroha;

    }
}

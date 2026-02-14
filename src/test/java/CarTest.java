import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void Mashin_Bayad_harekat_kond_vaghti_Dar_mashin_basteh_roshan_ast() {
        // Given
        Car benz = new Car("Benz");

        // When
        boolean harekat = benz.harekat();

        // Then
        Assertions.assertFalse(harekat);


//        Car car = new Car();
//        car.mashinRoshan();
//        car.darMashinBasteh();
//        car.harekat();
//        System.out.println("----------------------------------");
//        Car model_1 = new Car("pride");
//        model_1.darMashinBaz();
//        model_1.mashinKhamosh();
//        model_1.harekat();

    }

    class Car {
        boolean ayaRoshan;
        boolean darMashinBaste;
        String mark;

        Car() {
            System.out.println("yek mashin sakhteh shod");
        }

        Car(String mark) {
            this.mark = mark;
            System.out.println("yek mashin sakhteh shod");
        }


        void Roshan() {
            System.out.println("Mashin Roshan Ast");
            ayaRoshan = true;
        }

        void mashinKhamosh() {
            System.out.println("Mashin Khamosh Ast");
            ayaRoshan = false;
        }

        void darMashinBaz() {
            System.out.println("Dar Mashin Baz Ast");
            darMashinBaste = false;
        }

        void darMashinBasteh() {
            System.out.println("Dar Mashin Basteh Ast");
            darMashinBaste = true;
        }

        boolean harekat() {
            if (darMashinBaste && ayaRoshan) {
                System.out.println("Mashin harekat mikonad");
                return true;
            } else {
                System.out.println("Mashin park ast");
                return false;
            }
        }
    }
}
import Foroshandeh.Foroshandeh;
import Khodro.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForoshandehMashinTest {
    @Test
    void Byad_Tedad_Tamam_Mashinhaye_Forokhteh_shodeh_Ra_Bedast_Avarim() {
        Foroshandeh foroshandeh = new Foroshandeh();
        Foroshandeh user1 = new Foroshandeh();

        foroshandeh.foroshMashin();
        foroshandeh.foroshMashin();
        user1.foroshMashin();

        Assertions.assertEquals(3, Car.tedadeForosh);
    }
}

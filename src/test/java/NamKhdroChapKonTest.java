import Khodro.Khodro;
import Khodro.Car;
import Khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Khodro.NamKhodroChopKon;
import Khodro.Kashti;

import java.util.concurrent.Executor;

public class NamKhdroChapKonTest {
    @Test
    void Bayad_Nam_Khodro_Ra_Chap_Konad() {
        // Given
        Khodro benz = new Car("Benz", 120, "Automatic");
        Khodro volvo = new Car("Volvo", 80, "Manual");
        Khodro motor = new Motor();
        Khodro kashti = new Kashti();
        Khodro[] khodroha = {benz, volvo, motor, kashti};
        NamKhodroChopKon namKhodroChopKon = new NamKhodroChopKon(khodroha);

        // When
        String listNamKhodroha = namKhodroChopKon.execute();

        // Then
        Assertions.assertEquals("Benz-Volvo-Motor-Kashti", listNamKhodroha);
    }
}

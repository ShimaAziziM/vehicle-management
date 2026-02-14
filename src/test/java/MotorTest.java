import Khodro.Khodro;
import Khodro.Motor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MotorTest {
    @Test
    void motor_bayad_harekat_konad_vaghti_roshan_ast() {

        // Given
        Khodro motor = new Motor();

        // When
        motor.Roshan();
        boolean ayaharekatmikonad = motor.harekat();

        // Then
        Assertions.assertTrue(ayaharekatmikonad);



    }

}

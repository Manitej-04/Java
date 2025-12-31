import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalciTest {
    // Creating fake object using annotation

    @Mock
    MathClass math;

    // Injecting fake object using annotation
    @InjectMocks
    Calci cal;

    @Test
    void sumTest() {
//        MathClass math = new MathClass();

        // Creating fake object
//        MathClass math = mock(MathClass.class);


        // Injecting fake object
//        Calci cal = new Calci(math);

        // Giving fake data
        when(cal.sum(90,90)).thenReturn(180);

        // Taking fake data
        int result = cal.sum(90, 90);
        Assertions.assertEquals(180, result);
    }
}

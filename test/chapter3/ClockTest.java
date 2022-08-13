package chapter3;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ClockTest {
    private Clock clock ;

    @BeforeEach
    public void setUp(){
        clock = new Clock(23,59,59);
    }
    @Test
    public void testThatClockExist(){
        assertNotNull(clock);
    }
    @Test
    public void testThatClockHasHour(){
        clock.setHour(23);
        assertEquals(23,clock.getHour());
    }
    @Test
    public void testThatClockHasMinute(){
        clock.setMinute(59);
        assertEquals(59,clock.getMinute());
    }
    @Test
    public void testThatClockHasSecond(){
        clock.setSecond(59);
        assertEquals(59,clock.getSecond());
    }
    @Test
    public void testToSetTime(){
        clock.setTime("23:59:59");
        assertEquals("23:59:59",clock.getTime());
    }

    @Test
    public void testForDisplayTime(){
        clock.setTime("23:59:59");
        String isTrue = clock.displayTime();
        assertNotNull(isTrue);
        assertEquals("23:59:59", isTrue);
    }
}


package chapter3;


import com.Exercise.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarApplicationTest {
    private Car car1;
    private Car car2;

    @BeforeEach
    public void setUp(){

        car1 = new Car("Ford","2003", 20000,5);
        car2= new Car("Audi","2012", 10000,7);

    }
    @Test
    public void testThatCarExists(){
        assertNotNull(car1);
        assertNotNull(car2);

    }
    @Test
    public void testThatCarHasAModel(){
        car1.setCarModel("Ford");
        assertEquals("Ford",car1.getModelCar());
    }
    @Test
    public void testForTheYear(){
        car1.setCarYear("2003");
        assertEquals("2003",car1.getCarYear());
    }
    @Test
    public void testForThePrice(){
        car1.setPrice(20000);
        assertEquals(20000,car1.getPrice());
    }
    @Test
    public void testThatCar2HasAModel(){
        car2.setCarModel("Audi");
        assertEquals("Audi",car2.getModelCar());

    }
    @Test
    public void testForCar2Year(){
        car2.setCarYear("2012");
        assertEquals("2012",car2.getCarYear());
    }
    @Test
    public void testForCar2Price(){
        car2.setPrice(10000);
        assertEquals(10000,car2.getPrice());
    }
    @Test
    public void testForDiscountAmount(){
        car1.getPurchaseAmount();
        assertEquals(1000,car1.getPurchaseAmount());

    }

}




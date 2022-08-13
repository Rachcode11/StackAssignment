package chapter3;

import com.Exercise.PetrolPurchase;
import com.Exercise.PetrolType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PetrolPurchaseTest {

    private PetrolPurchase petrolPurchase ;

    @BeforeEach
    public void setUp(){
        petrolPurchase = new PetrolPurchase("yaba",2,"OCTANE_REGULAR",200,10);

    }
    @Test
    public void testThatWeHavePetrolStation(){
        assertNotNull(petrolPurchase);
    }
    @Test
    public void testThatPetrolStationHasALocation(){
        assertEquals("yaba",petrolPurchase.getLocation());
    }
    @Test
    public void testThatPetrolHaveQuantity(){
        petrolPurchase.setQuantity(2);
        assertEquals(2,petrolPurchase.getQuantity());

    }
    @Test
    public void testForPetrolType(){
        petrolPurchase.setTypeOfPetrol("OCTANE_REGULAR");
        assertEquals("OCTANE_REGULAR", petrolPurchase.getTypeOfPetrol().toString());
        assertEquals(PetrolType.OCTANE_REGULAR, petrolPurchase.getTypeOfPetrol());

    }
    @Test
    public void testThePricePerLitre(){
        petrolPurchase.setPricePerLitre(200);
        assertEquals(200,petrolPurchase.getPricePerLitre());

    }
    @Test
    public void testForPercentageDiscount(){
        petrolPurchase.setPercentageDiscount(10);
        assertEquals(10,petrolPurchase.getPercentageDiscount());
    }
    @Test
    public void testPurchaseAmount(){
        assertEquals(360, petrolPurchase.getPurchaseAmount());



    }


}


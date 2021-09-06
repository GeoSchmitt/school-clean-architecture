import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneTest {

    @Test
    void shouldNotCreatePhoneWithInvalidDDD(){
        assertThrows(IllegalArgumentException.class, ()->{
           new Phone(null, "97321756");
        });
        assertThrows(IllegalArgumentException.class, ()->{
            new Phone("", "97321756");
        });
        assertThrows(IllegalArgumentException.class, ()->{
            new Phone("1", "97321756");
        });
    }

    @Test
    void shouldNotCreatePhoneWithInvalidNumber(){
        assertThrows(IllegalArgumentException.class, ()->{
            new Phone("47", "");
        });
        assertThrows(IllegalArgumentException.class, ()->{
            new Phone("47", null);
        });
        assertThrows(IllegalArgumentException.class, ()->{
            new Phone("47", "9732");
        });
    }

    @Test
    void shouldCreatePhoneWithValidDDDAndNumber(){
       String ddd = "47";
       String number = "97321756";
       Phone phone = new Phone(ddd, number);
       assertEquals(ddd, phone.getDdd());
       assertEquals(number, phone.getNumber());
    }
}
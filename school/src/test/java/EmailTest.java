import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void shouldNotCreateEmailWithInvalidAddress(){
        assertThrows(IllegalArgumentException.class,()->{
            new Email(null);
        });
        assertThrows(IllegalArgumentException.class,()->{
            new Email("");
        });
        assertThrows(IllegalArgumentException.class,()->{
            new Email("invalidemail");
        });
    }

    @Test
    void shouldCreateEmailWithValidAddress(){
        String address = "geoschmitt0@gmail.com";
        Email email = new Email(address);
        assertEquals(address, email.getAddress());
    }

}
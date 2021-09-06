import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DocumentTest {

    @Test
    void shouldNotCreateDocumentWithInvalidNumber(){
        assertThrows(IllegalArgumentException.class,()->{
            new Document(null);
        });
        assertThrows(IllegalArgumentException.class,()->{
            new Document("");
        });
        assertThrows(IllegalArgumentException.class,()->{
            new Document("123");
        });
    }

    @Test
    void shouldCreateDocumentWithValidNumber(){
        String number = "123.456.789-00";
        Document document = new Document(number);
        assertEquals(number, document.getNumber());
    }

}
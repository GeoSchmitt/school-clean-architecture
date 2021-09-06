import java.util.ArrayList;
import java.util.List;

public class Student {
    //Entity

    private Document document;
    private String name;
    private Email email;
    private List<Phone> phone = new ArrayList<>();

    public Student(Document document, String name, Email email) {
        this.document = document;
        this.name = name;
        this.email = email;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Email getEmail() {
        return email;
    }

    public void setEmail(Email email) {
        this.email = email;
    }

    public List<Phone> getPhone() {
        return phone;
    }

    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public void addPhone(String ddd, String number){
        this.phone.add(new Phone(ddd, number));
    }




}

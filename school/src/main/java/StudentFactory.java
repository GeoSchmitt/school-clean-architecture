public class StudentFactory {
    private Student student;

    public StudentFactory withNameDocumentEmail(String name, String document, String email){
        this.student = new Student(new Document(document), name, new Email(email));
        return this;
    }

    public StudentFactory withPhone(String ddd, String phone){
        this.student.addPhone(ddd, phone);
        return this;
    }

    public Student create(){
        return this.student;
    }

    public static void main(String[] args){
        StudentFactory factory = new StudentFactory();
        Student student = factory.withNameDocumentEmail("","","")
            .withPhone("","")
                .create();
    }
}

import java.math.MathContext;

public class Main {
    public static void main(String[] args) {
        Person user1 = new Person("Christian");
        Person user2 = new Person("Ana");
        Person user3 = new Person("Franco");
        System.out.println(user1.getId() + "\n" + user2.getId() + "\n" + user3.getId());
        System.out.println(Person.getRegisteredUser());
        System.out.println(user1.getRegisterDateFormat());


    }
}

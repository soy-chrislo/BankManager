import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {

    private final String name;
    private int id;
    private static int registeredUser;
    private int age;
    private double balance, salary;
    private boolean isWork, isEmployed, isIndependent, isNaturalPerson, isLegalPerson;
    private GregorianCalendar register;

    public Person(String name) {
        this(name, 18, 100, Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.YEAR));
        registeredUser++;
        //this.name = name;
        this.id = registeredUser;
    }

    public Person(String name, int age, double balance, boolean isNaturalPerson) {
        this(name, age, balance, Calendar.getInstance().get(Calendar.DAY_OF_MONTH), Calendar.getInstance().get(Calendar.MONTH), Calendar.getInstance().get(Calendar.YEAR));
        registeredUser++;
        //this.name = name;
        this.id = registeredUser;
        //this.age = age;
        //this.balance = balance;
        this.register = new GregorianCalendar();
        this.isNaturalPerson = isNaturalPerson;
        if (isNaturalPerson) {
            isLegalPerson = false;
        } else {
            isLegalPerson = true;
        }
    }

    public Person(String name, int age, double balance, int day, int month, int year) {
        registeredUser++;
        this.name = name;
        this.id = registeredUser;
        this.age = age;
        this.balance = balance;
        this.register = new GregorianCalendar(year, month - 1, day);
    }


    public void depositBalance (double deposit) {
        if (deposit > 0) {
            balance += deposit;
            System.out.println("Se ha depositado $" + deposit + " exitosamente a " + name + ".");
        } else {
            System.out.println("Por favor ingrese una cantidad mayor a 0.");
        }
    }

    public void withdrawBalance (double withdraw) {
        if (withdraw > 0) {
            if (withdraw < balance) {
                System.out.println("Se ha retirado $" + withdraw + " exitosamente a " + name + ".");
                balance -= withdraw;
            } else {
                System.out.println("No tiene fondos suficientes para esta transacción.");
            }
        } else {
            System.out.println("Por favor ingrese una cantidad mayor a 0.");
        }
    }

    public String getRegisterDateFormat() {
        int day = register.get(register.DATE);
        int month = register.MONTH - 1;
        int year = register.get(register.YEAR);
        return day + "/" + month + "/" + year;
    }

    public void incrementAge(int increment) {
        age += increment;
    }

    public void decrementAge(int decrement) {
        age -= decrement;
    }

    public void incrementSalary(double increment) {
        salary += increment;
    }

    public void decrementSalary(double decrement) {
        salary -= decrement;
    }

    /*Getters*/
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public double getSalary() {
        return salary;
    }

    public boolean isWork() {
        return isWork;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public boolean isIndependent() {
        return isIndependent;
    }

    public GregorianCalendar getRegister() {
        return register;
    }

    public Date getRegisterDate() {
        return register.getTime();
    }

    public static int getRegisteredUser() {
        return registeredUser;
    }

    /*Setters*/

/*    public void setName(String name) {
        this.name = name;
    }*/

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setWork(boolean work) {
        isWork = work;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public void setIndependent(boolean independent) {
        isIndependent = independent;
    }

    public void setRegister(GregorianCalendar register) {
        this.register = register;
    }

    public static void setRegisteredUser(int registeredUser) {
        Person.registeredUser = registeredUser;
    }
}

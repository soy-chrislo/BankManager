import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Costumer extends Person{

    private int registerNumber;
    private static int registeredUsers;
    private double balance, salary;
    private boolean isWork, isEmployed, isIndependent, isNaturalPerson, isLegalPerson;
    private GregorianCalendar register;
    private static final int  ageBase = 18, rutDefault = 0, currentDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH), currentMonth = Calendar.getInstance().get(Calendar.MONTH), currentYear = Calendar.getInstance().get(Calendar.YEAR);
    private static final double balanceBase = 10000, salaryBase = 100000;

    public Costumer(String name, int id, int rut) {
        this(name, ageBase, id, rut, currentDay, currentMonth, currentYear, balanceBase, salaryBase, false, false, false);
        registeredUsers++;
        this.registerNumber = registeredUsers;
    }

    public Costumer(String name, int age, int id, int rut, boolean isWork, boolean isEmployed, boolean isNaturalPerson) {
        this(name, age, id, rut, currentDay, currentMonth, currentYear, balanceBase, salaryBase, isWork, isEmployed, isNaturalPerson);
        registeredUsers++;
        this.registerNumber = registeredUsers;
    }

    public Costumer(String name, int age, int id, int rut, int day, int month, int year, double balance, double salary, boolean isWork, boolean isEmployed, boolean isNaturalPerson) {
        super(name, id, rut);
        registeredUsers++;
        this.registerNumber = registeredUsers;

        this.register = new GregorianCalendar(year, month - 1, day);
        this.balance = balance;
        this.salary = salary;
        this.isWork = isWork;
        this.isEmployed = isEmployed;
        this.isNaturalPerson = isNaturalPerson;

        if (isWork) {
            this.isIndependent = !isEmployed;
        } else {
            this.isEmployed = false;
            this.isIndependent = false;
        }
        this.isLegalPerson = !isNaturalPerson;
    }

    public void depositBalance (double deposit) {
        if (deposit > 0) {
            balance += deposit;
            System.out.println("Se ha depositado $" + deposit + " exitosamente a " + getName() + ".");
        } else {
            System.out.println("Por favor ingrese una cantidad mayor a 0.");
        }
    }

    public void withdrawBalance (double withdraw) {
        if (withdraw > 0) {
            if (withdraw < balance) {
                System.out.println("Se ha retirado $" + withdraw + " exitosamente a " + getName() + ".");
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

    public void incrementSalary(double increment) {
        salary += increment;
    }

    public void decrementSalary(double decrement) {
        salary -= decrement;
    }

    /*Getters*/

    public int getRegisterNumber() {
        return registerNumber;
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

    public boolean isNaturalPerson() {
        return isNaturalPerson;
    }

    public boolean isLegalPerson() {
        return isLegalPerson;
    }

    public GregorianCalendar getRegister() {
        return register;
    }

    public Date getRegisterDate() {
        return register.getTime();
    }

    public static int getRegisteredUser() {
        return registeredUsers;
    }

    /*Setters*/

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
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

    public void setNaturalPerson(boolean naturalPerson) {
        isNaturalPerson = naturalPerson;
    }

    public void setLegalPerson(boolean legalPerson) {
        isLegalPerson = legalPerson;
    }

    public void setRegister(GregorianCalendar register) {
        this.register = register;
    }

    public static void setRegisteredUser(int registeredUser) {
        Costumer.registeredUsers = registeredUser;
    }
}

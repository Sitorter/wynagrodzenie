abstract class Employee{
    abstract void calculateSalary();
    abstract void displayInfo();
}
class Manager extends Employee{
    public void calculateSalary(){
        double salary;
        double salaryPerHour = 45.00;
        double daySalary = 8*salaryPerHour;
        double weekSalary = 7*daySalary;
        double monthSalary = 4*weekSalary;
        System.out.println("Stawka miesięczna bez premi = " + monthSalary);
        System.out.println("Stawka miesieczna z premia = " + monthSalary+300);

    }
    public void displayInfo(){
        System.out.println("Stanowisko nr 24");
        System.out.println("Minimalna płaca = 3500zł");
        System.out.println("Brak nadgodzin");
        System.out.println("Stawka gozinowa = 45zł/h");
        System.out.println("Premia = 300zl");
    }
}
class Programmer extends Employee{
    public void calculateSalary(){
        double salary;
        double salaryPerHour = 50.00;
        double daySalary = 8*salaryPerHour;
        double weekSalary = 7*daySalary;
        double monthSalary = 4*weekSalary;
        System.out.println("Stawka miesięczna bez premi = " + monthSalary);
        System.out.println("Stawka miesieczna z premia = " + monthSalary+400);

    }
    public void displayInfo(){
        System.out.println("Stanowisko nr 4");
        System.out.println("Minimalna płaca = 4000zł");
        System.out.println("Brak nadgodzin");
        System.out.println("Stawka gozinowa = 50zł/h");
        System.out.println("Premia = 400zl");
    }
}
public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.displayInfo();
        m.calculateSalary();
        Programmer p = new Programmer();
        p.displayInfo();
        p.calculateSalary();

    }
}
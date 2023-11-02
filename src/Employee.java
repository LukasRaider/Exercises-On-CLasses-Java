

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        int newSalary = (int) (salary * (percent / 100.0));
        salary += newSalary;
        return salary;
    }

    public String toString() {
        return String.format("Zamestnanec[id = %d, jmeno = %s %s, vyplata = %d]", id, firstName, lastName, salary);
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Mark", "Buffalo", 35000);
        System.out.println(e1.toString());
        System.out.println("Vyplata po zvyseni o 15%: " + e1.raiseSalary(15));
        System.out.println("Rocni mzda je: " + e1.getAnnualSalary());
    }
}

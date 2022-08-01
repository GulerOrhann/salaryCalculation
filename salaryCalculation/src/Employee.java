public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            double tax = this.salary * 0.03;
            return tax;
        }
    }
    public int bonus() {
        if (this.workHours > 40) {
            int bonus = (this.workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }
    public double raiseSalary() {
        double raiseSalary;
        int totalYear = 2021 - this.hireYear;
        if (totalYear < 10) {
            raiseSalary = this.salary * 0.05;
            return raiseSalary;
        } else if (totalYear > 9 && totalYear < 20) {
            raiseSalary = this.salary * 0.10;
            return raiseSalary;
        } else if (totalYear > 19) {
            raiseSalary = this.salary * 0.15;
            return raiseSalary;
        }else {
            return 0;
        }
    }

    public String toString(){
        double bonusTaxSalary = this.salary-tax()+bonus();
        double totalSalary = this.salary+raiseSalary();
        System.out.println("===================================================");
        System.out.println("Name : "+this.name);
        System.out.println("Salary : "+this.salary);
        System.out.println("Working hours : "+workHours);
        System.out.println("Hire Year : "+hireYear);
        System.out.println("Tax : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("raise Salary : "+raiseSalary());
        System.out.println("Salary with Tax and Bonus : "+bonusTaxSalary);
        System.out.println("Total Salary : "+totalSalary);
        return null;
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advance_programming_331_332;

/**
 *
 * @author user
 */
public class employee {

    private String firstName;
    private String lastName;
    private double salary;

    public employee(String fName, String lName, double sal) {
        if (fName != null) {
            firstName = fName;
        }
        if (lName != null) {
            lastName = lName;
        }
        if (sal > 0.0) {
            salary = sal;
        } else {
            salary = 0.0;
        }
    }
//set methods

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

//get methods
    public void setFirstName(String fName) {
        if (fName != null) {
            firstName = fName;
        }
    }

    public void setLastName(String lName) {
        if (lName != null) {
            lastName = lName;
        }
    }

    public void setSalary(double sal) {
        if (sal > 0.0) {
            salary = sal;
        } else {
            salary = 0.0;
        }
    }

    int getMonthlySalary() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setMonthlySalary(double incrementedSalary1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class employeetest {

    public static void main(String[] args) {
        employee employee1 = new employee("Moon", "Taisr", 100000);
        employee employee2 = new employee("Bill", "Gates", 25000000);
        System.out.println("\n" + employee1.getFirstName()
                + " " + employee1.getLastName()
                + " Yearly Salary :" + (12 * employee1.getMonthlySalary()));
        System.out.println("\n" + employee2.getFirstName()
                + " " + employee2.getLastName()
                + " Yearly Salary :" + (12 * employee2.getMonthlySalary()));
        double incrementedSalary1 = employee1.getMonthlySalary() + employee1.getMonthlySalary() * 0.1;
        employee1.setMonthlySalary(incrementedSalary1);
        double incrementedSalary2 = employee2.getMonthlySalary() + employee2.getMonthlySalary() * 0.1;
        employee2.setMonthlySalary(incrementedSalary2);
        System.out.println("\n" + employee1.getFirstName() + " " + employee1.getLastName() + " Yearly Salary :" + (12 * employee1.getMonthlySalary()));
        System.out.println("\n" + employee2.getFirstName() + " " + employee2.getLastName() + " Yearly Salary :" + (12 * employee2.getMonthlySalary()));
    }
}


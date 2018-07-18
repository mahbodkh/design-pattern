package app.creational.prototype;

import java.util.List;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees developer = (Employees) employees.clone();
        Employees accounting = (Employees) employees.clone();

        List<String> listOne = developer.getEmployeeList();
        listOne.add("Maria");
        List<String> listTwo = accounting.getEmployeeList();
        listTwo.remove("Lisa");

        System.out.println("the developer list : " + developer.getEmployeeList());
        System.out.println("the accounting list : " + accounting.getEmployeeList());

        System.out.println("List Own" + listOne);
        System.out.println("List Two" + listTwo);

    }
}

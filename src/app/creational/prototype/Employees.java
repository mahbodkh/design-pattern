package app.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/*
 * created by Mahbod Kh with ❤️.
 */

public class Employees implements Cloneable {

    private List<String> employeeList;

    public Employees() {
        employeeList = new ArrayList<String>();
    }

    public Employees(List<String> employeeList) {
        this.employeeList = employeeList;
    }

    public List<String> getEmployeeList() {
        return employeeList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : getEmployeeList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }

    public void loadData() {
        //read all employees from database and put into the list
        employeeList.add("Mahbod");
        employeeList.add("Kevin");
        employeeList.add("Rose");
        employeeList.add("Lisa");
    }

}

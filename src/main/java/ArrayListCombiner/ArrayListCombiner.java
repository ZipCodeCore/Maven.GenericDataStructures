package ArrayListCombiner;

import Employee.Employee;
import Employee.Manager;

import java.util.ArrayList;

/**
 * Create two generic methods that take two arraylists.  The methods should both append the second ArrayList's items,
 * to the first.  Use a wildcard for one of the type arguments in each method.
 * The first method should be called extendCombiner and should use ? extends E
 * The second method should be called superCombiner and should use ? super E
 */
public class ArrayListCombiner<T> extends Manager {

    private ArrayList<Employee> employees;
    private ArrayList<Manager> managers;

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    public ArrayListCombiner(String name, double salary) {
        super(name, salary);
    }

    public static void extendCombiner(ArrayList<Employee> first, ArrayList<Manager> second) {
        first.addAll(second);
    }

    public static void superCombiner(ArrayList<Employee> first, ArrayList<Manager> second) {
        first.addAll(second);
    }
}

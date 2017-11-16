package Employee;

public class Janitor extends Manager{
    public Janitor(String name, double salary) {
        super(name, salary);
    }

    public synchronized String getname() {
        return null;
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class MyApplication {
    public static void main(String[] args) {
        ArrayList<Payable> payables = new ArrayList<>();

        Student student1 = new Student("Paul", "McCartney", 3.5);
        Student student2 = new Student("Ringo", "Starr", 2.5);

        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Engineer", 50000.00);

        payables.add(student1);
        payables.add(student2);
        payables.add(employee1);
        payables.add(employee2);

        Collections.sort(payables, (a, b) -> Double.compare(a.getPaymentAmount(), b.getPaymentAmount()));

        printData(payables);
    }

    public static void printData(Iterable<Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable + " earns " + payable.getPaymentAmount() + " tenge");
        }
    }
}

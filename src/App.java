import br.com.linkedlist.Customer;
import br.com.linkedlist.LinkedList;

public class App {
    
    public static void main(String[] args) throws Exception {

        Customer c1 = new Customer(1, "Fellipe");
        Customer c2 = new Customer(2, "Edeni");
        Customer c3 = new Customer(3, "Gabriel");
        Customer c4 = new Customer(4, "Caroline");
        Customer c5 = new Customer(5, "Isabella");

        LinkedList<Customer> linkedList = new LinkedList<>();
        linkedList.add(c1);
        linkedList.add(c2);
        linkedList.add(c3);
        linkedList.add(c4);
        linkedList.add(c5);

        Customer c6 = new Customer(6, "Sebastiao");
        Customer c7 = new Customer(7, "Ivanete");
        Customer c8 = new Customer(8, "Ivan");

        linkedList.add(c6);
        linkedList.add(c7, 0);
        linkedList.add(c8, 3);

        System.out.println("LinkedList size: " + linkedList.size());
        System.out.println("List of customers: " + linkedList);

    }
}

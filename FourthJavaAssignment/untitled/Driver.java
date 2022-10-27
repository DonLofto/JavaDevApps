import java.util.*;

public class Driver {

    public static void main(String[] args) {
        //Create an ArrayList and populate it with 4 Contact objects
        Scanner s = new Scanner(System.in);
        List<Contact> contacts = new ArrayList<>();
        //Adding objects to array
        contacts.add(new Contact("James", 28));
        contacts.add(new Contact("Neil", 29));
        contacts.add(new Contact("Tom", 30));
        contacts.add(new Contact("Brian", 26));

        //Use a ListIterator to traverse the list in both
        // directions displaying its contents
        ListIterator<Contact> itr = contacts.listIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        //Display the size of the list.
        int size = contacts.size();
        System.out.println("Array size is:" + size);

        //Request the user to input the name of a contact in the list
        System.out.print("Type in one of the names to find index of it's location: ");
        String name = s.nextLine();
        int index = -1;
        int counter = 0;
        for (Contact c : contacts) {
            if (name.equals(c.getName())) {
                index = counter;
                break;
            }
            counter++;
        }
           if (index == -1) {
                System.out.println("name not found");
            }

            else {
                System.out.println("The index location of " + name + " is " + index + "\n");
            }

            System.out.println("The name " + name +  " is now being removed from the list...\n");
            for (int i = 0; i < contacts.size(); i++) {
                if (contacts.get(i).getName().equals(name)) {
                    contacts.remove(i);
                    break;
                }
            }

            System.out.println("The details of the updated List are:");
            for (Contact c : contacts) {
                System.out.println(c.toString());
            }

        }
    }

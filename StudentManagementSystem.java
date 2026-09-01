
import java.util.*;

class Student {

    int id;
    String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id + "-" + name;
    }
}

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Student Management System---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6.Exit");
            try {
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();
                switch (ch) {
                    case 1 -> {
                        System.out.print("Enter Id: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name:");
                        String name = sc.nextLine();
                        students.add(new Student(id, name));
                        System.out.println("Student added.");
                    }
                    case 2 -> {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    case 3 -> {
                        System.out.print("Enter ID: ");
                        int search = sc.nextInt();
                        for (Student s : students) {
                            if (s.id == search) {
                                System.out.println(s);
                            }
                        }
                    }
                    case 4 -> {
                        System.out.println("Enter ID:");
                        int update = sc.nextInt();
                        sc.nextLine();
                        for (Student s : students) {
                            if (s.id == update) {
                                System.out.println("Enter new name: ");
                                s.name = sc.nextLine();
                                System.out.println("Updated.");
                            }
                        }
                    }
                    case 5 -> {
                        System.out.print("Enter ID: ");
                        int delete = sc.nextInt();
                        students.removeIf(s -> s.id == delete);
                        System.out.println("Deleted.");
                    }
                    case 6 -> {
                        System.out.println("Thank You!");
                        return;
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("please enter a validnumber.");
                sc.nextLine();
            }
        }
    }
}

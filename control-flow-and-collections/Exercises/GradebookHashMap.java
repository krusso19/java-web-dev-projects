import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;


public class GradebookHashMap {
    public static void main (String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudentName;
        Integer newId;

        System.out.println("Enter your students name (or ENTER to finish): ");

        do {
            newStudentName = input.nextLine();

            if (!newStudentName.isEmpty()){
                System.out.print("ID Number: ");
                newId = input.nextInt();
                students.put(newId, newStudentName);

                System.out.println("Name: ");
                input.nextLine();
            }
        } while(!newStudentName.isEmpty());

        System.out.println("Class Roster: ");
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }
    }
}

//takes in names(values) and IDs (Key)
//print ID with students name
// KT - I would change the loop? No If so newID can be accessed outside.
// KT - While first though so it can check if it is empty. If it is empty, then break.
package NewProjectForHashMap;

import java.util.HashMap;

public class StudentHashMapExample {

	public static void main(String[] args) {
		// Sample arrays of student IDs and marks
        String[] studentIds = {"101", "102", "103", "104"};
        int[] studentMarks = {90, 85, 95, 88};

        // Create a HashMap to store student information
        HashMap<String, Integer> studentMap = new HashMap<>();

        // Iterate through the arrays and store information in the HashMap
        for (int i = 0; i < studentIds.length; i++) {
            String studentId = studentIds[i];
            int studentMark = studentMarks[i];

            // Store the information in the HashMap
            studentMap.put(studentId, studentMark);
        }

        // Print the stored values in the HashMap
        System.out.println("Student Information:");
        for (String id : studentMap.keySet()) {
            int mark = studentMap.get(id);
            System.out.println("Student ID: " + id + ", Marks: " + mark);
        }

        // Print the size of the HashMap
        System.out.println("Size of the HashMap: " + studentMap.size());
    }
}

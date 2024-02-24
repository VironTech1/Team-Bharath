package Sri_laskshmi_sanikommu.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> StuCollection = new ArrayList<>();

        Student stu1 = new Student(11801, "Lakshmi Reddy", 23, 905902107);
        Student stu2 = new Student(11802, "Velugonda", 25, 905902334);
        Student stu3 = new Student(11803, "Srinivas", 27, 905324207);
        Student stu4 = new Student(11804, "Sam", 29, 934345307);
        Student stu5 = new Student(11805, "Ram", 30, 834702107);

        StuCollection.add(stu1);
        StuCollection.add(stu5);
        StuCollection.add(stu4);
        StuCollection.add(stu3);
        StuCollection.add(stu2);
        

        System.out.println("Student details in the collection:");
        System.out.println("-----------------------------");
        for (Student student : StuCollection) {
            System.out.println("Student ID: " + student.StuId);
            System.out.println("Student Name: " + student.StuName);
            System.out.println("Age: " + student.Age);
            System.out.println("Phone: " + student.Phone);
            System.out.println("-----------------------------");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Student ID to search: ");
        int searchId = input.nextInt();

        Student foundStudent = searchStudentById(StuCollection, searchId);

        if(foundStudent != null){
            System.out.println("Student Found");
            System.out.println("-----------------------------");
            System.out.println("Student ID: " + foundStudent.StuId);
            System.out.println("Student Name: " + foundStudent.StuName);
            System.out.println("Student Age: " + foundStudent.Age);
            System.out.println("Student Phone: " + foundStudent.Phone);
        }
        else{
            System.out.println("Student Not Found!!!");
        }

        System.out.print("Enter the Student ID to delete: ");
        int deleteId = input.nextInt();

        Student delete = deleteStudentById(StuCollection, deleteId);
        if (delete != null) {
            System.out.println("Student found And Deleting");
            StuCollection.remove(delete); 
        } else {
            System.out.println("Student Not Found!!!");
        }
        
        System.out.println("Student details After Deletion:");
        System.out.println("-----------------------------");
        for (Student student : StuCollection) {
            System.out.println("Student ID: " + student.StuId);
            System.out.println("Student Name: " + student.StuName);
            System.out.println("Age: " + student.Age);
            System.out.println("Phone: " + student.Phone);
            System.out.println("-----------------------------");
        }
        
    }

    private static Student searchStudentById(List<Student> stuCollection, int id) {
        for (Student student : stuCollection) {
            if (student.StuId == id) {
                return student;
            }
        }
        return null;
    }

    private static Student deleteStudentById(List<Student> stuCollection, int id) {
        for (Student student : stuCollection) {
            if (student.StuId == id) {
                return student;
            }
        }
        return null;
    }
}
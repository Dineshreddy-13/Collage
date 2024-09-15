// Write a menu driven application to maintain the Student Grade Sheet using JAVA.
// Your application must contain the following functionalities. Use constructors, getter and
// setter functions.
// a) For each student in your application must have the details such as
// name, registerNo, department, specialization, semester as basic details.
// b) For each student maintain 5 subject details as subjectName,
// subjectCode,mark,grade. Calculate the grade for each subject based on the mark.
// c) In the menu give the user options to add, edit, delete or display the student grade
// details

package exp4;
import java.util.Scanner;

public class StudentGrade {
        String name,department,specialization;
        int regno,sem;
        SubjectDetails[] arr = new SubjectDetails[2]; 


    public void setStudentDetails(String name,int regno,String department,String specialization,int sem){
            this.name = name;
            this.regno = regno;
            this.department = department;
            this.specialization = specialization;
            this.sem = sem;

    }
    public void setSubjectDetails(){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<2; i++){
            String sub_name = sc.nextLine();
            int sub_code = sc.nextInt();
            int sub_mark = sc.nextInt();
            sc.nextLine();
            char sub_grade = sc.next().charAt(0);
            arr[i] = new SubjectDetails(sub_name,sub_code,sub_mark,sub_grade);
            sc.nextLine();
        }
        sc.close();
    }

    public void getStudentDetails(){
        System.out.println(name);
        System.out.println(regno);
        System.out.println(department);
        System.out.println(specialization);
        System.out.println(sem);
    }
    public void getSubjectDetails(){
        for(int i=0; i<2; i++){
            System.out.println(arr[i].subjectname + " " + arr[i].subjectcode + " " +arr[i].mark+ " "+arr[i].grade);
        }

    }


    static class SubjectDetails{
        String subjectname;
        int subjectcode,mark;
        char grade;

        SubjectDetails(String subjectname, int subjectcode, int mark, char i){
           this.subjectname = subjectname;
           this.subjectcode = subjectcode;
           this.mark = mark;
           this.grade = i;
   
       }
    }

    public static void main(String args[]){
        StudentGrade std = new StudentGrade();
        std.setStudentDetails("dinesh", 1263, "btech", "cse", 3);
        std.setSubjectDetails();
        std.getStudentDetails();
        std.getSubjectDetails();
    }

}

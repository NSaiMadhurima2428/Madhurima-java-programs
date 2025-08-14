
class College {
    String collegeName;
    String collegeAddress;

    College(String name, String address) {
        this.collegeName = name;
        this.collegeAddress = address;
    }

    void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("College Address: " + collegeAddress);
    }
}

class School extends College {
    String schoolName;

    School(String collegeName, String collegeAddress, String schoolName) {
        super(collegeName, collegeAddress);
        this.schoolName = schoolName;
    }

    void displaySchoolInfo() {
        System.out.println("School Name: " + schoolName);
    }
}


class FacultyDetails extends School {
    String facultyName;
    String department;

    FacultyDetails(String collegeName, String collegeAddress, String schoolName, String facultyName, String department) {
        super(collegeName, collegeAddress, schoolName);
        this.facultyName = facultyName;
        this.department = department;
    }

    void displayFacultyInfo() {
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Department: " + department);
    }
}


class StudentMarks extends FacultyDetails {
    String studentName;
    int[] marks = new int[3];

    StudentMarks(String collegeName, String collegeAddress, String schoolName,
                 String facultyName, String department, String studentName, int[] marks) {
        super(collegeName, collegeAddress, schoolName, facultyName, department);
        this.studentName = studentName;
        this.marks = marks;
    }

    void displayStudentInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        int total = 0;
        for (int mark : marks) total += mark;
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + (total / marks.length));
    }
}

class CollegeManagement {
    static void main(String[] args) {
        int[] marks = {85, 90, 78}; // Sample marks
        StudentMarks student = new StudentMarks(
                "ABC College", "123 College Road", "School of Science",
                "Dr. Smith", "Physics", "John Doe", marks
        );

      
        student.displayCollegeInfo();
        student.displaySchoolInfo();
        student.displayFacultyInfo();
        student.displayStudentInfo();
    }
}

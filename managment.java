import java.io.*;
import java.util.*;
public class managment
{//public class
    public static void main(String[] args)
    {// main method
        Scanner input = new Scanner (System.in);

        System.out.println("Press 1 to login as an Admin : ");
        System.out.println("Press 2 to login as a Student : ");
        System.out.println("Press 3 to calculate use our GPA calculator (you don't need to login for that ) : ");
        int choice = input.nextInt();
        boolean isValidAdmin = false;
        boolean isValidStudent = false;
        switch (choice)//main switch
        {
         case 1:
            {
                while(!isValidAdmin)
                {
                File file = new File ("Uni Managment\\adminAccounts.txt");
                isValidAdmin = checkAdminAccount(file);
                if (isValidAdmin == true)
                {
                   System.out.println("Correct Password and Username");
                    break;
                }
                else
                {
                    System.out.println("Invalid username or password");
                    System.out.println("Try Again");
                }
            }
                //else
                while (isValidAdmin)
                {
                    System.out.println("Welcome Admin");
                    System.out.println("Press 1 : To add a new student details: ");
                    System.out.println("Press 2 : To view students of any Semester: ");
                    System.out.println("Press 3 : To search for a student : ");
                    System.out.println("Press 4 : To Find the Top Three students of any Semester : ");
                    System.out.println("Press 5 : To add course : ");
                    System.out.println("Press 6 : To view all course : ");
                    System.out.println("Press 7 : To view CGPA  : ");
                    System.out.println("Enter 0 to Exit : ");
                    int adminChoice = input.nextInt();
                    if(adminChoice == 0)
                    {
                        System.out.println("You are Successfuly Logged Out.....");
                        System.out.println("Thank You...");
                        break;
                    }
                    else
                    {
                    switch (adminChoice)
                    {
                    case 1://add student
                        {
                            System.out.println("Select a Semester : ");
                            System.out.println(" 1: For First Semester : ");
                            System.out.println(" 2: For Second Semester : ");
                            System.out.println(" 3: For Third Semester : ");
                            System.out.println(" 4: For Fourth Semester : ");
                            System.out.println(" 5: For Fifth Semester : ");
                            System.out.println(" 6: For Sixth Semester : ");
                            System.out.println(" 7: For Seventh Semester : ");
                            System.out.println(" 8: For Eight Semester : ");
                            try {
                                int semChoice = input.nextInt();
                                switch (semChoice) {
                                    case 1:
                                        File path = new File("Uni Managment\\Students_sem1.txt");
                                        addStudent(path);
                                        break;
                                    case 2:
                                        File path1 = new File("Uni Managment\\Students_sem2.txt");
                                        addStudent(path1);
                                        break;
                                    case 3:
                                        File path2 = new File("Uni Managment\\Students_sem3.txt");
                                        addStudent(path2);
                                        break;
                                    case 4:
                                        File path3 = new File("Uni Managment\\Students_sem4.txt");
                                        addStudent(path3);
                                        break;
                                    case 5:
                                        File path4 = new File("Uni Managment\\Students_sem5.txt");
                                        addStudent(path4);
                                        break;
                                    case 6:
                                        File path5 = new File("Uni Managment\\Students_sem6.txt");
                                        addStudent(path5);
                                        break;
                                    case 7:
                                        File path6 = new File("Uni Managment\\Students_sem7.txt");
                                        addStudent(path6);
                                        break;
                                    case 8:
                                        File path7 = new File("Uni Managment\\Students_sem8.txt");
                                        addStudent(path7);
                                        break;
                                    default:
                                        System.out.println("Invalid Choice");
                                }
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        break;
                        }//case 1 end
                    case 2: //To view students
                    {
                        System.out.println("Select 1 to Display all students of semester 1: ");
                            System.out.println("Select 2 to Display all students of semester 2: ");
                            System.out.println("Select 3 to Display all students of semester 3: ");
                            System.out.println("Select 4 to Display all students of semester 4: ");
                            System.out.println("Select 5 to Display all students of semester 5: ");
                            System.out.println("Select 6 to Display all students of semester 6: ");
                            System.out.println("Select 7 to Display all students of semester 7: ");
                            System.out.println("Select 8 to Display all students of semester 8: ");
                            int semChoice = input.nextInt();
                            try {
                                switch (semChoice) {
                                    case 1: {
                                        File path = new File("Uni Managment\\Students_sem1.txt");
                                        viewStudent(path);
                                        break;
                                    }
                                    case 2: {
                                        File path1 = new File("Uni Managment\\Students_sem2.txt");
                                        viewStudent(path1);
                                        break;
                                    }
                                    case 3: {
                                        File path2 = new File("Uni Managment\\Students_sem3.txt");
                                        viewStudent(path2);
                                        break;
                                    }
                                    case 4: {
                                        File path3 = new File("Uni Managment\\Students_sem4.txt");
                                        viewStudent(path3);
                                        break;
                                    }
                                    case 5: {
                                        File path4 = new File("Uni Managment\\Students_sem5.txt");
                                        viewStudent(path4);
                                        break;
                                    }
                                    case 6: {
                                        File path5 = new File("Uni Managment\\Students_sem6.txt");
                                        viewStudent(path5);
                                        break;
                                    }
                                    case 7: {
                                        File path6 = new File("Uni Managment\\Students_sem7.txt");
                                        viewStudent(path6);
                                        break;
                                    }
                                    case 8: {
                                        File path7 = new File("Uni Managment\\Students_sem8.txt");
                                        viewStudent(path7);
                                        break;
                                    }
                                    default:
                                        System.out.println("Invalid Choice");
                                }
                            } // try
                            catch (Exception e) {
                                System.out.println(e);
                            }
                            break;
                    }//end main case2 admin
                    case 3://to search for a student
                {
                    System.out.println("Select a Semester To Search a Student by Registration Number: ");
                    System.out.println(" 1: For First Semester : ");
                    System.out.println(" 2: For Second Semester : ");
                    System.out.println(" 3: For Third Semester : ");
                    System.out.println(" 4: For Fourth Semester : ");
                    System.out.println(" 5: For Fifth Semester : ");
                    System.out.println(" 6: For Sixth Semester : ");
                    System.out.println(" 7: For Seventh Semester : ");
                    System.out.println(" 8: For Eight Semester : ");
                    int semChoice = input.nextInt();
                    switch (semChoice) {
                        case 1: {
                            File path = new File("Uni Managment\\Students_sem1.txt");
                            searchStudent(path);
                            break;
                        }
                        case 2: {
                            File path1 = new File("Uni Managment\\Students_sem2.txt");
                            searchStudent(path1);
                            break;
                        }
                        case 3: {
                            File path2 = new File("Uni Managment\\Students_sem3.txt");
                            searchStudent(path2);
                            break;
                        }
                        case 4: {
                            File path3 = new File("Uni Managment\\Students_sem4.txt");
                            searchStudent(path3);
                            break;
                        }
                        case 5: {
                            File path4 = new File("Uni Managment\\Students_sem5.txt");
                            searchStudent(path4);
                            break;

                        }
                        case 6: {
                            File path5 = new File("Uni Managment\\Students_sem6.txt");
                            searchStudent(path5);
                            break;
                        }
                        case 7: {
                            File path6 = new File("Uni Managment\\Students_sem7.txt");
                            searchStudent(path6);
                            break;
                        }
                        case 8: {
                            File path7 = new File("Uni Managment\\Students_sem8.txt");
                            searchStudent(path7);
                            break;
                        }
                        default:
                            System.out.println("Invalid Choice");
                    }//switch
                break;
                }// end of main admin case 3
            
                case 4://to view the top 3 students
                {
                    System.out.println("Enter 1.... To view Toppers of 1st Semester: ");
                    System.out.println("Enter 2.... To view Toppers of 2nd Semester: ");
                    System.out.println("Enter 3.... To view Toppers of 3rd Semester: ");
                    System.out.println("Enter 4.... To view Toppers of 4th Semester: ");
                    System.out.println("Enter 5.... To view Toppers of 5th Semester: ");
                    System.out.println("Enter 6.... To view Toppers of 6th Semester: ");
                    System.out.println("Enter 7.... To view Toppers of 7th Semester: ");
                    System.out.println("Enter 8.... To view Toppers of 8th Semester: ");
                    int semchoice = input.nextInt();
                    switch (semchoice)
                    {
                        case 1: {
                            File path = new File("Uni Managment\\marks_sem1.txt");
                            viewToppers(path);
                            break;
                        }
                        case 2: {
                            File path1 = new File("Uni Managment\\marks_sem2.txt");
                            viewToppers(path1);
                            break;
                        }
                        case 3: {
                            File path2 = new File("Uni Managment\\marks_sem3.txt");
                            viewToppers(path2);
                            break;
                        }
                        case 4: {
                            File path3 = new File("Uni Managment\\marks_sem4.txt");
                            viewToppers(path3);
                            break;
                        }
                        case 5: {
                            File path4 = new File("Uni Managment\\marks_sem5.txt");
                            viewToppers(path4);
                            break;
                        }
                        case 6: {
                            File path5 = new File("Uni Managment\\marks_sem6.txt");
                            viewToppers(path5);
                            break;
                        }
                        case 7: {
                            File path6 = new File("Uni Managment\\marks_sem7.txt");
                            viewToppers(path6);
                            break;
                        }
                        case 8: {
                            File path7 = new File("Uni Managment\\marks_sem8.txt");
                            viewToppers(path7);
                            break;
                        }
                        default:
                            System.out.println("Invalid Choice");
                    }//closing of case 4 switch
                    break;
                } //end of main case 4
                    case 5:// to add a new course
                {
                    System.out.println("Enter the semester number");
                            System.out.println("Enter 1 to add a course into first Semester Catalogue : ");
                            System.out.println("Enter 2 to add a course into second Semester Catalogue : ");
                            System.out.println("Enter 3 to add a course into third Semester Catalogue : ");
                            System.out.println("Enter 4 to add a course into fourth Semester Catalogue : ");
                            System.out.println("Enter 5 to add a course into fifth Semester Catalogue : ");
                            System.out.println("Enter 6 to add a course into sixth Semester Catalogue : ");
                            System.out.println("Enter 7 to add a course into seventh Semester Catalogue : ");
                            System.out.println("Enter 8 to add a course into eighth Semester Catalogue : ");
                            int semChoice = input.nextInt();
                            switch (semChoice) {
                                case 1: {
                                    File path = new File("Uni Managment\\Courses_sem1.txt");
                                    addCourse(path);
                                    break;
                                }
                                case 2: {
                                    File path1 = new File("Uni Managment\\Courses_sem2.txt");
                                    addCourse(path1);
                                    break;
                                }
                                case 3: {
                                    File path2 = new File("Uni Managment\\Courses_sem3.txt");
                                    addCourse(path2);
                                    break;
                                }
                                case 4: {
                                    File path3 = new File("Uni Managment\\Courses_sem4.txt");
                                    addCourse(path3);
                                    break;
                                }
                                case 5: {
                                    File path4 = new File("Uni Managment\\Courses_sem5.txt");
                                    addCourse(path4);
                                    break;
                                }
                                case 6: {
                                    File path5 = new File("Uni Managment\\Courses_sem6.txt");
                                    addCourse(path5);
                                    break;
                                }
                                case 7: {
                                    File path6 = new File("Uni Managment\\Courses_sem7.txt");
                                    addCourse(path6);
                                    break;
                                }
                                case 8: {
                                    File path7 = new File("Uni Managment\\Courses_sem8.txt");
                                    addCourse(path7);
                                    break;
                                }
                                default:
                                    System.out.println("Invalid Choice");
                            }
                            break;
                }//end of main case 5 admin

                    case 6://to view courses
                    {
                        System.out.println("Enter the semester number");
                            System.out.println("Enter 1 to view first Semester Catalogue : ");
                            System.out.println("Enter 2 to view second Semester Catalogue : ");
                            System.out.println("Enter 3 to view third Semester Catalogue : ");
                            System.out.println("Enter 4 to view fourth Semester Catalogue : ");
                            System.out.println("Enter 5 to view fifth Semester Catalogue : ");
                            System.out.println("Enter 6 to view sixth Semester Catalogue : ");
                            System.out.println("Enter 7 to view seventh Semester Catalogue : ");
                            System.out.println("Enter 8 to view eighth Semester Catalogue : ");
                            int semChoice = input.nextInt();
                            switch (semChoice) {
                                case 1: {
                                    File path = new File("Uni Managment\\Courses_sem1.txt");
                                    viewCourse(path);
                                    break;
                                }
                                case 2: {
                                    File path1 = new File("Uni Managment\\Courses_sem2.txt");
                                    viewCourse(path1);
                                    break;
                                }
                                case 3: {
                                    File path2 = new File("Uni Managment\\Courses_sem3.txt");
                                    viewCourse(path2);
                                    break;
                                }
                                case 4: {
                                    File path3 = new File("Uni Managment\\Courses_sem4.txt");
                                    viewCourse(path3);
                                    break;
                                }
                                case 5: {
                                    File path4 = new File("Uni Managment\\Courses_sem5.txt");
                                    viewCourse(path4);
                                    break;
                                }
                                case 6: {
                                    File path5 = new File("Uni Managment\\Courses_sem6.txt");
                                    viewCourse(path5);
                                    break;
                                }
                                case 7: {
                                    File path6 = new File("Uni Managment\\Courses_sem7.txt");
                                    viewCourse(path6);
                                    break;
                                }
                                case 8: {
                                    File path7 = new File("Uni Managment\\Courses_sem8.txt");
                                    viewCourse(path7);
                                    break;
                                }
                                default:
                                    System.out.println("Invalid Choice");
                            }
                            break;
                    }// end main case 7
                    case 7:
                    {//to view all CGPA
                        System.out.println("Press 1 : To view CGPA of Students of semester 1: ");
                System.out.println("Press 2 : To view CGPA of Students of semester 2: ");
                System.out.println("Press 3 : To view CGPA of Students of semester 3: ");
                System.out.println("Press 4 : To view CGPA of Students of semester 4: ");
                System.out.println("Press 5 : To view CGPA of Students of semester 5: ");
                System.out.println("Press 6 : To view CGPA of Students of semester 6: ");
                System.out.println("Press 7 : To view CGPA of Students of semester 7: ");
                System.out.println("Press 8 : To view CGPA of Students of semester 8: ");
                int semchoice = input.nextInt();
                switch (semchoice) {
                    case 1: {
                        File path = new File("Uni Managment\\marks_sem1.txt");
                        viewCGPA(path);
                        break;
                    }
                    case 2: {
                        File path1 = new File("Uni Managment\\marks_sem2.txt");
                        viewCGPA(path1);
                        break;
                    }
                    case 3: {
                        File path2 = new File("Uni Managment\\marks_sem3.txt");
                        viewCGPA(path2);
                        break;
                    }
                    case 4: {
                        File path3 = new File("Uni Managment\\marks_sem4.txt");
                        viewCGPA(path3);
                        break;
                    }
                    case 5: {
                        File path4 = new File("Uni Managment\\marks_sem5.txt");
                        viewCGPA(path4);
                        break;
                    }
                    case 6: {
                        File path5 = new File("Uni Managment\\marks_sem6.txt");
                        viewCGPA(path5);
                        break;
                    }
                    case 7: {
                        File path6 = new File("Uni Managment\\marks_sem7.txt");
                        viewCGPA(path6);
                        break;
                    }
                    case 8: {
                        File path7 = new File("Uni Managment\\marks_sem8.txt");
                        viewCGPA(path7);
                        break;
                    }
                    default:
                        System.out.println("Invalid Choice");

                }
                    }//end of module 8
        }//admin choice switch
                }//else 
            }//while
            break;
            }// admin case1 in main switch
        //Now Case 2 for students 
        case 2:
        {//student module starting
            while(!isValidStudent)
                {
                File file = new File ("Uni Managment\\StudentsAccounts.txt");
                isValidStudent = checkStudentAccount(file);
                if (isValidStudent == true)
                {
                   System.out.println("Correct Password and Username");
                    break;
                }
                else
                {
                    System.out.println("Invalid username or password");
                    System.out.println("Try Again");
                }
            }

            while(isValidStudent)
            {
            System.out.println("Press 1 to view your personal info : ");
                System.out.println("Press 2 to view your courses : ");
                System.out.println("Press 3 to view your CGPA : ");
                System.out.println("Press 0 to logout : ");
                int studentchoice = input.nextInt();
                if (studentchoice== 0)
                {
                    isValidStudent= false;
                    System.out.println("You are logged out Successfully");
                    System.out.println("Thank You....");
                    break;
                }
                else{
                switch (studentchoice)
                {
                    case 1:
                        {//to view personal info
                        System.out.println("Enter youur semester : ");
                        int semChoice = input.nextInt();
                        switch (semChoice)
                        {
                            case 1:
                            {
                                File path = new File("Uni Managment\\Students_sem1.txt");
                                searchStudent(path);
                                break;
                            }
                            case 2:
                            {
                                File path1 = new File("Uni Managment\\Students_sem2.txt");
                                searchStudent(path1);
                                break;
                            }
                            case 3:
                            {
                                File path2 = new File("Uni Managment\\Students_sem3.txt");
                                searchStudent(path2);
                                break;
                            }
                            case 4:
                            {
                                File path3 = new File("Uni Managment\\Students_sem4.txt");
                                searchStudent(path3);
                                break;
                            }
                            case 5:
                            {
                                File path4 = new File("Uni Managment\\Students_sem5.txt");
                                searchStudent(path4);
                                break;
                            }
                            case 6:
                            {
                                File path5 = new File("Uni Managment\\Students_sem6.txt");
                                searchStudent(path5);
                                break;
                            }
                            case 7:
                            {
                                File path6 = new File("Uni Managment\\Students_sem7.txt");
                                searchStudent(path6);
                                break;
                            }
                            case 8:
                            {
                                File path7 = new File("Uni Managment\\Students_sem8.txt");
                                searchStudent(path7);
                                break;
                            }
                            default:
                            {
                                System.out.println("Invalid Choice");
                            }
                        }//sem choice closing
                        break;
                        }// info view case 1 closing
                    case 2:
                    {// view your courses
                        System.out.println("Enter youur semester : ");
                        int semChoice = input.nextInt();
                        switch (semChoice) {
                            case 1: {
                                File path = new File("Uni Managment\\Courses_sem1.txt");
                                viewCourse(path);
                                break;
                            }
                            case 2: {
                                File path1 = new File("Uni Managment\\Courses_sem2.txt");
                                viewCourse(path1);
                                break;
                            }
                            case 3: {
                                File path2 = new File("Uni Managment\\Courses_sem3.txt");
                                viewCourse(path2);
                                break;
                            }
                            case 4: {
                                File path3 = new File("Uni Managment\\Courses_sem4.txt");
                                viewCourse(path3);
                                break;
                            }
                            case 5: {
                                File path4 = new File("Uni Managment\\Courses_sem5.txt");
                                viewCourse(path4);
                                break;
                            }
                            case 6: {
                                File path5 = new File("Uni Managment\\Courses_sem6.txt");
                                viewCourse(path5);
                                break;
                            }
                            case 7: {
                                File path6 = new File("Uni Managment\\Courses_sem7.txt");
                                viewCourse(path6);
                                break;
                            }
                            case 8: {
                                File path7 = new File("Uni Managment\\Courses_sem8.txt");
                                viewCourse(path7);
                                break;
                            }
                            default:
                                System.out.println("Invalid Choice");
                        }
                        break;
                    }//end of case 2 view courses by student
                    case 3:
                {// to view your cgpa
                    System.out.println("Select your semester to view your CGPA : ");
                    int semChoice = input.nextInt();
                    switch (semChoice) {
                        case 1: {
                            File path = new File("Uni Managment\\marks_sem1.txt");
                            viewYourCGPA(path);
                            break;
                        }
                        case 2: {
                            File path1 = new File("Uni Managment\\marks_sem2.txt");
                            viewYourCGPA(path1);
                            break;
                        }
                        case 3: {
                            File path2 = new File("Uni Managment\\marks_sem3.txt");
                            viewYourCGPA(path2);
                            break;
                        }
                        case 4: {
                            File path3 = new File("Uni Managment\\marks_sem4.txt");
                            viewYourCGPA(path3);
                            break;
                        }
                        case 5: {
                            File path4 = new File("Uni Managment\\marks_sem5.txt");
                            viewYourCGPA(path4);
                            break;
                        }
                        case 6: {
                            File path5 = new File("Uni Managment\\marks_sem6.txt");
                            viewYourCGPA(path5);
                            break;
                        }
                        case 7: {
                            File path6 = new File("Uni Managment\\marks_sem7.txt");
                            viewYourCGPA(path6);
                            break;
                        }
                        case 8: {
                            File path7 = new File("Uni Managment\\marks_sem8.txt");
                            viewYourCGPA(path7);
                            break;
                        }
                        default:
                            System.out.println("Invalid Choice");
                        break;
                    }
                }// closing of view cgpa main student case 3
               
        }//student main choice switch closing
            }//else statement
        }//student while
    }//student main module closing
    case 3 :
    {//GPA calculator
        System.out.println("Press 1... To Calculate Your GPA of a single semester : ");
        System.out.println("Press 2.... To calculate Your CGPA : ");
        int Userchoice = input.nextInt();
        switch (Userchoice)
        {
            case 1:
            {
                System.out.println("Enter the number of courses: ");
                int courses = input.nextInt();
        
                String grades [] = new String[courses];
                int total_credits [] = new int[courses];
        
                for (int i = 0; i < courses; i++) {
                    System.out.print("Enter the grade for course (Ex, A, A-, B...) " + (i + 1) + ": ");
                    grades[i] = input.next();
                    System.out.print("Enter the credit hours for course " + (i + 1) + ": ");
                    total_credits[i] = input.nextInt();
                }
        
                double Points = 0.0;
                int totalCreditHours = 0;
        
                for (int i = 0; i < courses; i++) {
                    double gradePoints = GradetoPoint(grades[i]);
                    Points += gradePoints * total_credits[i];
                    totalCreditHours += total_credits[i];
                }
        
                double gpa = Points / totalCreditHours;
                System.out.printf("Your GPA is: %.2f\n", gpa);
                break;
            }
            case 2:
            {
                System.out.print("Enter the number of total semesters: ");
                int sem = input.nextInt();

                double[] gpa = new double[sem];
                int[] creditHours = new int[sem];
        
                double totalPoints = 0;
                int totalCreditHours = 0;

                for (int i = 0; i < sem; i++) {
                    System.out.print("Enter GPA for semester #" + (i + 1) + ": ");
                    gpa[i] = input.nextDouble();
                    System.out.print("Enter the credit hours for semester #" + (i + 1) + ": ");
                    creditHours[i] = input.nextInt();

                    totalPoints += gpa[i] * creditHours[i];
                    totalCreditHours += creditHours[i];
                }

                double cgpa = totalPoints / totalCreditHours;
                System.out.print("Your CGPA is: "+ cgpa);
                break;
            }//case2closing
            default:
            {
                System.out.println("Invalid Choice");
            }
        }//user choice switch closing
    }//closing gpa calculator

}// main switch closing
    }// main method
    public static boolean checkAdminAccount(File file) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your username : ");
            String username = input.nextLine();
            System.out.println("Enter Your Password : ");
            String password = input.nextLine();
            FileInputStream x = new FileInputStream(file);
            Scanner s = new Scanner(x);
            while (s.hasNextLine()) {
                String username1 = s.nextLine();
                String password1 = s.nextLine();
                if (username1.equals(username) && password1.equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public static void addStudent(File file) {
    try (PrintStream s = new PrintStream(new FileOutputStream(file, true))) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Student ID : ");
        String id = input.nextLine();
        System.out.println("Enter the Student Name : ");
        String name = input.nextLine();
        System.out.println("Enter the Student Email : ");
        String email = input.nextLine();
        System.out.println("Enter the Student Phone Number : ");
        String phone = input.nextLine();

        s.println(id);
        s.println(name);
        s.println(email);
        s.println(phone);
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
        System.out.println("I/O error: " + e.getMessage());
    }
    System.out.println("Student has been successfully added to the Record ");
}
    public static void viewStudent(File file) {
        try {
            FileInputStream x = new FileInputStream(file);
            Scanner s = new Scanner(x);
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

public static void searchStudent(File file) {
        try {
            Scanner input = new Scanner(System.in);
            FileInputStream x = new FileInputStream(file);
            Scanner s = new Scanner(x);
            ArrayList<String> students = new ArrayList<>(); // Change Integer to String
            while (s.hasNextLine()) {
                students.add(s.nextLine());
            }
            System.out.println("Enter the Student ID to search: ");
            String id = input.nextLine();
            if (students.contains(id)) {
                System.out.println("Student found:");
                int index = students.indexOf(id);
                for (int i = index; i < index + 4; i++) {
                    System.out.println(students.get(i));
                }
            } else {
                System.out.println("Student not found.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
   
    public static void addCourse(File file) {
        try {
            Scanner input = new Scanner(System.in);
            FileOutputStream y = new FileOutputStream(file, true);
            PrintWriter s = new PrintWriter(y);
            System.out.println("Enter the Course ID : ");
            String id = input.nextLine();
            System.out.println("Enter the Course Name : ");
            String name = input.nextLine();
            System.out.println("Enter the Course Code : ");
            String code = input.nextLine();
            System.out.println("Enter the Course Credit : ");
            String credit = input.nextLine();
            s.println(id);
            s.println(name);
            s.println(code);
            s.println(credit);
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void viewToppers(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);
            Scanner scanner = new Scanner(fis);

            ArrayList<String> students = new ArrayList<>();
            ArrayList<Double> marks = new ArrayList<>();

            while (scanner.hasNext()) {
                String name = scanner.next();
                students.add(name);
                marks.add(scanner.nextDouble());
            }

            double max1 = Double.NEGATIVE_INFINITY;
            double max2 = Double.NEGATIVE_INFINITY;
            double max3 = Double.NEGATIVE_INFINITY;

            for (double mark : marks) {
                if (mark >= max1) {
                    if (mark > max1) {
                        max3 = max2;
                        max2 = max1;
                        max1 = mark;
                    }
                } else if (mark >= max2) {
                    if (mark > max2) {
                        max3 = max2;
                        max2 = mark;
                    }
                } else if (mark >= max3) {
                    max3 = mark;
                }
            }

            ArrayList<String> toppers1 = new ArrayList<>();
            ArrayList<String> toppers2 = new ArrayList<>();
            ArrayList<String> toppers3 = new ArrayList<>();

            for (int i = 0; i < students.size(); i++) {
                double mark = marks.get(i);
                if (mark == max1) {
                    toppers1.add(students.get(i));
                } else if (mark == max2) {
                    toppers2.add(students.get(i));
                } else if (mark == max3) {
                    toppers3.add(students.get(i));
                }
            }

            System.out.println("The Toppers Are : ");
            System.out.println("Topper 1 : ");
            for (String topper : toppers1) {
                System.out.println(topper);
            }
            System.out.println("Topper 2 : ");
            for (String topper : toppers2) {
                System.out.println(topper);
            }
            System.out.println("Topper 3 : ");
            for (String topper : toppers3) {
                System.out.println(topper);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

public static void viewCourse(File file) {
    try {
        FileInputStream x = new FileInputStream(file);
        Scanner s = new Scanner(x);

        System.out.println("Course ID\tCourse Name\tCourse Code\tCourse Credit");
        System.out.println("------------------------------------------------------------");

        while (s.hasNextLine()) {
            String id = s.nextLine();
            String name = s.nextLine();
            String code = s.nextLine();
            String credit = s.nextLine();

            System.out.printf("%s\t%s\t%s\t%s\n", id, name, code, credit);
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
}

public static void viewCGPA(File file) {
        System.out.println("Name\tCGPA");
        System.out.println("----\t----");

        try {
            FileInputStream x = new FileInputStream(file);
            Scanner s = new Scanner(x);

            while (s.hasNextLine()) {
                String name = s.nextLine();
                double cgpa = Double.parseDouble(s.nextLine()); // Convert string to double
                System.out.println(name + "\t" + cgpa);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

public static void viewYourCGPA(File file) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your name to view your CGPA : ");
        String name = input.next();

        try {
            FileInputStream x = new FileInputStream(file);
            Scanner s = new Scanner(x);

            boolean found = false;
            while (s.hasNextLine()) {
                String studentName = s.nextLine();
                double cgpa = Double.parseDouble(s.nextLine()); // Convert string to double

                if (studentName.equalsIgnoreCase(name)) {
                    System.out.println("Your CGPA is: " + cgpa);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Your name was not found in the CGPA file.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static boolean checkStudentAccount(File file) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your username : ");
            String username = input.nextLine();
            System.out.println("Enter Your Password : ");
            String password = input.nextLine();
            FileInputStream x = new FileInputStream(file);
            Scanner s = new Scanner(x);
            while (s.hasNextLine()) {
                String username1 = s.nextLine();
                String password1 = s.nextLine();
                if (username1.equals(username) && password1.equals(password)) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }

    public static Double GradetoPoint(String grade){
        switch(grade.toUpperCase()){
            case "A":
                return 4.00;
            case "A-":
                return 3.66;
            case "B+":
                return 3.33;
            case "B":
                return 3.00;
            case "B-":
                return 2.66;
            case "C+":
                return 2.33;
            case "C":
                return 2.00;
            case "C-":
                return 1.66;
            case "D+":
                return 1.33;
            case "D":
                return 1.00;
            case "F":
                return 0.00;
            default:
                System.out.println("Invalid grade entered. Please enter a valid grade (A, A-, B+, etc.).");
                return 0.0;
        }
    }
}//public class
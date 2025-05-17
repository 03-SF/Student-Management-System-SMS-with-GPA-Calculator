# Student Management System (SMS) with GPA Calculator
University Management System in Java for Programming Fundamentals course. Features admin & student logins, student/course management, GPA/CGPA calculator, and file-based data storage for semester-wise records.

📌 Overview
This Student Management System (SMS) is a console-based Java application developed as a 2nd-semester project. It allows:

✅ Admins to manage student records, courses, and academic performance.

✅ Students to view their profiles, courses, and CGPA.

✅ Public users to calculate GPA/CGPA without logging in.


✨ Key Features:

👨‍💻 Admin Panel

🔐 Secure login authentication

➕ Add/view students by semester

🔍 Search student records

🏆 View top 3 students per semester

📚 Add/view courses

📊 View CGPA reports

🎓 Student Panel

🔐 Secure login authentication

👤 View personal details

📖 View enrolled courses

📈 Check CGPA

🧮 Public GPA Calculator

📉 Calculate semester GPA (enter grades & credit hours)

📊 Calculate CGPA (enter past GPAs & credits)

Supports standard grade-to-point conversions (A, A-, B+, etc.)


⚙️ Technical Details

Language: Java

File Handling: Text-based storage (adminAccounts.txt, Students_semX.txt, etc.)

Data Structure: ArrayList, file I/O operations

Modular Design: Separate methods for each feature


📂 File Structure

Uni Management/

├── adminAccounts.txt          # Admin credentials

├── StudentsAccounts.txt       # Student credentials

├── Students_sem1.txt          # Semester-wise student records

├── Courses_sem1.txt           # Semester-wise courses

├── marks_sem1.txt             # Semester-wise grades/CGPA

└── ... (up to sem8)

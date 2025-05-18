# Student Management System (SMS) with GPA Calculator
A Java console application developed for Programming Fundamentals course (2nd semester) featuring role-based access and academic tools.

## 📌 Overview
**Role-based Management System:**
- 👨‍💻 **Admin Panel:** Manage students, courses, and academic records
- 🎓 **Student Portal:** View personal data and academic performance
- 🧮 **Public Tools:** GPA/CGPA calculator (no login required)

## ✨ Key Features

### Admin Functions
- 🔐 Secure login authentication
- ➕ Add/view students by semester
- 🔍 Search student records
- 🏆 View top 3 performers per semester
- 📚 Course management (add/view)
- 📊 Generate CGPA reports

### Student Functions
- 🔐 Secure login
- 👤 View personal profile
- 📖 Check enrolled courses
- 📈 View CGPA

### GPA Tools
- 📉 Semester GPA calculator (grades + credit hours)
- 📊 Multi-semester CGPA calculator
- Supports standard grade conversions (A → 4.0, A- → 3.66, etc.)

## ⚙️ Technical Implementation
- **Core:** Java (Console-based)
- **Storage:** Text files (`adminAccounts.txt`, `Students_semX.txt`)
- **Data Handling:** File I/O operations with ArrayLists
- **Structure:** Modular methods for each functionality

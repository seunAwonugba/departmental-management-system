fun main(args: Array<String>) {
    /**
     * create an instance of student and try to access its values
     */
    println("An instance of Students")
    var student1 = Student("Seun",26,1);
    println("Student's name is: ${student1.theName}");
    println("Student's age: ${student1.theAge}");
    println("Student's id: ${student1.theId}");
    println()

    /**
     * Creating an instance of a principal and also accessing its values
     */
    println("An instance of a Principal")
    var principal1 = Principal("Mr Ayo",50, 2);
    println("Functions of the principal includes:\n\t* ${principal1.functionPrincipal()}");
    println("Principals name:  ${principal1.theName}");
    println("Principal's age: ${principal1.theAge} years");
    println("Principal's id: ${principal1.theId}");
    println()

    /**
     * Creating an instance of a principal and also accessing its values
     */
    println("An instance of a teacher")
    var teacher1 =Teacher("Temidayo", 30, 3);
    println("Function's of the teacher includes:\n\t* ${teacher1.functionTeacher()}");
    println("Teacher's name: ${teacher1.theName} years");
    println("Teacher's age: ${teacher1.theAge}");
    println("Teacher's id: ${teacher1.theId}");
    println()
    /**
     * Creating an instance of a non academic staff and also accessing its values
     */
    println("An instance of a non-academic staff")
    var nonAcademicStaff1 = NonAcademicStaff("Mr Shola",35, 20);
    println("Functions of a non-Academic staff includes:\n\t* ${nonAcademicStaff1.nonAcademicStaffFunction()}")
    println("Non-Academic staff name: ${nonAcademicStaff1.theName}")
    println("Non-Academic staff age: ${nonAcademicStaff1.theAge}")
    println("Non-Academic staff id: {nonAcademicStaff1.theId}")
    println()

    /**
     * Creating an instance of applicants and also trying to access its values
     */
    println("An instance of an applicant")
    var applicant1 = Applicants("Mr Ajala", 40,50);
    println("Applicants name: ${applicant1.theName}")
    println("Applicants age: ${applicant1.theAge}")
    println("Applicants id: ${applicant1.theId}")
    println()

    /**
     * Creating a list of all the courses offered in the department
     */
    var listOfCoursesOffered = Courses("Mathematics", "English", "Physics")
    println("List of courses offered in our department include: ${listOfCoursesOffered.courseOffered1}, ${listOfCoursesOffered.courseOffered2}, and ${listOfCoursesOffered.courseOffered3}")
    println()

    /**
     * Listing out all the classes in the department
     */

    var classesInDepartment = Classes("Year 1", "Year 2", class3 = "Year 3", "Year 4")
    println("We have four classes in this Department");
    println("1st class is ${classesInDepartment.theClass1}")
    println("2nd class is ${classesInDepartment.theClass2}")
    println("3rd class is ${classesInDepartment.theClass3}")
    println("4th class is ${classesInDepartment.theClass4}")
}

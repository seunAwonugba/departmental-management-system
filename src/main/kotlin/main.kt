fun main(args: Array<String>) {
    var student1 = Student("Seun",26,1);
    println(student1.theName);
    println(student1.theAge);
    println(student1.theId);


    var principal1 = Principal("Mr Ayo",50, 2);
    println(principal1.functionPrincipal());


    var teacher1 =Teacher("Temidayo", 30, 3);
    println(teacher1.functionTeacher());

    var nonAcademicStaff1 = NonAcademicStaff("Mr Shola",35, 20);
    println(nonAcademicStaff1.nonAcademicStaffFunction())
}
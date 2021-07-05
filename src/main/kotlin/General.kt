/**
 * using an abstract class to serves as a base class that holds the general properties of other derived class
 */

abstract class General(name:String, age:Int, id:Int){
    var theName:String;
    var theAge:Int;
    var theId:Int;

    init {
        this.theName = name;
        this.theAge = age;
        this.theId = id;
    }
}
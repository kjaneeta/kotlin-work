// Task 15.2.1: syntax for subclasses

open class Parent

open class Child : Parent()
// openness does not carry forward!

class GrandChild : Child()

open class Person(val name: String)

class Student(name: String, val degree: String) : Person(name)
             ----------------------------------

// you need to specify which constructor method the child is inheriting from!
// 'degree' is preceded with val whereas 'name' is not because name is already an
// attribute defined in the parent class.


val student = Student("Sarah", "Computer Science")

println(student.name)     // accesses inherited property
println(student.degree)
package cn.mirrorming.basis.object_oriented

/**
 * 抽象
 *
 * @author Mireal
 */
object Abstract {

  def main(args: Array[String]): Unit = {
    var stu = new Student1()

    println(stu.name + " : " + stu.age)
    stu.speak
  }
}

abstract class Person2 {
  def speak

  val name: String
  val age: Int
}

class Student1 extends Person2 {
  //override def speak: Unit = ???
  override def speak: Unit = {
    println("speak")
  }

  override val name: String = "Mireal"
  override val age: Int = 32
}
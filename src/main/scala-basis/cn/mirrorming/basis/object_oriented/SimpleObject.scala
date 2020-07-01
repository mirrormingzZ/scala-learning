package cn.mirrorming.basis.object_oriented

/**
 * CaseClass
 *
 * @author Mireal
 */
object SimpleObject {

  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "Mireal"
    println(person.name + ".." + person.age)
    println("invoke eat method: " + person.eat)
    person.watchFootball("Barcelona")

    person.printInfo()
    //编译不通过 private 修饰
    //    println(person.gender)
  }
}

class People {
  //var(变量)类型自动生成getter/setter
  var name: String = _
  //val(常量)类型自动生成getter
  val age: Int = 10

  private[this] var gender = "male"

  def printInfo(): Unit = {
    print("性别: " + gender)
  }

  def eat(): String = {
    name + "吃饭..."
  }

  def watchFootball(teamName: String): Unit = {
    println(name + " is watching match of " + teamName)
  }
}
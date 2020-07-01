package cn.mirrorming.basis.object_oriented

/**
 * CaseClass
 *
 * @author Mireal
 */
//通常用在模式匹配
object CaseClass {

  def main(args: Array[String]): Unit = {
    println(Dog("wangcai").name)
  }
}

//case class 不用new
case class Dog(name: String)

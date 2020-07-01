package cn.mirrorming.basis.function

object Function {

  def main(args: Array[String]): Unit = {
    println(add(2, 3))
    println(three())
    println(three) //没有入参的函数，调用时括号可以省略

    sayHello
    sayHello("Chan")
    //    默认参数
    sayName()
    sayName("Mireal Chan")
    //    命名参数
    println(speed(time = 10, destination = 100))

    val x = 1
    if (x > 0) true else false

    1.to(10)
    1.until(10)
    Range(1, 10, 2)

    for (i <- 1 to 10) {
      println(i)
    }

    for (i <- 1.until(10, 3)) {
      println(i)
    }

    for (i <- 1 to 10 if i % 2 == 0) {
      println(i)
    }

    val courses = Array("Hadoop", "Spark SQL", "Spark Streaming", "Storm", "Scala")
    for (course <- courses) {
      println(course)
    }

    courses.foreach(course => println(course))

    var (num, sum) = (100, 0)
    while (num > 0) {
      sum = sum + num
      num = num - 1
    }
    println(sum)
  }

  def add(x: Int, y: Int): Int = {
    x + y //最后一行就是返回值，不需要return
  }

  def three() = 1 + 2

  def sayHello: Unit = {
    println("Say Hello...")
  }

  def sayHello(name: String): Unit = {
    println("Say Hello..." + name)
  }

  def sayName(name: String = "Hello Mireal") = {
    println(name)
  }

  def speed(destination: Float, time: Float) = {
    destination / time
  }

  def sum(a: Int, b: Int) = {
    a + b
  }

  def sum2(numbers: Int*) = {
    var result = 0
    for (num <- numbers) {
      result += num
    }
    result
  }
}
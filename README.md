# scala-learning
```
src
  main
    java            SpringBoot-Java 
    scala           SpringBoot-Scala 目录
    scala-basis     Scala 基础
```
## 初识Scala (https://www.scala-lang.org)
### Scala概述
***Scala运行于Java平台(Java虚拟机)，并兼容现有的Java程序***
- Scala是一门多范式的编程语言，设计初衷是要集成面向对象编程和函数式编程的各种特性

- 多范式编程语言：是一种支持超过一种编程范型的程式语言，这个词提出最初是用于表述C++可以同时使用多种风格来写程序，比如面向对象和泛型编程。
	
>	官网原文： Scala combines object-oriented and functional programming in one concise, high-level language.



### 大数据生态圈	
- Hadoop  -> Java语言
- Spark   -> Scala语言
- Spark、Apache Flink、Apache kafka等都是Scale开发的

> Scala和Java可以互通

> Scala是Spark生态圈的基石  

_Scala vs Java  HelloWorld_
```java
public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World..");
	}
}
```
```scala
//Scala(每行代码并不强求使用;结束)
object HelloWorld {
	def main(args : Array[String]) {
		println("Hello World..")
	}
}
```
## 入门
### val vs var
	val：值
		final
		val 值名称：类型=xx
		val a = 1  (不可变)
		val a : int = 1
	var：变量
		var 值名称：类型=xxx
		var b = 1
		var b : int = 1
### Scala基本数据类型
	Byte/Char
	Short/Int/Long/Float/Double
	Boolean

	只有Float声明时比较特别
		var c : Float = 1.1f

### lazy的使用
	lazy var d : int = 1;
	延迟加载，只有在第一次使用时才加载

	读取文件并以字符串形式输出
		import scala.io.Source._
		var info = fromFile("...").mkString
	如果用lazy var info = fromFile("...").mkString，开始是检测不到错误的，要小心使用
> 注意：当一个变量声明为lazy，只有当你第一次操作时才会去真正访问，如果不去访问，即使写错了，也不会发现

### 使用IDEA整合Maven构建Scala应用程序
	1.下载IDEA和Maven
	2.进入IDEA，新建项目 选择Maven 勾选create from archetype 选择scala-archetype simple-> 正常创建(注意Maven仓库位置)
	3.IDEA默认是不支持Scala的，需要下载Scala插件
		File -> settings -> Plugins -> install JetBrains plugin -> scala
		之后就可以new 一个Scala类了
	4.新建测试类，运行报错
		删除pom.xml中<arg>make:transitive</args>

## Scala 函数

### 函数/方法的定义和使用
```scala
def 方法名(参数: 参数类型): 返回值类型 = {
		//方法体
		//返回值(不需要使用return)
	}
```
```scala
def max(x: Int, y: Int): Int = {
	if(x > y)
		x
	else 
		y
}
```
	
- def:开始函数定义
- max:函数名
- ()：参数列表
- 最后一个Int：函数返回值类型

例：
```scala
def main(args: Array[String]): Unit = {
	println(add(2,3))
	println(three())
	println(three)  //没有入参的函数，调用时括号可以省略

	sayHello
	sayHello("zhangsan")
}

def add(x: Int, y: Int): Int = {
	x + y //最后一行就是返回值，不需要return
}
def three() = 1 + 2

def sayHello: Unit ={
	println("Say Hello...")
}

def sayHello(name : String): Unit ={
	println("Say Hello..." + name)
}
```
### 默认参数： 在函数定义时，允许指定参数的默认值
```scala
def sayName(name: String = "Mireal") = {
  println(name)
}

sayName()

sayName("Hello Mireal")
```

> 相关源码：SparkContext中使用

### 命名参数
```scala
def speed(destination: Float, time: Float): Float {
	destination / time
}
println(speed(100, 10))
println(speed(time = 10, destination = 100))
```

### 可变参数(可传入任意多个相同类型的参数)  java中 int... numbers
	JDK5+：可变参数
	def sum(number: Int*) {
		var result = 0
		for(num <- number) {
			result += num
		}
		result
	}
	相关源码：org.apache.spark.sql.Dataset中的select方法

### 条件表达式
```scala
	if else
	val a = if(x > 0) true else false
```


### 循环表达式
- to   	1 to 10 (左闭右闭)  1.to(10)
- range	Range(1,10) (左闭右开的) Range(1,10,2) (2为步长)
- until	1 until 10 (左闭右开)
- to、until的底层调用都是Range
```scala
for(i <- 1.to(10)) {
	println(i)
}
for(i <- 1.until(10, 2)) {
	println(i)
}
for(i <- 1 to 10 if i % 2 == 0) {
	println(i)
}
val courses = Array("Hadoop", "Spark SQL", "Spark Streaming", "Storm", "Scala")
for(course <- courses) {
	println(course)
}
//course 其实就是courses里面的每个元素
// => 	 就是将左边的course作用上一个函数，变成另外一个结果
courses.foreach(course => println(course))
var (num, sum) = (100, 0)
while(num > 0){
	sum = sum + num
	num = num - 1
}
println(sum)
```
	
	
	
	

	
	
	
	
	
	
	
	
	

	
	
	
	

	
	
	

	
	
	
	
	
	
	
## 对象

Java/Scala OO(Object Oriented)
	封装：属性、方法封装到类中，可设置访问级别
	继承：父类和子类之间的关系  重写 
	多态：父类引用指向子类对象  开发框架基石

类的定义和使用
	class SparkContext(config: SparkConf) extends Logging{}

	构造器(主构造器和附属构造器)
	def this() = this(new SparkConf())

	//主构造器
	class Person(val name: String, val age: Int){
		  println("Person constructor enter...")

		  val school = "ustc"
		  var gender: String = _

		  //附属构造器
		  def this(name: String , age: Int, gender: String){
		    this(name, age)   //必须要调用主构造器或者其他附属构造器
		    this.gender = gender
	 }

继承
		class Student(name: String, age: Int, var major: String) extends Person(name, age) {

重写
	override def acquireUnrollMemory()
	override def toString = "test override"

抽象类
	abstract class Person2{}
	private [spark] abstract class MemoryManager(...) entends Logging{}

伴生类和伴生对象
  	如果有一个class，还有一个与class同名的object 互为 伴生类和伴生对象
	class ApplyTest{
		def apply(){
			println(...)
		}
	} 
	object ApplyTest{
		def apply(){
			println("Object ApplyTest apply...")
			new ApplyTest
		}
	} 
	
  	类名() ==> Object.apply
  	对象() ==> Class.apply  
  	最佳实践：在Object的apply方法中去new一个Class

  	case class ：不用new
  		case class Dog(name: String)

  	Trait： 类似implements  
  			xxx entends ATrait 
  			xxx extends Cloneable with Logging with Serializable
  		源码中Partition类


## SpringBoot 2.3.1 整合 Scala 构建微服务应用

### pom 添加依赖和 plugin 详细参考代码
```xml
<!-- 添加 Scala 依赖 -->
<dependency>
    <groupId>org.scala-lang</groupId>
    <artifactId>scala-library</artifactId>
    <version>${scala.version}</version>
</dependency>


<!-- 添加 plugin -->
<build>
    <sourceDirectory>${project.basedir}/src/main/scala</sourceDirectory>
    <plugins>
        <plugin>
            <groupId>net.alchim31.maven</groupId>
            <artifactId>scala-maven-plugin</artifactId>
            <version>${maven.scala.version}</version>
            <executions>
                <execution>
                    <goals>
                        <goal>compile</goal>
                        <goal>testCompile</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>
```
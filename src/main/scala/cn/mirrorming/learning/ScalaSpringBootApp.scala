package cn.mirrorming.learning

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

/**
 * 启动类 任选一个启动即可
 *
 * @author Mireal
 */
@SpringBootApplication
@ComponentScan(value = Array("cn.mirrorming.learning.*"))
class ScalaSpringBootApp

object ScalaSpringBootApp extends App {
  SpringApplication.run(classOf[ScalaSpringBootApp])
}
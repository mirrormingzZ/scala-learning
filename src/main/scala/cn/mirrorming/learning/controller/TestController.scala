package cn.mirrorming.learning.controller

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

/**
 * @author Mireal
 */
@RestController
class TestController {
  @RequestMapping(value = Array("/hello"), method = Array(RequestMethod.GET))
  def sayHello() = "Hello Scala...."
}

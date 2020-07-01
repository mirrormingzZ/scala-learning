package cn.mirrorming.learning.controller

import cn.mirrorming.learning.domain.Teacher
import cn.mirrorming.learning.domain.dto.R
import cn.mirrorming.learning.service.TeacherService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation._

/**
 * @author Mireal
 */
@RestController
@RequestMapping(Array("/table", "/t")) //两个路径都能访问
class TeacherController @Autowired()(metaTableService: TeacherService) {

  @PostMapping
  def save(metaTable: Teacher) = {
    metaTableService.save(metaTable)
    R.succeed() // 调用Java代码
  }

  @GetMapping
  def query() = R.succeed(metaTableService.query())
}

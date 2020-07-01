package cn.mirrorming.learning.service

import cn.mirrorming.learning.domain.Teacher
import cn.mirrorming.learning.repository.TeacherRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * @author Mireal
 */
@Service
class TeacherService @Autowired()(repository: TeacherRepository) {

  @Transactional
  def save(metaTable: Teacher) = repository.save(metaTable)


  def query() = repository.findAll()

}

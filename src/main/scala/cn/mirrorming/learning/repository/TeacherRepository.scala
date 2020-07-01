package cn.mirrorming.learning.repository

import cn.mirrorming.learning.domain.Teacher
import org.springframework.data.jpa.repository.JpaRepository

/**
 * @author Mireal
 */
trait TeacherRepository extends JpaRepository[Teacher, Integer] {
}

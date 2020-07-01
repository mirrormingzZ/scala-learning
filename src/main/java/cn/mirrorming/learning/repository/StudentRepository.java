package cn.mirrorming.learning.repository;

import cn.mirrorming.learning.domain.po.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Mireal Chan
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {
}

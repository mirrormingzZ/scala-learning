package cn.mirrorming.learning.service;

import cn.mirrorming.learning.domain.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author Mireal
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

    @Autowired
    private TeacherService teacherService;

    @Test
    public void testSave() {
        Teacher teacher = new Teacher();
        teacher.setName("Mr Chan");
        teacher.setAge(23);
        teacherService.save(teacher);
    }

    @Test
    public void testQuery() {
        List<Teacher> query = teacherService.query();
        System.out.println(query);
    }
}

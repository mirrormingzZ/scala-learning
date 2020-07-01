package cn.mirrorming.learning.controller;

import cn.mirrorming.learning.domain.dto.R;
import cn.mirrorming.learning.domain.po.Student;
import cn.mirrorming.learning.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mireal
 */
@RestController
@RequestMapping("/meta/database")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    public R save(Student student) {
        studentService.save(student);
        return R.succeed();
    }

    @GetMapping
    public R query() {
        return R.succeed(studentService.query());
    }
}

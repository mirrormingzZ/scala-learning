package cn.mirrorming.learning.service;

import cn.mirrorming.learning.domain.po.Student;
import cn.mirrorming.learning.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * @author Mireal
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class StudentService {
    private final StudentRepository studentRepository;

    @Transactional(rollbackFor = Exception.class)
    public void save(Student student) {
        studentRepository.save(student);
    }

    public List<Student> query() {
        return studentRepository.findAll();
    }
}

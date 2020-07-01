package cn.mirrorming.learning.domain.po;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Mireal Chan
 */
@Data
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String hobby;
}

package cn.mirrorming.learning.domain

import javax.persistence.{Entity, GeneratedValue, Id, Table}
import scala.beans.BeanProperty

/**
 * @author Mireal
 */
@Entity
@Table
class Teacher {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Integer = _

  @BeanProperty
  var name: String = _

  @BeanProperty
  var age: Integer = _
}

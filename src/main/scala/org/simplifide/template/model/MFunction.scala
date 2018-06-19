package org.simplifide.template.model

import org.simplifide.template.Container
import org.simplifide.template.model.MVar.{MType, Var}

trait MFunction extends Model{
  val name:Model
  val output:MType
  val args:List[Var]
  def body:List[Model]
}

object MFunction {
  abstract case class MFunc(name:Model, output:MType) extends Container[Model] with MFunction {

    def body = items.toList
  }
}


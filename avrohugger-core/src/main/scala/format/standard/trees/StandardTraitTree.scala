package avrohugger
package format
package standard
package trees

import treehugger.forest._
import definitions._
import treehuggerDSL._

import org.apache.avro.Protocol

import scala.collection.JavaConversions._

object StandardTraitTree {

  def toADTRootDef(protocol: Protocol) = {
    val traitTree =
      TRAITDEF(protocol.getName)
        .withFlags(Flags.SEALED)
    val treeWithScalaDoc = ScalaDocGenerator.docToScalaDoc(
      Right(protocol),
      traitTree)
      
    treeWithScalaDoc
  }
  
}

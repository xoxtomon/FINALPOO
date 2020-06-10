import Command._
import Luz._
import Control._
import Prender._
import Apagar._

object Main extends App {
  
  var lampara = new Luz
  var control = new Control
  var prender = new Prender(lampara)
  var apagar = new Apagar(lampara)

  control.prenderApagar(prender)

  control.prenderApagar(apagar)

}
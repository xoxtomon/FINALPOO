package Prender
import Luz._
import Command._

class Prender(luz:Luz) extends Command{
    def ejecutar() = luz.prender_()
}
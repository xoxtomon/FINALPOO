package Apagar
import Luz._
import Command._

class Apagar(luz:Luz) extends Command{
    def ejecutar() = luz.apagar_()
}
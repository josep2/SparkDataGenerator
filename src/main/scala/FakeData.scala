import com.danielasfregola.randomdatagenerator.RandomDataGenerator

object FakeData extends RandomDataGenerator {

  case class Jowanza(name: String, sign: String)

  val wanzi: Jowanza = random[Jowanza]

  def main(args: Array[String]): Unit = {
    print(wanzi)
  }

}

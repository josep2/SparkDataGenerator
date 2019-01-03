import com.danielasfregola.randomdatagenerator.RandomDataGenerator

object FakeData extends RandomDataGenerator {

  case class Jowanza(name: String, sign: String, id: Long)

  val wanzi: Seq[Jowanza] = random[Jowanza](100)

  def main(args: Array[String]): Unit = {
    wanzi.foreach(println)
  }

}

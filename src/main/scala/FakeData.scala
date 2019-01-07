import com.danielasfregola.randomdatagenerator.RandomDataGenerator

object FakeData extends RandomDataGenerator {

  case class Jowanza(name: fabricator.Contact, sign: String, id: Long)

  val contact = fabricator.Contact()

  val wanzi: Seq[Jowanza] = random[Jowanza](100)

  def main(args: Array[String]): Unit = {
    wanzi.foreach(println)
  }

}

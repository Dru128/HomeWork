import org.junit.Assert
import org.junit.Test
import kotlin.system.exitProcess

public class Main
{
        @Test
        fun main()
        {
//          far cel, fut = 0.3 met, 0.6 mil = km, 745 vut = HS, 2.5 akr = gek
//            10 atm = pas, 1.8 kmH = uzl, 3.8 litr = gal, 142 karat = unc
            val numOper = true                                 // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            val a = 2f                                         // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            val actual = 200f                                  // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            val operation = "*"                                // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            val value1 = Currency(100f, "fut")      // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            val value2 = Currency(11f, "fut")       // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            var values = mutableListOf<Currency>(value1, value2)

            for (i in values.indices)
            {
                when (values[i].mera)
                {
                    "cel" -> values[i].toFar()
                    "met" -> values[i].toFut()
                    "km" -> values[i].toMil()
                    "HS" -> values[i].toVut()
                    "gek" -> values[i].toAkr()
                    "pas" -> values[i].toAtm()
                    "uzl" -> values[i].toKmH()
                    "gal" -> values[i].toLitr()
                    "unc" -> values[i].toKarat()
                }

            }
             if (values[0].mera != values[1].mera)
             {
                 print("ERROR---РАЗНЫЕ ЕДИНИЦЫ ИЗМЕРЕНИЯ")
                 exitProcess(0)
             }

            when (operation)
            {
                "+" ->
                {
                     val expect = values[0].value + values[1].value
                     Assert.assertEquals(expect, actual)
                }
                "-" ->
                {
                    val expect: Float?
                    if (numOper) expect = values[0].value - a
                    else expect = values[1].value - a
                    Assert.assertEquals(expect, actual)
                }
                "*" ->
                {
                    val expect: Float?
                    if (numOper) expect = values[0].value * a
                    else expect = values[1].value * a
                    Assert.assertEquals(expect, actual)
                }
                "/" ->
                {
                    val expect: Float?
                    if (numOper) expect = values[0].value / a
                    else expect = values[1].value / a
                    Assert.assertEquals(expect, actual)
                }
                ">" ->
                {
                    var expect = false
                    if (values[0].value > values[1].value) expect = true
                    Assert.assertEquals(expect, actual)
                }
                "<" ->
                {
                    var expect = false
                    if (values[0].value < values[1].value) expect = true
                    Assert.assertEquals(expect, actual)
                }
                "=" ->
                {
                    Assert.assertEquals(values[0].value, values[1].value)
                }
            }
            print("SUCSECSFULL")
        }
}
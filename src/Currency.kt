import org.junit.Assert
import org.junit.Test

class Currency(var value: Float, var mera: String)
{
    fun toFar()
    {
        value = (value * 9f/5f) + 32f
        mera = "far"
    }

    fun toFut()
    {
        value *= 3f
        mera = "fut"
    }

    fun toMil()
    {
        value *= 0.6f
        mera  = "mil"
    }

    fun toVut()
    {
        value *= 735f
        mera = "vut"
    }

    fun toAkr()
    {
        value *= 2.5f
        mera = "akr"
    }

    fun toAtm()
    {
        value *= 10f
        mera = "atm"
    }

    fun toKmH()
    {
        value *= 1.8f
        mera = "kmH"
    }

    fun toLitr()
    {
        value *= 3.8f
        mera = "litr"
    }

    fun toKarat()
    {
        value *= 142f
        mera = "karat"
    }
}


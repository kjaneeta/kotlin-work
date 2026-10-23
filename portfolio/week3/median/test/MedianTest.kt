// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Exception when size=1"
    {
        median(listOf()) shouldBe (listOf[0])
    }

    "Exception when size=2"
    {
        median(listOf()) shouldBe ((listOf[0] + listOf[1]) /2)
    }

    "Exception when size=3"
    {
        median(listOf()) shouldBe (listOf[1])
    }

    "Exception when size=4"
    {
        median(listOf()) shouldBe ((listOf[1] + listOf[2]) /2)
    }


})

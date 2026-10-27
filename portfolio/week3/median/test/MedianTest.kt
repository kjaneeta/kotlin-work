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



    "Median when size=1" {
        val numbers = listOf(1.0f)
        median(numbers) shouldBe (1.0f plusOrMinus tolerance)
    }

    "Median when size=2" {
        val numbers = listOf(0.0f, 1.0f)
        median(numbers) shouldBe (0.5f plusOrMinus tolerance)
    }

    "Median when size=3" {
        val numbers = listOf(0.0f, 1.0f, 2.0f)
        median(numbers) shouldBe (1.0f plusOrMinus tolerance)
    }

    "Median when size=4" {
        val numbers = listOf(0.0f, 1.0f, 2.0f, 3.0f)
        median(numbers) shouldBe (1.5f plusOrMinus tolerance)
    }


})


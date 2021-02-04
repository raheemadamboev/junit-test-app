package xyz.teamgravity.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class HomeWorkTest {

    @Test
    fun `if number is 1 return 1`() {
        val result = HomeWork.fib(1)

        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `if number is 0 return 0`() {
        val result = HomeWork.fib(0)

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `calculate number`() {
        val result = HomeWork.fib(5)

        assertThat(result).isEqualTo(7)
    }

    @Test
    fun `start brace more`() {
        val result = HomeWork.checkBraces("((yeah)")

        assertThat(result).isFalse()
    }

    @Test
    fun `end brace more`() {
        val result = HomeWork.checkBraces("((yeah)))")

        assertThat(result).isFalse()
    }

    @Test
    fun `braces are same`() {
        val result = HomeWork.checkBraces("(yeah)")

        assertThat(result).isTrue()
    }

    @Test
    fun `braces are same but fucked up`() {
        val result = HomeWork.checkBraces(")yeah(")

        assertThat(result).isFalse()
    }
}
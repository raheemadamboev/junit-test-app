package xyz.teamgravity.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username return false`() {
        val result = RegistrationUtil.validateRegistration("", "123", "123")

        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistration("Philip", "123", "123")

        assertThat(result).isTrue()
    }

    @Test
    fun `username exists returns false`() {
        val result = RegistrationUtil.validateRegistration("Raheem", "123", "123")

        assertThat(result).isFalse()
    }

    @Test
    fun `empty password return false`() {
        val result = RegistrationUtil.validateRegistration("Philip", "", "")

        assertThat(result).isFalse()
    }

    @Test
    fun `not same password returns false`() {
        val result = RegistrationUtil.validateRegistration("", "1234", "123")

        assertThat(result).isFalse()
    }

    @Test
    fun `password less than 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistration("", "BA1", "BA1")

        assertThat(result).isFalse()
    }
}
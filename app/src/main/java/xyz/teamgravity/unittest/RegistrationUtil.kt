package xyz.teamgravity.unittest

object RegistrationUtil {

    private val existingUsers = listOf("Raheem", "Nargeeza")

    /**
     * The input is not valid if...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not same as the real password
     * ...the password contains less than 2 digits
     */

    fun validateRegistration(
        username: String,
        password1: String, password2: String
    ): Boolean {

        if (username.isBlank() || password1.isBlank()) {
            return false
        }

        if (username in existingUsers) {
            return false
        }

        if (password1 != password2) {
            return false
        }

        if (password1.count { it.isDigit() } < 2) {
            return false
        }

        return true
    }
}
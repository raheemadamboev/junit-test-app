package xyz.teamgravity.unittest

object HomeWork {

    /**
     * Returns the n-th fibonacci number
     * They are defined like this:
     * fib(0) = 0
     * fib(1) = 1
     * fib(n) = fib(n-2) + fib(n-1)
     */
    fun fib(n: Int): Long {
        if (n == 0 || n == 1) {
            return n.toLong()
        }

        return ((n - 2) + (n - 1)).toLong()
    }

    /**
     * Checks if braces are set correctly
     * e.g. "(a * b)) returns false
     */
    fun checkBraces(string: String): Boolean {
        for (char in string) {
            if (char == '(') break
            if (char == ')') return false
        }

        return string.count { it == '(' } == string.count { it == ')' }
    }
}
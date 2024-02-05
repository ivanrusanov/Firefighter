/* This class contains methods that work very slow that makes them visible on flame graph */
class PrimeFinder {
    fun getPrimes(n: Int): List<Int> {
        if (n <= 2) return listOf()

        val res = mutableListOf<Int>()
        for (i in 3..n) {
            if (isPrime(i)) {
                res.add(i)
            }
        }

        return res
    }

    private fun isPrime(a: Int): Boolean {
        for (i in 2..<a) {
            if (a % i == 0) {
                return false
            }
        }
        return true
    }
}
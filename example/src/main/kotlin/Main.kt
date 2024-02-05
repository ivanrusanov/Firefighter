fun main(args: Array<String>) {
    var limit = 1000
    if (args.isNotEmpty()) {
        limit = args[0].toInt()
    }

    val primes = PrimeFinder().getPrimes(limit)
    println(primes.joinToString())
}
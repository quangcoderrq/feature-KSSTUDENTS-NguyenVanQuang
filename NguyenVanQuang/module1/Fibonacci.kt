
package nguyenvanquang.module1

interface IFibonacci {
    fun fibonacci(n: Int, flag: Boolean): Long
}

class FibonacciImpl : IFibonacci {
    override fun fibonacci(n: Int, flag: Boolean): Long {
        return if (flag) recursiveNotImplemented(n) else iterativeNotImplemented(n)
    }

    private fun recursiveNotImplemented(n: Int): Long {
        throw UnsupportedOperationException("Recursive not implemented yet")
    }

    private fun iterativeNotImplemented(n: Int): Long {
        throw UnsupportedOperationException("Iterative not implemented yet")
    }
}

package oop



fun main(args: Array<String>) {
    val op = Operation()
    op.sum(3,3)
    op.div(3,3)
    op.sub(3,3)
    op.mul(3,3)
}

    open class Sum {
        open fun sum(a: Int, b: Int) {
            println("$a + $b = ${a + b}")
        }
    }
    open class Sub:Sum() {
        fun sub(a: Int, b: Int) {
            println("$a - $b = ${a - b}")
        }
    }
    open class Div:Sub() {
        fun div(a: Int, b: Int) {
            println("$a / $b = ${a / b}")
        }
    }
    open class Mul : Div() {
        fun mul(a: Int, b: Int) {
            println("$a * $b = ${a * b}")
        }
    }

    class Operation : Mul() {
        override fun sum(a: Int, b: Int) {
            println("$a + $b = ${a + b}")

        }
    }











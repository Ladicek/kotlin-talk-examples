package _03classes

sealed class Expression

class Const(val value: Int) : Expression()

class Add(val a: Expression, val b: Expression) : Expression()

class Mul(val a: Expression, val b: Expression) : Expression()

fun eval(expr: Expression): Int = when (expr) {
    is Const -> expr.value
    is Add -> eval(expr.a) + eval(expr.b)
    is Mul -> eval(expr.a) * eval(expr.b)
}

fun main() {
    println(eval(
            Add(
                    Mul(
                            Const(2),
                            Add(
                                    Const(3),
                                    Const(5)
                            )
                    ),
                    Add(
                            Const(7),
                            Mul(
                                    Const(11),
                                    Const(13)
                            )
                    )
            )
    ))
}

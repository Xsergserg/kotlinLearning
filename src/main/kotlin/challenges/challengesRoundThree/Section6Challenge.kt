package academy.learnprogramming.section6challenge


fun main(args: Array<String>) {

    // using a range, print 5, 10, 15, 20, 25... 5000, each number
    // on a separate line
    (5..5000).step(5).forEach(::println)

    // using a range, -500..0, each number on a separate line
    (-500..0).forEach(::println)

    // using a range, print the first 15 numbers in the
    // Fibonacci sequence, each
    // number on a separate line
    // Hint: you'll have to print the first one or two numbers
    // outside the range
    // 0, 1, 1, 2, 3, 5, 8...
    var total: Int
    var secondToLast = 0
    var last = 1
    println (secondToLast)
    println (last)
    (1..13).forEach {
        total = secondToLast + last
        secondToLast = last
        last = total
        println(last)
    }
    // Modify the following code so that it prints the following,
    // each number on a separate line
    // 1, 11, 100, 99, 98, 2
    for (i in 1..5) {
        println(i)
        if (i == 2)
            break
        kloop@ for (j in 11..20) {
            println(j)
            for (k in 100 downTo 90) {
                println(k)
                if (k == 98)
                    break@kloop
            }
        }
    }



    // Declare a variable called num (int) and assign it whatever you want

    val num = 10

    // Declare a variable called dnum (double) and assign it as follows:
    // if num > 100, assign dnum -234.567
    // if num < 100, assign dnum 4444.555
    // if num == 100, assign dnum 0.0
    // do all of the above (declaring dnum and assigning
    // it) in one statement/expression

    var dnum = when {
        num > 100 -> -234.567
        num < 100 -> 4444.444
        else -> 0.0
    }
    // Then print the value of dnum - separate statement
    println(dnum)
    dnum = if (num > 100) -234.567 else if (num < 100) 4444.444 else 0.0
    println(dnum)
    dnum = if (num > 100)
        -234.567
    else if (num < 100)
        4444.444
    else
        0.0
    println(dnum)
}
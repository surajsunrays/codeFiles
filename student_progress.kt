fun main(args: Array<String>) {
    println("Enter marks of student:")
    var x = readLine()!!
    var a:Int = x.toInt()

    when(a) {
        in 1..40 -> println("student is dull")
        in 41..65 -> println("student is average")
        in 66..100 -> println("student is clever")
    }

}
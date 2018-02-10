fun main(args: Array<String>){
    println("Enter 5 Numbers")

    for(i in 1..5){
        println("Enter $i number:")
        var x = readLine()!!
        var a:Int = x.toInt()
        var cube:Int = (a*a*a)
        println("cube is: $cube")
    }
}
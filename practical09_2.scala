@main def main():Unit ={

    println("Enter the Number that you want to check ")
    val a =scala.io.StdIn.readInt()
    println(patternmatch(a))

}
val isNegative = (value:Int) => {
    value < 0
}
val isZero = (value:Int) => {
    value == 0
}
val isEven = (value:Int) => {
    value %2 == 0 && value>0
}
val isOdd = (value:Int) => {
    value %2 == 1 && value > 0
} 
val itsNegative = () => {
    "Negative number is given"
}
val itsZero = () => {
    "Zero is given"
}
val itsEven = () => {
    "Even number is given" 
}
val itsOdd = () => {
    "Odd number is given"
}
val patternmatch = (num:Int) => num match {
    case x if isNegative(x) => itsNegative()
    case x if isZero(x) => itsZero()
    case x if isEven(x) => itsEven()
    case x if isOdd(x) => itsOdd()
}

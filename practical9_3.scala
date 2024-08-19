@main def main():Unit = {
    println("Enter the inputs separated by commas")
    val input = scala.io.StdIn.readLine()
    val names = input.split(",").map(_.trim).toList
    formatInOutput(names)
}
val toUpper= (word:String) => {
    word.map(a => a.toUpper)
} 
val toLower= (word:String) => {
    word.map(a => a.toLower)
} 
val format1 = (word:String) => {
    word.head.toUpper + toLower(word.tail)
}
val format2 = (word:String) => {
   word.head.toUpper + toLower(word.substring(1,word.length -1)) + word.last.toUpper
}
val formatNames = (name:String , func:String => String) => {
    func(name)
}
val formatInOutput = (names:List[String]) => {
    println(formatNames(names(0),toUpper))
    println(formatNames(names(1),format1))
    println(formatNames(names(2),toLower))
    println(formatNames(names(3),format2))
}
@main def main():Unit = {
    print("Enter you Amount : ")
    val amount =  scala.io.StdIn.readDouble
    println("Your Interest for Amount " + amount + " is " + checkInterest(amount))
}
val range1 = (amount:Double) => {
   0 < amount && amount <= 20000
}
val range2 = (amount:Double) => {
    20000 < amount && amount <=200000
}
val range3 = (amount:Double) => {
    200000 < amount && amount <= 2000000
}
val range4 = (amount:Double) => {
    amount > 2000000
}
val interest1 = (amount:Double) => {
    amount*0.02
}
val interest2 = (amount:Double) => {
    amount*0.04
}
val interest3 = (amount:Double) => {
    amount*0.035
}
val interest4 = (amount:Double) => {
    amount*0.065
}
val interest5 = (amount:Double) => {
    amount*0
}
val checkInterest = (amount:Double) => {
    if(range1(amount)) interest1(amount)
    else if(range2(amount)) interest2(amount)
    else if(range3(amount)) interest3(amount)
    else if(range4(amount)) interest4(amount)
    else interest5(amount)
}
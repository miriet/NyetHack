fun main(args: Array<String>){
//    var signatureDrink = "맥주"
//    signatureDrink = null
    var signatureDrink = readLine()
        signatureDrink?.let {
        signatureDrink = it.capitalize()
    } ?: println("null입니다.")
//    signatureDrink = null
    println(signatureDrink)
}
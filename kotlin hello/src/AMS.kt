import java.util.*

fun main(args: Array<String>){

    days()
}

 fun days(){
     var today = random()
     var food= randomfood(today)

     println("today is $today and we feed the fish $food")
 }

fun randomfood(today: String): Any {
return when(today){
    "monday"->"flask"
    "tuesday"->"pleat"
    "wensday"->"rice"
    "thursday"->"beans"
    "friday"->"corn"
    "saturday"->"yam"



    else -> {"fasting"
    }
}

}


fun random() : String{
    val day = listOf ("monday","tuesday","wensday","thursday","friday","saturday","sunday")
    return day[Random().nextInt(7)]
}


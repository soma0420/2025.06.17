//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val a_navem = "Soma"
    println("Én vagyok" + a_navem + "!")

    var szam: Int = 7
   var szam_2: Int= 5
    println("${szam.toInt()} + ${szam_2.toInt()} = ${(szam + szam_2).toInt()}")
    println("${szam.toInt()} - ${szam_2.toInt()} = ${(szam - szam_2).toInt()}")
    println("${szam.toInt()} * ${szam_2.toInt()} = ${(szam * szam_2).toInt()}")
    println("${szam.toInt()} / ${szam_2.toInt()} = ${(szam / szam_2).toInt()}")
    println("kerlek irj be valamit")
    var bekert_szoveg = readln()
    if(bekert_szoveg.isEmpty()){
        println("nem adtal meg semmilyen szoveget!")
    }else{
        println(bekert_szoveg)
    }
    println(bekert_szoveg)


}

package com.example.degiskenlerveveritipleri

fun main() {

    var i:Int=42
    var d:Double=45.85
    var f:Float=42.89f

    var sonuc1:Int=d.toInt()
    var sonuc2:Double=i.toDouble()
    var sonuc3:Int=f.toInt()

    println(sonuc1)
    println(sonuc2)
    println(sonuc3)

    var str1=i.toString()
    var str2=d.toString()
    var str3=f.toString()

    println(str1)
    println(str2)
    println(str3)

    //YÖNTEM 1

    var yazi1="34t"

    try {

        var x= yazi1.toInt()
        println(x)
    }catch (e:Exception){
        println("DÖNÜŞÜMDE HATA VAR!!")
    }

    //YÖNTEM 2

    var yazi2="48.56e"

    var y= yazi2.toDoubleOrNull()

    if (y!=null){
        println("y:$y")
    }
    else{
        println("DÖNÜŞÜMDE HATA VAR!!")
    }

    //YÖNTEM 3

    var yazi3 ="67z"

    var z=yazi3.toIntOrNull()

    z?.let {
        println("z:$z")
    }



}
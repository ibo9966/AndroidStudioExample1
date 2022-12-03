package com.example.degiskenlerveveritipleri

class DENEME {
    var x = 10
    var y=20

    fun topla(){

        //Yukarda x değeri verilmiştir. Fakat yukarıdaki x değer global değerdir.
        //Altta yazılan x değeri localdir.
        //Ve local değer her zaman global değere göre baskındır. İlk önce locak değer çalışır.
        var x = 40

        var z= x+y

        println(z)
    }

}
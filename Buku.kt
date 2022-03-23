class Buku(Judul:String,Pengarang:String, Penerbit:String, Tahun:Int ){
    init {
        println("judul" + Judul)
        println("pengarang" + Pengarang)
        println("penerbit" + Penerbit)
        println("tahun" + Tahun)
    }
}

fun main (args:Array<String>){
    var bukupertama = Buku(Judul = " spiderman ", Pengarang = " Jhon ", Penerbit = " SIDU ", Tahun =  2018 )
    var bukupkedua = Buku(Judul = " batman ", Pengarang = " alex ", Penerbit = " SIDU ", Tahun =  2020 )
}
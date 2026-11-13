// Hands-on 3: Closure — Counter Factory
// Tugas: Implementasikan `makeCounter()` yang mengembalikan sebuah fungsi
// closure. Setiap kali closure tersebut dipanggil, ia harus mengembalikan
// angka berikutnya (1, 2, 3, ...) dengan MENGINGAT state count-nya sendiri
// di luar scope fungsi `makeCounter`.
//
// CATATAN: File ini SENGAJA belum bisa di-compile sampai kamu melengkapi
// semua TODO di bawah — itu normal untuk latihan ini!

fun makeCounter(): () -> Int {
    // TODO 1: Deklarasikan `var count` bertipe Int, mulai dari 0.
    // Variabel ini akan "ditangkap" (captured) oleh closure di bawah.
    var count = 0

    // TODO 2: Kembalikan sebuah lambda `() -> Int` yang menambah `count`
    // lalu mengembalikan nilai barunya.
    return {
        count++ 
        count
    }
}

fun main() {
    val counterA = makeCounter()
    val counterB = makeCounter()

   println("Counter A: ${counterA()}") // 1
    println("Counter A: ${counterA()}") // 2
    println("Counter A: ${counterA()}") // 3

    println("Counter B: ${counterB()}") // 1
    println("Counter B: ${counterB()}") // 2

}

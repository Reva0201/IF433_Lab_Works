package oop_113059_MuhammadMeccapareva.week05

fun main() {

    val dosen1 = Dosen("Pak Alex", "0123456")
    val admin1 = Admin("Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")

    for (pegawai in daftarPegawai) {

        // Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting
        when (pegawai) {

            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }

            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }

        }

        println("----------------------")
    }

    println("=== TEST MATH HELPER ===")

    val math = MathHelper()

    println("Luas Persegi: ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(5, 6)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")

    println("=== SISTEM PEMBAYARAN ===")

    val wallet = EWallet("Budi", 50000.0)
    val card = CreditCard("Budi", 100000.0)

    val payments: List<PaymentMethod> = listOf(wallet, card)

    for (method in payments) {

        method.processPayment(75000.0)

        if (method is EWallet) {
            println("Top up otomatis dilakukan...")
            method.topUp(50000.0)
            method.processPayment(75000.0)
        }

        println("----------------------")
    }

}
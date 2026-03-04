package oop_113059_MuhammadMeccapareva.week05

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKS.")
    }

    fun mengajar() {
        println("[$nama] sedang mengajar di kelas.")
    }
}
package oop_113059_MuhammadMeccapareva.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== PILIH PROGRAM ===")
    println("1. Student System")
    println("2. Loan System")
    println("3. Mini RPG Game")
    print("Pilihan: ")

    val programChoice = scanner.nextInt()
    scanner.nextLine()

    if (programChoice == 1) {

        println("--- APLIKASI PMB UMN ---")

        print("Masukkan Nama: ")
        val name = scanner.nextLine()

        println("Masukkan NIM (Wajib 5 Karakter): ")
        val nim = scanner.next()

        scanner.nextLine()

        if (nim.length != 5) {
            println("ERROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
        } else {
            print("Pilihan Jalur (1. Reguler, 2. Umum): ")
            val type = scanner.nextInt()
            scanner.nextLine()

            if (type == 1) {
                print("Masukkan Jurusan: ")
                val major = scanner.nextLine()
                val s1 = Student(name, nim, major)
                println("Terdaftar di ${s1.major} dengan GPA awal ${s1.gpa}")
            } else if (type == 2) {
                val s2 = Student(name, nim)
                println("Terdaftar di ${s2.major} dengan GPA awal ${s2.gpa}")
            } else {
                println("Pilihan ngawurn pendaftaran batal!")
            }
        }

    } else if (programChoice == 2) {

        println("=== SISTEM PEMINJAMAN BUKU ===")

        print("Masukkan Judul Buku: ")
        val title = scanner.nextLine()

        print("Masukkan Nama Peminjam: ")
        val borrower = scanner.nextLine()

        print("Masukkan Lama Pinjam (hari): ")
        var duration = scanner.nextInt()
        scanner.nextLine()

        if (duration < 0) {
            println("Durasi tidak boleh minus. Diubah menjadi 1 hari.")
            duration = 1
        }

        val loan = Loan(title, borrower, duration)

        println("\n=== DETAIL PEMINJAMAN ===")
        println("Judul Buku   : ${loan.bookTitle}")
        println("Peminjam     : ${loan.borrower}")
        println("Lama Pinjam  : ${loan.loanDuration} hari")
        println("Total Denda  : Rp ${loan.calculateFine()}")

    } else if (programChoice == 3) {

        println("=== MINI RPG BATTLE ===")

        print("Masukkan Nama Hero: ")
        val heroName = scanner.nextLine()

        print("Masukkan Base Damage Hero: ")
        val heroDamage = scanner.nextInt()
        scanner.nextLine()

        val hero = Hero(heroName, heroDamage)
        var enemyHp = 100

        while (hero.isAlive() && enemyHp > 0) {
            println("\n1. Serang")
            println("2. Kabur")
            print("Pilih aksi: ")

            val choice = scanner.nextInt()
            scanner.nextLine()

            if (choice == 1) {
                hero.attack("Enemy")
                enemyHp -= hero.baseDamage
                if (enemyHp < 0) enemyHp = 0
                println("HP Enemy tersisa: $enemyHp")

                if (enemyHp > 0) {
                    val enemyDamage = (10..20).random()
                    println("Enemy menyerang balik sebesar $enemyDamage!")
                    hero.takeDamage(enemyDamage)
                    println("HP ${hero.name} tersisa: ${hero.hp}")
                }
            } else if (choice == 2) {
                println("${hero.name} kabur dari pertempuran!")
                break
            } else {
                println("Pilihan tidak valid!")
            }
        }

        println("\n=== HASIL PERTEMPURAN ===")
        if (hero.hp > 0 && enemyHp == 0) {
            println("${hero.name} menang!")
        } else if (hero.hp == 0) {
            println("Enemy menang!")
        } else {
            println("Pertempuran berakhir tanpa pemenang.")
        }

    } else {
        println("Pilihan tidak valid.")
    }
}

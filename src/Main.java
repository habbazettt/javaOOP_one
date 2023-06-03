import menuGradeNilai.*;
import menuHonor.*;
import menuKalkulator.*;
import menuKasir.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String pin;
        String ulang;
        int opsimenu;

        System.out.println("LOGIN GATEWAY!!");
        System.out.print("Masukkan PIN: ");
        pin = scr.next();

        if (pin.equals("314151")) {
            System.out.println("===============================");
            System.out.println("Welcome, Hubbal Kholiq Habbaza");
            System.out.println("===============================");

            do {
                System.out.println();
                System.out.println("===========================");
                System.out.println("Pilihan Menu: ");
                System.out.println("1. Cek Grade Nilai");
                System.out.println("2. Hitung Honor Karyawan");
                System.out.println("3. Kalkulator");
                System.out.println("4. Kasir Belanja");
                System.out.println("5. Keluar");
                System.out.print("Pilihan Anda: ");
                opsimenu = scr.nextInt();

                switch (opsimenu) {
                    case 1 -> {
                        do {
                            System.out.println("PROGRAM CEK GRADE NILAI");
                            System.out.print("NIM: ");
                            int inputNim = scr.nextInt();

                            System.out.print("Nama: ");
                            String inputNama = scr.next();

                            System.out.print("Jurusan: ");
                            String inputJurusan = scr.next();

                            System.out.println();
                            System.out.print("Nilai Tugas: ");
                            int inputTugas = scr.nextInt();

                            System.out.print("Nilai UTS: ");
                            int inputUTS = scr.nextInt();

                            System.out.print("Nilai UAS: ");
                            int inputUAS = scr.nextInt();

                            nilaiMahsiswa mhs = new nilaiMahsiswa(inputNim, inputNama, inputJurusan, inputTugas, inputUTS, inputUAS);

                            System.out.println();
                            System.out.println("Nama: " + mhs.getNama());
                            System.out.println("NIM: " + mhs.getNim());
                            System.out.println("Jurusan: " + mhs.getJurusan());

                            System.out.println("Nilai Akhir: " + mhs.hitungNilaiAkhir());
                            System.out.println("Grade Nilai: " + mhs.cetakGrade());
                            System.out.println();
                            System.out.print("Ulang Program Cek Grade (Y/N)? ");
                            ulang = scr.next();
                        } while (ulang.equalsIgnoreCase("Y"));
                    }
                    case 2 -> {
                        do {
                            System.out.println("PROGRAM HITUNG HONOR KARYAWAN");
                            System.out.print("Nama Karyawan: ");
                            String inputNama = scr.next();

                            System.out.print("Golongan: ");
                            int inputGol = scr.nextInt();

                            System.out.print("Pendidikan: ");
                            String inputPen = scr.next();

                            System.out.print("Jumlah Jam kerja: ");
                            int inputjam = scr.nextInt();

                            Karyawan kar = new Karyawan(inputNama, inputGol, inputPen, inputjam);

                            kar.hitungTunjanganJabatan();
                            kar.hitungTunjanganPendidikan();
                            kar.hitungHonorLembur();

                            System.out.println();
                            System.out.println("Karyawan yang bernama " + kar.getNama());
                            System.out.println("Honor yang Diterima: " + kar.getHonorTetap());
                            System.out.println("Tunjangan Jabatan: " + kar.getTunjanganJabatan());
                            System.out.println("Tunjangan Pendidikan: " + kar.getTunjanganPendidikan());
                            System.out.println("Honor Lembur: " + kar.getHonorLembur());
                            System.out.println();
                            kar.tampilTotal();

                            System.out.println();
                            System.out.print("Ulang Program Hitung Honor (Y/N)? ");
                            ulang = scr.next();
                        } while (ulang.equalsIgnoreCase("Y"));
                    } case 3 -> {
                        do {
                            System.out.println();
                            System.out.println("PROGRAM KALKULATOR");
                            System.out.println("=================================");
                            System.out.println("Menu Kalkulator");
                            System.out.println("1. Penjumlahan");
                            System.out.println("2. Pengurangan");
                            System.out.println("3. Perkalian");
                            System.out.println("4. Pembagian");

                            System.out.println();
                            System.out.print("Pilihan Anda: ");
                            opsimenu = scr.nextInt();

                            switch (opsimenu) {
                                case 1 -> {
                                    do {
                                        System.out.println("PROGRAM PENJUMLAHAN");
                                        System.out.println("Menu Penjumlahan");
                                        System.out.println("1. 2 Angka");
                                        System.out.println("2. 3 Angka");

                                        System.out.println();
                                        System.out.print("Plihan Anda: ");
                                        opsimenu = scr.nextInt();

                                        switch (opsimenu) {
                                            case 1 -> {
                                                System.out.println("PENJUMLAHAN 2 ANGKA");
                                                System.out.print("Maukkan Bilangan 1: ");
                                                double bil1 = scr.nextDouble();

                                                System.out.print("Maukkan Bilangan 2: ");
                                                double bil2 = scr.nextDouble();

                                                Kalkulator klk = new Kalkulator2(bil1, bil2);
                                                System.out.println("Jumlah: " + klk.penjumlahan());
                                            }
                                            case 2 -> {
                                                System.out.println("PENJUMLAHAN 3 ANGKA");
                                                System.out.print("Maukkan Bilangan 1: ");
                                                double bil1 = scr.nextDouble();

                                                System.out.print("Maukkan Bilangan 2: ");
                                                double bil2 = scr.nextDouble();

                                                System.out.print("Masukkan Bilangan 3: ");
                                                double bil3 = scr.nextDouble();

                                                Kalkulator klk = new Kalkulator3(bil1, bil2,bil3);
                                                System.out.println("Jumlah: " + klk.penjumlahan());
                                            }
                                        }
                                        System.out.println();
                                        System.out.print("Ulang Program Penjumlahan (Y/N)? ");
                                        ulang = scr.next();
                                    } while (ulang.equalsIgnoreCase("Y"));
                                }
                                case 2 -> {
                                    do {
                                        System.out.println("PROGRAM PENGURANGAN");
                                        System.out.println("Menu Pengurangan");
                                        System.out.println("1. 2 Angka");
                                        System.out.println("2. 3 Angka");

                                        System.out.println();
                                        System.out.print("Plihan Anda: ");
                                        opsimenu = scr.nextInt();

                                        switch (opsimenu) {
                                            case 1 -> {
                                                System.out.println("PENGURANGAN 2 ANGKA");
                                                System.out.print("Maukkan Bilangan 1: ");
                                                double bil1 = scr.nextDouble();

                                                System.out.print("Maukkan Bilangan 2: ");
                                                double bil2 = scr.nextDouble();

                                                Kalkulator klk = new Kalkulator2(bil1, bil2);
                                                System.out.println("Jumlah: " + klk.pengurangan());
                                            }
                                            case 2 -> {
                                                System.out.println("PENGURANGAN 3 ANGKA");
                                                System.out.print("Maukkan Bilangan 1: ");
                                                double bil1 = scr.nextDouble();

                                                System.out.print("Maukkan Bilangan 2: ");
                                                double bil2 = scr.nextDouble();

                                                System.out.print("Masukkan Bilangan 3: ");
                                                double bil3 = scr.nextDouble();

                                                Kalkulator klk = new Kalkulator3(bil1, bil2, bil3);
                                                System.out.println("Jumlah: " + klk.pengurangan());
                                            }
                                        }
                                        System.out.println();
                                        System.out.print("Ulang Program Pengurangan (Y/N)? ");
                                        ulang = scr.next();
                                    } while (ulang.equalsIgnoreCase("Y"));
                                }
                                case 3 -> {
                                    do {
                                        System.out.println("PROGRAM PERKALIAN");
                                        System.out.println("Menu Perkalian");
                                        System.out.println("1. 2 Angka");
                                        System.out.println("2. 3 Angka");

                                        System.out.println();
                                        System.out.print("Plihan Anda: ");
                                        opsimenu = scr.nextInt();

                                        switch (opsimenu) {
                                            case 1 -> {
                                                System.out.println("PERKALIAN 2 ANGKA");
                                                System.out.print("Maukkan Bilangan 1: ");
                                                double bil1 = scr.nextDouble();

                                                System.out.print("Maukkan Bilangan 2: ");
                                                double bil2 = scr.nextDouble();

                                                Kalkulator klk = new Kalkulator2(bil1, bil2);
                                                System.out.println("Jumlah: " + klk.perkalian());
                                            }
                                            case 2 -> {
                                                System.out.println("PERKALIAN 3 ANGKA");
                                                System.out.print("Maukkan Bilangan 1: ");
                                                double bil1 = scr.nextDouble();

                                                System.out.print("Maukkan Bilangan 2: ");
                                                double bil2 = scr.nextDouble();

                                                System.out.print("Masukkan Bilangan 3: ");
                                                double bil3 = scr.nextDouble();

                                                Kalkulator klk = new Kalkulator3(bil1, bil2,bil3);
                                                System.out.println("Jumlah: " + klk.perkalian());
                                            }
                                        }
                                        System.out.println();
                                        System.out.print("Ulang Program Perkalian (Y/N)? ");
                                        ulang = scr.next();
                                    } while (ulang.equalsIgnoreCase("Y"));
                                }
                                case 4 -> {
                                    do {
                                        System.out.println("PROGRAM PEMBAGIAN");
                                        System.out.println("Menu Pembagian");
                                        System.out.println("1. 2 Angka");
                                        System.out.println("2. 3 Angka");

                                        System.out.println();
                                        System.out.print("Plihan Anda: ");
                                        opsimenu = scr.nextInt();

                                        switch (opsimenu) {
                                            case 1 -> {
                                                System.out.println("PEMBAGIAN 2 ANGKA");
                                                System.out.print("Maukkan Bilangan 1: ");
                                                double bil1 = scr.nextDouble();

                                                System.out.print("Maukkan Bilangan 2: ");
                                                double bil2 = scr.nextDouble();

                                                Kalkulator klk = new Kalkulator2(bil1, bil2);
                                                System.out.println("Jumlah: " + klk.pembagian());
                                            }
                                            case 2 -> {
                                                System.out.println("PEMBAGIAN 3 ANGKA");
                                                System.out.print("Maukkan Bilangan 1: ");
                                                double bil1 = scr.nextDouble();

                                                System.out.print("Maukkan Bilangan 2: ");
                                                double bil2 = scr.nextDouble();

                                                System.out.print("Masukkan Bilangan 3: ");
                                                double bil3 = scr.nextDouble();

                                                Kalkulator klk = new Kalkulator3(bil1, bil2, bil3);
                                                System.out.println("Jumlah: " + klk.pembagian());
                                            }
                                        }
                                        System.out.println();
                                        System.out.print("Ulang Program Pembagian (Y/N)? ");
                                        ulang = scr.next();
                                    } while (ulang.equalsIgnoreCase("Y"));
                                }
                                default -> System.exit(0);
                            }
                            System.out.println();
                            System.out.print("Kembali ke Menu Kalkulator (Y/N)? ");
                            ulang = scr.next();
                        } while (ulang.equalsIgnoreCase("Y"));
                    } case 4 -> {
                        do {
                            System.out.println();
                            System.out.println("Menu Makanan");
                            System.out.println("1. Nasi Goreng");
                            System.out.println("2. Ayam Geprek");
                            System.out.println("3. Seblak");

                            System.out.print("Pilihan Anda: ");
                            opsimenu = scr.nextInt();
                            if (opsimenu == 1) {
                                Nasgor nas = new Nasgor();
                                System.out.println("NASI GORENG");
                                System.out.print("Pilih Level: ");
                                opsimenu = scr.nextInt();
                                nas.hitungHargaLevel(opsimenu);
                                System.out.println("Harga Level: " + nas.getHargaLevel());
                                System.out.println("Harga Total: " + nas.hitungTotal(nas.getHargaPokok(), nas.getHargaLevel()));
                            } else if (opsimenu == 2) {
                                Geprek gep = new Geprek();
                                System.out.println("AYAM GEPREK");
                                System.out.print("Pilih Level: ");
                                opsimenu = scr.nextInt();
                                gep.hitungHargaLevel(opsimenu);
                                System.out.println("Harga Level: " + gep.getHargaLevel());
                                System.out.println("Harga Total: " + gep.hitungTotal(gep.getHargaPokok(), gep.getHargaLevel()));
                            } else if (opsimenu == 3) {
                                Seblak seb = new Seblak();
                                System.out.println("SEBLAK");
                                System.out.print("Pilih Level: ");
                                opsimenu = scr.nextInt();
                                seb.hitungHargaLevel(opsimenu);
                                System.out.println("Harga Level: " + seb.getHargaLevel());
                                int totalSeblak = seb.hitungTotal(seb.getHargaPokok(), seb.getHargaLevel());
                                System.out.println("Harga Total: " + totalSeblak);
                            }
                            System.out.println();
                            System.out.print("Kembali ke Menu Kasir (Y/N)? ");
                            ulang = scr.next();
                        } while (ulang.equalsIgnoreCase("Y"));
                    } case 5 -> {
                        System.exit(0);
                    }
                    default -> {
                        System.out.println("Input Error!!");
                        System.out.println("Program akan berakhir secara otomatis");
                        System.exit(0);
                    }
                }
                System.out.println();
                System.out.print("Kembali Ke Menu Awal (Y/N)? ");
                ulang = scr.next();
            } while (ulang.equalsIgnoreCase("Y"));
        } else {
            System.out.println("PIN ANDA SALAH!!!");
            System.exit(0);
        }
    }
}
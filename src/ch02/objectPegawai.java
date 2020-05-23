package ch02;

public class objectPegawai {
        public static void main(String[] args) {
            Pegawai p1 = new Pegawai();
            Pegawai p2 = new Pegawai();

            p1.nik ="654321";
            p1.nama ="Alam";
            p1.jabatan ="Manager";
            p1.isAktif ="true";

            p2.nik ="98765";
            p2.nama ="Ananda";
            p2.jabatan ="Staff";
            p2.isAktif ="true";

            p1.cetak();
            System.out.println("=========================");
            p2.cetak();
        }
}

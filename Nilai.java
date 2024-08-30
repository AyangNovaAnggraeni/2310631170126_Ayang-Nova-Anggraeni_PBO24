public class Nilai {
    String nama;
    int NIM;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    void hitungNilaiAkhir(){
        nilaiAkhir = (nilaiAbsen * 0.1 ) + (nilaiTugas * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);    
    }

    void CetakNilai(){
        System.out.println("NIM : " + NIM);
        System.out.println("Nama : " + nama);
        System.out.println("Nilai Absen " + nilaiAbsen);
        System.out.println("Nilai Tugas " + nilaiTugas);
        System.out.println("Nilai UTS " + nilaiUTS);
        System.out.println("NIM UAS " + nilaiUAS);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
    
}

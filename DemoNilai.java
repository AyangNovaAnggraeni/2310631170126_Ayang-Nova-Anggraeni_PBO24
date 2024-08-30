public class DemoNilai {
    public static void main(String[] args) {
        Nilai nilai1 = new Nilai();
        Nilai nilai2 = new Nilai();

        nilai1.nama = "Nova Fluktuatif";
        nilai1.NIM = 1234;
        nilai1.nilaiAbsen = 80;   
        nilai1.nilaiTugas = 90;
        nilai1.nilaiUAS = 76;
        nilai1.nilaiUTS = 98;
        nilai1.hitungNilaiAkhir();
        nilai1.CetakNilai();

        System.out.println("");

        nilai2.nama = "Torger Secondary";
        nilai2.NIM = 4321;
        nilai2.nilaiAbsen = 78;   
        nilai2.nilaiTugas = 88;
        nilai2.nilaiUAS = 98;
        nilai2.nilaiUTS = 56;
        nilai2.hitungNilaiAkhir();
        nilai2.CetakNilai();
    }
}

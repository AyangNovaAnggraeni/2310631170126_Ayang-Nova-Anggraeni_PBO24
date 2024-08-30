public class MahasiswaBeraksi {
    public static void main(String[] args) {
         Mahasiswa mhs1 = new Mahasiswa();
         Mahasiswa mhs2 = new Mahasiswa();
            
         mhs1.nama = "Joel Massivly";
         mhs1.NPM = 12345;  
         mhs1.display();
         mhs1.nyontek();
         mhs1.membaca();
         mhs1.modifikasi();

         System.out.println(" ");
            
         mhs2.nama = "Budi Fasolasido";
         mhs2.NPM = 54321;
         mhs2.display();
         mhs2.nyontek();
         mhs2.membaca();
         mhs2.modifikasi();
    }                   
}

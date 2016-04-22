package bukutamu;
public class BukuTamu {
private String nama;
private String alamat;
private String nohp;
private String jurusan;
private static int notamu;
private final int angkatan = 2015;
private final String universitas="Universitas Brawijaya";
private final String fakultas="Fakultas Ilmu Komputer";
public BukuTamu(){
    nama="";
    alamat="";
    nohp="";
    jurusan="";
    notamu++;
}
public BukuTamu(String a, String b, String c, String d){
nama=a;
alamat=b;
nohp=c;
jurusan=d;
notamu++;
}
public static void setTamu(){
    notamu++;
}
public static int getTamu(){
    return notamu;
}
public void setNama(String n){
    nama=n;
}
public String getNama(){
return nama;
}
public void setAlamat(String a){
   alamat=a;  
    }
public String getAlamat(){
    return alamat;
}
public void setnoHP(String hp){
    nohp=hp;
}
public String getnoHP(){
    return nohp;
}
public void setJurusan(String j){
    jurusan=j;           
}
public String getJurusan(){
    return jurusan;
}
public void displayMessage(){
    System.out.println("================================");
    System.out.println("Data sudah masuk");
    System.out.println("Nomor Buku : "+getTamu());
    System.out.println("Nama : "+getNama());
    System.out.println("ALamat   :"+getAlamat());
    System.out.println("No Hp   :"+getnoHP());
    System.out.println("Universitas :"+universitas);
    System.out.println("Fakultas :"+fakultas);
    System.out.println("Jurusan :"+getJurusan());
    System.out.println("Angkatan :"+angkatan);
    System.out.println("================================");
}
}

package q3;

public class Main {
    public static void main(String[] args) {
        // Laptop ve masaüstü bilgisayar nesneleri oluşturuluyor
        Laptop laptop = new Laptop();
        MasaustuBilgisayar masaustuBilgisayar = new MasaustuBilgisayar();

        // Her iki bilgisayar tipinin de belirli metotları çağrılıyor
        laptop.ac();
        laptop.uykuModunaGec();

        masaustuBilgisayar.kapat();
        masaustuBilgisayar.ac();
    }
}

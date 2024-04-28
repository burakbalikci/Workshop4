package q2;

public class Main {
    public static void main(String[] args) {
        Add toplama = new Add();
        DoubleAdd doubleToplama = new DoubleAdd();

        int sonuc1 = toplama.topla(5, 3);
        double sonuc3 = doubleToplama.topla(4.5, 2.7);

        System.out.println("Toplam (int): " + sonuc1); // Çıktı: Toplam (int): 8
        System.out.println("Toplam (double): " + sonuc3); // Çıktı: Toplam (double): 7.2
    }
}

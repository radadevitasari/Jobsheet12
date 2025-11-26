import java.util.Scanner;

public class HitungTotalHarga19 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam      Rp 15.000");
        System.out.println("2. Cappuccino      Rp 20.000");
        System.out.println("3. Latte           Rp 22.000");
        System.out.println("4. Teh Tarik       Rp 12.000");
        System.out.println("5. Roti Bakar      Rp 10.000");
        System.out.println("6. Mie Goreng      Rp 18.000");
        System.out.println("0. Selesai");
        System.out.println("============================");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            totalHarga -= totalHarga * 50 / 100;
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            totalHarga -= totalHarga * 30 / 100;
        }
        return totalHarga;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc.nextLine();
        Menu("Andi", true, kodePromo);
        int totalKeseluruhan = 0;

        while (true) {
            System.out.print("\nMasukkan nomor menu (0 untuk selesai): ");
            int pilihanMenu = sc.nextInt();
        if (pilihanMenu == 0) break;
            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();
            int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhan += totalHarga;
            System.out.println("Subtotal pesanan ini: Rp " + totalHarga);
        }
            System.out.println("\n===================================");
            System.out.println("Total keseluruhan pesanan: Rp " + totalKeseluruhan);
            System.out.println("Terima kasih sudah berbelanja!");
    }
}
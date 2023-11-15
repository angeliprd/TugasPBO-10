package id.ac.unand.fti.si.pbo;

public class App {
    
    public static void main(String[] args) {


        // Membuat objek dari masing-masing jenis member
        MemberReguler memberReguler = new MemberReguler();
        MemberSilver memberSilver = new MemberSilver();
        MemberGold memberGold = new MemberGold();
        MemberPlatinum memberPlatinum = new MemberPlatinum();

        // Menampilkan informasi untuk masing-masing member
        System.out.println("=== Informasi Member ===");

        System.out.println("\nMember Reguler:");
        System.out.println("Poin: " + memberReguler.getPoin());
        System.out.println("Total Bayar: " + memberReguler.hitungTotalBayar(800000));

        System.out.println("\nMember Silver:");
        System.out.println("Poin: " + memberSilver.getPoin());
        System.out.println("Total Bayar: " + memberSilver.hitungTotalBayar(1200000));

        System.out.println("\nMember Gold:");
        System.out.println("Poin: " + memberGold.getPoin());
        System.out.println("Total Bayar: " + memberGold.hitungTotalBayar(5000000));

        System.out.println("\nMember Platinum:");
        System.out.println("Poin: " + memberPlatinum.getPoin());
        System.out.println("Total Bayar: " + memberPlatinum.hitungTotalBayar(9000000));
    }
}

package praktek02;

public class penjualanlaptopaksi {
    public static void main(String[] args) {
        penjualanlaptop r1 = new penjualanlaptop();
        
        r1.harga_laptop = 4000000;
        r1.jumlah_barang = 3;
        
        r1.cetakInfo();
        System.out.println("total   =   "+r1.hitungPenjualan());
        r1.cetaktotal();
    }
}

package praktek02;
public class penjualanlaptop {
    int harga_laptop;
    int jumlah_barang;

    public penjualanlaptop() {
        this.harga_laptop = 5000000;
        this.jumlah_barang = 2;
    }

    public penjualanlaptop(int harga_laptop, int jumlah_barang) {
        this.harga_laptop = harga_laptop;
        this.jumlah_barang = jumlah_barang;
    }
    
    
    
    void cetakInfo(){
        System.out.println("===================");
        System.out.println("Harga Laptop  :"+harga_laptop);
        System.out.println("Jumlah Barang :"+jumlah_barang);
        System.out.println("===================");
    }
    
    Integer hitungPenjualan(){
            int total;
            total=harga_laptop*jumlah_barang;
            return total;
            
    }
    void cetaktotal(){
        System.out.println("Totalnya    = "+hitungPenjualan());
    }
}

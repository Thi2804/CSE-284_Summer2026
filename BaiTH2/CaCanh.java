public class CaCanh {

    // Thuộc tính
    private int maCa;
    private String tenCa;
    private String tenKhoaHoc;
    private String loaiCa;
    private String giongCa;
    private String gioiTinh;
    private int tuoi;
    private double kichThuoc;      // cm
    private double canNang;        // gram
    private String mauSac;
    private String tinhTrangSucKhoe;
    private String nguonGoc;
    private double giaBan;
    private String hinhAnh;
    private String ghiChu;

    // Constructor mặc định
    public CaCanh() {
    }

    // Constructor đầy đủ
    public CaCanh(int maCa, String tenCa, String tenKhoaHoc, String loaiCa,
                  String giongCa, String gioiTinh, int tuoi,
                  double kichThuoc, double canNang, String mauSac,
                  String tinhTrangSucKhoe, String nguonGoc,
                  double giaBan, String hinhAnh, String ghiChu) {

        this.maCa = maCa;
        this.tenCa = tenCa;
        this.tenKhoaHoc = tenKhoaHoc;
        this.loaiCa = loaiCa;
        this.giongCa = giongCa;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.kichThuoc = kichThuoc;
        this.canNang = canNang;
        this.mauSac = mauSac;
        this.tinhTrangSucKhoe = tinhTrangSucKhoe;
        this.nguonGoc = nguonGoc;
        this.giaBan = giaBan;
        this.hinhAnh = hinhAnh;
        this.ghiChu = ghiChu;
    }

    // Getter và Setter

    public int getMaCa() {
        return maCa;
    }

    public void setMaCa(int maCa) {
        this.maCa = maCa;
    }

    public String getTenCa() {
        return tenCa;
    }

    public void setTenCa(String tenCa) {
        this.tenCa = tenCa;
    }

    public String getTenKhoaHoc() {
        return tenKhoaHoc;
    }

    public void setTenKhoaHoc(String tenKhoaHoc) {
        this.tenKhoaHoc = tenKhoaHoc;
    }

    public String getLoaiCa() {
        return loaiCa;
    }

    public void setLoaiCa(String loaiCa) {
        this.loaiCa = loaiCa;
    }

    public String getGiongCa() {
        return giongCa;
    }

    public void setGiongCa(String giongCa) {
        this.giongCa = giongCa;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(double kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getTinhTrangSucKhoe() {
        return tinhTrangSucKhoe;
    }

    public void setTinhTrangSucKhoe(String tinhTrangSucKhoe) {
        this.tinhTrangSucKhoe = tinhTrangSucKhoe;
    }

    public String getNguonGoc() {
        return nguonGoc;
    }

    public void setNguonGoc(String nguonGoc) {
        this.nguonGoc = nguonGoc;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    // Các phương thức nghiệp vụ

    public void capNhatSucKhoe(String tinhTrang) {
        this.tinhTrangSucKhoe = tinhTrang;
    }

    public void capNhatGia(double giaMoi) {
        this.giaBan = giaMoi;
    }

    public void hienThiThongTin() {
        System.out.println("Mã cá: " + maCa);
        System.out.println("Tên cá: " + tenCa);
        System.out.println("Loài: " + loaiCa);
        System.out.println("Màu sắc: " + mauSac);
        System.out.println("Giá bán: " + giaBan);
        System.out.println("Tình trạng: " + tinhTrangSucKhoe);
    }
}
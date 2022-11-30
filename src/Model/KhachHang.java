/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Huy PC
 */
public class KhachHang {

    private String id;
    private String hoTen;
    private boolean gioiTinh;
    private String ngaySinh;
    private String sdt;
    private String email;
    private String diaChi;
    private String ngayTao;
    private String nguoiTao;
    private String ngayChinhSua;
    private String nguoiChinhSua;

    public KhachHang(String id, String hoTen, boolean gioiTinh, String ngaySinh, String sdt, String email, String diaChi, String ngayTao, String nguoiTao, String ngayChinhSua, String nguoiChinhSua) {
        this.id = id;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.ngayTao = ngayTao;
        this.nguoiTao = nguoiTao;
        this.ngayChinhSua = ngayChinhSua;
        this.nguoiChinhSua = nguoiChinhSua;
    }

    public KhachHang(String id, String hoTen, String sdt, String email) {
        this.id = id;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
    }

    public KhachHang() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getNgayChinhSua() {
        return ngayChinhSua;
    }

    public void setNgayChinhSua(String ngayChinhSua) {
        this.ngayChinhSua = ngayChinhSua;
    }

    public String getNguoiChinhSua() {
        return nguoiChinhSua;
    }

    public void setNguoiChinhSua(String nguoiChinhSua) {
        this.nguoiChinhSua = nguoiChinhSua;
    }

    public Object[] toDataRow(int i) {
        return new Object[]{i, hoTen, ngaySinh, gioiTinh == true ? "Nam" : "Nu", sdt, diaChi, email, nguoiTao, ngayTao};
    }
}

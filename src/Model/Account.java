/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Huy PC
 */
public class Account {

    private String id;
    private int chucVu;
    private int trangThai;
    private String hoTen;
    private String ngaySinh;
    private boolean gioiTinh;
    private String SDT;
    private String diaChi;
    private String eamil;
    private String username;
    private String password;
    private String ngayTao;
    private String nguoiTao;
    private String ngayChinhSua;
    private String NguoiChinhSua;

    public Account() {
    }

    public Account(String id, int chucVu, int trangThai, String hoTen, String ngaySinh, boolean gioiTinh, String SDT, String diaChi, String eamil, String username, String password, String ngayTao, String nguoiTao, String ngayChinhSua, String NguoiChinhSua) {
        this.id = id;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.SDT = SDT;
        this.diaChi = diaChi;
        this.eamil = eamil;
        this.username = username;
        this.password = password;
        this.ngayTao = ngayTao;
        this.nguoiTao = nguoiTao;
        this.ngayChinhSua = ngayChinhSua;
        this.NguoiChinhSua = NguoiChinhSua;
    }

    public Account(String id, int chucVu, int trangThai, String username, String password) {
        this.id = id;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getChucVu() {
        return chucVu;
    }

    public void setChucVu(int chucVu) {
        this.chucVu = chucVu;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
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
        return NguoiChinhSua;
    }

    public void setNguoiChinhSua(String NguoiChinhSua) {
        this.NguoiChinhSua = NguoiChinhSua;
    }

}

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

    private int id;
    private int chucVu;
    private int trangThai;
    private String hoTen;
    private boolean gioiTinh;
    private String username;
    private String password;
    private String ngayTao;
    private int nguoiTao;
    private String ngayChinhSua;
    private int NguoiChinhSua;

    public Account() {
    }

    public Account(int chucVu, int trangThai, String hoTen, boolean gioiTinh, String username, String password, String ngayTao, int nguoiTao, String ngayChinhSua, int NguoiChinhSua) {
        this.chucVu = chucVu;
        this.trangThai = trangThai;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.username = username;
        this.password = password;
        this.ngayTao = ngayTao;
        this.nguoiTao = nguoiTao;
        this.ngayChinhSua = ngayChinhSua;
        this.NguoiChinhSua = NguoiChinhSua;
    }

    public Account(int id, int trangThai, String hoTen) {
        this.id = id;
        this.trangThai = trangThai;
        this.hoTen = hoTen;
    }

    public Account(int id, int chucVu, int trangThai, String hoTen, boolean gioiTinh, String username, String password, String ngayTao, int nguoiTao, String ngayChinhSua, int NguoiChinhSua) {
        this.id = id;
        this.chucVu = chucVu;
        this.trangThai = trangThai;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.username = username;
        this.password = password;
        this.ngayTao = ngayTao;
        this.nguoiTao = nguoiTao;
        this.ngayChinhSua = ngayChinhSua;
        this.NguoiChinhSua = NguoiChinhSua;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
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

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(int nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getNgayChinhSua() {
        return ngayChinhSua;
    }

    public void setNgayChinhSua(String ngayChinhSua) {
        this.ngayChinhSua = ngayChinhSua;
    }

    public int getNguoiChinhSua() {
        return NguoiChinhSua;
    }

    public void setNguoiChinhSua(int NguoiChinhSua) {
        this.NguoiChinhSua = NguoiChinhSua;
    }

    public Object[] toDataRow(int i) {
        return new Object[]{i, hoTen, gioiTinh == true ? "Nam" : "Nữ", nguoiTao, ngayTao, trangThai == 1 ? "Able" : "Disable"};
    }
}

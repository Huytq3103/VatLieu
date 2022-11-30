/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Model.ChiTietSanPham;
import Repository.ChiTietSanPhamRepository;
import Service.ViewDSSanPhamService;
import java.util.List;

/**
 *
 * @author Huy PC
 */
public class ViewDanhSachSanPhamImpl implements ViewDSSanPhamService {

    private ChiTietSanPhamRepository ctspr = new ChiTietSanPhamRepository();

    public List<ChiTietSanPham> getAll() {
        return ctspr.getAll();
    }

}

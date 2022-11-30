/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Model.ChiTietSanPham;
import Model.HoaDon;
import Model.HoaDonChiTiet;
import Repository.ChiTietSanPhamRepository;
import Repository.HoaDonChiTietRepository;
import Repository.HoaDonRepository;
import Service.ViewThemHoaDonService;
import java.util.List;

/**
 *
 * @author Huy PC
 */
public class ViewThemHoaDonServiceImpl implements ViewThemHoaDonService {

    private HoaDonRepository hdr = new HoaDonRepository();
    private ChiTietSanPhamRepository ctspr = new ChiTietSanPhamRepository();
    private HoaDonChiTietRepository hdctr = new HoaDonChiTietRepository();

    @Override
    public List<HoaDon> getAllHD() {
        return hdr.getAll();
    }

    @Override
    public List<ChiTietSanPham> getAllSP() {
        return ctspr.getAll();
    }

    @Override
    public List<HoaDonChiTiet> getOneHD(String id) {
        return hdctr.getOneHD(id);
    }
}

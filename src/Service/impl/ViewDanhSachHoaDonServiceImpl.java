/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service.impl;

import Model.HoaDon;
import Repository.HoaDonRepository;
import Service.ViewDanhSachHoaDonService;
import ViewModel.ViewDonHang;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Huy PC
 */
public class ViewDanhSachHoaDonServiceImpl implements ViewDanhSachHoaDonService {

    private HoaDonRepository hdr = new HoaDonRepository();

    @Override
    public List<ViewDonHang> getAll() {
        List<ViewDonHang> list = new ArrayList<>();
        for(HoaDon hd : hdr.getAll()){
            list.add(new ViewDonHang(hd));
        }
        return list;
    }

}

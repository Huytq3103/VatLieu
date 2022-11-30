/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import Model.ChiTietSanPham;
import Model.HoaDon;
import Model.HoaDonChiTiet;
import java.util.List;

/**
 *
 * @author Huy PC
 */
public interface ViewThemHoaDonService {
    List<HoaDon> getAllHD();
    
    List<ChiTietSanPham> getAllSP();
    
    List<HoaDonChiTiet> getOneHD(String id);
}

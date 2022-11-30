/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Model.KhachHang;
import Repository.KhachHangRepository;
import Service.ViewKhachHangService;
import java.util.List;

/**
 *
 * @author Huy PC
 */
public class ViewKhachHangServiceImpl implements ViewKhachHangService{
    private KhachHangRepository khr = new KhachHangRepository();
    public List<KhachHang> getAll(){
        return khr.getAll();
    }
}

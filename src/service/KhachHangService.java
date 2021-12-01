/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author ADMIN
 */

import DAO.KhachHangDAO;
import java.util.List;
import model.KhachHang;

public class KhachHangService {

    private KhachHangDAO khachHangDAO = null;

    public KhachHangService() {
        this.khachHangDAO = new KhachHangDAO();
    }

    public List<KhachHang> getList() {
        return khachHangDAO.getList();
    }

     public int createOrUpdate(KhachHang khachHang) {
        return khachHangDAO.createOrUpdate(khachHang);
    }
    
     public int deleteById(int id)
     {
         return khachHangDAO.DeleteById(id);
     }
}

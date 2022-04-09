/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Controller;

import DAO.kullaniciDAO;
import Entity.kullanici;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author oktao
 */
@Named(value = "kullaniciBean")
@SessionScoped
public class kullaniciBean implements Serializable {

    private kullanici entity;
    private kullaniciDAO dao;
    private List<kullanici> list;

    /**
     * Creates a new instance of kullaniciBean
     */
    public kullaniciBean() {
    }

    public void create() {
        this.getDao().create(entity);
        entity = new kullanici();
    }

    public void update() {
        this.getDao().update(entity);
        this.entity = new kullanici();
    }

    public void delete(kullanici k) {
        this.getDao().delete(k);
        entity = new kullanici();
    }

    public kullanici getEntity() {
        if (entity == null) {
            entity = new kullanici();
        }
        return entity;
    }

    public void setEntity(kullanici entity) {
        this.entity = entity;
    }

    public kullaniciDAO getDao() {
        if (dao == null) {
            dao = new kullaniciDAO();
        }
        return dao;
    }

    public void setDao(kullaniciDAO dao) {
        this.dao = dao;
    }

    public List<kullanici> getList() {
        this.list = this.getDao().getList();
        return list;
    }

    public void setList(List<kullanici> list) {
        this.list = list;
    }

}

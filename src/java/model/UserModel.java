/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author daniel
 */
public class UserModel {
    
    public Usuario crearUsuario(Usuario usuario){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        try {
            sesion.beginTransaction();
            sesion.save(usuario);
            sesion.getTransaction().commit();
            sesion.refresh(usuario);
        } catch (Exception e) {
            sesion.getTransaction().rollback();
            return null;
        }finally{
            sesion.close();
        }
        return usuario;
    }
    
    public List<Usuario> obtenerUsuarios(){
        List<Usuario> lst = new ArrayList<>();
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        
        try {
            sesion.beginTransaction();
            lst = sesion.createCriteria(Usuario.class).list();
            sesion.getTransaction().commit();
        } catch (Exception e) {
            sesion.getTransaction().rollback();
            return null;
        }finally{
            sesion.close();
        }
        
        return lst;
    }
    
    public Usuario actualizarUsuario(Usuario usuario){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        try {
            sesion.beginTransaction();
            sesion.update(usuario);
            sesion.getTransaction().commit();
            sesion.refresh(usuario);
        } catch (Exception e) {
            sesion.getTransaction().rollback();
            return null;
        }finally{
            sesion.close();
        }
        return usuario;
    }
    
    public Usuario buscarUsuarioID(int id){
        Usuario usuario;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        
        try {
            sesion.beginTransaction();
            Query query = sesion.createQuery("FROM Usuario U WHERE U.id = :id");
            query.setParameter("id", id);
            usuario = (Usuario) query.list().get(0);
        } catch (Exception e) {
            sesion.getTransaction().rollback();
            return null;
        }
        return usuario;
    }
    
    public Usuario eliminarUsuario(Usuario usuario){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        try {
            sesion.beginTransaction();
            sesion.delete(usuario);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            sesion.getTransaction().rollback();
            return null;
        }finally{
            sesion.close();
        }
        return usuario;
    }
}

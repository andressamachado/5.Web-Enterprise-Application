/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.appusers2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author andre
 */
@Entity
@Table(name = "AppUser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AppUser.findAll", query = "SELECT c FROM AppUser c"),
    //@NamedQuery(name = "AppUser.findByID", query = "SELECT c FROM AppUser c WHERE c.id = :id"),
    @NamedQuery(name = "AppUser.findByUserID", query = "SELECT c FROM AppUser c WHERE c.userid = :userid"),
    @NamedQuery(name = "AppUser.findByFirstName", query = "SELECT c FROM AppUser c WHERE c.firstname = :firstname"),
    @NamedQuery(name = "AppUser.findByLastName", query = "SELECT c FROM AppUser c WHERE c.lastname = :lastname"),
    @NamedQuery(name = "AppUser.findByGroupName", query = "SELECT c FROM AppUser c WHERE c.groupname = :groupname"),
    @NamedQuery(name = "AppUser.findByPassword", query = "SELECT c FROM AppUser c WHERE c.password = :password")})
public class AppUser implements Serializable {

    private static final long serialVersionUID = 1L;
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Size(max = 255)
    @Column (name = "userid")
    private String userid;
    
    @Size(max = 255)
    @Column(name = "firstname")
    private String firstname;
    
    @Size(max = 255)
    @Column(name = "lastname")
    private String lastname;
    
    @Size(max = 255)
    @Column(name = "groupname")
    private String groupname;
    
    @Size(max = 255)
    @Column(name = "password")
    private String password;
     
    public AppUser() {
    }

    public AppUser(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserID() {
        return userid;
    }
    
    public void setUserID(String userid) {
      this.userid = userid;
    }
    
    public String getFirstName() {
        return firstname;
    }
    
    public void setFirstName(String firstname) {
      this.firstname = firstname;
    }
    
    public String getLastName() {
        return lastname;
    }
    
    public void setlastName(String lastname) {
      this.lastname = lastname;
    }
    
    public String getGroupName() {
        return groupname;
    }

    public void setGroupName(String groupname) {
        this.groupname = groupname;
    }

  public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AppUser)) {
            return false;
        }
        AppUser other = (AppUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.appusers.AppUser[ id=" + id + " ]";
    }
    
}

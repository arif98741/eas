/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eas;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author roudr
 */
@Entity
@Table(name = "std_register", catalog = "n1_eas", schema = "")
@NamedQueries({
    @NamedQuery(name = "StdRegister.findAll", query = "SELECT s FROM StdRegister s")
    , @NamedQuery(name = "StdRegister.findBySerial", query = "SELECT s FROM StdRegister s WHERE s.stdRegisterPK.serial = :serial")
    , @NamedQuery(name = "StdRegister.findByStdId", query = "SELECT s FROM StdRegister s WHERE s.stdRegisterPK.stdId = :stdId")
    , @NamedQuery(name = "StdRegister.findByName", query = "SELECT s FROM StdRegister s WHERE s.name = :name")
    , @NamedQuery(name = "StdRegister.findByEmail", query = "SELECT s FROM StdRegister s WHERE s.email = :email")
    , @NamedQuery(name = "StdRegister.findByPassword", query = "SELECT s FROM StdRegister s WHERE s.password = :password")
    , @NamedQuery(name = "StdRegister.findByDateOfBirth", query = "SELECT s FROM StdRegister s WHERE s.dateOfBirth = :dateOfBirth")
    , @NamedQuery(name = "StdRegister.findByFaculty", query = "SELECT s FROM StdRegister s WHERE s.faculty = :faculty")
    , @NamedQuery(name = "StdRegister.findByDepartment", query = "SELECT s FROM StdRegister s WHERE s.department = :department")
    , @NamedQuery(name = "StdRegister.findByBloodGroup", query = "SELECT s FROM StdRegister s WHERE s.bloodGroup = :bloodGroup")
    , @NamedQuery(name = "StdRegister.findByGender", query = "SELECT s FROM StdRegister s WHERE s.gender = :gender")
    , @NamedQuery(name = "StdRegister.findByContactNo", query = "SELECT s FROM StdRegister s WHERE s.contactNo = :contactNo")
    , @NamedQuery(name = "StdRegister.findByAddress", query = "SELECT s FROM StdRegister s WHERE s.address = :address")})
public class StdRegister implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StdRegisterPK stdRegisterPK;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Basic(optional = false)
    @Column(name = "faculty")
    private String faculty;
    @Basic(optional = false)
    @Column(name = "department")
    private String department;
    @Basic(optional = false)
    @Column(name = "blood_group")
    private String bloodGroup;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "contact_no")
    private String contactNo;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Lob
    @Column(name = "photo")
    private byte[] photo;

    public StdRegister() {
    }

    public StdRegister(StdRegisterPK stdRegisterPK) {
        this.stdRegisterPK = stdRegisterPK;
    }

    public StdRegister(StdRegisterPK stdRegisterPK, String name, String email, String password, String dateOfBirth, String faculty, String department, String bloodGroup, String gender, String contactNo, String address) {
        this.stdRegisterPK = stdRegisterPK;
        this.name = name;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.faculty = faculty;
        this.department = department;
        this.bloodGroup = bloodGroup;
        this.gender = gender;
        this.contactNo = contactNo;
        this.address = address;
    }

    public StdRegister(int serial, String stdId) {
        this.stdRegisterPK = new StdRegisterPK(serial, stdId);
    }

    public StdRegisterPK getStdRegisterPK() {
        return stdRegisterPK;
    }

    public void setStdRegisterPK(StdRegisterPK stdRegisterPK) {
        this.stdRegisterPK = stdRegisterPK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        String oldDateOfBirth = this.dateOfBirth;
        this.dateOfBirth = dateOfBirth;
        changeSupport.firePropertyChange("dateOfBirth", oldDateOfBirth, dateOfBirth);
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        String oldFaculty = this.faculty;
        this.faculty = faculty;
        changeSupport.firePropertyChange("faculty", oldFaculty, faculty);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        String oldDepartment = this.department;
        this.department = department;
        changeSupport.firePropertyChange("department", oldDepartment, department);
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        String oldBloodGroup = this.bloodGroup;
        this.bloodGroup = bloodGroup;
        changeSupport.firePropertyChange("bloodGroup", oldBloodGroup, bloodGroup);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        String oldContactNo = this.contactNo;
        this.contactNo = contactNo;
        changeSupport.firePropertyChange("contactNo", oldContactNo, contactNo);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        byte[] oldPhoto = this.photo;
        this.photo = photo;
        changeSupport.firePropertyChange("photo", oldPhoto, photo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stdRegisterPK != null ? stdRegisterPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StdRegister)) {
            return false;
        }
        StdRegister other = (StdRegister) object;
        if ((this.stdRegisterPK == null && other.stdRegisterPK != null) || (this.stdRegisterPK != null && !this.stdRegisterPK.equals(other.stdRegisterPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eas.StdRegister[ stdRegisterPK=" + stdRegisterPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eas;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author roudr
 */
@Embeddable
public class StdRegisterPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "serial")
    private int serial;
    @Basic(optional = false)
    @Column(name = "std_id")
    private String stdId;

    public StdRegisterPK() {
    }

    public StdRegisterPK(int serial, String stdId) {
        this.serial = serial;
        this.stdId = stdId;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) serial;
        hash += (stdId != null ? stdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StdRegisterPK)) {
            return false;
        }
        StdRegisterPK other = (StdRegisterPK) object;
        if (this.serial != other.serial) {
            return false;
        }
        if ((this.stdId == null && other.stdId != null) || (this.stdId != null && !this.stdId.equals(other.stdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "eas.StdRegisterPK[ serial=" + serial + ", stdId=" + stdId + " ]";
    }
    
}

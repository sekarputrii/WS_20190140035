/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data.mhs.pws.a;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author ASUS ROG
 */
@Entity
@Table(name = "datamahasiswa")
@NamedQueries({
    @NamedQuery(name = "Datamahasiswa.findAll", query = "SELECT d FROM Datamahasiswa d"),
    @NamedQuery(name = "Datamahasiswa.findByNim", query = "SELECT d FROM Datamahasiswa d WHERE d.nim = :nim"),
    @NamedQuery(name = "Datamahasiswa.findByNama", query = "SELECT d FROM Datamahasiswa d WHERE d.nama = :nama"),
    @NamedQuery(name = "Datamahasiswa.findByAlamat", query = "SELECT d FROM Datamahasiswa d WHERE d.alamat = :alamat"),
    @NamedQuery(name = "Datamahasiswa.findByFakultas", query = "SELECT d FROM Datamahasiswa d WHERE d.fakultas = :fakultas"),
    @NamedQuery(name = "Datamahasiswa.findByProgramStudi", query = "SELECT d FROM Datamahasiswa d WHERE d.programStudi = :programStudi")})
public class Datamahasiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nim")
    private String nim;
    @Column(name = "nama")
    private String nama;
    @Column(name = "alamat")
    private String alamat;
    @Column(name = "fakultas")
    private String fakultas;
    @Column(name = "program_studi")
    private String programStudi;

    public Datamahasiswa() {
    }

    public Datamahasiswa(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nim != null ? nim.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datamahasiswa)) {
            return false;
        }
        Datamahasiswa other = (Datamahasiswa) object;
        if ((this.nim == null && other.nim != null) || (this.nim != null && !this.nim.equals(other.nim))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.mhs.pws.a.Datamahasiswa[ nim=" + nim + " ]";
    }
    
}

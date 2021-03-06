/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.monkeysolution.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author luisp.araujo
 */
@Entity
@Table(name = "evaluacion_area")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EvaluacionArea.findAll", query = "SELECT e FROM EvaluacionArea e")
    , @NamedQuery(name = "EvaluacionArea.findById", query = "SELECT e FROM EvaluacionArea e WHERE e.id = :id")
    , @NamedQuery(name = "EvaluacionArea.findByEstado", query = "SELECT e FROM EvaluacionArea e WHERE e.estado = :estado")
    , @NamedQuery(name = "EvaluacionArea.findByFechaCr", query = "SELECT e FROM EvaluacionArea e WHERE e.fechaCr = :fechaCr")
    , @NamedQuery(name = "EvaluacionArea.findByFechaAct", query = "SELECT e FROM EvaluacionArea e WHERE e.fechaAct = :fechaAct")
    , @NamedQuery(name = "EvaluacionArea.findByUsuarioCr", query = "SELECT e FROM EvaluacionArea e WHERE e.usuarioCr = :usuarioCr")
    , @NamedQuery(name = "EvaluacionArea.findByUsuarioAct", query = "SELECT e FROM EvaluacionArea e WHERE e.usuarioAct = :usuarioAct")})
public class EvaluacionArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_cr")
    @Temporal(TemporalType.DATE)
    private Date fechaCr;
    @Column(name = "fecha_act")
    @Temporal(TemporalType.DATE)
    private Date fechaAct;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario_cr")
    private int usuarioCr;
    @Column(name = "usuario_act")
    private Integer usuarioAct;
    @JoinColumn(name = "area", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Area area;
    @JoinColumn(name = "evaluacion", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Evaluacion evaluacion;

    public EvaluacionArea() {
    }

    public EvaluacionArea(Integer id) {
        this.id = id;
    }

    public EvaluacionArea(Integer id, String estado, Date fechaCr, int usuarioCr) {
        this.id = id;
        this.estado = estado;
        this.fechaCr = fechaCr;
        this.usuarioCr = usuarioCr;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaCr() {
        return fechaCr;
    }

    public void setFechaCr(Date fechaCr) {
        this.fechaCr = fechaCr;
    }

    public Date getFechaAct() {
        return fechaAct;
    }

    public void setFechaAct(Date fechaAct) {
        this.fechaAct = fechaAct;
    }

    public int getUsuarioCr() {
        return usuarioCr;
    }

    public void setUsuarioCr(int usuarioCr) {
        this.usuarioCr = usuarioCr;
    }

    public Integer getUsuarioAct() {
        return usuarioAct;
    }

    public void setUsuarioAct(Integer usuarioAct) {
        this.usuarioAct = usuarioAct;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Evaluacion getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(Evaluacion evaluacion) {
        this.evaluacion = evaluacion;
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
        if (!(object instanceof EvaluacionArea)) {
            return false;
        }
        EvaluacionArea other = (EvaluacionArea) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.monkeysolution.modelo.EvaluacionArea[ id=" + id + " ]";
    }
    
}

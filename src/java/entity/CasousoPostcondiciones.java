package entity;
// Generated 3/04/2018 10:11:12 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * CasousoPostcondiciones generated by hbm2java
 */
@Entity
@Table(name="casouso_postcondiciones"
    ,catalog="AdministracionProyectosSoftware"
)
public class CasousoPostcondiciones  implements java.io.Serializable {


     private Integer id;
     private Casouso casouso;
     private String postcondiciones;

    public CasousoPostcondiciones() {
    }

    public CasousoPostcondiciones(Casouso casouso, String postcondiciones) {
       this.casouso = casouso;
       this.postcondiciones = postcondiciones;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_casouso", nullable=false)
    public Casouso getCasouso() {
        return this.casouso;
    }
    
    public void setCasouso(Casouso casouso) {
        this.casouso = casouso;
    }

    
    @Column(name="postcondiciones", nullable=false, length=25)
    public String getPostcondiciones() {
        return this.postcondiciones;
    }
    
    public void setPostcondiciones(String postcondiciones) {
        this.postcondiciones = postcondiciones;
    }




}



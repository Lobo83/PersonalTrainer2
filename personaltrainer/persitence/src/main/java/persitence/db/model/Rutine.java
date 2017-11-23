package persitence.db.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * Rutine generated by hbm2java
 */
@Entity
@Table(name="rutine"
    ,catalog="personalTrainer"
, uniqueConstraints = {  }
)

public class Rutine  implements java.io.Serializable {


    // Fields    

     private int idRutine;
     private UserData userData;
     private Date createDate;
     private Date updateDate;
     private String updateUser;
     private String updateProgram;
     private int optimistLock;
     private String name;
     private String description;
     private Set exerciseRutines = new HashSet(0);
     private Set exerciseRutineHistorics = new HashSet(0);


    // Constructors

    /** default constructor */
    public Rutine() {
    }

	/** minimal constructor */
    public Rutine(int idRutine, UserData userData, Date createDate, Date updateDate, String updateUser, String updateProgram, int optimistLock, String name) {
        this.idRutine = idRutine;
        this.userData = userData;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
        this.updateProgram = updateProgram;
        this.optimistLock = optimistLock;
        this.name = name;
    }
    
    /** full constructor */
    public Rutine(int idRutine, UserData userData, Date createDate, Date updateDate, String updateUser, String updateProgram, int optimistLock, String name, String description, Set exerciseRutines, Set exerciseRutineHistorics) {
        this.idRutine = idRutine;
        this.userData = userData;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
        this.updateProgram = updateProgram;
        this.optimistLock = optimistLock;
        this.name = name;
        this.description = description;
        this.exerciseRutines = exerciseRutines;
        this.exerciseRutineHistorics = exerciseRutineHistorics;
    }
    

   
    // Property accessors
    @Id
    @Column(name="ID_RUTINE", unique=true, nullable=false, insertable=true, updatable=true)

    public int getIdRutine() {
        return this.idRutine;
    }
    
    public void setIdRutine(int idRutine) {
        this.idRutine = idRutine;
    }
    @ManyToOne(cascade={},
        fetch=FetchType.LAZY)
    
        @JoinColumn(name="ID_USER_DATA", unique=false, nullable=false, insertable=true, updatable=true)

    public UserData getUserData() {
        return this.userData;
    }
    
    public void setUserData(UserData userData) {
        this.userData = userData;
    }
    @Column(name="CREATE_DATE", unique=false, nullable=false, insertable=true, updatable=true, length=19)

    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    @Column(name="UPDATE_DATE", unique=false, nullable=false, insertable=true, updatable=true, length=19)

    public Date getUpdateDate() {
        return this.updateDate;
    }
    
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    @Column(name="UPDATE_USER", unique=false, nullable=false, insertable=true, updatable=true, length=10)

    public String getUpdateUser() {
        return this.updateUser;
    }
    
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }
    @Column(name="UPDATE_PROGRAM", unique=false, nullable=false, insertable=true, updatable=true, length=45)

    public String getUpdateProgram() {
        return this.updateProgram;
    }
    
    public void setUpdateProgram(String updateProgram) {
        this.updateProgram = updateProgram;
    }
    @Column(name="OPTIMIST_LOCK", unique=false, nullable=false, insertable=true, updatable=true)

    public int getOptimistLock() {
        return this.optimistLock;
    }
    
    public void setOptimistLock(int optimistLock) {
        this.optimistLock = optimistLock;
    }
    @Column(name="NAME", unique=false, nullable=false, insertable=true, updatable=true, length=50)

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    @Column(name="DESCRIPTION", unique=false, nullable=true, insertable=true, updatable=true, length=100)

    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    @OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="rutine")

    public Set getExerciseRutines() {
        return this.exerciseRutines;
    }
    
    public void setExerciseRutines(Set exerciseRutines) {
        this.exerciseRutines = exerciseRutines;
    }
    @OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="rutine")

    public Set getExerciseRutineHistorics() {
        return this.exerciseRutineHistorics;
    }
    
    public void setExerciseRutineHistorics(Set exerciseRutineHistorics) {
        this.exerciseRutineHistorics = exerciseRutineHistorics;
    }
   








}

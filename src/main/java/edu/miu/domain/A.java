package edu.miu.domain;

import edu.miu.listener.ClassListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

//Named query annotation
//
@NamedQueries({
        @NamedQuery(name="findStudents",query = "SELECT cA FROM A cA WHERE cA.p1 = 3"),
        @NamedQuery(name="findStudentsGpa3",query = "SELECT cA FROM A cA WHERE cA.p2 = :prop1")
})


@Entity
@EntityListeners({ClassListener.class})
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)       //InheritanceType.JOINED needs Discriminator
@DiscriminatorColumn(name = "CLASS_A_TYPE")                 //InheritanceType.TABLE_PER_CLASS  no Discriminator @ID @GeneratedValue( strategy = strategy.Table)
public class A {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "P1")
    private int p1;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="C_p_id") //Optional
    private C p2;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="A_p_id")
    private List<C> p3;

    @OneToMany
    @JoinTable( name = "C_A_ONE",
        joinColumns = { @JoinColumn(name = "A_id")},
        inverseJoinColumns = {@JoinColumn(name = "C_id")}
    )
    private List<C> p4;

    @OneToMany(mappedBy = "p1")
    private List<C> p5;

    @OneToOne
    @JoinColumn(name="C_id")
    private C p6;


    @ManyToMany
    @JoinTable( name = "A_C_MANY",  //Optional
            joinColumns = { @JoinColumn(name = "A_id")},
            inverseJoinColumns = {@JoinColumn(name = "C_id")}
    )
    private List<C> p7;

    @Lob //Large objects
    @Basic(fetch = FetchType.LAZY)
    private Boolean p8;

    @Transient //Attribute not persisted
    private int p9;

    @Temporal(TemporalType.DATE) //Date, Time, Calendar, Timestamp
    private Date date;

    @Version  //getters and setters is must
    private int version;

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public C getP2() {
        return p2;
    }

    public void setP2(C p2) {
        this.p2 = p2;
    }

    public List<C> getP3() {
        return p3;
    }

    public void setP3(List<C> p3) {
        this.p3 = p3;
    }

    public List<C> getP4() {
        return p4;
    }

    public void setP4(List<C> p4) {
        this.p4 = p4;
    }

    public List<C> getP5() {
        return p5;
    }

    public void setP5(List<C> p5) {
        this.p5 = p5;
    }

    public C getP6() {
        return p6;
    }

    public void setP6(C p6) {
        this.p6 = p6;
    }

    public List<C> getP7() {
        return p7;
    }

    public void setP7(List<C> p7) {
        this.p7 = p7;
    }

    public Boolean getP8() {
        return p8;
    }

    public void setP8(Boolean p8) {
        this.p8 = p8;
    }

    public int getP9() {
        return p9;
    }

    public void setP9(int p9) {
        this.p9 = p9;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}
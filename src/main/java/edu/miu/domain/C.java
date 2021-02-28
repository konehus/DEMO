package edu.miu.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class C {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="A_id")
    private A p1;

    @OneToOne(mappedBy = "p6")
    private A p2;

    @ManyToMany(mappedBy = "p7")
    private List<A> p3;

    @Embedded
    @AttributeOverrides({@AttributeOverride(name="p1", column = @Column(name = "xp1")),
                         @AttributeOverride(name = "p2", column = @Column(name= "xp2"))})
    private D p4;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public A getP1() {
        return p1;
    }

    public void setP1(A p1) {
        this.p1 = p1;
    }

    public A getP2() {
        return p2;
    }

    public void setP2(A p2) {
        this.p2 = p2;
    }

    public List<A> getP3() {
        return p3;
    }

    public void setP3(List<A> p3) {
        this.p3 = p3;
    }

    public D getP4() {
        return p4;
    }

    public void setP4(D p4) {
        this.p4 = p4;
    }
}

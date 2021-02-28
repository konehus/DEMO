package edu.miu.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CLASS_B")
public class B extends A {

    //OneTOOne ManyTOONe  ManyToMany
}

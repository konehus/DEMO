package edu.miu.domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

@Embeddable //Embedded in Class C
@Access(AccessType.FIELD)
public class D {

    private String p1;
    private String p2;
    private String p3;
    private String p4;

    //Generate No-argument constructor
    //Generate Constructor with parameters
    //Generate getters and setters

}

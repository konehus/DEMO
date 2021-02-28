package edu.miu.listener;

import edu.miu.domain.A;

import javax.persistence.PostLoad;
import javax.persistence.PrePersist;


public class ClassListener {
    @PrePersist
    public void preAdvice(A a){
        System.out.println("Persist classA with id");
    }

    @PostLoad
    public void postLoad(A a){
        System.out.println("Load classA with id");
    }
}

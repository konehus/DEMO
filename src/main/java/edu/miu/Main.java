package edu.miu;

import edu.miu.domain.*;

import javax.persistence.*;
import javax.persistence.criteria.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo");
        EntityManager em = factory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        transaction.begin();
        System.out.println("Start");


        //JPQL
//        TypedQuery<Laptop>  query = em.createQuery("select s.laptop from Students s where s.gpa =: gpa", Laptop.class);
//        query.setParameter("gpa" , 3.0f);
//        List<Laptop> laptops = query.getResultList();







        //Named query accessing
//        TypedQuery<ClassA> query = em.createNamedQuery("findStudentsGpa3", ClassA.class);
//        query.setParameter("prop1", "Henok");
//
//
//




        //Native query
//        Query query2 = em.createNativeQuery("SELECT b.id, pages, title, publisher_id " +
//                "from Student As s inner join student_book As sb on s.id = sb.Student_id  " +
//                "inner join Book b on sb.books_id = b.id where s.gpa >= 3.0 and b.pages >= 100", Book.class);
//        List<Book> books2 = query2.getResultList();





        //Criteria query
//
//        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
//        CriteriaQuery<Book> criteriaQuery = criteriaBuilder.createQuery(Book.class);
//        Root<Student> rootStudent = criteriaQuery.from(Student.class);
//        criteriaQuery.select(rootStudent.get("books"));
//
//        Predicate gpaPredicate = criteriaBuilder.greaterThanOrEqualTo(rootStudent.get("gpa"), 3.0);
//        Join<Student, Book> studentBookJoin = rootStudent.join("books");
//        Predicate pagesPredicate = criteriaBuilder.greaterThanOrEqualTo(studentBookJoin.get("pages"),120);
//        Join<Book, Publisher>  publisherJoin = studentBookJoin.join("publisher");
//        Predicate employeePredicate = criteriaBuilder.greaterThan(publisherJoin.get("numberOfEmployees"), 100);
//
//        Join<Book, Author> authorJoin = studentBookJoin.join("author");
//        Join<Author, Address> addressJoin = authorJoin.join("address");
//        Predicate statePredicate = criteriaBuilder.equal(addressJoin.get("state"),"IO");
//
//        Predicate andPredicate = criteriaBuilder.and(gpaPredicate, pagesPredicate, statePredicate, employeePredicate);
//
//        criteriaQuery.where(andPredicate);
//
//        TypedQuery<Book> query4 = em.createQuery(criteriaQuery);
//        List<Book> criteriaBooks =  query4.getResultList();



        //Pessimistic Lock
//        em.find(Student.class, 1l,
//                LockModeType.PESSIMISTIC_READ);
//
//        query.setLockMode(LockModeType.PESSIM
//                ISTIC_WRITE);
//
//        em.lock(student,
//                LockModeType.PESSIMISTIC_WRITE);
//
//        @NamedQuery(name="Student.FindAll",
//                query="SELECT s FROM Student s",
//                lockMode= PERSSIMISTIC_READ)
//
//

                System.out.println("End");
        transaction.commit();
        em.close();
        factory.close();



    }

}

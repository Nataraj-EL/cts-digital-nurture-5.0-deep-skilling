# Exercise 04 - Difference Between JPA, Hibernate and Spring Data JPA

## Objective

Understand the differences between JPA, Hibernate, and Spring Data JPA, and learn how Spring Data JPA reduces boilerplate code compared to traditional Hibernate development.

---

## Scenario

The library management application requires database persistence.

Instead of writing large amounts of database access code using Hibernate Sessions, Spring Data JPA provides a much simpler abstraction for performing CRUD operations.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

---

## JPA (Java Persistence API)

- Java specification (JSR 338)
- Defines standard APIs for Object Relational Mapping (ORM)
- Does not provide an implementation
- Requires an implementation such as Hibernate

Example:

```java
@Entity
public class Book {
    ...
}
```

---

## Hibernate

- Popular implementation of JPA
- Handles mapping Java objects to database tables
- Requires manual session and transaction management

Example:

```java
Session session = sessionFactory.openSession();
Transaction tx = session.beginTransaction();

session.save(book);

tx.commit();
session.close();
```

---

## Spring Data JPA

- Built on top of JPA
- Uses Hibernate (or another JPA provider) internally
- Eliminates boilerplate CRUD code
- Automatically manages repositories and transactions

Example:

```java
public interface BookRepository extends JpaRepository<Book, Integer> {
}
```

```java
@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    @Transactional
    public void save(Book book) {
        repository.save(book);
    }
}
```

---

## Comparison

| Feature | JPA | Hibernate | Spring Data JPA |
|---------|-----|-----------|-----------------|
| Type | Specification | Framework | Spring abstraction |
| ORM Support | Defines ORM APIs | Implements ORM | Uses JPA internally |
| CRUD Operations | Not provided | Manual coding | Automatic |
| Transaction Handling | Not provided | Manual | Managed by Spring |
| Boilerplate Code | High | Medium | Very Low |

---

## Key Learning

- JPA is a specification.
- Hibernate is one implementation of JPA.
- Spring Data JPA simplifies data access by reducing boilerplate code while internally using JPA and Hibernate.

---

## Outcome

Successfully understood the relationship between JPA, Hibernate, and Spring Data JPA, and learned how Spring Data JPA simplifies database operations in Spring applications.
package projectdefence.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import projectdefence.models.entities.User;

import java.util.List;
import java.util.Optional;


@Repository
public interface UserRepository extends PagingAndSortingRepository<User, String>,
        JpaSpecificationExecutor<User> {
//    Iterable<User> findAll(Sort user);

//    @Procedure
    @Query(nativeQuery = true, value = "call get_users()")
    List<User> getUsersProcedure();


    @Transactional(readOnly = true)
    Page<User> findAll(Pageable page);

    @Query("select u from User u where  u.username = :username")
    Optional<User> findByUsernameOptional(@Param("username") String username);

    @Query("select u from User u where u.username like %:username% or u.email like %:username%")
    List<User> findAllByGivenUsername(@Param("username") String username);

    Optional<User> findByUsernameAndPassword(String username, String password);

    User findByUsername(String username);

    Optional<User> findUserByUsername(String username);

    List<User> findAllByTitle(String title);

    @Query("SELECT u.imageUrl from  User u where u.username = :username")
    String findImageUrl(@Param("username") String username);

    @Query("select distinct u from User u " +
            "left join Treatment t on t.user.id = u.id" +
            " left join Measurement m on m.user.id = u.id " +
            " where  m.createdBy = :name or t.createdBy = :name " +
            " order by u.createdDate desc ")
    List<User> findAllByKinesitherapistName(@Param("name") String name);


    @Query("select u from  User  u order by u.createdDate desc ")
    List<User> findAllOrderByDate();
}

package cl.javadevs.springsecurityjwt.repositories;

import cl.javadevs.springsecurityjwt.models.SmartPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartPhoneRepository extends JpaRepository<SmartPhone, Long> {
}

package iuh.edu.vn.vonguyenthanhtu_kttkpm_userspringboot_week12.repositories;

import iuh.edu.vn.vonguyenthanhtu_kttkpm_userspringboot_week12.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

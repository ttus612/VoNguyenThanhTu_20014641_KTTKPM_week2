package iuh.edu.vn.vonguyenthanhtu_kttpm_productspringboot_week1.repositories;

import iuh.edu.vn.vonguyenthanhtu_kttpm_productspringboot_week1.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}

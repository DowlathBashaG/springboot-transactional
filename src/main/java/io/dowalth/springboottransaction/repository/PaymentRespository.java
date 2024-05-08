package io.dowalth.springboottransaction.repository;

import io.dowalth.springboottransaction.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRespository extends JpaRepository<Payment,Long> {
}

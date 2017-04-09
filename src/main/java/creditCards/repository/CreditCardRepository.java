package creditCards.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import creditCards.entity.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Long> {

}

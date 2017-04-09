package wasdev.sample.servlet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import creditCards.entity.CreditCard;
import creditCards.repository.CreditCardRepository;

@RestController
public class CreditCardController {

	@Autowired
	private CreditCardRepository repository;

	@RequestMapping("/getAll")
	public List<CreditCard> getAll() {
		return repository.findAll();
	}

}
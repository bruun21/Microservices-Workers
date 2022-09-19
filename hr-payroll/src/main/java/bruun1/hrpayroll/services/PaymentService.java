package bruun1.hrpayroll.services;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import bruun1.hrpayroll.entities.Payment;

@Service
public class PaymentService {

	
	public Payment getPayment(Long id, int days) {
		return new Payment("Bob", new BigDecimal(200.00) , days);
	}
}

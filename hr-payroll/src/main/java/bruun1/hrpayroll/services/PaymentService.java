package bruun1.hrpayroll.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bruun1.hrpayroll.entities.Payment;
import bruun1.hrpayroll.entities.Worker;
import bruun1.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	
	public Payment getPayment(Long workerId, int days) {
				
		Worker worker = workerFeignClient.findByIdl(workerId).getBody();
		return new Payment(worker.getName(),  new BigDecimal(worker.getDailyIncome()) , days);
	}
}

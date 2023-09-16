package com.tsayvyac.inventoryservice;

import com.tsayvyac.inventoryservice.model.Inventory;
import com.tsayvyac.inventoryservice.repository.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
		return args -> {
			Inventory samsungInventory = Inventory.builder()
					.skuCode("samsung")
					.quantity(2)
					.build();

			Inventory nokiaInventory = Inventory.builder()
					.skuCode("nokia")
					.quantity(10)
					.build();

			inventoryRepository.save(samsungInventory);
			inventoryRepository.save(nokiaInventory);
		};
	}

}

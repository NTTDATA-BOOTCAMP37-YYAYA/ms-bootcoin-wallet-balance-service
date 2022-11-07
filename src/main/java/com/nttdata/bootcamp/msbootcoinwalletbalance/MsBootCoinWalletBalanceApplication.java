package com.nttdata.bootcamp.msbootcoinwalletbalance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**.*/
@SpringBootApplication
@EnableEurekaClient
public class MsBootCoinWalletBalanceApplication {

  public static void main(String[] args) {
    SpringApplication.run(MsBootCoinWalletBalanceApplication.class, args);
  }

}

package com.nttdata.bootcamp.msbootcoinwalletbalance.infrastructure.consumer.adapter.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.nttdata.bootcamp.msbootcoinwalletbalance.application.incoming.CreateWalletBalanceUseCase;
import com.nttdata.bootcamp.msbootcoinwalletbalance.domain.model.WalletBalance;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class WalletBalanceConsumerAdapter {


  @Autowired
  private CreateWalletBalanceUseCase  createWalletBalanceUseCase;

  
  @KafkaListener(topics = "${kafka.topic.bootcoin.wallet-balance.create.name}")
  public void listenerCreate(@Payload WalletBalance walleBalance) {
	  createWalletBalanceUseCase.createWalletBalance(walleBalance).block();
  }
  

}

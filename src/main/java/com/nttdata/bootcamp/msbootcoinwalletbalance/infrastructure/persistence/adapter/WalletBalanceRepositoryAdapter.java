package com.nttdata.bootcamp.msbootcoinwalletbalance.infrastructure.persistence.adapter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nttdata.bootcamp.msbootcoinwalletbalance.application.outgoing.CreateWalletBalancePort;
import com.nttdata.bootcamp.msbootcoinwalletbalance.domain.enums.States;
import com.nttdata.bootcamp.msbootcoinwalletbalance.domain.model.WalletBalance;
import com.nttdata.bootcamp.msbootcoinwalletbalance.infrastructure.persistence.entity.WalletBalanceEntity;

import reactor.core.publisher.Mono;

/**.*/
@Component
public class WalletBalanceRepositoryAdapter implements CreateWalletBalancePort{

  @Autowired
  private ReactiveMongoWalletBalanceRepository reactiveMongoDB;

@Override
public Mono<WalletBalance> createWalletBalance(WalletBalance walletBalance) {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
	LocalDateTime now = LocalDateTime.now();
    String createDate = now.format(formatter);
    walletBalance.setWalletBalanceState(States.ACTIVE.getValue());
    walletBalance.setWalletBalanceCreateDate(createDate);
	  return reactiveMongoDB.insert(WalletBalanceEntity.toWalletBalanceEntity(walletBalance))
              .map(WalletBalanceEntity::toWalletBalance);
}






}

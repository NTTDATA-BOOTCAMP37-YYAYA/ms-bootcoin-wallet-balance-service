package com.nttdata.bootcamp.msbootcoinwalletbalance.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.bootcamp.msbootcoinwalletbalance.application.incoming.CreateWalletBalanceUseCase;
import com.nttdata.bootcamp.msbootcoinwalletbalance.application.outgoing.CreateWalletBalancePort;
import com.nttdata.bootcamp.msbootcoinwalletbalance.domain.model.WalletBalance;

import reactor.core.publisher.Mono;

/**.*/
@Service
public class WalletBalanceService implements CreateWalletBalanceUseCase{


  @Autowired
  private CreateWalletBalancePort createWalletBalancePort;


@Override
public Mono<WalletBalance> createWalletBalance(WalletBalance walletBalance) {
	return createWalletBalancePort.createWalletBalance(walletBalance);
}
  






}

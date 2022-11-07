package com.nttdata.bootcamp.msbootcoinwalletbalance.application.outgoing;

import com.nttdata.bootcamp.msbootcoinwalletbalance.domain.model.WalletBalance;

import reactor.core.publisher.Mono;

public interface CreateWalletBalancePort {

	Mono<WalletBalance> createWalletBalance(WalletBalance walletBalance);
}

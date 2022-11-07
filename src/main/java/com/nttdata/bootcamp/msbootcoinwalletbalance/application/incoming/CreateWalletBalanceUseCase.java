package com.nttdata.bootcamp.msbootcoinwalletbalance.application.incoming;

import com.nttdata.bootcamp.msbootcoinwalletbalance.domain.model.WalletBalance;

import reactor.core.publisher.Mono;

public interface CreateWalletBalanceUseCase {

	Mono<WalletBalance> createWalletBalance(WalletBalance walletBalance);
}

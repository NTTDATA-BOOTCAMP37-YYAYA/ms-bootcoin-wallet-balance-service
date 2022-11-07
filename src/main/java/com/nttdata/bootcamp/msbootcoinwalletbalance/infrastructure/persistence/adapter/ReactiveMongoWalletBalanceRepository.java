package com.nttdata.bootcamp.msbootcoinwalletbalance.infrastructure.persistence.adapter;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.bootcamp.msbootcoinwalletbalance.infrastructure.persistence.entity.WalletBalanceEntity;

/**.*/
public interface ReactiveMongoWalletBalanceRepository extends ReactiveMongoRepository
                                                        <WalletBalanceEntity, String> {
  



}
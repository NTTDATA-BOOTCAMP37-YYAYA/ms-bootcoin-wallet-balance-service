package com.nttdata.bootcamp.msbootcoinwalletbalance.infrastructure.persistence.entity;

import org.springframework.beans.BeanUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.nttdata.bootcamp.msbootcoinwalletbalance.domain.model.WalletBalance;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



/**.*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document (collection = "WalletBalance")
public class WalletBalanceEntity {

  @Id
	private String walletBalanceId;
	private String walletId;
	private double walletBalanceQuantityCoin;
	private String walletBalanceState;
	private String walletBalanceCreateDate;

  /**.*/
  public static WalletBalance toWalletBalance(WalletBalanceEntity walletBalanceEntity) {
    WalletBalance walletBalance = new WalletBalance();
    BeanUtils.copyProperties(walletBalanceEntity, walletBalance);
    return walletBalance;
  }
  
  /**.*/
  public static WalletBalanceEntity toWalletBalanceEntity(WalletBalance walletBalance) {

    WalletBalanceEntity walletBalanceEntity = new WalletBalanceEntity();
    BeanUtils.copyProperties(walletBalance, walletBalanceEntity);
    return walletBalanceEntity;
  }
}

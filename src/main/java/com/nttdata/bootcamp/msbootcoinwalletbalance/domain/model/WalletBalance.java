package com.nttdata.bootcamp.msbootcoinwalletbalance.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**.*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WalletBalance {
	
	private String walletBalanceId;
	private String walletId;
	private double walletBalanceQuantityCoin;
	private String walletBalanceState;
	private String walletBalanceCreateDate;

}

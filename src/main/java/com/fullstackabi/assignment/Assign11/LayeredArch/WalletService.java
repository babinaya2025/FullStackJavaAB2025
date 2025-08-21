package com.fullstackabi.assignment.Assign11.LayeredArch;

import java.util.Collection;

public interface WalletService {
    Wallet registerNewUserWallet(Wallet newWallet) throws WalletException;

    Double addFundsToWalletByEmailId(String emailId, Double amount) throws WalletException;

    Double withdrawFromWalletByEmailId(String emailId, Double amount) throws WalletWithdrawException;

    Boolean transferFunds(String fromEmailId, String toEmailId, Double amount) throws WalletTransferFundException;

    Wallet getUserWalletByEmailId(String userEmailId) throws WalletException;

    Collection<Wallet> getAllCustomerWallets() throws WalletException;
}

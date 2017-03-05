package ca.uwo.eng.se2205b.lab5.model;

import javax.annotation.ParametersAreNonnullByDefault;

/**
 * Represents an Account with a list of time organized transactions.
 */
@ParametersAreNonnullByDefault
public final class Account {

    public Account() {

    }

    /**
     * Add a transaction to the account, updating the balance
     * @param transaction
     */
    public void addTransaction(Transaction transaction) {
        // TODO SE2205B
    }

    /**
     * Get the Balance of this account
     * @return Current balance
     */
    public double getBalance() {
        return 0.0;
    }
}

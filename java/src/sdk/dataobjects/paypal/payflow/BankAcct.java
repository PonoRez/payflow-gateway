/*
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package paypal.payflow;

/**
 * Used for BankAcct information.
 * BankAcct is associated with ACHTender. {@link ACHTender}
 */
public final class BankAcct extends PaymentDevice {

    private String aba;
    private String acctType;

    /**
     * Constructor
     *
     * @param acct Bank Account number
     * @param aba  Aba number
     *             BankAcct should be used to perform the transactions
     *             in which the user provides his bank account details for
     *             the online payment processing.
     *             <p/>
     * @paypal.sample //Create the BankAcct object
     * BankAcct account = new BankAcct("XXXXXXXXXXX","XXXXXXXXXXX");
     * </p>
     */
    public BankAcct(String acct, String aba) {
        super(acct);
        this.aba = aba;
    }

    protected void generateRequest() {
        super.generateRequest();
        //Add ABA and ACCTTYPE to parameter list.
        super.getRequestBuffer().append(PayflowUtility.appendToRequest(PayflowConstants.PARAM_ABA, aba));
        super.getRequestBuffer().append(PayflowUtility.appendToRequest(PayflowConstants.PARAM_ACCTTYPE, acctType));
    }

    /**
     * Gets the aba value.
     * Target Bank's transit ABA routing number.Appies only to ACH transactions.(8-digit number)
     *
     * @return String
     *         <p/>
     * @paypal.sample Maps to Payflow Parameters as follows: ABA
     * </p>
     */
    public String getAba() {
        return aba;
    }

    /**
     * Gets the Customer's bank account type.
     *
     * @return String
     *         <p/>
     *         Allowed AcctType values are:
     *         {@paypal.listtable}
     *         {@paypal.ltr}
     *         {@paypal.lth} ACCTTYPE {@paypal.elth}
     *         {@paypal.lth}Description{@paypal.elth}
     *         {@paypal.eltr}
     *         {@paypal.ltr}
     *         {@paypal.ltd} C {@paypal.eltd}
     *         {@paypal.ltd} Checking account {@paypal.eltd}
     *         {@paypal.eltr}
     *         {@paypal.ltr}
     *         {@paypal.ltd} S {@paypal.eltd}
     *         {@paypal.ltd} Savings account {@paypal.ltd}
     *         {@paypal.eltr}
     *         {@paypal.endlisttable}
     *         </p>
     *         <p/>
     * @paypal.sample Maps to Payflow Parameters as follows: ACCTTYPE
     * </p>
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * Sets the Customer's bank account type.
     *
     * @param acctType <p/>
     *                 Allowed AcctType values are:
     *                 {@paypal.listtable}
     *                 {@paypal.ltr}
     *                 {@paypal.lth} ACCTTYPE {@paypal.elth}
     *                 {@paypal.lth}Description{@paypal.elth}
     *                 {@paypal.eltr}
     *                 {@paypal.ltr}
     *                 {@paypal.ltd} C {@paypal.eltd}
     *                 {@paypal.ltd} Checking account {@paypal.eltd}
     *                 {@paypal.eltr}
     *                 {@paypal.ltr}
     *                 {@paypal.ltd} S {@paypal.eltd}
     *                 {@paypal.ltd} Savings account {@paypal.ltd}
     *                 {@paypal.eltr}
     *                 {@paypal.endlisttable}
     *                 </p>
     *                 <p/>
     * @paypal.sample Maps to Payflow Parameters as follows: ACCTTYPE
     * </p>
     */
    public void setAcctType(String acctType) {
        this.acctType = acctType;
    }

}
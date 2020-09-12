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

import java.util.Hashtable;

/**
 * Used for transaction response.
 * <p/>
 * TransactionResponse object is contained in the main response
 * object Response of the transaction.
 * </p>
 * Following is the example of how to get the transaction response
 * after the transaction.
 *
 * @paypal.sample ..........
 * // Trans is the transaction object.
 * *		...................
 * // Submit the transaction.
 * Response resp = trans.SubmitTransaction();
 * <p/>
 * if (resp != null)
 * {
 * // Get the Transaction Response parameters.
 * TransactionResponse trxnResponse =  resp.getTransactionResponse();
 * if (trxnResponse!= null)
 * {
 * System.out.println("RESULT = " + trxnResponse.getResult());
 * System.out.println("RESPMSG = " + trxnResponse.getRespMsg());
 * System.out.println("AUTHCODE = " + trxnResponse.getAuthCode());
 * System.out.println("AVSADDR = " + trxnResponse.getAVSAddr());
 * System.out.println("AVSZIP = " + trxnResponse.getAVSZip());
 * System.out.println("IAVS = " + trxnResponse.getIAVS());
 * }
 * }
 */
public final class TransactionResponse extends BaseResponseDataObject {

    private int result;
    private String ppref;
    private String pnref;
    private String respMsg;
    private String authCode;
    private String avsAddr;
    private String avsZip;
    private String cardSecure;
    private String cvv2Match;
    private String iavs;
    private String origResult;
    private String origPnref;
    private String transState;
    private String custRef;
    private String startTime;
    private String endTime;
    private String duplicate;
    private String dateToSettle;
    private String batchId;
    private String addlMsgs;
    private String respText;
    private String procAvs;
    private String procCardSecure;
    private String procCVV2;
    private String hostCode;
    private String settleDate;
    private String correlationId;
    private String feeAmt;
    private String pendingReason;
    private String paymentType;
    private String status;
    private String balAmt;
    private String amexId;
    private String amexPosData;
    private String acct;
    private String expDate;
    private String amt;
    private String billToLastName;
    private String billToFirstName;
    private String transTime;
    private String cardType;
    private String origAmt;
    private String secureToken;
    private String secureTokenId;
    private String phoneMatch;
    private String emailMatch;
    private String extRspMsg;
    private String paymentAdviceCode;
    private String associationResponseCode;
    private String transactionId;
    private String magTResponse;
    private String traceId;
    private String achStatus;
    private String txId;
    private String type;
    private String affluent;
    private String ccUpdated;

    /**
     * Gets the result.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: RESULT
     */
    public int getResult() {
        return result;
    }

    /**
     * Gets the PPref parameter
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: PPREF
     */
    public String getPPRef() {
        return ppref;
    }

    /**
     * Gets the pnref number(Reference Id).
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: PNREF
     */
    public String getPnref() {
        return pnref;
    }

    /**
     * Gets the response message.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: RESPMSG
     */
    public String getRespMsg() {
        return respMsg;
    }

    /**
     * Gets the AuthCode.
     * Returned for Sale, Authorization, and Voice
     * Authorization transactions. AUTHCODE is the
     * approval code obtained over the phone from
     * the processing network.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: AUTHCODE
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Gets the avsaddr.
     * AVS address responses are for advice only.
     * This process does not affect the outcome of the
     * authorization.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: AVSADDR
     */
    public String getAvsAddr() {
        return avsAddr;
    }

    /**
     * Gets the avsZip.
     * <p>AVS ZIP code responses are for advice only.
     * This process does not affect the outcome of the
     * authorization.</p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: AVSZIP
     */
    public String getAvsZip() {
        return avsZip;
    }

    /**
     * Gets the cardsecure parameter.
     * <p>Obtained for Visa cards.
     * CAVV validity.
     * Y=valid, N=Not valid, X=cannot determine</p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: CARDSECURE
     */
    public String getCardSecure() {
        return cardSecure;
    }

    /**
     * Gets the acct parameter.
     * <p>Obtain the last 4-digits of the credit card number</p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: ACCT
     */
    public String getAcct() {
        return acct;
    }

    /**
     * Gets the expdate parameter.
     * <p>Obtain the expiration date of the credit card used.</p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: EXPDATE
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * Gets the amt parameter.
     * <p>Obtain the amount of the transaction.  Used to validate
     * that the amount sent was the amount authorized.</p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: AMT
     */
    public String getAmt() {
        return amt;
    }

    /**
     * Gets the lastname parameter.
     * <p>Obtain the last name of the card holder./p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: BILLTOLASTNAME
     */
    public String getBillToLastName() {
        return billToLastName;
    }

    /**
     * Gets the firstname parameter.
     * <p>Obtain the first name of the card holder./p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: BILLTOFIRSTNAME
     */
    public String getBillToFirstName() {
        return billToFirstName;
    }

    /**
     * Gets the transtime parameter.
     * <p>Obtain the transaction date and time./p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: TRANSTIME
     */
    public String getTransTime() {
        return transTime;
    }

    /**
     * Gets the cvv2match.
     * <p>Result of the card security code (CVV2) check.
     * This value does not affect the outcome of the
     * transaction.</p>
     *
     * @return - String
     * <p/>
     * {@paypal.listtable}
     * {@paypal.ltr}
     * {@paypal.lth} Value {@paypal.elth}
     * {@paypal.lth} Description {@paypal.elth}
     * {@paypal.eltr}
     * {@paypal.ltr}
     * {@paypal.ltd} Y {@paypal.eltd}
     * {@paypal.ltd} The submitted value matches the data on file for the card. {@paypal.eltd}
     * {@paypal.eltr}
     * {@paypal.ltr}
     * {@paypal.ltd} N {@paypal.eltd}
     * {@paypal.ltd} The submitted value does not match the data on file for the card. {@paypal.eltd}
     * {@paypal.eltr}
     * {@paypal.ltr}
     * {@paypal.ltd} X {@paypal.eltd}
     * {@paypal.ltd} The cardholder's bank does not support this service. {@paypal.eltd}
     * {@paypal.eltr}
     * {@paypal.endlisttable}
     * @paypal.sample <p>Maps to Payflow Parameter: CVV2MATCH
     */
    public String getCvv2Match() {
        return cvv2Match;
    }

    /**
     * Gets the iavs.
     * <p>International AVS address responses are for
     * advice only. This value does not affect the
     * outcome of the transaction.
     * Indicates whether AVS response is
     * international (Y), US (N), or cannot be
     * determined (X).</p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: IAVS
     */
    public String getIavs() {
        return iavs;
    }

    /**
     * Gets the Original transaction result for which
     * inquiry transaction is performed.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: ORIGRESULT
     */
    public String getOrigResult() {
        return origResult;
    }

    /**
     * Gets the orignal pnref for the primary transaction.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: ORIGPNREF
     */
    public String getOrigPnref() {
        return origPnref;
    }

    /**
     * Gets the transaction state.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: TRANSSTATE
     */
    public String getTransState() {
        return transState;
    }

    /**
     * Gets the custRef.
     * <p>Merchant-defined identifier for reporting and
     * auditing purposes. For example, you can set
     * CUSTREF to the invoice number.
     * You can use CUSTREF when performing Inquiry
     * transactions. To ensure that you can always
     * access the correct transaction when performing
     * an Inquiry, you must provide a unique CUSTREF </p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: CUSTREF
     */
    public String getCustRef() {
        return custRef;
    }

    /**
     * Gets the startTime.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: STARTTIME
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * Gets the end time.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: ENDTIME
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * Gets the duplicate parameter
     * <p>Indicates transactions sent with duplicate identifier.
     * If a transaction is performed with the request id that has
     * been previously used for another transaction, Duplicate is
     * returned as 1.</p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: DUPLICATE
     */
    public String getDuplicate() {
        return duplicate;
    }

    /**
     * Gets the inquiry DateToSettle.
     * <p>Gets the settle date of the transaction for which
     * inquiry transaction is performed.
     * Value available only before settlement has started
     * Value obtained when Payflow Verbosity paramter = MEDIUM
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: DATE_TO_SETTLE
     */
    public String getDateToSettle() {
        return dateToSettle;
    }

    /**
     * Gets the batchid.
     * <p>Gets the batch id of the transaction for which the
     * inquiry transaction is performed.
     * Value available only after settlement has assigned a BatchId
     * Value obtained when Payflow Verbosity paramter = MEDIUM </p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: BATCHID
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * Gets the addlMsgs.
     * Additional error message that indicates that the
     * merchant used a feature that is disabled.
     * Value obtained when Payflow Verbosity paramter = MEDIUM
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: ADDLMSGS
     */
    public String getAddlMsgs() {
        return addlMsgs;
    }

    /**
     * Gets the respText.
     * <p>Text corresponding to the response code
     * returned by the processor. This text is not
     * normalized by Gateway server.</p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: RESPTEXT
     */
    public String getRespText() {
        return respText;
    }

    /**
     * Gets the procAvs.
     * <p>AVS (Address Verification Service) response
     * from the processor.
     * Value obtained when Payflow Verbosity paramter = MEDIUM
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: PROCAVS
     */
    public String getProcAvs() {
        return procAvs;
    }

    /**
     * Gets the ProcCardSecure.
     * <p>VPAS/SPA response from the processor.
     * Value obtained when Payflow Verbosity paramter = MEDIUM
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: PROCCARDSECURE
     */
    public String getProcCardSecure() {
        return procCardSecure;
    }

    /**
     * Gets the PROCCVV2.
     * <p>CVV2 (buyer authentication) response from the processor.
     * Its a 3- or 4-digit code that is printed (not imprinted) on
     * the back of a credit card. Used as partial assurance
     * that the card is in the buyer's possession.
     * Value obtained when Payflow Verbosity paramter = MEDIUM</p>
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: PROCCVV2
     */
    public String getProcCVV2() {
        return procCVV2;
    }

    /**
     * Gets the hostCode.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: HOSTCODE
     */
    public String getHostCode() {
        return hostCode;
    }

    /**
     * Gets the settleDate.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: SETTLEDATE
     */
    public String getSettleDate() {
        return settleDate;
    }

    /**
     * Gets the status.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * Gets the status.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: BALAMT
     */
    public String getBalAmt() {
        return balAmt;
    }

    /**
     * Gets the status.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: AMEXID
     */
    public String getAmexId() {
        return amexId;
    }

    /**
     * Gets the status.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: AMEXPOSDATA
     */
    public String getAmexPosData() {
        return amexPosData;
    }

    /**
     * Gets the card type.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: CARDTYPE
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Gets the original amount.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: ORIGAMT
     */
    public String getOrigAmt() {
        return origAmt;
    }

    /**
     * Gets the secure token.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: SECURETOKEN
     */
    public String getSecureToken() {
        return secureToken;
    }

    /**
     * Gets the secure token id.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: EMAILMATCH
     */
    public String getEmailMatch() {
        return emailMatch;
    }

    /**
     * Gets the secure token.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: PHONEMATCH
     */
    public String getPhoneMatch() {
        return phoneMatch;
    }

    /**
     * Gets the extended response message.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: EXTRSPMSG
     */
    public String getExtRspMsg() {
        return extRspMsg;
    }

    /**
     * Gets the secure token id.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: SECURETOKENID
     */
    public String getSecureTokenId() {
        return secureTokenId;
    }

    /**
     * Gets the payment advice code.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: PAYMENTADVICECODE
     */
    public String getPaymentAdviceCode() {
        return paymentAdviceCode;
    }

    /**
     * Gets the association response code.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: ASSOCIATIONRESPCODE
     */
    public String getAssociationResponseCode() {
        return associationResponseCode;
    }

    /**
     * Gets the Magtek Response.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: MAGTRESPONSE
     */
    public String getMagTResponse() {
        return magTResponse;
    }

    /**
     * Gets Trace ID.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: TRACEID
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Gets the ACH Status/
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: ACHSTATUS
     */
    public String getAchStatus() {
        return achStatus;
    }

    /**
     * Gets the Transaction ID (Card on File)
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: TXID
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Gets the transaction type
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: TYPE
     */
    public String getType() {
        return type;
    }
    /**
     * Gets the cardholder status
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: AFFLUENT
     */
    public String getAffluent() {
        return affluent;
    }
    /**
     * Gets the response if the credit card was updated
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: CCUPDATED
     */
    public String getCcUpdated() {
        return ccUpdated;
    }
    /**
     * Gets the transaction id for Braintree.
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: TRANSACTIONID
     */
    public String getTransactionId() {
        return transactionId;
    }


    protected TransactionResponse() {
    }

    protected void setParams(Hashtable ResponseHashTable) {

        result = Integer.parseInt((String) ResponseHashTable.get(PayflowConstants.PARAM_RESULT));
        ppref = (String) ResponseHashTable.get(PayflowConstants.PARAM_PPREF);
        pnref = (String) ResponseHashTable.get(PayflowConstants.PARAM_PNREF);
        respMsg = (String) ResponseHashTable.get(PayflowConstants.PARAM_RESPMSG);
        authCode = (String) ResponseHashTable.get(PayflowConstants.PARAM_AUTHCODE);
        avsAddr = (String) ResponseHashTable.get(PayflowConstants.PARAM_AVSADDR);
        avsZip = (String) ResponseHashTable.get(PayflowConstants.PARAM_AVSZIP);
        cardSecure = (String) ResponseHashTable.get(PayflowConstants.PARAM_CARDSECURE);
        cvv2Match = (String) ResponseHashTable.get(PayflowConstants.PARAM_CVV2MATCH);
        iavs = (String) ResponseHashTable.get(PayflowConstants.PARAM_IAVS);
        origResult = (String) ResponseHashTable.get(PayflowConstants.PARAM_ORIGRESULT);
        transState = (String) ResponseHashTable.get(PayflowConstants.PARAM_TRANSSTATE);
        custRef = (String) ResponseHashTable.get(PayflowConstants.PARAM_CUSTREF);
        startTime = (String) ResponseHashTable.get(PayflowConstants.PARAM_STARTTIME);
        endTime = (String) ResponseHashTable.get(PayflowConstants.PARAM_ENDTIME);
        duplicate = (String) ResponseHashTable.get(PayflowConstants.PARAM_DUPLICATE);
        dateToSettle = (String) ResponseHashTable.get(PayflowConstants.PARAM_DATE_TO_SETTLE);
        batchId = (String) ResponseHashTable.get(PayflowConstants.PARAM_BATCHID);
        addlMsgs = (String) ResponseHashTable.get(PayflowConstants.PARAM_ADDLMSGS);
        respText = (String) ResponseHashTable.get(PayflowConstants.PARAM_RESPTEXT);
        procAvs = (String) ResponseHashTable.get(PayflowConstants.PARAM_PROCAVS);
        procCardSecure = (String) ResponseHashTable.get(PayflowConstants.PARAM_PROCCARDSECURE);
        procCVV2 = (String) ResponseHashTable.get(PayflowConstants.PARAM_PROCCVV2);
        hostCode = (String) ResponseHashTable.get(PayflowConstants.PARAM_HOSTCODE);
        settleDate = (String) ResponseHashTable.get(PayflowConstants.PARAM_SETTLE_DATE);
        origPnref = (String) ResponseHashTable.get(PayflowConstants.PARAM_ORIGPNREF);
        feeAmt = (String) ResponseHashTable.get(PayflowConstants.PARAM_FEEAMT);
        pendingReason = (String) ResponseHashTable.get(PayflowConstants.PARAM_PENDINGREASON);
        paymentType = (String) ResponseHashTable.get(PayflowConstants.PARAM_PAYMENTTYPE);
        correlationId = (String) ResponseHashTable.get(PayflowConstants.PARAM_CORRELATIONID);
        status = (String) ResponseHashTable.get(PayflowConstants.PARAM_STATUS);
        balAmt = (String) ResponseHashTable.get(PayflowConstants.PARAM_BALAMT);
        amexId = (String) ResponseHashTable.get(PayflowConstants.PARAM_AMEXID);
        amexPosData = (String) ResponseHashTable.get(PayflowConstants.PARAM_AMEXPOSDATA);
        acct = (String) ResponseHashTable.get(PayflowConstants.PARAM_ACCT);
        billToLastName = (String) ResponseHashTable.get(PayflowConstants.PARAM_LASTNAME);
        billToFirstName = (String) ResponseHashTable.get(PayflowConstants.PARAM_FIRSTNAME);
        amt = (String) ResponseHashTable.get(PayflowConstants.PARAM_AMT);
        transTime = (String) ResponseHashTable.get(PayflowConstants.PARAM_TRANSTIME);
        expDate = (String) ResponseHashTable.get(PayflowConstants.PARAM_EXPDATE);
        cardType = (String) ResponseHashTable.get(PayflowConstants.PARAM_CARDTYPE);
        origAmt = (String) ResponseHashTable.get(PayflowConstants.PARAM_ORIGAMT);
        secureToken = (String) ResponseHashTable.get(PayflowConstants.PARAM_SECURETOKEN);
        secureTokenId = (String) ResponseHashTable.get(PayflowConstants.PARAM_SECURETOKENID);
        phoneMatch = (String) ResponseHashTable.get(PayflowConstants.PARAM_PHONEMATCH);
        emailMatch = (String) ResponseHashTable.get(PayflowConstants.PARAM_EMAILMATCH);
        extRspMsg = (String) ResponseHashTable.get(PayflowConstants.PARAM_EXTRSPMSG);
        paymentAdviceCode = (String) ResponseHashTable.get(PayflowConstants.PARAM_PAYMENTADVICECODE);
        associationResponseCode = (String) ResponseHashTable.get(PayflowConstants.PARAM_ASSOCIATIONRESPCODE);
        transactionId = (String) ResponseHashTable.get(PayflowConstants.PARAM_TRANSACTIONID);
        transactionId = (String) ResponseHashTable.get(PayflowConstants.MAGTEK_PARAM_MAGTRESPONSE);
        traceId = (String) ResponseHashTable.get(PayflowConstants.PARAM_TRACEID);
        achStatus = (String) ResponseHashTable.get(PayflowConstants.PARAM_ACHSTATUS);
        type = (String) ResponseHashTable.get(PayflowConstants.PARAM_TYPE);
        affluent= (String) ResponseHashTable.get(PayflowConstants.PARAM_AFFLUENT);
        ccUpdated = (String) ResponseHashTable.get(PayflowConstants.PARAM_CCUPDATED);
        txId = (String) ResponseHashTable.get(PayflowConstants.PARAM_TXID);


        ResponseHashTable.remove(PayflowConstants.PARAM_RESULT);
        ResponseHashTable.remove(PayflowConstants.PARAM_PPREF);
        ResponseHashTable.remove(PayflowConstants.PARAM_PNREF);
        ResponseHashTable.remove(PayflowConstants.PARAM_RESPMSG);
        ResponseHashTable.remove(PayflowConstants.PARAM_AUTHCODE);
        ResponseHashTable.remove(PayflowConstants.PARAM_AVSADDR);
        ResponseHashTable.remove(PayflowConstants.PARAM_AVSZIP);
        ResponseHashTable.remove(PayflowConstants.PARAM_CARDSECURE);
        ResponseHashTable.remove(PayflowConstants.PARAM_CVV2MATCH);
        ResponseHashTable.remove(PayflowConstants.PARAM_IAVS);
        ResponseHashTable.remove(PayflowConstants.PARAM_ORIGRESULT);
        ResponseHashTable.remove(PayflowConstants.PARAM_TRANSSTATE);
        ResponseHashTable.remove(PayflowConstants.PARAM_CUSTREF);
        ResponseHashTable.remove(PayflowConstants.PARAM_STARTTIME);
        ResponseHashTable.remove(PayflowConstants.PARAM_ENDTIME);
        ResponseHashTable.remove(PayflowConstants.PARAM_DUPLICATE);
        ResponseHashTable.remove(PayflowConstants.PARAM_DATE_TO_SETTLE);
        ResponseHashTable.remove(PayflowConstants.PARAM_BATCHID);
        ResponseHashTable.remove(PayflowConstants.PARAM_ADDLMSGS);
        ResponseHashTable.remove(PayflowConstants.PARAM_RESPTEXT);
        ResponseHashTable.remove(PayflowConstants.PARAM_PROCAVS);
        ResponseHashTable.remove(PayflowConstants.PARAM_PROCCARDSECURE);
        ResponseHashTable.remove(PayflowConstants.PARAM_PROCCVV2);
        ResponseHashTable.remove(PayflowConstants.PARAM_HOSTCODE);
        ResponseHashTable.remove(PayflowConstants.PARAM_ORIGPNREF);
        ResponseHashTable.remove(PayflowConstants.PARAM_SETTLE_DATE);
        ResponseHashTable.remove(PayflowConstants.PARAM_FEEAMT);
        ResponseHashTable.remove(PayflowConstants.PARAM_PENDINGREASON);
        ResponseHashTable.remove(PayflowConstants.PARAM_PAYMENTTYPE);
        ResponseHashTable.remove(PayflowConstants.PARAM_CORRELATIONID);
        ResponseHashTable.remove(PayflowConstants.PARAM_STATUS);
        ResponseHashTable.remove(PayflowConstants.PARAM_BALAMT);
        ResponseHashTable.remove(PayflowConstants.PARAM_AMEXID);
        ResponseHashTable.remove(PayflowConstants.PARAM_AMEXPOSDATA);
        ResponseHashTable.remove(PayflowConstants.PARAM_ACCT);
        ResponseHashTable.remove(PayflowConstants.PARAM_LASTNAME);
        ResponseHashTable.remove(PayflowConstants.PARAM_FIRSTNAME);
        ResponseHashTable.remove(PayflowConstants.PARAM_AMT);
        ResponseHashTable.remove(PayflowConstants.PARAM_TRANSTIME);
        ResponseHashTable.remove(PayflowConstants.PARAM_EXPDATE);
        ResponseHashTable.remove(PayflowConstants.PARAM_CARDTYPE);
        ResponseHashTable.remove(PayflowConstants.PARAM_ORIGAMT);
        ResponseHashTable.remove(PayflowConstants.PARAM_SECURETOKEN);
        ResponseHashTable.remove(PayflowConstants.PARAM_SECURETOKENID);
        ResponseHashTable.remove(PayflowConstants.PARAM_PHONEMATCH);
        ResponseHashTable.remove(PayflowConstants.PARAM_EMAILMATCH);
        ResponseHashTable.remove(PayflowConstants.PARAM_EXTRSPMSG);
        ResponseHashTable.remove(PayflowConstants.PARAM_PAYMENTADVICECODE);
        ResponseHashTable.remove(PayflowConstants.PARAM_ASSOCIATIONRESPCODE);
        ResponseHashTable.remove(PayflowConstants.PARAM_TRANSACTIONID);
        ResponseHashTable.remove(PayflowConstants.MAGTEK_PARAM_MAGTRESPONSE);
        ResponseHashTable.remove(PayflowConstants.PARAM_TRACEID);
        ResponseHashTable.remove(PayflowConstants.PARAM_ACHSTATUS);
        ResponseHashTable.remove(PayflowConstants.PARAM_TXID);

    }

    /**
     * Gets the feeAmt parameter
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: FEEAMT
     */
    public String getFeeAmt() {
        return feeAmt;
    }

    /**
     * Gets the pending reason parameter
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: PENDINGREASON
     */
    public String getPendingReason() {
        return pendingReason;
    }

    /**
     * Gets the Payment Type parameter
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: PAYMENTTYPE
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Gets the Correlation Id parameter
     *
     * @return - String
     * @paypal.sample <p>Maps to Payflow Parameter: CORRELATIONID
     */

    public String getCorrelationId() {
        return correlationId;
    }

}

#region "Imports"

using System;
using System.Collections;
using PayPal.Payments.Common.Exceptions; 
using PayPal.Payments.Common.Utility ; 
#endregion

namespace PayPal.Payments.DataObjects
{
	/// <summary>
	/// Used for ExpressCheckout get operation.
	/// </summary>
	/// <remarks>
	/// <seealso cref="ExpressCheckoutResponse"/>
	/// <seealso cref="ECDoResponse"/>
	/// </remarks>
	public class ECGetResponse : ExpressCheckoutResponse
	{
		#region "Member variables"

		private String mEMail;
		private String mPayerId;
		private String mPayerStatus;
		private String mShipToFirstName;
		private String mShipToLastName;
		private String mShipToCountry;
		private String mShipToBusiness;
		private String mAddrStatus;
		private String mFirstName;
		private String mLastName;
		private String mShipToStreet;
		private String mShipToStreet2;
		private String mShipToCity;
		private String mShipToState;
		private String mShipToZip;
		private String mCountryCode;
		private String mPhoneNum;
		private String mBA_Flag;

		#endregion

		#region "Constructor"
		/// <summary>
		/// constructor
		/// </summary>
		internal ECGetResponse()
		{
		}
		#endregion

		#region "properties"
		/// <summary>
		/// Gets the EMail parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>EMAIL</code>
		/// </remarks>
		public String EMail
		{
			get {return mEMail;}
		}
		/// <summary>
		/// Gets the payerid parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>PAYERID</code>
		/// </remarks>
		public String PayerId
		{
			get {return mPayerId;}
		}

		/// <summary>
		/// Gets the payerstatus parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>PAYERSTATUS</code>
		/// </remarks>
		public String PayerStatus
		{
			get {return mPayerStatus;}
		}
		/// <summary>
		/// Gets the shiptofirstname parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>SHIPTOFIRSTNAME</code>
		/// </remarks>
		public String ShipToFirstName
		{
			get {return mShipToFirstName;}
		}
		/// <summary>
		/// Gets the shiptolastname parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>SHIPTOLASTNAME</code>
		/// </remarks>
		public String ShipToLastName
		{
			get {return mShipToLastName;}
		}
		/// <summary>
		/// Gets the ShipToCountry parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>SHIPTOCOUNTRY</code>
		/// </remarks>
		public String ShipToCountry
		{
			get {return mShipToCountry;}
		}
		/// <summary>
		/// Gets the ShipToBusiness parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>SHIPTOBUSINESS</code>
		/// </remarks>
		public String ShipToBusiness
		{
			get {return mShipToBusiness;}
		}
		/// <summary>
		/// Gets the AddressStatus parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>ADDRSTATUS</code>
		/// </remarks>
		public String AddressStatus
		{
			get {return mAddrStatus;}
		}
		/// <summary>
		/// Gets the FirstName parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>FIRSTNAME</code>
		/// </remarks>
		public String FirstName
		{
			get {return mFirstName;}
		}
		/// <summary>
		/// Gets the LastName parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>LASTNAME</code>
		/// </remarks>
		public String LastName
		{
			get {return mLastName;}
		}
		/// <summary>
		/// Gets the ShipToStreet parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>SHIPTOSTREET</code>
		/// </remarks>
		public String ShipToStreet
		{
			get {return mShipToStreet;}
		}
		/// <summary>
		/// Gets the ShipToStreet2 parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>SHIPTOSTREET2</code>
		/// </remarks>
		public String ShipToStreet2
		{
			get {return mShipToStreet2;}
		}
		/// <summary>
		/// Gets the ShipToCity parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>SHIPTOCITY</code>
		/// </remarks>
		public String ShipToCity
		{
			get {return mShipToCity;}
		}
		/// <summary>
		/// Gets the ShipToState parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>SHIPTOSTATE</code>
		/// </remarks>
		public String ShipToState
		{
			get {return mShipToState;}
		}
		/// <summary>
		/// Gets the ShipToZip parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>SHIPTOZIP</code>
		/// </remarks>
		public String ShipToZip
		{
			get {return mShipToZip;}
		}
		/// <summary>
		/// Gets the CountryCode parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>COUNTRYCODE</code>
		/// </remarks>
		public String CountryCode
		{
			get {return mCountryCode;}
		}
		/// <summary>
		/// Gets the PHONENUM parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>PHONENUM</code>
		/// </remarks>
		public String PhoneNum
		{
			get {return mPhoneNum;}
		}
		/// <summary>
		/// Gets the BA_FLAG parameter
		/// </summary>
		/// <remarks>
		/// <para>Maps to Payflow Parameter:</para>
		/// <code>BA_FLAG</code>
		/// </remarks>
		public String BA_Flag
		{
			get {return mBA_Flag;}
		}

		#endregion

		#region "Core functions"

		/// <summary>
		/// Sets Response params
		/// </summary>
		///<param name="ResponseHashTable">Response Hash table by ref</param>
		internal override void SetParams(ref Hashtable ResponseHashTable)
		{
			try
			{
				mEMail = (String) ResponseHashTable[PayflowConstants.PARAM_BILLTOEMAIL];
				mPayerId = (String) ResponseHashTable[PayflowConstants.PARAM_PAYERID];
				mPayerStatus = (String) ResponseHashTable[PayflowConstants.PARAM_PAYERSTATUS];
				mShipToFirstName = (String) ResponseHashTable[PayflowConstants.PARAM_SHIPTOFIRSTNAME];
				mShipToLastName = (String) ResponseHashTable[PayflowConstants.PARAM_SHIPTOLASTNAME];
				mShipToCountry = (String) ResponseHashTable[PayflowConstants.PARAM_SHIPTOCOUNTRY];
				mShipToBusiness = (String) ResponseHashTable[PayflowConstants.PARAM_SHIPTOBUSINESS];
				mAddrStatus = (String) ResponseHashTable[PayflowConstants.PARAM_ADDRSTATUS];
				mFirstName = (String) ResponseHashTable[PayflowConstants.PARAM_BILLTOFIRSTNAME];
				mLastName = (String) ResponseHashTable[PayflowConstants.PARAM_BILLTOLASTNAME];
				mShipToStreet = (String) ResponseHashTable[PayflowConstants.PARAM_SHIPTOSTREET];
				mShipToStreet2 = (String) ResponseHashTable[PayflowConstants.PARAM_SHIPTOSTREET2];
				mShipToCity = (String) ResponseHashTable[PayflowConstants.PARAM_SHIPTOCITY];
				mShipToState = (String) ResponseHashTable[PayflowConstants.PARAM_SHIPTOSTATE];
				mShipToZip = (String) ResponseHashTable[PayflowConstants.PARAM_SHIPTOZIP];
				mCountryCode = (String) ResponseHashTable[PayflowConstants.PARAM_COUNTRYCODE];
				mPhoneNum = (String) ResponseHashTable[PayflowConstants.PARAM_BILLTOPHONENUM];
				mBA_Flag = (String) ResponseHashTable[PayflowConstants.PARAM_BA_FLAG];


				ResponseHashTable.Remove(PayflowConstants.PARAM_BILLTOEMAIL);
				ResponseHashTable.Remove(PayflowConstants.PARAM_PAYERID);
				ResponseHashTable.Remove(PayflowConstants.PARAM_PAYERSTATUS);
				ResponseHashTable.Remove(PayflowConstants.PARAM_SHIPTOFIRSTNAME);
				ResponseHashTable.Remove(PayflowConstants.PARAM_SHIPTOLASTNAME);
				ResponseHashTable.Remove(PayflowConstants.PARAM_SHIPTOCOUNTRY);
				ResponseHashTable.Remove(PayflowConstants.PARAM_SHIPTOBUSINESS);
				ResponseHashTable.Remove(PayflowConstants.PARAM_ADDRSTATUS);
				ResponseHashTable.Remove(PayflowConstants.PARAM_BILLTOFIRSTNAME);
				ResponseHashTable.Remove(PayflowConstants.PARAM_BILLTOLASTNAME);
				ResponseHashTable.Remove(PayflowConstants.PARAM_SHIPTOSTREET);
				ResponseHashTable.Remove(PayflowConstants.PARAM_SHIPTOSTREET2);
				ResponseHashTable.Remove(PayflowConstants.PARAM_SHIPTOCITY);
				ResponseHashTable.Remove(PayflowConstants.PARAM_SHIPTOSTATE);
				ResponseHashTable.Remove(PayflowConstants.PARAM_SHIPTOZIP);
				ResponseHashTable.Remove(PayflowConstants.PARAM_COUNTRYCODE);
				ResponseHashTable.Remove(PayflowConstants.PARAM_BILLTOPHONENUM);
				ResponseHashTable.Remove(PayflowConstants.PARAM_BA_FLAG);
			}
			catch (BaseException)
			{
				throw;
			}
			catch (Exception Ex)
			{
				DataObjectException DEx = new DataObjectException(Ex);
				throw DEx;
			}
			//catch
			//{
			//    throw new Exception();				
			//}

		}

		#endregion

	}
}

package Adapter

/**
  * Created by steven on 07/05/2017.
  */
class XpayToPayDAdapter(var original:Xpay) extends PayD{

  def getCustCardNo: String = original.getCreditCardNo

  def setCustCardNo(custCardNo: String) = original.setCreditCardNo(custCardNo)

  def getCardOwnerName: String = original.getCustomerName

  def setCardOwnerName(cardOwnerName: String) = original.setCustomerName(cardOwnerName)

  def getCardExpMonthDate: String = original.getCardExpMonth

  def setCardExpMonthDate(cardExpMonthDate: String) = original.setCardExpMonth(cardExpMonthDate)

  def getCVVNo: Integer = original.getCardCVVNo.toInt

  def setCVVNo(cVVNo: Integer) = {

    val c = cVVNo.toShort
    original.setCardCVVNo(c)
  }

  def getTotalAmount: Double = original.getAmount

  def setTotalAmount(totalAmount: Double) = original.setAmount(totalAmount)

}

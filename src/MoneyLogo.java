import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class MoneyLogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double payment = 12324.134d;
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
		//System.out.println(numberFormat.format(payment));
//      	numberFormat.format(payment)setCurrency(Currency.getInstance(Locale.US));
//      	String payments = numberFormat.format(payment);
//      	System.out.println("US: " + payments);
//      	
      String paymentUS = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
      System.out.println(paymentUS);
		
		//for US
//        Locale localeUS = Locale.US;
//        Currency currUS = Currency.getInstance(localeUS);
//        String symbolUS = currUS.getSymbol(localeUS);
//        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
//        numberFormat.setCurrency(Currency.getInstance(Locale.US));
//        String paymentUS = numberFormat.format(payment);
//        System.out.println("US: " + paymentUS);
//        
//        
//
//        //for India
//        Locale localeIND = new Locale("Hello","IN");
//        Currency currIND = Currency.getInstance(localeIND);
//        String symbolIND = currIND.getSymbol(localeIND);
//        System.out.println("INDIA: " + symbolIND + " "+ payment);
      	
        Locale localeIND = new Locale("Hello","IN");
      	NumberFormat numberFormatIND = NumberFormat.getCurrencyInstance(localeIND);
      	numberFormatIND.setCurrency(Currency.getInstance(localeIND));
    //  	String payments = numberFormat.format(payment);
      	//System.out.println("US: " + numberFormatIND.format(payment));
//    
//
//        //for China
//        Locale localeCHN = Locale.CHINA;
//        Currency currCHN = Currency.getInstance(localeCHN);
//        String symbolCHN = currCHN.getSymbol(localeCHN);
//        System.out.println("China: " + symbolCHN + " "+ payment);
//
//
//        //For France
//        Locale localeFRA = Locale.FRANCE;
//        Currency currFRA = Currency.getInstance(localeFRA);
//        String symbolFRA = currFRA.getSymbol(localeFRA);
//        System.out.println("France: " + " "+ payment+" " +symbolFRA);
//        
        MoneyLogo logo = new MoneyLogo();
        logo.currencyPattern(payment, "Locale.US");
      
        
        
		
	}
	  public void currencyPattern(double payment, String countryName) {
      }

}

package locales;

import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.Locale;

public class MainLocales {
	
	public static void main(String[] args) {
		
		Locale usEnglish = Locale.forLanguageTag("en-US");	
		
		Locale[] locales = Locale.getAvailableLocales();
		Locale[] supportedLocales = NumberFormat.getAvailableLocales();
		Charset platformEncoding = Charset.defaultCharset();
		
		System.out.println(Locale.getDefault().getDisplayName());
		System.out.println(Locale.getDefault().getDisplayName(usEnglish));
		System.out.println(platformEncoding);
		
		
	}

}

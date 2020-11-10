package ge.edu.btu.impl;

public class main {
        public static void main(String[] args) {
            CurrencyServiceImpl currencyService = new CurrencyServiceImpl();
            System.out.println(currencyService.convert(3));
            System.out.println(currencyService.convert(40));
        }
    }
}

package ge.edu.btu.impl;

public class main {
        public static void main(String[] args) {
            CurrencyServiceImpl currencyService = new CurrencyServiceImpl();
            System.out.println(currencyService.convert(4));
            System.out.println(currencyService.convert(50));
        }
    }
}

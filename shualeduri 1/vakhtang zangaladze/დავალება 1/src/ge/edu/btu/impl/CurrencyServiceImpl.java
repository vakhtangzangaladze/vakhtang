package ge.edu.btu.impl;

public class CurrencyServiceImpl {
    public boolean convert(int i) {
        return false;
    }public class CurrencyServiceImpl implements CurrencyService {
        private double exchangeRate = 5;
        @Override
        public double convert(double amount) {
            return amount / exchangeRate;
        }@Override
        public double setExchangeRate(int value) {
            return exchangeRate = value;
        }
    }
}

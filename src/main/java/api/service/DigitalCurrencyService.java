package api.service;

public interface DigitalCurrencyService {
    double getCryptoPrice(String symbol);

    void syncCryptoPrices();
}

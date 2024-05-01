package api.service;

import api.model.CryptoPriceData;
import jakarta.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@EnableAsync
@Service
public class DigitalCurrencyServiceImpl implements DigitalCurrencyService {
    private static final String API_URL = "https://fapi.binance.com/fapi/v1/premiumIndex";
    private final Map<String, Double> cryptoPricesStorage = new HashMap<>();
    private final RestTemplate restTemplate;

    @Override
    public double getCryptoPrice(String symbol) {
        return cryptoPricesStorage.getOrDefault(symbol, 0.0);
    }

    @Async
    @Scheduled(cron = "* * * * * *")
    @PostConstruct
    @Override
    public void syncCryptoPrices() {
        ResponseEntity<CryptoPriceData[]> responseEntity
                = restTemplate.getForEntity(API_URL, CryptoPriceData[].class);
        CryptoPriceData[] cryptoPrices = responseEntity.getBody();

        assert cryptoPrices != null;
        Arrays.stream(cryptoPrices)
                .forEach(price -> cryptoPricesStorage.put(price.getSymbol(),
                        Double.valueOf(price.getMarkPrice())));

    }
}

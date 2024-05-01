package api.controller;

import api.service.DigitalCurrencyService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class DigitalCurrencyController {
    private final DigitalCurrencyService digitalCurrencyService;

    @GetMapping("/price")
    public double getCurrentPrice(
            @RequestParam(defaultValue = "BTCUSDT")
            @Parameter(description = "try to find prices for currencies like `BTCUSDT` or `ETHUSDT`")
            String symbol) {
        return digitalCurrencyService.getCryptoPrice(symbol);
    }
}

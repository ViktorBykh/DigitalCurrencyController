package api.model;

import lombok.Data;

@Data
public class CryptoPriceData {
    private String symbol;
    private String markPrice;
    private String indexPrice;
    private String estimatedSettlePrice;
    private String lastFundingRate;
    private long nextFundingTime;
    private String interestRate;
    private long time;
}

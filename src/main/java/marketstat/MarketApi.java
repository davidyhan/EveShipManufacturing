package marketstat;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "evec_api")
public class MarketApi {

    private MarketStat market;

    public MarketStat getMarket() {
        return market;
    }

    @XmlElement(name = "marketstat")
    public void setMarket(MarketStat market) {
        this.market = market;
    }

    public String toString() {
        return market.toString();
    }
}

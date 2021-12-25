package be.dekleinekobini.tornapi.models.torn;

import be.dekleinekobini.tornapi.models.Model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class TornItem extends Model {

    private String name;
    private String description;
    private String effect;
    private String requirement;
    private String type;
    @JsonProperty("weapon_type")
    private String weaponType;
    @JsonProperty("buy_price")
    private long buyPrice;
    @JsonProperty("sell_price")
    private long sellPrice;
    @JsonProperty("market_value")
    private long marketValue;
    private long circulation;
    private String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public long getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(long buyPrice) {
        this.buyPrice = buyPrice;
    }

    public long getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(long sellPrice) {
        this.sellPrice = sellPrice;
    }

    public long getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(long marketValue) {
        this.marketValue = marketValue;
    }

    public long getCirculation() {
        return circulation;
    }

    public void setCirculation(long circulation) {
        this.circulation = circulation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TornItem tornItem = (TornItem) o;
        return buyPrice == tornItem.buyPrice && sellPrice == tornItem.sellPrice && marketValue == tornItem.marketValue && circulation == tornItem.circulation && Objects.equals(name, tornItem.name) && Objects.equals(description, tornItem.description) && Objects.equals(effect, tornItem.effect) && Objects.equals(requirement, tornItem.requirement) && Objects.equals(type, tornItem.type) && Objects.equals(weaponType, tornItem.weaponType) && Objects.equals(image, tornItem.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, effect, requirement, type, weaponType, buyPrice, sellPrice, marketValue, circulation, image);
    }

}

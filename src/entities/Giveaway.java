package entities;

public class Giveaway {
    String sponsor;
    String sweepstakesName;
    String description;
    String url;
    String endDate;
    String frequency;
    String restrictions;
    String prize;
    String prizeValue;
    String personalName;
    String email;
    String giveawayImgUrl;
    String giveawayImgLocal;
    String comment;

    public Giveaway(String sponsor, String sweepstakesName, String description, String url, String endDate, String frequency, String restrictions, String prize, String prizeValue, String personalName, String email, String giveawayImgUrl, String giveawayImgLocal, String comment) {
        this.sponsor = sponsor;
        this.sweepstakesName = sweepstakesName;
        this.description = description;
        this.url = url;
        this.endDate = endDate;
        this.frequency = frequency;
        this.restrictions = restrictions;
        this.prize = prize;
        this.prizeValue = prizeValue;
        this.personalName = personalName;
        this.email = email;
        this.giveawayImgUrl = giveawayImgUrl;
        this.giveawayImgLocal = giveawayImgLocal;
        this.comment = comment;
    }

    public String getSponsor() {
        return this.sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getSweepstakesName() {
        return this.sweepstakesName;
    }

    public void setSweepstakesName(String sweepstakesName) {
        this.sweepstakesName = sweepstakesName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getFrequency() {
        return this.frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getRestrictions() {
        return this.restrictions;
    }

    public void setRestrictions(String restrictions) {
        this.restrictions = restrictions;
    }

    public String getPrize() {
        return this.prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getPrizeValue() {
        return this.prizeValue;
    }

    public void setPrizeValue(String prizeValue) {
        this.prizeValue = prizeValue;
    }

    public String getPersonalName() {
        return this.personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGiveawayImgUrl() {
        return this.giveawayImgUrl;
    }

    public void setGiveawayImgUrl(String giveawayImgUrl) {
        this.giveawayImgUrl = giveawayImgUrl;
    }

    public String getGiveawayImgLocal() {
        return this.giveawayImgLocal;
    }

    public void setGiveawayImgLocal(String giveawayImgLocal) {
        this.giveawayImgLocal = giveawayImgLocal;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

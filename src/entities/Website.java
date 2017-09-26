package entities;

public class Website {
    String url;
    String sponsorInputId;
    String sweepstakesInputId;
    String giveawayUrlInputId;
    String expirationInputId;
    String frequencyInputId;
    String prizeInputId;
    String personalNameInputId;
    String emailInputId;
    String submitButtonId;
    String confirmationMsg;

    public Website(String url, String sponsorInputId, String sweepstakesInputId, String giveawayUrlInputId, String expirationInputId, String frequencyInputId, String prizeInputId, String personalNameInputId, String emailInputId, String submitButtonId, String confirmationMsg) {
        this.url = url;
        this.sponsorInputId = sponsorInputId;
        this.sweepstakesInputId = sweepstakesInputId;
        this.giveawayUrlInputId = giveawayUrlInputId;
        this.expirationInputId = expirationInputId;
        this.frequencyInputId = frequencyInputId;
        this.prizeInputId = prizeInputId;
        this.personalNameInputId = personalNameInputId;
        this.emailInputId = emailInputId;
        this.submitButtonId = submitButtonId;
        this.confirmationMsg = confirmationMsg;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSponsorInputId() {
        return this.sponsorInputId;
    }

    public void setSponsorInputId(String sponsorInputId) {
        this.sponsorInputId = sponsorInputId;
    }

    public String getSweepstakesInputId() {
        return this.sweepstakesInputId;
    }

    public void setSweepstakesInputId(String sweepstakesInputId) {
        this.sweepstakesInputId = sweepstakesInputId;
    }

    public String getGiveawayUrlInputId() {
        return this.giveawayUrlInputId;
    }

    public void setGiveawayUrlInputId(String giveawayUrlInputId) {
        this.giveawayUrlInputId = giveawayUrlInputId;
    }

    public String getExpirationInputId() {
        return this.expirationInputId;
    }

    public void setExpirationInputId(String expirationInputId) {
        this.expirationInputId = expirationInputId;
    }

    public String getFrequencyInputId() {
        return this.frequencyInputId;
    }

    public void setFrequencyInputId(String frequencyInputId) {
        this.frequencyInputId = frequencyInputId;
    }

    public String getPrizeInputId() {
        return this.prizeInputId;
    }

    public void setPrizeInputId(String prizeInputId) {
        this.prizeInputId = prizeInputId;
    }

    public String getPersonalNameInputId() {
        return this.personalNameInputId;
    }

    public void setPersonalNameInputId(String personalNameInputId) {
        this.personalNameInputId = personalNameInputId;
    }

    public String getEmailInputId() {
        return this.emailInputId;
    }

    public void setEmailInputId(String emailInputId) {
        this.emailInputId = emailInputId;
    }

    public String getSubmitButtonId() {
        return this.submitButtonId;
    }

    public void setSubmitButtonId(String submitButtonId) {
        this.submitButtonId = submitButtonId;
    }

    public String getConfirmationMsg() {
        return this.confirmationMsg;
    }

    public void setConfirmationMsg(String confirmationMsg) {
        this.confirmationMsg = confirmationMsg;
    }
}

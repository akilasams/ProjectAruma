package com.addRating;

public class addRatingMem {
    private String rate;
    private String review;

    public addRatingMem(String rate, String review) {
        super();
        this.rate = rate;
        this.review = review;
    }

    public addRatingMem() {
        super();
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}

package com.addRating;

public class addRatingMem {
    private String design_id;
    private String rate;
    private String review;

    public addRatingMem(String design_id,String rate, String review) {
        super();
        this.design_id = design_id;
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

    public String getDesign_id() {
        return design_id;
    }

    public void setDesign_id(String design_id) {
        this.review = design_id;
    }
}

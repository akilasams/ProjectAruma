package com.viewRatingsReviews;

public class viewRateReview {
    private String design_id;
    private String rating;
    private String review;

    public viewRateReview(String design_id, String rating, String review) {
        super();
        this.design_id = design_id;
        this.rating = rating;
        this.review = review;

    }

    public viewRateReview() {
        super();
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
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

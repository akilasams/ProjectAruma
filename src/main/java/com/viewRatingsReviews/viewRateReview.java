package com.viewRatingsReviews;

public class viewRateReview {
    private String rating;
    private String review;

    public viewRateReview(String rating, String review) {
        super();
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
}

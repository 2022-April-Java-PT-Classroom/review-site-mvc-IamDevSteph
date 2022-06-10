package org.wecancoeit.reviews;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    //now creating the constructor that should have my review instances
    public ReviewRepository(){
        Review princessMononoke = new Review(1L, "Princess Mononoke", "https://live.staticflickr.com/5445/17219911175_d693e2329b_b.jpg", "Action/Adventure/Fantasy", "Hayao Miyazaki", "December 19th 1997", "Powerful emotional film");
        Review kikisDeliveryService = new Review(2L, "Kiki's Delivery Service", "https://live.staticflickr.com/8536/8675736937_6deb0c28c6_b.jpg", "Family/Fantasy", "Hayao Miyazaki", "December 20th 1990", "Great family film with a coming of age cast");
        Review howlsMovingCastle = new Review(3L, "Howl's Moving Castle", "https://live.staticflickr.com/7139/7633828504_fa1c008cc0_b.jpg", "Adventure/Family/Fantasy", "Hayao Miyazaki", "June 17th 2005", "Fantastic work with a lot of meaning");
        Review spiritedAway = new Review(4L, "Spirited Away", "https://live.staticflickr.com/1623/25007888619_1bc2f8c199_b.jpg", "Adventure/Family/Fantasy/Mystery", "Hayao Miyazaki", "March 28th 2003", "Amazing film featuring a determined girl with a strong ambition to bring her parents back to their original form and not used for slaughter to feed the bath house");

        //Studio Ghibli films

        reviewsList.put(princessMononoke.getId(), princessMononoke);
        reviewsList.put(kikisDeliveryService.getId(), kikisDeliveryService);
        reviewsList.put(howlsMovingCastle.getId(), howlsMovingCastle);
        reviewsList.put(spiritedAway.getId(), spiritedAway);
    }

    public ReviewRepository(Review ...reviewsToAdd){
        for(Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id){
        return reviewsList.get(id);
    }

    public Collection<Review> findAll(){
        return reviewsList.values();
    }

}

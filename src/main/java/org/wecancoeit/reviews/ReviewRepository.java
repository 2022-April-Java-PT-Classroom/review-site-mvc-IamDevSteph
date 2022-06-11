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
        Review princessMononoke = new Review(1L, "Princess Mononoke", "https://live.staticflickr.com/5445/17219911175_d693e2329b_b.jpg", "Action/Adventure/Fantasy", "Hayao Miyazaki", "December 19th 1997", "Stunning hand drawn animation that illustrates the dynamic feud of between civilization and the gods/spirits of the forest. This film follows a few brave main characters who are raised in opposite environments, with one fighting his way to find a balance between human production and the natural habitat. ");
        Review kikisDeliveryService = new Review(2L, "Kiki's Delivery Service", "https://live.staticflickr.com/8536/8675736937_6deb0c28c6_b.jpg", "Family/Fantasy", "Hayao Miyazaki", "December 20th 1990", "As an adult rewatching this animation, I feel many people can relate to this film when it comes to leaving their safety net which is their childhood home and entering the world of being an independent adult. I can even say that my fellow colleagues in my programming course can relate to having that insecurity, but drive to survive in the world as a programmer. Kiki in the film does just that and even seeks advice from an established witch on how she can be successful and fulfilled in her own life. She also throughout the movie tries to find her niche/skill that she can use to make her stand out, to the best of her knowledge, it is flying. However, she eventually starts finding flying (while performing her deliveries) mundane and she eventually loses interest in hanging with friends and activities. She loses her inspiration and loses the ability to use her magic. This prompts Kiki to have an internal struggle within herself that if she cannot fly anymore, she will need to give up as a witch. This is very much relatable, as there were times I felt I was getting 'it' and wondered why am I pursing to be a programmer; however as both Kiki and any programmer both realize, is that self care is necessary to continue that drive and inspiration to find your place in the world.");
        Review howlsMovingCastle = new Review(3L, "Howl's Moving Castle", "https://live.staticflickr.com/7139/7633828504_fa1c008cc0_b.jpg", "Adventure/Family/Fantasy", "Hayao Miyazaki", "June 17th 2005", "This film  is a beautiful masterpiece that illustrates that love does make you feel younger. The protagonist becomes subject to a curse due to a jealous witch who noticed her getting close to a wizard named Howl. She receives the help of a sentient scarecrow and finds Howl's moving castle. There she becomes a supporting resident by maintaining the castle along with the help of the other residents inside. Throughout the film, Sophie (main character) becomes a little more confident each day which reverses the curse laid on her steadily. Through courage, confidence, and appreciation all the characters experience growth and in their own special way, reverse their own curses and find true happiness in the end.");
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

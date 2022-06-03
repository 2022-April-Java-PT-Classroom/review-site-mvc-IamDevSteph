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
    //DragonBall Z Character reviews
        //Goku
        //Vegeta
        //Gohan
        //
    }

    public Review findOne(long id){
        return reviewsList.get(id);
    }

    public Collection<Review> findAll(){
        return reviewsList.values();
    }

}

package org.wecancoeit.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewsController {
    @Resource
    private ReviewRepository reviewRepo;

//    @GetMapping("/home")
//    public String home(@RequestParam(value = "reviews", required=false, defaultValue = "Review"))

    @RequestMapping("/reviews")
    public String findAllReviews(Model model){
        model.addAttribute("reviewsModel", reviewRepo.findAll());
        return "reviewsTemplate";
    }

    @RequestMapping("/review")
    public String findOneReview(@RequestParam(value="id") Long id, Model model) throws ReviewNotFoundException {
        if(reviewRepo.findOne(id) == null){
            throw new ReviewNotFoundException();
        }
        model.addAttribute("reviewModel", reviewRepo.findOne(id));
        return "reviewTemplate";
    }

}

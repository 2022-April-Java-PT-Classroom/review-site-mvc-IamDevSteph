package org.wecancoeit.reviews;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code= HttpStatus.NOT_FOUND, reason="I'm sorry, I have not reviewed this person :[")
public class ReviewNotFoundException extends Exception{
}

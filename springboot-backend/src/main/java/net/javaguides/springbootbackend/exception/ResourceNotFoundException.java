package net.javaguides.springbootbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


// Exception if data not found in database
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    // verify that the sender and receiver of a serialized object have loaded classes for that object that are compatible with respect to serialization
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message){
        // Call super class method
        super(message);
    }

    
}

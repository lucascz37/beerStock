package com.lucas.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NegativeBeerStockException extends Exception{

    public NegativeBeerStockException(Long id, int quantityToDecrement){
        super(String.format("Beers with ID %s to decrement the quantity %s cannot leave stock negative", id, quantityToDecrement));
    }
}

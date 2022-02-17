package com.example.challengeeldar;

import com.example.challengeeldar.cards.CardData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CardBoundary {

    private final CardController cardController;

    public CardBoundary(CardController cardController){
        this.cardController = cardController;
    }

    @GetMapping("/status")
    public Object getStatus(@RequestBody CardData data){
        return cardController.getCardInformation(data);
    }

}

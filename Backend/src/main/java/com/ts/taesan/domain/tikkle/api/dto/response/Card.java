package com.ts.taesan.domain.tikkle.api.dto.response;

import com.ts.taesan.global.openfeign.card.dto.inner.CardList;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Card {

    private Long cardId;
    private String cardNumber;
    private String cardCompany;
    private String cardType;

    @Builder
    public Card(Long cardId, String cardNumber, String cardCompany, String cardType) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.cardCompany = cardCompany;
        this.cardType = cardType;
    }

    public Card(CardList cardList) {
        this.cardId = cardList.getCardId();
        this.cardNumber = cardList.getCardNum();
        this.cardCompany = cardList.getCompany();
        this.cardType = cardList.getCardType();
    }

}

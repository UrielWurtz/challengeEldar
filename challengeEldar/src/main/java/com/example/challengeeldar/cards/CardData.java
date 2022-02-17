package com.example.challengeeldar.cards;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CardData {
    @NonNull
    private int cardNumber;
    @NonNull
    private String brand;
    @NonNull
    private String cardHolderFirstName;
    @NonNull
    private String cardHolderLastName;
    @NonNull
    private LocalDate expirationDate;
    @NonNull
    private double operationAmount;
}

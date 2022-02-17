package com.example.challengeeldar;

import com.example.challengeeldar.cards.CardData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
@RequiredArgsConstructor
public class CardController {

 public Response getCardInformation(CardData data){
  double totalAmount = 0;
  int year = Integer.parseInt(LocalDate.now().format(DateTimeFormatter.ofPattern("yy")));
  if (data.getExpirationDate().isAfter((LocalDate.now()))){
   if(data.getOperationAmount()>1000)return getErrorAmountResponse(data,totalAmount);
     switch (data.getBrand()){
      case "VISA" :
       totalAmount = data.getOperationAmount()+(data.getOperationAmount()*(year/LocalDate.now().getMonthValue())/100);
       if(totalAmount>1000)return getErrorAmountResponse2(data,totalAmount);
       return getSucces(data,totalAmount);
      case  "AMEX":
       totalAmount = data.getOperationAmount()+(data.getOperationAmount()*(LocalDate.now().getMonthValue()*0.1)/100);
       if(totalAmount>1000)return getErrorAmountResponse2(data,totalAmount);
       return getSucces(data,totalAmount);
      case "NARA" :
       totalAmount = data.getOperationAmount()+(data.getOperationAmount()*(LocalDate.now().getDayOfMonth()*0.5)/100);
       if(totalAmount>1000)return getErrorAmountResponse2(data,totalAmount);
       return getSucces(data,totalAmount);
      default: return getErrorCardResponse(data,totalAmount);
     }
  }
  return getErrorDateResponse(data,totalAmount);
 }

 public Response getErrorDateResponse(CardData data, double totalAmount){
  Response response = new Response();
  response.setSuccess(false);
  response.setResponse("La tarjeta se encuentra Vencida");
  response.setCardNumber(data.getCardNumber());
  response.setBrand(data.getBrand());
  response.setCardHolderFirstName(data.getCardHolderFirstName());
  response.setCardHolderLastName(data.getCardHolderLastName());
  response.setExpirationDate(data.getExpirationDate().toString());
  response.setOperationAmount(data.getOperationAmount());
  response.setTotalAmount(0.0);
  return response;
 }
 public Response getErrorCardResponse(CardData data, double totalAmount){
  Response response = new Response();
  response.setSuccess(false);
  response.setResponse("La tarjeta no existe");
  response.setCardNumber(data.getCardNumber());
  response.setBrand(data.getBrand());
  response.setCardHolderFirstName(data.getCardHolderFirstName());
  response.setCardHolderLastName(data.getCardHolderLastName());
  response.setExpirationDate(data.getExpirationDate().toString());
  response.setOperationAmount(data.getOperationAmount());
  response.setTotalAmount(0.0);
  return response;
 }
 public Response getErrorAmountResponse(CardData data, double totalAmount){
  Response response = new Response();
  response.setSuccess(false);
  response.setResponse("El limite de Operacion es de $1000 pesos");
  response.setCardNumber(data.getCardNumber());
  response.setBrand(data.getBrand());
  response.setCardHolderFirstName(data.getCardHolderFirstName());
  response.setCardHolderLastName(data.getCardHolderLastName());
  response.setExpirationDate(data.getExpirationDate().toString());
  response.setOperationAmount(data.getOperationAmount());
  response.setTotalAmount(0.0);
  return response;
 }
 public Response getErrorAmountResponse2(CardData data, double totalAmount){
  Response response = new Response();
  response.setSuccess(false);
  response.setResponse("El limite de Operacion es de $1000 pesos y fue superada por la tasa");
  response.setCardNumber(data.getCardNumber());
  response.setBrand(data.getBrand());
  response.setCardHolderFirstName(data.getCardHolderFirstName());
  response.setCardHolderLastName(data.getCardHolderLastName());
  response.setExpirationDate(data.getExpirationDate().toString());
  response.setOperationAmount(data.getOperationAmount());
  response.setTotalAmount(totalAmount);
  return response;
 }
 public Response getSucces(CardData data, double totalAmount){
  Response response = new Response();
  response.setSuccess(true);
  response.setResponse("La operacion es un exito");
  response.setCardNumber(data.getCardNumber());
  response.setBrand(data.getBrand());
  response.setCardHolderFirstName(data.getCardHolderFirstName());
  response.setCardHolderLastName(data.getCardHolderLastName());
  response.setExpirationDate(data.getExpirationDate().toString());
  response.setOperationAmount(data.getOperationAmount());
  response.setTotalAmount(totalAmount);
  return response;
 }
}

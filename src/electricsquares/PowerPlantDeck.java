package electricsquares;

public class PowerPlantDeck{

  private PowerPlant[] deck;

  PowerPlantDeck(int maxElektroCost, int[] cards){
    deck = new PowerPlant[maxElektroCost];

    createDeck(cards);
  }

  private void createDeck(int[] cards){
    for (int i = 0; i < cards.length; i++){
      if (cards[i] == 1){
        addOrigCard(i);
      }else if (cards[i] == 2){
        addAltCard(i);
      }
    }
  }

  void addOrigCard(int card){
    switch (card){
      case 3:
        deck[card] = new PowerPlant(card, 2, 1, 1);
        break;
      case 4:
        deck[card] = new PowerPlant(card, 2, 0, 1);
        break;
      case 5:
        deck[card] = new PowerPlant(card, 2, 2, 1);
        break;
      case 6:
        deck[card] = new PowerPlant(card, 1, 3, 1);
        break;
      case 7:
        deck[card] = new PowerPlant(card, 3, 1, 2);
        break;
      case 8:
        deck[card] = new PowerPlant(card, 3, 0, 2);
        break;
      case 9:
        deck[card] = new PowerPlant(card, 1, 1, 1);
        break;
      case 10:
        deck[card] = new PowerPlant(card, 2, 0, 2);
        break;
      case 11:
        deck[card] = new PowerPlant(card, 1, 4, 2);
        break;
      case 12:
        deck[card] = new PowerPlant(card, 2, 2, 2);
        break;
      case 13:
        deck[card] = new PowerPlant(card, 0, 5, 1);
        break;
      case 14:
        deck[card] = new PowerPlant(card, 2, 3, 2);
        break;
      case 15:
        deck[card] = new PowerPlant(card, 2, 0, 3);
        break;
      case 16:
        deck[card] = new PowerPlant(card, 2, 1, 3);
        break;
      case 17:
        deck[card] = new PowerPlant(card, 1, 4, 2);
        break;
      case 18:
        deck[card] = new PowerPlant(card, 0, 5, 2);
        break;
      case 19:
        deck[card] = new PowerPlant(card, 2, 3, 3);
        break;
      case 20:
        deck[card] = new PowerPlant(card, 3, 0, 5);
        break;
      case 21:
        deck[card] = new PowerPlant(card, 2, 2, 4);
        break;
      case 22:
        deck[card] = new PowerPlant(card, 0, 5, 2);
        break;
      case 23:
        deck[card] = new PowerPlant(card, 1, 4, 3);
        break;
      case 24:
        deck[card] = new PowerPlant(card, 2, 3, 4);
        break;
      case 25:
        deck[card] = new PowerPlant(card, 2, 0, 5);
        break;
      case 26:
        deck[card] = new PowerPlant(card, 2, 1, 5);
        break;
      case 27:
        deck[card] = new PowerPlant(card, 0, 5, 3);
        break;
      case 28:
        deck[card] = new PowerPlant(card, 1, 4, 4);
        break;
      case 29:
        deck[card] = new PowerPlant(card, 1, 2, 4);
        break;
      case 30:
        deck[card] = new PowerPlant(card, 3, 3, 6);
        break;
      case 31:
        deck[card] = new PowerPlant(card, 3, 0, 6);
        break;
      case 32:
        deck[card] = new PowerPlant(card, 3, 1, 6);
        break;
      case 33:
        deck[card] = new PowerPlant(card, 0, 5, 4);
        break;
      case 34:
        deck[card] = new PowerPlant(card, 1, 4, 5);
        break;
      case 35:
        deck[card] = new PowerPlant(card, 1, 1, 5);
        break;
      case 36:
        deck[card] = new PowerPlant(card, 3, 0, 7);
        break;
      case 37:
        deck[card] = new PowerPlant(card, 0, 5, 4);
        break;
      case 38:
        deck[card] = new PowerPlant(card, 3, 3, 7);
        break;
      case 39:
        deck[card] = new PowerPlant(card, 1, 4, 6);
        break;
      case 40:
        deck[card] = new PowerPlant(card, 2, 1, 6);
        break;
      case 42:
        deck[card] = new PowerPlant(card, 2, 0, 6);
        break;
      case 44:
        deck[card] = new PowerPlant(card, 0, 5, 5);
        break;
      case 46:
        deck[card] = new PowerPlant(card, 3, 2, 7);
        break;
      case 50:
        deck[card] = new PowerPlant(card, 0, 5, 6);
        break;
      default:
        System.out.println("Not a card in this deck");
        break;
    }
  }

  void addAltCard(int card){
    switch (card){
      case 1:
        deck[card] = new PowerPlant(card, 3, 0, 1);
        break;
      case 2:
        deck[card] = new PowerPlant(card, 2, 1, 1);
        break;
      case 3:
        deck[card] = new PowerPlant(card, 1, 0, 1);
        break;
      case 4:
        deck[card] = new PowerPlant(card, 1, 2, 1);
        break;
      case 5:
        deck[card] = new PowerPlant(card, 3, 2, 2);
        break;
      case 6:
        deck[card] = new PowerPlant(card, 1, 3, 2);
        break;
      case 7:
        deck[card] = new PowerPlant(card, 2, 1, 2);
        break;
      case 8:
        deck[card] = new PowerPlant(card, 1, 4, 2);
        break;
      case 9:
        deck[card] = new PowerPlant(card, 3, 0, 3);
        break;
      case 10:
        deck[card] = new PowerPlant(card, 0, 5, 1);
        break;
      case 11:
        deck[card] = new PowerPlant(card, 0, 5, 1);
        break;
      case 12:
        deck[card] = new PowerPlant(card, 1, 1, 2);
        break;
      case 13:
        deck[card] = new PowerPlant(card, 1, 2, 2);
        break;
      case 14:
        deck[card] = new PowerPlant(card, 3, 0, 4);
        break;
      case 15:
        deck[card] = new PowerPlant(card, 0, 5, 2);
        break;
      case 16:
        deck[card] = new PowerPlant(card, 0, 5, 2);
        break;
      case 19:
        deck[card] = new PowerPlant(card, 1, 4, 3);
        break;
      case 20:
        deck[card] = new PowerPlant(card, 1, 1, 3);
        break;
      case 21:
        deck[card] = new PowerPlant(card, 3, 3, 5);
        break;
      case 22:
        deck[card] = new PowerPlant(card, 2, 1, 4);
        break;
      case 23:
        deck[card] = new PowerPlant(card, 2, 0, 4);
        break;
      case 24:
        deck[card] = new PowerPlant(card, 1, 4, 4);
        break;
      case 25:
        deck[card] = new PowerPlant(card, 3, 1, 5);
        break;
      case 26:
        deck[card] = new PowerPlant(card, 0, 5, 3);
        break;
      case 27:
        deck[card] = new PowerPlant(card, 1, 3, 4);
        break;
      case 28:
        deck[card] = new PowerPlant(card, 3, 0, 5);
        break;
      case 29:
        deck[card] = new PowerPlant(card, 3, 2, 5);
        break;
      case 30:
        deck[card] = new PowerPlant(card, 1, 0, 4);
        break;
      case 31:
        deck[card] = new PowerPlant(card, 1, 4, 5);
        break;
      case 32:
        deck[card] = new PowerPlant(card, 0, 5, 4);
        break;
      case 33:
        deck[card] = new PowerPlant(card, 2, 3, 5);
        break;
      case 34:
        deck[card] = new PowerPlant(card, 3, 0, 6);
        break;
      case 35:
        deck[card] = new PowerPlant(card, 1, 0, 5);
        break;
      case 36:
        deck[card] = new PowerPlant(card, 2, 2, 6);
        break;
      case 37:
        deck[card] = new PowerPlant(card, 3, 1, 7);
        break;
      case 38:
        deck[card] = new PowerPlant(card, 1, 4, 6);
        break;
      case 39:
        deck[card] = new PowerPlant(card, 0, 5, 5);
        break;
      case 40:
        deck[card] = new PowerPlant(card, 1, 1, 6);
        break;
      case 42:
        deck[card] = new PowerPlant(card, 2, 3, 7);
        break;
      case 44:
        deck[card] = new PowerPlant(card, 0, 5, 6);
        break;
      case 46:
        deck[card] = new PowerPlant(card, 2, 0, 7);
        break;
      case 50:
        deck[card] = new PowerPlant(card, 2, 4, 8);
        break;
      case 52:
        deck[card] = new PowerPlant(card, 3, 3, 8);
        break;
      case 54:
        deck[card] = new PowerPlant(card, 2, 1, 8);
        break;
      case 57:
        deck[card] = new PowerPlant(card, 3, 1, 9);
        break;
      case 60:
        deck[card] = new PowerPlant(card, 0, 5, 8);
        break;
      default:
        System.out.println("Not a card in this deck");
        break;
    }
  }

}

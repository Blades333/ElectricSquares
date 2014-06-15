package electricsquares;

public class Constants{

  public static enum ResourceType{

    COAL, OIL, HYBRID, GARBAGE, URANIUM, ECO;
  }

  public static int getNumRegions(int numPlayers){
    switch (numPlayers){
      case 2:
        return 3;
      case 3:
        return 3;
      case 4:
        return 4;
      case 5:
        return 5;
      case 6:
        return 5;
      default:
        return -1;
    }
  }

  public static int getNumRandRemovedPlants(int numPlayers){
    switch (numPlayers){
      case 2:
        return 8;
      case 3:
        return 8;
      case 4:
        return 4;
      case 5:
        return 0;
      case 6:
        return 0;
      default:
        return -1;
    }
  }

  public static int getNumPlantsMax(int numPlayers){
    switch (numPlayers){
      case 2:
        return 4;
      case 3:
        return 3;
      case 4:
        return 3;
      case 5:
        return 3;
      case 6:
        return 3;
      default:
        return 3;
    }
  }

  public static int getNumCitiesStep2(int numPlayers){
    switch (numPlayers){
      case 2:
        return 1 - 1;
      case 3:
        return 7;
      case 4:
        return 7;
      case 5:
        return 7;
      case 6:
        return 6;
      default:
        return -1;
    }
  }

  public static int getNumCitiesGameEnd(int numPlayers){
    switch (numPlayers){
      case 2:
        return 21;
      case 3:
        return 17;
      case 4:
        return 17;
      case 5:
        return 15;
      case 6:
        return 14;
      default:
        return -1;
    }
  }

  public static int getCoalRefresh(int numPlayers, int step){
    if (step == 1){
      switch (numPlayers){
        case 2:
          return 3;
        case 3:
          return 4;
        case 4:
          return 5;
        case 5:
          return 5;
        case 6:
          return 7;
        default:
          return -1;
      }
    }else if (step == 2){
      switch (numPlayers){
        case 2:
          return 4;
        case 3:
          return 5;
        case 4:
          return 6;
        case 5:
          return 7;
        case 6:
          return 9;
        default:
          return -1;
      }
    }else if (step == 3){
      switch (numPlayers){
        case 2:
          return 3;
        case 3:
          return 3;
        case 4:
          return 4;
        case 5:
          return 5;
        case 6:
          return 6;
        default:
          return -1;
      }
    }else{
      return -1;
    }
  }

  public static int getOilRefresh(int numPlayers, int step){
    if (step == 1){
      switch (numPlayers){
        case 2:
          return 2;
        case 3:
          return 2;
        case 4:
          return 3;
        case 5:
          return 4;
        case 6:
          return 5;
        default:
          return -1;
      }
    }else if (step == 2){
      switch (numPlayers){
        case 2:
          return 2;
        case 3:
          return 3;
        case 4:
          return 4;
        case 5:
          return 5;
        case 6:
          return 6;
        default:
          return -1;
      }
    }else if (step == 3){
      switch (numPlayers){
        case 2:
          return 4;
        case 3:
          return 4;
        case 4:
          return 5;
        case 5:
          return 6;
        case 6:
          return 7;
        default:
          return -1;
      }
    }else{
      return -1;
    }
  }

  public static int getGarbageRefresh(int numPlayers, int step){
    if (step == 1){
      switch (numPlayers){
        case 2:
          return 1;
        case 3:
          return 1;
        case 4:
          return 2;
        case 5:
          return 3;
        case 6:
          return 3;
        default:
          return -1;
      }
    }else if (step == 2){
      switch (numPlayers){
        case 2:
          return 2;
        case 3:
          return 2;
        case 4:
          return 3;
        case 5:
          return 3;
        case 6:
          return 5;
        default:
          return -1;
      }
    }else if (step == 3){
      switch (numPlayers){
        case 2:
          return 3;
        case 3:
          return 3;
        case 4:
          return 4;
        case 5:
          return 5;
        case 6:
          return 6;
        default:
          return -1;
      }
    }else{
      return -1;
    }
  }

  public static int getUraniumRefresh(int numPlayers, int step){
    if (step == 1){
      switch (numPlayers){
        case 2:
          return 1;
        case 3:
          return 1;
        case 4:
          return 1;
        case 5:
          return 2;
        case 6:
          return 2;
        default:
          return -1;
      }
    }else if (step == 2){
      switch (numPlayers){
        case 2:
          return 1;
        case 3:
          return 1;
        case 4:
          return 2;
        case 5:
          return 3;
        case 6:
          return 3;
        default:
          return -1;
      }
    }else if (step == 3){
      switch (numPlayers){
        case 2:
          return 1;
        case 3:
          return 1;
        case 4:
          return 2;
        case 5:
          return 2;
        case 6:
          return 3;
        default:
          return -1;
      }
    }else{
      return -1;
    }
  }
}

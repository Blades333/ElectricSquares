package electricsquares;

public class PowerPlant{

  private int elektroCost;
  private int resourceCost;
  private Constants.ResourceType resourceType;
  private int numCitiesPowered;

  PowerPlant(int eCost, int rCost, Constants.ResourceType rType, int numPowered){
    elektroCost = eCost;
    resourceCost = rCost;
    resourceType = rType;
    numCitiesPowered = numPowered;
  }

  public int getElektroCost(){
    return elektroCost;
  }

  public int getResourceCost(){
    return resourceCost;
  }

  public Constants.ResourceType getResourceType(){
    return resourceType;
  }

  public int getNumCitiesPowered(){
    return numCitiesPowered;
  }
}

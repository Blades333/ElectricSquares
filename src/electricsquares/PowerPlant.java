package electricsquares;

public class PowerPlant{

  private final int elektroCost;
  private final int resourceCost;
  private final Constants.ResourceType resourceType;
  private final int numCitiesPowered;

  public PowerPlant(int eCost, int rCost, int rType, int powered){
    elektroCost = eCost;
    resourceCost = rCost;
    resourceType = Constants.ResourceType.values()[rType];
    numCitiesPowered = powered;
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

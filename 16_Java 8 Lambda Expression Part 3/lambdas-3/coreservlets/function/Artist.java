package coreservlets.function;

public class Artist extends Person {
  public enum ArtType { PAINTING, SCULPTING, TERRAFORMING };
  private ArtType artType = ArtType.PAINTING;

  public ArtType getArtType() {
    return(artType);
  }

  public void setArtType(ArtType artType) {
    this.artType = artType;
  }
}

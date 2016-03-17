package ua.gostart.goit.MusicShop;

 class Trumpet extends MusicalInstrument{
  private String name;

  public Trumpet(String name) {
   this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
   if (obj == this) {
    return true;
   }
   if (obj == null || obj.getClass() != this.getClass()) {
    return false;
   }

   Trumpet guest = (Trumpet) obj;
   return name == guest.name;

  }

  @Override
  public int hashCode() {
   final int prime = 31;
   int result = 1;
   result = prime * result;
   return result;
  }

 }




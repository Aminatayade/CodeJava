public enum EnumerationEditeur{
    Java("Eclipe"),
    Langage_C("Code Block"),
    PHP("Visual Studio");
}
    public static boolean EstDanslaliste(String Langage){
        for(EnumerationEditeur editeur : EnumerationEditeur.values){
            if(editeur.name().equalsIgnoreCase(langage)){
                return true;
            }
            else{
                return false;
            }
        
        }
       
    } 

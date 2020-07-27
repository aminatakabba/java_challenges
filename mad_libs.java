public class MadLibs {
  /*
  Your description here
  */
  	public static void main(String[] args){
      /*
      This program generates a mad libbed story.
      Author: Aminata
      Date: 21/07/2020
      */
      String name1 = "Juanjo";

      String adjective1 = "pretty";
      String adjective2 = "tall";
      String adjective3 = "big";

      String verb1 = "cleaning";

      String noun1 = "house";
      String noun2 = "beach";
      String noun3 = "table";
      String noun4 = "coffee";
      String noun5 = "water";
      String noun6 = "toilet";
      
      String name2 = name1;

      int number = 21;

      String place1 = "Birmingham";
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      System.out.println(story);
    }       
}

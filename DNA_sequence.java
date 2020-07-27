// This program represent the structure and composition of out DNA
public class DNA {

  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna2;
    // System.out.println(dna.length());
    int beginning = dna.indexOf("ATG");
    int end = dna.indexOf("TGA");
    System.out.println("Beginning: " + beginning);
    System.out.println("End: " + end);
    if (beginning != -1 && end != -1 && (beginning - end) % 3 == 0){
        System.out.println("Condition 1 and 2 and 3 are satisfied.");
        String protein = dna.substring(beginning, end+3);
        System.out.println("Protein: " + protein);
       
      }else{
        System.out.println("No protein");
    }
  }
}
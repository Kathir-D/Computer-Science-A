public class Testing {

  public static void main(String[] args) {
    String[] words = { "words", "testing", "happy", "blurry" }; // example for given array of words
    String vowels = "aeiouAEIOU";
    int count = 0;

    for (int i = 0; i < words.length; i++) {
      String wordTemp = words[i];
      for (int j = 0; j < wordTemp.length(); j++) {
        if (vowels.contains(wordTemp.substring(j, j + 1))) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}

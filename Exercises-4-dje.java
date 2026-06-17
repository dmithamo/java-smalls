class Exercises4DJE {
  public static void main(String[] args) {
    String input = IO.readln("Enter the sentence\n");
    String capitalised = capitalise(input);
    System.out.println("%s -> %s".formatted(input, capitalised));
  }

  public static String capitalise(String src) {
    String[] words = src.split("\\s+");

    for (int i = 0; i < words.length; i++) {
      if (words[i].isEmpty())
        continue;

      char[] wc = words[i].toCharArray();

      wc[0] = Character.toUpperCase(wc[0]);
      words[i] = String.valueOf(wc);
    }

    return String.join(" ", words);
  }
}

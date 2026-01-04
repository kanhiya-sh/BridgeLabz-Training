package Capgemini_Day16_ScenarioBased;

public class SentenceFormatter {
    public static void main(String[] args) {
        String paragraph = "this is a test.  this is only a test!is it working? yes,it is.";
        String formattedParagraph = formatParagraph(paragraph);
        System.out.println(formattedParagraph);
    }
    public static String formatParagraph(String paragraph) {
        // Trim extra spaces
        String trimmed = paragraph.trim().replaceAll("\\s+", " ");

        // doing first letter capital and adding space after punctuation
        StringBuilder formatted = new StringBuilder();
        boolean capitalizeNext = true;
        for (int i = 0; i < trimmed.length(); i++) {
            char currentChar = trimmed.charAt(i);
            if (capitalizeNext && Character.isLetter(currentChar)) {
                formatted.append(Character.toUpperCase(currentChar));
                capitalizeNext = false;
            }
            else {
                formatted.append(currentChar);
            }
            if (currentChar == '.' || currentChar == '!' || currentChar == '?') {
                capitalizeNext = true;
                // appending space after punctuation if it's not there
                if (i + 1 < trimmed.length() && trimmed.charAt(i + 1) != ' ') {
                    formatted.append(' ');
                }
            }
        }
        return formatted.toString().replaceAll(" +", " ");
    }
}

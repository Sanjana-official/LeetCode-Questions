class Solution
{
public String reorderSpaces(String text) {
    int spaces = 0;
    int n = text.length();

    for (int i = 0; i < n; i++) {
        if (text.charAt(i) == ' ') {
            spaces++;
        }
    }

    // Split words by spaces
    String words[] = text.trim().split("\\s+");

    // If only one word → all spaces at the end
    if (words.length == 1) {
        StringBuilder sb = new StringBuilder(words[0]);
        for (int i = 0; i < spaces; i++) sb.append(" ");
        return sb.toString();
    }

    // Otherwise distribute spaces
    int spacesBetween = spaces / (words.length - 1);
    int extraSpaces = spaces % (words.length - 1);

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < words.length; i++) {
        sb.append(words[i]);
        if (i < words.length - 1) {
            for (int j = 0; j < spacesBetween; j++) sb.append(" ");
        }
    }

    // Add extra spaces at the end
    for (int i = 0; i < extraSpaces; i++) sb.append(" ");

    return sb.toString();
}
}

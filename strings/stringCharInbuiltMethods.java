package strings;

public class stringCharInbuiltMethods {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String str = "Sahil";
        // ! Java String Methods

        /*
         * Most Frequently Used Methods
         */
        // Returns the length of the string.
        int len = str.length();

        // Returns the character at the specified index.
        char c = str.charAt(0);

        // Returns a new string that is a substring of this string.
        String sub = str.substring(1);

        // Compares the string to the specified object.
        boolean isEqual = str.equals("test");

        // Compares the string to another string, ignoring case considerations.
        boolean isEqualIgnoreCase = str.equalsIgnoreCase("test");

        // Checks if the string contains the specified sequence of characters.
        boolean contains = str.contains("abc");

        // Returns the index within the string of the first occurrence of the specified
        // character or substring.
        int index = str.indexOf('a');

        // Returns the index within the string of the last occurrence of the specified
        // character or substring.
        int lastIndex = str.lastIndexOf('a');

        // Converts all the characters in the string to lower case.
        String lower = str.toLowerCase();

        // Converts all the characters in the string to upper case.
        String upper = str.toUpperCase();

        // Returns a copy of the string with leading and trailing white spaces removed.
        String trimmed = str.trim();

        /*
         * Less Frequently Used Methods
         */
        // Replaces occurrences of a specified character or sequence in the string.
        String newStr = str.replace('a', 'b');

        // Splits the string around matches of the given regular expression.
        String[] parts = str.split(",");

        // Compares two strings lexicographically.
        int result = str.compareTo("test");

        // Compares two strings lexicographically, ignoring case differences.
        int resultIgnoreCase = str.compareToIgnoreCase("test");

        // Checks if the string is empty.
        boolean empty = str.isEmpty();

        // Checks if the string starts with the specified prefix.
        boolean starts = str.startsWith("abc");

        // Checks if the string ends with the specified suffix.
        boolean ends = str.endsWith("xyz");

        // Returns a formatted string using the specified format string and arguments.
        String formatted = String.format("Hello, %s!", "world");

        // Tells whether or not the string matches the given regular expression.
        boolean matches = str.matches("\\d+");

        // Returns the string representation of the specified argument.
        String value = String.valueOf(123);

        /*
         * Remaining methods
         */

        // Returns the Unicode code point at the specified index.
        int codePoint = str.codePointAt(0);

        // Returns the Unicode code point before the specified index.
        int codePointBefore = str.codePointBefore(1);

        // Returns the number of Unicode code points in the specified text range.
        int codePointCount = str.codePointCount(0, str.length());

        // Encodes the string into a sequence of bytes using the named charset.
        byte[] bytes = str.getBytes();

        // Copies characters from this string into the destination character array.
        char[] chars = new char[10];
        str.getChars(0, 5, chars, 0);

        // Returns a canonical representation for the string object.
        String interned = str.intern();

        // Returns the index within this string that is offset from the given index by
        // codePointOffset code points.
        int offsetIndex = str.offsetByCodePoints(0, 2);

        // Tests if two string regions are equal.
        boolean regionMatch = str.regionMatches(0, "test", 0, 4);

        // Replaces each substring of the string that matches the given regular
        // expression with the given replacement.
        String replaced = str.replaceAll("a", "b");

        // Returns a new character sequence that is a subsequence of this sequence.
        CharSequence seq = str.subSequence(1, 4);

        // ! Java Character Methods

        /*
         * Most frequently used
         */

        // Determines if the specified character is a letter.
        boolean isLetter = Character.isLetter('a');

        // Determines if the specified character is a digit.
        boolean isDigit = Character.isDigit('1');

        // Determines if the specified character is a whitespace character.
        boolean isWhitespace = Character.isWhitespace(' ');

        // Converts the character to uppercase.
        char upperChar = Character.toUpperCase('a');

        // Converts the character to lowercase.
        char lowerChar = Character.toLowerCase('A');

        // Determines if the specified character is uppercase.
        boolean isUpper = Character.isUpperCase('A');

        // Determines if the specified character is lowercase.
        boolean isLower = Character.isLowerCase('a');

        // Determines if the specified character is a letter or digit.
        boolean isLetterOrDigit = Character.isLetterOrDigit('a');

        /*
         * Less Frequently Used Methods
         */
        // Determines if the specified character is a space character.
        boolean isSpace = Character.isSpaceChar(' ');

        // Determines if the specified character is a titlecase character.
        boolean isTitle = Character.isTitleCase('ǅ');

        // Converts the character to titlecase.
        char titleChar = Character.toTitleCase('ǅ');

        // Determines if the specified character can be used as the first character of a
        // Java identifier.
        boolean isIdentifierStart = Character.isJavaIdentifierStart('_');

        // Determines if the specified character can be used as part of a Java
        // identifier.
        boolean isIdentifierPart = Character.isJavaIdentifierPart('0');

        // Determines if the specified character (Unicode code point) is alphabetic.
        boolean isAlphabetic = Character.isAlphabetic('a');

        /*
         * Remaining methods
         */

        // Returns the number of char values needed to represent the specified character
        // (Unicode code point).
        int charCount = Character.charCount(0x1F600);
    }
}

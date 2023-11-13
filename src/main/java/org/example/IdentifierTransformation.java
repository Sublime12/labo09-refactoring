package org.example;

public final class IdentifierTransformation {

    public static String snakeCaseIdentifierToPascalCase(String identifier) {
        char[] workString = snakeCaseIdentifierToCamelCase(identifier).toCharArray();
        if (workString.length > 0) {
            workString[0] = Character.toUpperCase(workString[0]);
        }
        return new String(workString);
    }

    public static String snakeCaseIdentifierToCamelCase(String identifier) {
        char[] camelCase = identifier.toLowerCase().toCharArray();

        int start = 0;
        while (start < camelCase.length && camelCase[start] == '_') start++;

        start++;

        for (int charIndex = start; charIndex < camelCase.length; charIndex++) {
            if (camelCase[charIndex] == '_' &&  !is_last_char(charIndex, camelCase)) {
                camelCase[charIndex + 1] = Character.toUpperCase(camelCase[charIndex + 1]);
            }
        }

        return new String(camelCase).replace("_", "");
    }

    public static boolean is_last_char(int index, char[] characters) {
        return index == characters.length - 1;
    }
}
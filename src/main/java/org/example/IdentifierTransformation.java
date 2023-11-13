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
        char[] workString = identifier.toLowerCase().toCharArray();

        boolean firstCharacterMet = false;

        int debut = 0;
        while (debut < workString.length && workString[debut] == '_') debut++;

        debut++;

        for (int charIndex = debut; charIndex < workString.length; charIndex++) {
            if (workString[charIndex] == '_' && firstCharacterMet) {
                if (charIndex < workString.length - 1) {
                    workString[charIndex + 1] = Character.toUpperCase(workString[charIndex + 1]);
                }
            } else {
                firstCharacterMet = true;
            }
        }

        return new String(workString).replace("_", "");
    }
}
package org.example;

import static org.junit.jupiter.api.Assertions.*;

class IdentifierTransformationTest {

//    @org.junit.jupiter.api.Test
//    void snakeCaseIdentifierToPascalCase() {
//    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase_simple_cas() {
        String snake_case = "first_snake_case";

        String camelCase = IdentifierTransformation.snakeCaseIdentifierToCamelCase(snake_case);

        String attendu = "firstSnakeCase";

        assertTrue(attendu.equals(camelCase));
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase_cas_identifiant_constant() {
        String snake_case = "MA_CONSTANTE_JAVA";

        String attendu = "maConstanteJava";

        String resultat = IdentifierTransformation.snakeCaseIdentifierToCamelCase(snake_case);

        assertTrue(attendu.equals(resultat));
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase_cas_debute_par_trait() {
        String snake_case = "_variable_debute_trait";

        String attendu = "variableDebuteTrait";

        String resultat = IdentifierTransformation.snakeCaseIdentifierToCamelCase(snake_case);

        assertTrue(attendu.equals(resultat));
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase_cas_trait_multiple_successifs() {
        String snake_case = "trait___multiples_successifs__";

        String attendu = "traitMultiplesSuccessifs";

        String resultat = IdentifierTransformation.snakeCaseIdentifierToCamelCase(snake_case);

        assertTrue(attendu.equals(resultat));
    }

    @org.junit.jupiter.api.Test
    void snakeCaseIdentifierToCamelCase_cas_chaine_vide() {
        String snake_case = "";

        String attendu = "";

        String resultat = IdentifierTransformation.snakeCaseIdentifierToCamelCase(snake_case);

        assertTrue(attendu.equals(resultat));
    }
}
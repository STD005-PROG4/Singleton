package Singleton;

import org.example.Singleton.ClassSingleton;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

public class SingletonTest {
    @Test
    public void testGetInstance() {
        // On obtient deux instances et on vérifie qu'elles sont les mêmes
        ClassSingleton instance1 = ClassSingleton.getInstance();
        ClassSingleton instance2 = ClassSingleton.getInstance();

        Assertions.assertSame(instance1, instance2, "Les instances doivent être identiques");
    }
    @Test
    public void testSingleton() {
        // Obtention des instances de ClassSingleton
        ClassSingleton instance1 = ClassSingleton.getInstance();
        ClassSingleton instance2 = ClassSingleton.getInstance();

        // Modification de l'attribut description des instances
        instance1.setDescription("Nouveau texte");
        instance2.setDescription("Texte modifié");

        // Vérification des attributs des instances
        Assertions.assertEquals("Texte modifié", instance1.getDescription(), "L'attribut description de instance1 doit être 'Texte modifié'");
        Assertions.assertEquals("Texte modifié", instance2.getDescription(), "L'attribut description de instance2 doit être 'Texte modifié'");
    }
}

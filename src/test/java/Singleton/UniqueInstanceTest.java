package Singleton;


import org.example.Singleton.ClassUniqueInstance;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UniqueInstanceTest {
    @Test
    public void testInstancesAreSame() {
        // Obtention de deux instances de ClassUniqueInstance
        ClassUniqueInstance instance1 = ClassUniqueInstance.INSTANCE;
        ClassUniqueInstance instance2 = ClassUniqueInstance.INSTANCE;

        // Vérification que les deux instances sont les mêmes
        Assertions.assertSame(instance1, instance2, "Les instances doivent être identiques");
    }
    @Test
    public void testUniqueInstance() {
        // Obtention de l'instance unique de ClassUniqueInstance
        ClassUniqueInstance instance1 = ClassUniqueInstance.INSTANCE;
        ClassUniqueInstance instance2 = ClassUniqueInstance.INSTANCE;

        // Modification de l'attribut click de l'instance
        instance1.setClick(10);
        instance2.setClick(20);

        // Vérification des attributs de l'instance
        Assertions.assertEquals(20, instance1.getClick(), "L'attribut click de instance1 doit être 20");
        Assertions.assertEquals(20, instance2.getClick(), "L'attribut click de instance2 doit être 20");
    }

}

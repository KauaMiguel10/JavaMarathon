package Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Test;

import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Repository.Repository;
import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Service.RepositoryDatabase;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryDatabase();
        repository.save();
    }
}

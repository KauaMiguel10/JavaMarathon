package Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Service;

import Academy.DevDojo.JavaMarathon.Javacore.NPolymorphism.Repository.Repository;

public class FileRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving File");
    }
}


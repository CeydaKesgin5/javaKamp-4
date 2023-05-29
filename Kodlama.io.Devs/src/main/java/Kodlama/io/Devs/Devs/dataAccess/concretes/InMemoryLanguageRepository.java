package Kodlama.io.Devs.Devs.dataAccess.concretes;

import Kodlama.io.Devs.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;

    public InMemoryLanguageRepository() {
        languages=new ArrayList<Language>();


        languages.add(new Language(1,"java"));
        languages.add(new Language(2,"c#"));
        languages.add(new Language(3,"python"));

    }
    public void addLanguage(Language language)throws Exception{
        for(Language language1:languages){
            if(language1.getLanguage()=="")
                throw new Exception("Programlama dilleri boş geçilemez");

            if(language1.getLanguage()==language.getLanguage())
                throw new Exception("Programlama dilleri tekrar edemez");

        }
        languages.add(language);
    }
    public void deleteLanguage(int id){
        languages=new ArrayList<Language>();

        languages.remove(id);

    }
    public void updateLanguage(int id,String name){
        languages=new ArrayList<Language>();

        languages.remove(id);
        languages.add(new Language(id,name));

    }





    @Override
    public List<Language> getAll() {
        return null;
    }
}

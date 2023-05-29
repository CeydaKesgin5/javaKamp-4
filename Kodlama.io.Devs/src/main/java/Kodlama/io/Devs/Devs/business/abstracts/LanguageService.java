package Kodlama.io.Devs.Devs.business.abstracts;

import Kodlama.io.Devs.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    public void addLanguage(Language language);
    public void deleteLanguage(int id);
    public void updateLanguage(int id,String name);

    Language getAllbyId(int id);

    List<Language> getAll() ;
}

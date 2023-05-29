package Kodlama.io.Devs.Devs.business.concretes;

import Kodlama.io.Devs.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.Devs.dataAccess.abstracts.LanguageRepository;
import Kodlama.io.Devs.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {
    LanguageRepository languageRepository;
    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public void addLanguage(Language language) {

    }

    @Override
    public void deleteLanguage(int id) {

    }

    @Override
    public void updateLanguage(int id, String name) {

    }

    @Override
    public Language getAllbyId(int id) {
        return null;
    }

    public List<Language> getAll() {
        return languageRepository.getAll();
    }

}

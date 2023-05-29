package Kodlama.io.Devs.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LanguageRepository {
    List<Language> getAll();
}

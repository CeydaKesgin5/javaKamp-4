package Kodlama.io.Devs.Devs.webApi.controllers;

import Kodlama.io.Devs.Devs.business.abstracts.LanguageService;
import Kodlama.io.Devs.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/languages")
public class LanguageController {
    private LanguageService languageService;
    public List<Language>languages;
    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getAll")
    public List<Language>getAll() throws Exception{

        return languageService.getAll();
    }
    @GetMapping("/addLanguage")
    public void addLanguage(Language language){
        languageService.addLanguage(language);

    }
    @GetMapping("/deleteLanguage")
    public void deleteLanguage(int id){

        languageService.deleteLanguage(id);
    }
    @GetMapping("/updateLanguage")
    public void updateLanguage(int id,String name){
        languageService.updateLanguage(id,name);
    }
    @GetMapping("/getAllbyId")
    Language getAllbyId(int id){

        return languageService.getAllbyId(id);
    }



}

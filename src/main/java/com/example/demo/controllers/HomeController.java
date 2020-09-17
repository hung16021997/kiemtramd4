package com.example.demo.controllers;
import com.example.demo.models.Country;
import com.example.demo.models.TheCity;
import com.example.demo.services.ICityService;
import com.example.demo.services.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
@Controller
public class HomeController {
    @Autowired
    private ICityService cityService;
    @Autowired
    private ICountryService countryService;
    @ModelAttribute("countries")
    public List<Country> getCountyName(){
        return countryService.findAll();
    }
    @GetMapping("")
    public ModelAndView showAllCity(){
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("cityList", cityService.findAll());
        return modelAndView;
    }
    @GetMapping("/detail/{id}")
    public ModelAndView showDetailForm(@PathVariable("id") Long id){
        TheCity city = cityService.findOne(id);
        ModelAndView mv = new ModelAndView("cityDetail");
        mv.addObject("city",city);
        return mv;
    }
    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView mv = new ModelAndView("form-city");
        mv.addObject("action","Create new city");
        mv.addObject("city", new TheCity());
        return mv;
    }
    @PostMapping("/save")
    public ModelAndView saveCity(@ModelAttribute("city") TheCity city){
        cityService.createCity(city);
        ModelAndView mv = new ModelAndView("form-city");
        mv.addObject("city", city);
        mv.addObject("message","Saving is successful");
        return mv;
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable("id") Long id){
        TheCity city = cityService.findOne(id);
        ModelAndView mv = new ModelAndView("form-city");
        mv.addObject("city",city);
        return mv;
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        cityService.delete(id);
        ModelAndView mv = new ModelAndView("home");
        mv.addObject("city",cityService.findAll());
        mv.addObject("message","deleted !!!");
        return "redirect:/";
    }
    @GetMapping("/createCountry")
    public ModelAndView createForm() {
        ModelAndView mv = new ModelAndView("form-Country");
        mv.addObject("action","Create new country");
        mv.addObject("country", new Country());
        return mv;
    }
    @PostMapping("/saveCountry")
    public ModelAndView saveCountry(@ModelAttribute("country") Country country){
        countryService.createCountry(country);
        ModelAndView mv = new ModelAndView("form-Country");
        mv.addObject("country", country);
        mv.addObject("message","Saving is successful");
        return mv;
    }
}

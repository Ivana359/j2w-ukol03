package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

  private final List<Vizitka> seznamVizitek = List.of(
          new Vizitka("Richard Dobrý", "Tlamagames", "Dlážděná 78", "Tmaň 26721", "info@tlamagames.com","www.tlamagames.com","+420 444555666"),
          new Vizitka("Lenka Láskorádová", "Zatrolené hry", "Holandská 123", "Beroun 26601", null,"www.seznam.cz","777444111"),
          new Vizitka("Věra Skálová", "Planeta her", "Nad Stadionem 359", "Králův Dvůr 26701", "email01@seznam.cz","www.web.cz","777444222"),
          new Vizitka("Simona Veselá", "HRAS", "Na Pankráci 123", "Praha 14000", null, null,null),
          new Vizitka("Štěpánka Smutná", "Svět Her", "Dlážděná 77", "Tmaň 26721", "email07@seznam.cz",null,null),
          new Vizitka("Kateřina Kůrková", "Fift", "Holandská 122", "Beroun 26601", "email11@seznam.cz","www.web2.cz","777444444"),
          new Vizitka("Jana Hrubá", "Veselý drak", "Nad Stadionem 357", "Králův Dvůr 26701", "email02@seznam.cz",null,"777444555"),
          new Vizitka("Karolina Světlá", "Luxor", "Václavské náměstí 41", "Praha 11000", null,"www.neoluxor.cz","+420 666 777 444"),
          new Vizitka("Lucie Výborná", "Korálkycz", "Vinohradská 1678/76", "Praha 13000", "info@manumi.cz",null,"777444111"),
          new Vizitka("Jana Lukášová", "Korálky komponenty", "Karlovo Náměstí 317/5", "Praha 12000", "mail@koralkykomponenty.cz","koralkykomponenty.cz",null)
  );

  @GetMapping("/")
  public ModelAndView seznam (){
    ModelAndView modelAndView= new ModelAndView("seznam");
    modelAndView.addObject("vizitky",seznamVizitek);
    return modelAndView;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("vizitka",seznamVizitek.get(id));
    return modelAndView;
  }

}


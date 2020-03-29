package com.starter.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Shivani Shinde on 28-03-2020.
 */

@RestController
public class AppController {

    private static final String url = "https://api.covid19api.com/";
    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/summary")
    public Object getSummary(){
        String url = AppController.url + "summary";
        return restTemplate.getForObject(url, Object.class);
    }

    @GetMapping("/countries")
    public Object getCountries(){
        String url = AppController.url + "countries";
        return restTemplate.getForObject(url, Object.class);
    }

    @GetMapping("/dayone/*/{country}/*/{status}")
    public Object getDayOne(@PathVariable(value="country") String country,
                            @PathVariable(value="status") String status){
        String url = AppController.url + "dayone/country/" + country + "/status/" + status;
        return restTemplate.getForObject(url, Object.class);
    }

    @GetMapping("/live/*/{country}/*/{status}/*/{date}")
    public Object getLiveByCountryStatusDate(@PathVariable(value="country") String country,
                                             @PathVariable(value="status") String status,
                                             @PathVariable(value="date") String date){

        String url = AppController.url + "live/country/" + country + "/status/" + status + "/date/" + date;
        return restTemplate.getForObject(url, Object.class);
    }
}
